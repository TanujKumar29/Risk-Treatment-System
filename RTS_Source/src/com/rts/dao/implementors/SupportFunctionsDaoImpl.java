/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.dao.implementors;

import com.rts.dao.interfaces.SupportFunctionsDAO;
import com.rts.dao.daofactory.MySQLDAOFactory;
import com.rts.pojoclasses.SFID;
import com.rts.pojoclasses.SF_Spoc;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
/**
 *
 * @author gosavpus
 */
public class SupportFunctionsDaoImpl implements SupportFunctionsDAO
{
    
 Session session =null;
 Query query;

      public void addSFToDb(SFID obj)
      {
          session = MySQLDAOFactory.getSessionfactory().openSession();
          session.getTransaction().begin();

          session.save(obj);

          session.getTransaction().commit();

      }
    //public void addProjectOwner(String name);
    public void modifySFToDb(SFID obj)
    {
            session = MySQLDAOFactory.getSessionfactory().openSession();
            session.getTransaction().begin();

            session.update(obj);

            session.getTransaction().commit();
            session.close();

    }
    public void deleteSFFrmDb(SFID sfName)
    {
            session = MySQLDAOFactory.getSessionfactory().openSession();
            session.getTransaction().begin();

            session.delete(sfName);

            session.getTransaction().commit();
            session.close();
    }
    public void addSpocsToSFToDb(SF_Spoc sfSpoc)
    {
        session = MySQLDAOFactory.getSessionfactory().openSession();
        session.getTransaction().begin();

        session.save(sfSpoc);
         

        session.getTransaction().commit();
        session.close();
    }

    public List<SFID> getSupportFunctions()
    {
        session = MySQLDAOFactory.getSessionfactory().openSession();
        session.getTransaction().begin();

        query =session.createQuery("from SFID");
        List<SFID> listSupportFunctions = query.list();


         session.getTransaction().commit();
        session.close();
        return listSupportFunctions;
        
    }

      public Object[] getSupportFunctionsByName()
    {
        session = MySQLDAOFactory.getSessionfactory().openSession();
        session.getTransaction().begin();

        query =session.createQuery("select SF_Name from SFID");
        List<SFID> listSupportFunctions = query.list();

        Object [] array = listSupportFunctions.toArray();

         session.getTransaction().commit();
        session.close();
        return array;

    }


    public SFID getSupportFunctionFromName(String sfName)
    {
        session = MySQLDAOFactory.getSessionfactory().openSession();
        session.getTransaction().begin();

        query= session.createQuery("from SFID where SF_Name='"+sfName+"'");
        List<SFID> list =  query.list();
         session.getTransaction().commit();
        session.close();
        if(!list.isEmpty())
        {
            SFID supportFunctions = list.get(0);
            return supportFunctions;
        }
        else
        {
            return null;
        }
   }
    public List<SF_Spoc> getSpocsForSF(int sfId)
    {
        session = MySQLDAOFactory.getSessionfactory().openSession();
        session.getTransaction().begin();

         query= session.createQuery("select sfSpocName from SF_Spoc where supportFunctions.SFId="+sfId);
         List<SF_Spoc> list = query.list();

        session.getTransaction().commit();
        session.close();
        return list;
    }

     public void modifySpocsToDb(SF_Spoc spocs)
     {
          session = MySQLDAOFactory.getSessionfactory().openSession();
            session.getTransaction().begin();

            session.update(spocs);

            session.getTransaction().commit();
            session.close();

     }
      public int getSFSpocsFromName(String names)
    {
        session= MySQLDAOFactory.getSessionfactory().openSession();
        session.getTransaction().begin();

        SF_Spoc sfSpoc= new SF_Spoc();
        query=session.createQuery("select sfSpocId from SF_Spoc where sfSpocName='"+names+"'");
        List<Integer>sfSpocsId = query.list();

        Integer id=sfSpocsId.get(0);
        //int id = projectSpoc.getSpocId();
        session.getTransaction().commit();
        session.close();
        return id;
    }

      public void deleteSpocFromDB(SF_Spoc sF_Spoc)
      {
      session= MySQLDAOFactory.getSessionfactory().openSession();
        session.getTransaction().begin();

        session.delete(sF_Spoc);

        session.getTransaction().commit();
        session.close();

      }
      public void modifySFSpocToDb(SF_Spoc sF_Spoc)
      {
          session= MySQLDAOFactory.getSessionfactory().openSession();
        session.getTransaction().begin();

        session.update(sF_Spoc);

        session.getTransaction().commit();
        session.close();

      }
}
