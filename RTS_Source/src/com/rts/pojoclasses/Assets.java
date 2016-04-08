/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.pojoclasses;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author gosavpus
 */
public class Assets {

    private int assetId;
//    private AssetCategory assetCategory;
    private Projects projectId;
    private String assetType;
    private String assetsName;
    private String assetsDescription;
//    private String assetsPlacement;
    private String assetsOwner;
    private int assetsIntegrity;
    private int assetsAvailability;
    private int assetsConfidentiality;
//    private String assetsDetailedAssetsDb;
    private float assetsValue;

    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    public String getAssetType() {
        return assetType;
    }





    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }



    public int getAssetsAvailability() {
        return assetsAvailability;
    }

    public void setAssetsAvailability(int assetsAvailability) {
        this.assetsAvailability = assetsAvailability;
    }

    public int getAssetsConfidentiality() {
        return assetsConfidentiality;
    }

    public void setAssetsConfidentiality(int assetsConfidentiality) {
        this.assetsConfidentiality = assetsConfidentiality;
    }

    public String getAssetsDescription() {
        return assetsDescription;
    }

    public void setAssetsDescription(String assetsDescription) {
        this.assetsDescription = assetsDescription;
    }

    public int getAssetsIntegrity() {
        return assetsIntegrity;
    }

    public void setAssetsIntegrity(int assetsIntegrity) {
        this.assetsIntegrity = assetsIntegrity;
    }

    public String getAssetsName() {
        return assetsName;
    }

    public void setAssetsName(String assetsName) {
        this.assetsName = assetsName;
    }

    public String getAssetsOwner() {
        return assetsOwner;
    }

    public void setAssetsOwner(String assetsOwner) {
        this.assetsOwner = assetsOwner;
    }

    public float getAssetsValue() {
        return assetsValue;
    }

    public void setAssetsValue(float assetsValue) {
        this.assetsValue = assetsValue;
    }

    public Projects getProjectId() {
        return projectId;
    }

    public void setProjectId(Projects projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString() {
        return "Assets{" + "assetId=" + assetId + "projectId=" + projectId + "assetType=" + assetType + "assetsName=" + assetsName + "assetsDescription=" + assetsDescription + "assetsOwner=" + assetsOwner + "assetsIntegrity=" + assetsIntegrity + "assetsAvailability=" + assetsAvailability + "assetsConfidentiality=" + assetsConfidentiality + "assetsValue=" + assetsValue + '}';
    }
//    private Set<Threats> threats;


}