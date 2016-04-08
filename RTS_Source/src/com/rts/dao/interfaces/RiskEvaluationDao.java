/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.dao.interfaces;

import com.rts.pojoclasses.RiskEvaluation;
import java.util.List;

/**
 *
 * @author rasanvin
 */
public interface  RiskEvaluationDao {
    public int insertRiskEvaluation(RiskEvaluation obj);
    public int deleteRiskEvaluation(RiskEvaluation obj);
    public List<RiskEvaluation> fetchRiskEvaluation(String query);
    public String[] fetchRiskEvaluationCol(String query);
}
