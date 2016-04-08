package com.rts.dao.interfaces;

import com.rts.pojoclasses.SFRiskResidual;
import java.util.List;

/**
 *
 * @author kumartan
 */
public interface SFRiskResidualDao {
    public int insertSFRiskResidual(SFRiskResidual obj);
    public int deleteSFRiskResidual(SFRiskResidual obj);
    public List<SFRiskResidual> fetchSFRiskResidual(String query);
    public String[] fetchSFRiskResidualCol(String query);
}
