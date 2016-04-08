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
import com.rts.dao.interfaces.VulnDao;
import com.rts.pojoclasses.Threats;
import com.rts.pojoclasses.Vulnarabilities;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
public class VulnDaoImpl implements VulnDao{
    public int insertVuln(Vulnarabilities obj) {
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

    public int deleteVuln(Vulnarabilities obj) {
    Session session=null;
    int resultCode=-1;
        try{
            session=MySQLDAOFactory.getSessionfactory().openSession();
            String query = "Delete from Vuln where vuln_id ="+obj.getVulnarabilityId();
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

    public List<Vulnarabilities> fetchVuln(String query) {
        Session session=null;
        List<Vulnarabilities> vulnObj = new ArrayList<Vulnarabilities>();
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

