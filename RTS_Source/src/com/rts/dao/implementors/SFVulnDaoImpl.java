/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.dao.implementors;

/**
 *
 * @author rasanvin
 */


import com.rts.dao.daofactory.MySQLDAOFactory;
import com.rts.dao.interfaces.SFVulnDao;
import com.rts.pojoclasses.SFThreats;
import com.rts.pojoclasses.SFVulnarabilities;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;


public class SFVulnDaoImpl implements SFVulnDao{
    public int insertSFVuln(SFVulnarabilities obj) {
        Session session=null;
        int resultCode=-1;
        try{
            session=MySQLDAOFactory.getSessionfactory().openSession();
            if(obj.getVulnarabilityId()==0) {
                session.beginTransaction().begin();
                     session.save(obj);
                     resultCode=0;
                session.beginTransaction().commit();
            }
            else{
                session.update(obj);
                resultCode=1;
            }
        }catch (Exception e){
            System.out.println("Exception while fetching Threat:"+e.getMessage());
        }
        finally{
            session.flush();
            session.close();
        }
        return resultCode;
   }

    public int deleteSFVuln(SFVulnarabilities obj) {
    Session session=null;
    int resultCode=-1;
        try{
            session=MySQLDAOFactory.getSessionfactory().openSession();
            String query = "Delete from SFVuln where vuln_id ="+obj.getVulnarabilityId();
            session.beginTransaction().begin();
            Query sqlQuery=session.createSQLQuery(query);
            resultCode = sqlQuery.executeUpdate();
            session.beginTransaction().commit();

        }catch(Exception e){

        } finally{

            session.flush();
            session.close();
        }
        return resultCode;
    }

    public List<SFVulnarabilities> fetchSFVuln(String query) {
        Session session=null;
        List<SFVulnarabilities> vulnObj = new ArrayList<SFVulnarabilities>();
        try{
            session = MySQLDAOFactory.getSessionfactory().openSession();
            session.beginTransaction().begin();
            Query queryResult = session.createQuery(query);

            vulnObj=queryResult.list();
            System.out.println("Fetched"+vulnObj.size()+" Records");
            session.beginTransaction().commit();

        }catch(Exception e){
            System.out.println("Exception while fetching records"+e.getMessage());
        } finally{

            session.flush();
            session.close();
        }
        return vulnObj;
    }
}

