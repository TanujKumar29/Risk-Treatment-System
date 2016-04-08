/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.dao.interfaces;

import com.rts.pojoclasses.SFVulnarabilities;
import java.util.List;

/**
 *
 * @author kumartan
 */
public interface SFVulnDao {
    public List<SFVulnarabilities> fetchSFVuln(String query);
    public int insertSFVuln(SFVulnarabilities obj);
    public int deleteSFVuln(SFVulnarabilities obj);
}
