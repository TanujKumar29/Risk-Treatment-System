/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.pojoclasses;

/**
 *
 * @author kumartan
 */
public class SFAssetsThreatsVuln {

    private int assetsThreatsVulnId;
    private SF_Assets assets;
    private SFThreats threats;
    private SFVulnarabilities vulnerabilities;

    public SFAssetsThreatsVuln(){
        this.assets=new SF_Assets();
        this.threats=new SFThreats();
        this.vulnerabilities=new SFVulnarabilities();
    }
    public SF_Assets getAssets() {
        return assets;
    }

    public void setAssets(SF_Assets assets) {
        this.assets = assets;
    }

    public int getAssetsThreatsVulnId() {
        return assetsThreatsVulnId;
    }

    public void setAssetsThreatsVulnId(int assetsThreatsVulnId) {
        this.assetsThreatsVulnId = assetsThreatsVulnId;
    }

    public SFThreats getThreats() {
        return threats;
    }

    public void setThreats(SFThreats threats) {
        this.threats = threats;
    }

    public SFVulnarabilities getVulnerabilities() {
        return vulnerabilities;
    }

    public void setVulnerabilities(SFVulnarabilities vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }

    @Override
    public String toString() {
        return "AssetsThreatsVuln{" + "assetsThreatsVulnId=" + assetsThreatsVulnId + "assets=" + assets + "threats=" + threats + "vulnerabilities=" + vulnerabilities + '}';
    }


public static void main (String args[]){
    new SFAssetsThreatsVuln();
}
    
}
