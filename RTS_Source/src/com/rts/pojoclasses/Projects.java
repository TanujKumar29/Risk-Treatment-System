/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.pojoclasses;

import java.util.List;
import java.util.Set;

/**
 *
 * @author gosavpus
 */
public class Projects {

    private int projectId;
    private String projectName;
    private String projectOwner;
    
    private BusinessUnitPojo businessUnit;
    

   
    

   

    public BusinessUnitPojo getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(BusinessUnitPojo businessUnit) {
        this.businessUnit = businessUnit;
    }


    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectOwner() {
        return projectOwner;
    }

    public void setProjectOwner(String projectOwner) {
        this.projectOwner = projectOwner;
    }

    

    

}
