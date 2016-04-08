/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.dao.interfaces;

import com.rts.pojoclasses.Vulnarabilities;
import java.util.List;

/**
 *
 * @author rasanvin
 */
public interface VulnDao {
    public List<Vulnarabilities> fetchVuln(String query);
    public int insertVuln(Vulnarabilities obj);
    public int deleteVuln(Vulnarabilities obj);
}
