/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.pojoclasses;

/**
 *
 * @author gosavpus
 */
public class Residual_Risk
{
    private int residualId;
    private RiskTreatment riskTreatment;
    private String resRiskCategory;
    private int resRiskLikelihood;
    private int resRiskImpact;
    private float  resRiskExposure;

    public String getResRiskCategory() {
        return resRiskCategory;
    }

    public void setResRiskCategory(String resRiskCategory) {
        this.resRiskCategory = resRiskCategory;
    }

    public float getResRiskExposure() {
        return resRiskExposure;
    }

    public void setResRiskExposure(float resRiskExposure) {
        this.resRiskExposure = resRiskExposure;
    }

    public int getResRiskImpact() {
        return resRiskImpact;
    }

    public void setResRiskImpact(int resRiskImpact) {
        this.resRiskImpact = resRiskImpact;
    }

    public int getResRiskLikelihood() {
        return resRiskLikelihood;
    }

    public void setResRiskLikelihood(int resRiskLikelihood) {
        this.resRiskLikelihood = resRiskLikelihood;
    }

    public int getResidualId() {
        return residualId;
    }

    public void setResidualId(int residualId) {
        this.residualId = residualId;
    }

    public RiskTreatment getRiskTreatment() {
        return riskTreatment;
    }

    public void setRiskTreatment(RiskTreatment riskTreatment) {
        this.riskTreatment = riskTreatment;
    }

    




}
