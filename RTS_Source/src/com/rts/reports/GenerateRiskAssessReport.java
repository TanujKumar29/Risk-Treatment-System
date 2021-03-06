/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.reports;

import java.io.FileOutputStream;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.util.Iterator;
/**
 *
 * @author panwadee
 */
public class GenerateRiskAssessReport {
private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
      Font.BOLD);
  private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
      Font.NORMAL, BaseColor.RED);
  private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
      Font.BOLD);
  private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
      Font.BOLD);
  private static String projectName = null;
  private static String buName = null;
  private static Iterator contractListItr = null;
 
public static void main(String[] args) {
   
  }

 public  String ReportData(String projectName,String buName,Iterator riskAssessmentListItr)
  {
     String FILE = "c:/temp/RiskAssessment_"+projectName+".pdf"; 
       try {
      Document document = new Document();
      PdfWriter.getInstance(document, new FileOutputStream(FILE));
      document.open();
      
      
      addMetaData(document);
      
      addTitlePage(document,projectName,buName);
      
      createTable(document, riskAssessmentListItr);
      document.close();
      
      
    } catch (Exception e) {
      e.printStackTrace();
    }
     
     return FILE;
  }
  // iText allows to add metadata to the PDF which can be viewed in your Adobe
  // Reader
  // under File -> Properties
  private  void addMetaData(Document document) {
    document.addTitle("Risk Assessment");
    document.addSubject("Using iText");
    document.addKeywords("Java, PDF, iText");
    document.addAuthor(System.getProperty("user.name"));
    document.addCreator(System.getProperty("user.name"));
  }

  private  void addTitlePage(Document document,String projectName,String buName)
      throws DocumentException {
   
      Paragraph preface = new Paragraph();
   
    // Lets write a big header
    preface.add(new Paragraph("Risk Assessment", catFont));
    addEmptyLine(preface, 1);
    preface.add(new Paragraph("Project Name : "+projectName, redFont));
    preface.add(new Paragraph("Business Unit : "+buName, redFont));

    addEmptyLine(preface, 1);

    document.add(preface);

  }

  private  void createTable(Document document,Iterator riskAssessmentListItr)
      throws BadElementException, DocumentException {
    
    PdfPTable table = new PdfPTable(9);
    table.setWidthPercentage(100);
    
    float[] columnWidths = {2f, 2f, 2f, 1f, 1f, 1f,1f,1f};
try{
    table.setWidths(columnWidths);
}
 catch (DocumentException ex) {
 }
    
    PdfPCell cell = new PdfPCell (new Paragraph ("Risk Assessment Report"));
    cell.setColspan (9);
    cell.setHorizontalAlignment (Element.ALIGN_CENTER);
    cell.setBackgroundColor (new BaseColor (128, 200, 128));
    cell.setPadding (10.0f);
    table.addCell (cell);

   
    PdfPCell c1 = new PdfPCell(new Phrase("AssetName"));
    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
    c1.setBackgroundColor (BaseColor.LIGHT_GRAY );
    c1.setPadding (10.0f);
    
    
    
    table.addCell(c1);

    c1 = new PdfPCell(new Phrase("Threat"));
    c1.setHorizontalAlignment(Element.ALIGN_LEFT);
    c1.setBackgroundColor (BaseColor.LIGHT_GRAY );
    c1.setPadding (10.0f);
    table.addCell(c1);

    c1 = new PdfPCell(new Phrase("Vulnerability"));
      c1.setHorizontalAlignment(Element.ALIGN_LEFT);
    c1.setBackgroundColor (BaseColor.LIGHT_GRAY );
    c1.setPadding (10.0f);
    table.addCell(c1);
    
    c1 = new PdfPCell(new Phrase("Likelihood"));
    c1.setHorizontalAlignment(Element.ALIGN_LEFT);
    c1.setBackgroundColor (BaseColor.LIGHT_GRAY );
    c1.setPadding (10.0f);
    table.addCell(c1);
    
    c1 = new PdfPCell(new Phrase("Impact"));
      c1.setHorizontalAlignment(Element.ALIGN_CENTER);
    c1.setBackgroundColor (BaseColor.LIGHT_GRAY );
    c1.setPadding (10.0f);
    table.addCell(c1);
    
    c1 = new PdfPCell(new Phrase("Category"));
    
     c1.setHorizontalAlignment(Element.ALIGN_CENTER);
    c1.setBackgroundColor (BaseColor.LIGHT_GRAY );
    c1.setPadding (10.0f);
    table.addCell(c1);
    
    c1 = new PdfPCell(new Phrase("Treatment Approach"));
     c1.setHorizontalAlignment(Element.ALIGN_CENTER);
    c1.setBackgroundColor (BaseColor.LIGHT_GRAY );
    c1.setPadding (10.0f);
    table.addCell(c1);
    
    c1 = new PdfPCell(new Phrase("Decision Reason"));
    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
    c1.setBackgroundColor (BaseColor.LIGHT_GRAY );
    c1.setPadding (10.0f);
    table.addCell(c1);
    
    c1 = new PdfPCell(new Phrase("Comments"));
    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
    c1.setBackgroundColor (BaseColor.LIGHT_GRAY );
    c1.setPadding (10.0f);
    table.addCell(c1);
    
    table.setHeaderRows(1);
    
    
    
    while(riskAssessmentListItr.hasNext())
    {
      Object []obj = (Object[])riskAssessmentListItr.next();
      
      for(int i=0;i<9;i++)
      {
          if(obj[i] == null)
              obj[i] = " ";
      }
      table.addCell(obj[0].toString());
      table.addCell(obj[1].toString());
      table.addCell(obj[2].toString());
      table.addCell(obj[3].toString());
      table.addCell(obj[4].toString());
      table.addCell(obj[5].toString());
      table.addCell(obj[6].toString());   
      table.addCell(obj[7].toString());  
      table.addCell(obj[8].toString());
                      
    }
    document.add(table);

  }

  private static void addEmptyLine(Paragraph paragraph, int number) {
    for (int i = 0; i < number; i++) {
      paragraph.add(new Paragraph(" "));
    }
  }
}

