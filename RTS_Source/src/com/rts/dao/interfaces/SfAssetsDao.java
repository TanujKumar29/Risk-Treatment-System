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
public interface SfAssetsDao {
    public int insertAssetsToDb(Assets obj);
    public int deleteAssetsFromDb(Assets obj);
    public List<Assets> fetchAssetsListFromDb(String query);
}

