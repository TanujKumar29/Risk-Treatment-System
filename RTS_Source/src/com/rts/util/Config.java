package com.rts.util;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kumartan
 */
public class Config {

    public String Risk_Likelihood_Negligible="Low(1)";
    public String Risk_Likelihood_Significant="Medium(2)";
    public String Risk_Likelihood_Critical="High(3)";
    public String Risk_Likelihood_Catastrophic="Very High(4)";
    public static String []arr={"Not Applicable","Low(1)","Medium(2)","High(3)","Very High(4)"};
    public static String []arr1={"Low(1)","Medium(2)","High(3)","Very High(4)"};
    public static String []riskCat={"Financial Loss",
	  "Operational Loss",
	  "Reputation Loss",
	  "Documentation Loss",
	  "Resource Loss ",};

    public static String [] riskTreatment={"Apply Control","Accept","Transfer","Avoid"};
     public static String getStringValue(int a){
        return arr[a];
     }
     public static int getIntValue(String str){
         for (int i=0;i<arr.length;i++){
             if (arr[i].equals(str))
                 return i;
         }
         return -1;
     }
    public static void main(String[] args)
    {
      Config cg=new Config();
     }
}
