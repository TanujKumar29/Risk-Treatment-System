/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.dao.interfaces;

import com.rts.pojoclasses.SFID;
import com.rts.pojoclasses.SF_Spoc;
import com.rts.pojoclasses.SupportFunctions;
import java.util.List;

/**
 *
 * @author gosavpus
 */
public interface  SupportFunctionsDAO
{
      public void addSFToDb(SFID obj);
    //public void addProjectOwner(String name);
    public void modifySFToDb(SFID obj);
    public void deleteSFFrmDb(SFID sfName);
     public void addSpocsToSFToDb(SF_Spoc sfSpoc);
     public List<SFID> getSupportFunctions();
     public SFID getSupportFunctionFromName(String sfName);
     public List<SF_Spoc> getSpocsForSF(int sfId);
     public void modifySpocsToDb(SF_Spoc spocs);
     public Object[] getSupportFunctionsByName();
      public int getSFSpocsFromName(String names);

       public void deleteSpocFromDB(SF_Spoc sF_Spoc);
       public void modifySFSpocToDb(SF_Spoc sF_Spoc) ;
}
