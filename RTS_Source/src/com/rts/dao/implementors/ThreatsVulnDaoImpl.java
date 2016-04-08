/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.dao.implementors;

import com.rts.dao.daofactory.MySQLDAOFactory;
import com.rts.dao.interfaces.ThreatsVulnDao;
import com.rts.pojoclasses.ThreatsVulnarabilities;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author rasanvin
 */
public class ThreatsVulnDaoImpl implements  ThreatsVulnDao {

    public int insetThreatsVuln(ThreatsVulnarabilities obj) {
        Session session=null;
        int resultCode=-1;
        try{
            session=MySQLDAOFactory.getSessionfactory().openSession();
            if(obj.getThreatVulnarabilityId()==0) {
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
            System.out.println("Exception while fetching Asset:"+e.getMessage());
        }
        finally{
            session.flush();
            session.close();
        }
        return resultCode;
   }

    public int deleteThreatsVuln(ThreatsVulnarabilities obj) {
    Session session=null;
    int resultCode=-1;
        try{
            session=MySQLDAOFactory.getSessionfactory().openSession();
            String query = "Delete from THREATS_VULNARABILITIES where THREAT_VULNARABILITY_ID ="+obj.getThreatVulnarabilityId();
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

    public List<ThreatsVulnarabilities> fetchThreatsVulnPair(String query) {
        Session session=null;
        List<ThreatsVulnarabilities> threatsVuln = new ArrayList<ThreatsVulnarabilities>();
        try{
            session = MySQLDAOFactory.getSessionfactory().openSession();
            session.beginTransaction().begin();
            Query queryResult = session.createQuery(query);
            
            threatsVuln=queryResult.list();
            System.out.println("Fetched"+threatsVuln.size()+" Records");
            session.beginTransaction().commit();
            
        }catch(Exception e){
            System.out.println("Exception while fetching records"+e.getMessage());
        } finally{

            session.flush();
            session.close();
        }
        return threatsVuln;
    }
}
