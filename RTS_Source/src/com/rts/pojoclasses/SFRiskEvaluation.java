/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.pojoclasses;

/**
 *
 * @author gosavpus
 */
public class SFRiskEvaluation {
    private int riskEvaluationId;
    private SFAssetsThreatsVuln sfassetsThreatsVuln;
    private String riskCategory;
    private int riskImpact;
    private int riskLikelihood;
    private float riskExposure;

    public SFRiskEvaluation (){
        sfassetsThreatsVuln = new SFAssetsThreatsVuln();
    }

    public SFAssetsThreatsVuln getSfassetsThreatsVuln() {
        return sfassetsThreatsVuln;
    }

    public void setSfassetsThreatsVuln(SFAssetsThreatsVuln sfassetsThreatsVuln) {
        this.sfassetsThreatsVuln = sfassetsThreatsVuln;
    }
   

    public String getRiskCategory() {
        return riskCategory;
    }

    public void setRiskCategory(String riskCategory) {
        this.riskCategory = riskCategory;
    }

    public int getRiskEvaluationId() {
        return riskEvaluationId;
    }

    public void setRiskEvaluationId(int riskEvaluationId) {
        this.riskEvaluationId = riskEvaluationId;
    }

    public float getRiskExposure() {
        return riskExposure;
    }

    public void setRiskExposure(float riskExposure) {
        this.riskExposure = riskExposure;
    }

    public int getRiskImpact() {
        return riskImpact;
    }

    public void setRiskImpact(int riskImpact) {
        this.riskImpact = riskImpact;
    }

    public int getRiskLikelihood() {
        return riskLikelihood;
    }

    public void setRiskLikelihood(int riskLikelihood) {
        this.riskLikelihood = riskLikelihood;
    }

    @Override
    public String toString() {
        return "RiskEvaluation{" + " riskEvaluationId=" + riskEvaluationId + " assetsThreatsVuln=" + sfassetsThreatsVuln + " riskCategory=" + riskCategory + " riskImpact=" + riskImpact +  " riskLikelihood=" + riskLikelihood + " riskExposure=" + riskExposure + '}';
    }


    
}
