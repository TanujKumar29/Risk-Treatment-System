/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.dao.interfaces;

import com.rts.pojoclasses.SFRiskTreatment;
import java.util.List;

/**
 *
 * @author rasanvin
 */
public interface  SFRiskTreatmentDao {
    public int insertSFRiskTreatment(SFRiskTreatment obj);
    public int deleteSFRiskTreatment(SFRiskTreatment obj);
    public List<SFRiskTreatment> fetchSFRiskTreatment(String query);
    public String[] fetchSFRiskTreatmentCol(String query);
}
