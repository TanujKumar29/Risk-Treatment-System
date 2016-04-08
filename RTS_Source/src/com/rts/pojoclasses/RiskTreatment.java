/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.pojoclasses;

/**
 *
 * @author gosavpus
 */
public class RiskTreatment {
    private int riskTreatmentId;
    private RiskEvaluation riskEvaluation;

    private String riskTreatmentApproach;
    private String riskDecisionReason;
    private String comment;

    public RiskTreatment(){
        this.riskEvaluation=new RiskEvaluation();
    }
    public String getComment() {
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

    public RiskEvaluation getRiskEvaluation() {
        return riskEvaluation;
    }

    public void setRiskEvaluation(RiskEvaluation riskEvaluation) {
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
    }

    @Override
    public String toString() {
        return "RiskTreatment{" + "riskTreatmentId=" + riskTreatmentId + "riskEvaluation=" + riskEvaluation + "riskTreatmentApproach=" + riskTreatmentApproach + "riskDecisionReason=" + riskDecisionReason + "comment=" + comment + '}';
    }

}
