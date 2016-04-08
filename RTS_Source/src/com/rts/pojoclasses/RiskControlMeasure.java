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
public class RiskControlMeasure {


    private RiskControl riskControl;

    public RiskControl getRiskControl() {
        return riskControl;
    }

    public void setRiskControl(RiskControl riskControl) {
        this.riskControl = riskControl;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RiskControlMeasure other = (RiskControlMeasure) obj;
        return true;
    }

    @Override
    public String toString() {
        return "RiskControlMeasure{" + "riskControl=" + riskControl + '}';
    }


}
