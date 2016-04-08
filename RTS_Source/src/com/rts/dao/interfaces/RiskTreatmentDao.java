/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.dao.interfaces;

import com.rts.pojoclasses.RiskTreatment;
import java.util.List;

/**
 *
 * @author rasanvin
 */
public interface  RiskTreatmentDao {
    public int insertRiskTreatment(RiskTreatment obj);
    public int deleteRiskTreatment(RiskTreatment obj);
    public List<RiskTreatment> fetchRiskTreatment(String query);
    public String[] fetchRiskTreatmentCol(String query);
}
