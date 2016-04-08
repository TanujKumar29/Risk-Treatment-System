/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.dao.interfaces;

import com.rts.pojoclasses.Threats;
import java.util.List;

/**
 *
 * @author rasanvin
 */
public interface ThreatsDao {
    public List<Threats> fetchThreats(String query);
    public int insertThreats(Threats obj);
    public int deleteThreats(Threats obj);
    public String[] fetchThreatsCol(String query);
    public String[] fetchThreatsForType(String query);
}
