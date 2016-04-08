/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.pojoclasses;

/**
 *
 * @author gosavpus
 */
public class ThreatsVulnarabilities {

    private int threatVulnarabilityId;
    private AssetsThreatsVuln assetsThreats;
    private Vulnarabilities vulnarabilities;
//    private Risks risks;

//    public Risks getRisks() {
//        return risks;
//    }
//
//    public void setRisks(Risks risks) {
//        this.risks = risks;
//    }

    public AssetsThreatsVuln getAssetsThreats() {
        return assetsThreats;
    }

    public void setAssetsThreats(AssetsThreatsVuln assetsThreats) {
        this.assetsThreats = assetsThreats;
    }

    public int getThreatVulnarabilityId() {
        return threatVulnarabilityId;
    }

    public void setThreatVulnarabilityId(int threatVulnarabilityId) {
        this.threatVulnarabilityId = threatVulnarabilityId;
    }



    public Vulnarabilities getVulnarabilities() {
        return vulnarabilities;
    }

    public void setVulnarabilities(Vulnarabilities vulnarabilities) {
        this.vulnarabilities = vulnarabilities;
    }




}
