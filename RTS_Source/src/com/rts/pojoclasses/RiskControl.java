/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.pojoclasses;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author gosavpus
 */
public class RiskControl implements Serializable{
    private RiskTreatment riskTreatment;
    private String controlCode;
    
    public RiskControl(RiskTreatment riskTreatment,String controlCode){
        this.riskTreatment=riskTreatment;
        this.controlCode=controlCode;
    }
    public String getControlCode() {
        return controlCode;
    }

    public void setControlCode(String controlCode) {
        this.controlCode = controlCode;
    }

    public RiskTreatment getRiskTreatment() {
        return riskTreatment;
    }

    public void setRiskTreatment(RiskTreatment riskTreatment) {
        this.riskTreatment = riskTreatment;
    }

    @Override
    public String toString() {
        return "RiskControlMeasure{" + "riskTreatment=" + riskTreatment + "controlCode=" + controlCode + '}';
    }

//@Override
//public boolean equals(Object arg0) {
//    if(arg0 == null) return false;
//    if(!(arg0 instanceof RiskControl)) return false;
//    RiskControl arg1 = (RiskControl) arg0;
//    return (this.controlCode == arg1.controlCode) && (this.riskTreatment.equals(arg1.riskTreatment));
//
//}


//@Override
//    public int hashCode() {
//        int hsCode;
//        hsCode = controlCode.hashCode();
//        hsCode = 19 * hsCode+ riskTreatment.hashCode();
//    return hsCode;
//    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (this.riskTreatment != null ? this.riskTreatment.hashCode() : 0);
        hash = 79 * hash + (this.controlCode != null ? this.controlCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RiskControl other = (RiskControl) obj;
        if (this.riskTreatment != other.riskTreatment && (this.riskTreatment == null || !this.riskTreatment.equals(other.riskTreatment))) {
            return false;
        }
        if ((this.controlCode == null) ? (other.controlCode != null) : !this.controlCode.equals(other.controlCode)) {
            return false;
        }
        return true;
    }

}
