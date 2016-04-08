/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.dao.interfaces;

import com.rts.pojoclasses.*;
import java.util.List;
/**
 *
 * @author rasanvin
 */
public interface ThreatsVulnDao {
    public int insetThreatsVuln(ThreatsVulnarabilities obj);
    public int deleteThreatsVuln(ThreatsVulnarabilities obj);
    public List<ThreatsVulnarabilities> fetchThreatsVulnPair(String query);
}


