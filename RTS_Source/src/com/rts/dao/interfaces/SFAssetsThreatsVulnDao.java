/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.dao.interfaces;

import com.rts.pojoclasses.*;
import java.util.List;
/**
 *
 * @author kumartan
 */
public interface SFAssetsThreatsVulnDao {
    public int insetSFAssetsThreatsVuln(SFAssetsThreatsVuln obj);
    public int deleteSFAssetsThreatsVuln(SFAssetsThreatsVuln obj);
    public List<SFAssetsThreatsVuln> fetchSFAssetsThreatsVuln(String query);
}

