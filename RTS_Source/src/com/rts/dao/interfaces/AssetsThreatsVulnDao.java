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
public interface AssetsThreatsVulnDao {
    public int insetAssetsThreatsVuln(AssetsThreatsVuln obj);
    public int deleteAssetsThreatsVuln(AssetsThreatsVuln obj);
    public List<AssetsThreatsVuln> fetchAssetsThreatsVuln(String query);
}

