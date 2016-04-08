/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.pojoclasses;

/**
 *
 * @author kumartan
 */
public class SFRiskResidual {
    private int riskResidualId;
    private SFRiskTreatment riskTreatment;

    private String riskResidualImpact;
    private String riskResidualLikelihood;
    private String riskResidualExposure;
    private String riskResidualCategory;


    public SFRiskResidual(){
        this.riskTreatment=new SFRiskTreatment();
    }

    public String getRiskResidualCategory() {
        return riskResidualCategory;
    }

    public void setRiskResidualCategory(String riskResidualCategory) {
        this.riskResidualCategory = riskResidualCategory;
    }

    public String getRiskResidualExposure() {
        return riskResidualExposure;
    }

    public void setRiskResidualExposure(String riskResidualExposure) {
        this.riskResidualExposure = riskResidualExposure;
    }

    public int getRiskResidualId() {
        return riskResidualId;
    }

    public void setRiskResidualId(int riskResidualId) {
        this.riskResidualId = riskResidualId;
    }

    public String getRiskResidualImpact() {
        return riskResidualImpact;
    }

    public void setRiskResidualImpact(String riskResidualImpact) {
        this.riskResidualImpact = riskResidualImpact;
    }

    public String getRiskResidualLikelihood() {
        return riskResidualLikelihood;
    }

    public void setRiskResidualLikelihood(String riskResidualLikelihood) {
        this.riskResidualLikelihood = riskResidualLikelihood;
    }

    public SFRiskTreatment getRiskTreatment() {
        return riskTreatment;
    }

    public void setRiskTreatment(SFRiskTreatment riskTreatment) {
        this.riskTreatment = riskTreatment;
    }

   /* public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getRiskDecisionReason() {
        return riskDecisionReason;
    }

    public void setRiskDecisionReason(String riskDecisionReason) {
        this.riskDecisionReason = riskDecisionReason;
    }

    public SFRiskEvaluation getRiskEvaluation() {
        return riskEvaluation;
    }

    public void setRiskEvaluation(SFRiskEvaluation riskEvaluation) {
        this.riskEvaluation = riskEvaluation;
    }

    public String getRiskTreatmentApproach() {
        return riskTreatmentApproach;
    }

    public void setRiskTreatmentApproach(String riskTreatmentApproach) {
        this.riskTreatmentApproach = riskTreatmentApproach;
    }

    public int getRiskTreatmentId() {
        return riskTreatmentId;
    }

    public void setRiskTreatmentId(int riskTreatmentId) {
        this.riskTreatmentId = riskTreatmentId;
    }*/

    @Override
    public String toString() {
        return "RiskResidual{" + "riskResidualId=" + riskResidualId + "riskTreatment=" + riskTreatment + "riskResidualImpact=" + riskResidualImpact + "riskResidualLikelihood=" + riskResidualLikelihood + "riskResidualExposure=" + riskResidualExposure+"riskResidualCategory"+ riskResidualCategory+ '}';
    }

}
