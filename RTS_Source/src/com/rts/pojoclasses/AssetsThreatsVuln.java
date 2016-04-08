/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.pojoclasses;

/**
 *
 * @author gosavpus
 */
public class AssetsThreatsVuln {

    private int assetsThreatsVulnId;
    private Assets assets;
    private Threats threats;
    private Vulnarabilities vulnerabilities;

    public AssetsThreatsVuln(){
        this.assets=new Assets();
        this.threats=new Threats();
        this.vulnerabilities=new Vulnarabilities();
    }
    public Assets getAssets() {
        return assets;
    }

    public void setAssets(Assets assets) {
        this.assets = assets;
    }

    public int getAssetsThreatsVulnId() {
        return assetsThreatsVulnId;
    }

    public void setAssetsThreatsVulnId(int assetsThreatsVulnId) {
        this.assetsThreatsVulnId = assetsThreatsVulnId;
    }

    public Threats getThreats() {
        return threats;
    }

    public void setThreats(Threats threats) {
        this.threats = threats;
    }

    public Vulnarabilities getVulnerabilities() {
        return vulnerabilities;
    }

    public void setVulnerabilities(Vulnarabilities vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }

    @Override
    public String toString() {
        return "AssetsThreatsVuln{" + "assetsThreatsVulnId=" + assetsThreatsVulnId + "assets=" + assets + "threats=" + threats + "vulnerabilities=" + vulnerabilities + '}';
    }



}
