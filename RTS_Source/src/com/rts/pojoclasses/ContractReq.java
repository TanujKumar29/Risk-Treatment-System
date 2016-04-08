/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.pojoclasses;

import java.util.Date;

/**
 *
 * @author gosavpus
 */
public class ContractReq {

    private int contractReqId;
    private String controlCategory;
    private String clause;
    private String compliance;
    private String description;
    private String owner;
    private String action;
    private Date deadline;
    private String evidance;
    private String comment;
    private Projects projects;
    public boolean  flag=false;

    public Projects getProjects() {
        return projects;
    }

    public void setProjects(Projects projects) {
        this.projects = projects;
    }

    

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getClause() {
        return clause;
    }

    public void setClause(String clause) {
        this.clause = clause;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCompliance() {
        return compliance;
    }

    public void setCompliance(String compliance) {
        this.compliance = compliance;
    }

    public int getContractReqId() {
        return contractReqId;
    }

    public void setContractReqId(int contractReqId) {
        this.contractReqId = contractReqId;
    }

    public String getControlCategory() {
        return controlCategory;
    }

    public void setControlCategory(String controlCategory) {
        this.controlCategory = controlCategory;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEvidance() {
        return evidance;
    }

    public void setEvidance(String evidance) {
        this.evidance = evidance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "ContractReq{" + "contractReqId=" + contractReqId + "controlCategory=" + controlCategory + "clause=" + clause + "compliance=" + compliance + "description=" + description + "owner=" + owner + "action=" + action + "deadline=" + deadline + "evidance=" + evidance + "comment=" + comment + "projects=" + projects + "flag=" + flag + '}';
    }



    
}
