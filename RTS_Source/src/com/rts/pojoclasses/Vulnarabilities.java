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
public class Vulnarabilities {

    private int vulnarabilityId;
    private String vulnarabilityName;
    private String vulnarabilityDescription;


    public String getVulnarabilityDescription() {
        return vulnarabilityDescription;
    }

    public void setVulnarabilityDescription(String vulnarabilityDescription) {
        this.vulnarabilityDescription = vulnarabilityDescription;
    }

    public int getVulnarabilityId() {
        return vulnarabilityId;
    }

    public void setVulnarabilityId(int vulnarabilityId) {
        this.vulnarabilityId = vulnarabilityId;
    }

    public String getVulnarabilityName() {
        return vulnarabilityName;
    }

    public void setVulnarabilityName(String vulnarabilityName) {
        this.vulnarabilityName = vulnarabilityName;
    }

    

}
