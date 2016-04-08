/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.dao.interfaces;

import com.rts.pojoclasses.*;
import java.util.List;
/**
 *
 * @author panwadee
 */
public interface ReportsDAO {

    public List<Object> fetchAssetRegisterFromDb(String query);
    public List<Object> fetchContractualReqFromDb(String query);
    public List<Object> fetchRiskAssessmentReportFromDb(String query);

}
