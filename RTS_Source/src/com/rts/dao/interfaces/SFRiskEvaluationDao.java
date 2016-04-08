/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.dao.interfaces;

import com.rts.pojoclasses.SFRiskEvaluation;
import java.util.List;

/**
 *
 * @author rasanvin
 */
public interface  SFRiskEvaluationDao {
    public int insertSFRiskEvaluation(SFRiskEvaluation obj);
    public int deleteSFRiskEvaluation(SFRiskEvaluation obj);
    public List<SFRiskEvaluation> fetchSFRiskEvaluation(String query);
    public String[] fetchSFRiskEvaluationCol(String query);
}
