/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.reports;

import com.itextpdf.awt.DefaultFontMapper;
//import com.itextpdf.awt.geom.Rectangle2D;
import com.itextpdf.awt.PdfGraphics2D;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;

import java.awt.Graphics2D;
 import java.awt.geom.Rectangle2D;
import java.io.FileOutputStream;
import java.util.Iterator;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
 
/**
 *
 * @author panwadee
 */
public class GenerateCharts {

    public static void main(String[] args) {
        //TODO: Add code to generate PDFs with charts
     
    }
    
    public String generatePieChart(Iterator assetItr, String projectName,String buName) throws DocumentException 
    {
        DefaultPieDataset dataSet = new DefaultPieDataset();
        Double highCount = 0.0;
        Double mediumCount = 0.0;
        Double lowCount = 0.0;
        Double assetValue =0.0;
        while(assetItr.hasNext())
        {
            Object []obj = (Object[])assetItr.next();
            assetValue = Double.parseDouble(obj[7].toString());
            System.out.println("assetValue :"+assetValue);
            
            if((assetValue >= 3) && (assetValue <=4))
                highCount++;
            else if(assetValue >=2 && assetValue <3)
                mediumCount++;
            else if(assetValue < 2)
                lowCount++;
           
   
        }
        System.out.println("High count :"+highCount);
        System.out.println("Medium count :"+mediumCount);
        System.out.println("Low count :"+lowCount);
        dataSet.setValue("High", highCount);
        dataSet.setValue("Medium", mediumCount);
        dataSet.setValue("Low", lowCount);

 
        JFreeChart chart = ChartFactory.createPieChart(
                "Assets by Asset Values", dataSet, true, true, false);
 
        
        String filePath ="C:/temp/piechart_"+projectName+".pdf";
        writeChartToPDF(chart, 500, 400,filePath ,projectName,buName,highCount,mediumCount,lowCount);
        
        return filePath;
    }
    
    public  void writeChartToPDF(JFreeChart chart, int width, int height, String fileName, String projectName,String buName,Double highCount,Double mediumCount,Double lowCount) throws DocumentException {
    PdfWriter writer = null;
 
    Document document = new Document();
 
    try {
        writer = PdfWriter.getInstance(document, new FileOutputStream(
                fileName));
        document.open();
        PdfContentByte contentByte = writer.getDirectContent();
        PdfTemplate template = contentByte.createTemplate(width, height);
        Graphics2D graphics2d = (PdfGraphics2D) template.createGraphics(width, height,
                new DefaultFontMapper());
        Rectangle2D rectangle2d = new Rectangle2D.Double(0, 0, width,height);
 
        
        chart.draw(graphics2d,rectangle2d);
        
         
        graphics2d.dispose();
        contentByte.addTemplate(template, 50, 250);
 
    } catch (Exception e) {
        e.printStackTrace();
    }
    addTitlePage(document,projectName,buName,highCount,mediumCount,lowCount);
    document.close();
}
    private  void addTitlePage(Document document,String projectName,String buName,Double highCount,Double mediumCount,Double lowCount)
      throws DocumentException {
   
      Paragraph preface = new Paragraph();
      Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,Font.BOLD);
      Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
      Font.NORMAL, BaseColor.RED);
      
      Double totalAssets = highCount+mediumCount+lowCount;
   
    // Lets write a big header
    preface.add(new Paragraph("Asset Register  ", catFont));
    addEmptyLine(preface, 1);
    preface.add(new Paragraph("Project Name : "+projectName, redFont));
    preface.add(new Paragraph("Business Unit : "+buName, redFont));

    addEmptyLine(preface, 1);
    preface.add(new Paragraph("Total number of Assets: "+totalAssets, redFont));
    preface.add(new Paragraph("No of Assets with HIGH Value: "+highCount+"  MEDIUM Value: "+mediumCount+"  LOW Value: "+lowCount, redFont));

    document.add(preface);

  }
    private static void addEmptyLine(Paragraph paragraph, int number) {
    for (int i = 0; i < number; i++) {
      paragraph.add(new Paragraph(" "));
    }
  }
    
}
