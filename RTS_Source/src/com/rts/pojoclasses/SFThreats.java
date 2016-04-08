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
public class SFThreats {

    private int threatId;
    private String threatName;
    private String threatType;
    private String threatDescription;

    public String getThreatDescription() {
        return threatDescription;
    }

    public void setThreatDescription(String threatDescription) {
        this.threatDescription = threatDescription;
    }

    public int getThreatId() {
        return threatId;
    }

    public void setThreatId(int threatId) {
        this.threatId = threatId;
    }

    public String getThreatName() {
        return threatName;
    }

    public void setThreatName(String threatName) {
        this.threatName = threatName;
    }

    public String getThreatType() {
        return threatType;
    }

    public void setThreatType(String threatType) {
        this.threatType = threatType;
    }

    @Override
    public String toString() {
        return "Threats{" + "threatId=" + threatId + "threatName=" + threatName + "threatType=" + threatType + "threatDescription=" + threatDescription + '}';
    }



    public static void main (String args[]){
        new Threats();
    }
}
