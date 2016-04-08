/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.dao.interfaces;

import com.rts.pojoclasses.SFThreats;
import java.util.List;

/**
 *
 * @author kumartan
 */
public interface SFThreatsDao {
    public List<SFThreats> fetchSFThreats(String query);
    public int insertSFThreats(SFThreats obj);
    public int deleteSFThreats(SFThreats obj);
    public String[] fetchSFThreatsCol(String query);
    public String[] fetchSFThreatsForType(String query);
}
