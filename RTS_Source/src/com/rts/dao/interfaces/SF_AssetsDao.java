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
public interface SF_AssetsDao {
    public int insetSF_AssetsToDb(SF_Assets obj);
    public int deleteSF_AssetsFromDb(SF_Assets obj);
    public List<SF_Assets> fetchSF_AssetsListFromDb(String query);
    public String[] fetchSF_AssetsCol(String query);
}

