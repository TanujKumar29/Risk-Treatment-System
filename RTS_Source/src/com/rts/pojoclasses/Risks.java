/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.pojoclasses;

/**
 *
 * @author gosavpus
 */
public class Risks {
    private int riskId;
    private AssetsThreatsVuln assetsThreatsVuln;
    private String riskCategory;
    private int riskImpact;
    private int riskLikelihood;
    private String riskTreatmentApproach;
    private String riskDescription;
    private String riskDecisionReason;
//    private String riskReductionReason;
//    private int riskConfidentiality;
//    private int riskIntegrity;
//    private int riskAvailibility;
    private int residualLikelihood;
    private int residualImpact;
    private String ResedualCategory;

    public String getResedualCategory() {
        return ResedualCategory;
    }

    public void setResedualCategory(String ResedualCategory) {
        this.ResedualCategory = ResedualCategory;
    }

    public AssetsThreatsVuln getAssetsThreatsVuln() {
        return assetsThreatsVuln;
    }

    public void setAssetsThreatsVuln(AssetsThreatsVuln assetsThreatsVuln) {
        this.assetsThreatsVuln = assetsThreatsVuln;
    }

    public int getResidualImpact() {
        return residualImpact;
    }

    public void setResidualImpact(int residualImpact) {
        this.residualImpact = residualImpact;
    }

    public int getResidualLikelihood() {
        return residualLikelihood;
    }

    public void setResidualLikelihood(int residualLikelihood) {
        this.residualLikelihood = residualLikelihood;
    }

    public String getRiskCategory() {
        return riskCategory;
    }

    public void setRiskCategory(String riskCategory) {
        this.riskCategory = riskCategory;
    }

    public String getRiskDecisionReason() {
        return riskDecisionReason;
    }

    public void setRiskDecisionReason(String riskDecisionReason) {
        this.riskDecisionReason = riskDecisionReason;
    }

    public String getRiskDescription() {
        return riskDescription;
    }

    public void setRiskDescription(String riskDescription) {
        this.riskDescription = riskDescription;
    }

    public int getRiskId() {
        return riskId;
    }

    public void setRiskId(int riskId) {
        this.riskId = riskId;
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

    public String getRiskTreatmentApproach() {
        return riskTreatmentApproach;
    }

    public void setRiskTreatmentApproach(String riskTreatmentApproach) {
        this.riskTreatmentApproach = riskTreatmentApproach;
    }

    @Override
    public String toString() {
        return "Risks{" + "riskId=" + riskId + "riskCategory=" + riskCategory + "riskImpact=" + riskImpact + "riskLikelihood=" + riskLikelihood + "riskTreatmentApproach=" + riskTreatmentApproach + "riskDescription=" + riskDescription + "riskDecisionReason=" + riskDecisionReason + "residualLikelihood=" + residualLikelihood + "residualImpact=" + residualImpact + "ResedualCategory=" + ResedualCategory + "assetsThreatsVuln=" + assetsThreatsVuln + '}';
    }



}
