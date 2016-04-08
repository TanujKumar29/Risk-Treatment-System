/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.dao.interfaces;

import com.rts.pojoclasses.BusinessUnitPojo;
import java.util.List;

/**
 *
 * @author gosavpus
 */
public interface  BusinessUnitDAO {
     public void addBUToDb(BusinessUnitPojo obj);
    public void modifyBUToDb(BusinessUnitPojo obj);
    public void deleteBUFrmDb(String obj);
    public Object[] getBUFromDb();
    public int getBuForProjectFromDb(String str);
 //   public int getBuId(String str);
 //   public int getBuIdFromBU(String str);

}
