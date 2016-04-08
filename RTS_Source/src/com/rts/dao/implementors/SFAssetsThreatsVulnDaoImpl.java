/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.dao.implementors;

import com.rts.dao.daofactory.MySQLDAOFactory;
import com.rts.dao.interfaces.SFAssetsThreatsVulnDao;
import com.rts.pojoclasses.SFAssetsThreatsVuln;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
/**
 *
 * @author kumartan
 */
public class SFAssetsThreatsVulnDaoImpl implements  SFAssetsThreatsVulnDao {

    public int insetSFAssetsThreatsVuln(SFAssetsThreatsVuln obj) {
        Session session=null;
        int resultCode=-1;
        try{
            session=MySQLDAOFactory.getSessionfactory().openSession();
            if(obj.getAssetsThreatsVulnId()==0) {
                session.beginTransaction().begin();
                     session.save(obj);
                     resultCode=0;
                session.beginTransaction().commit();

            }
            else{
                session.beginTransaction().begin();
                session.update(obj);
                resultCode=1;
                session.beginTransaction().commit();
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

    public int deleteSFAssetsThreatsVuln(SFAssetsThreatsVuln obj) {
    Session session=null;
    int resultCode=-1;
        try{
            session=MySQLDAOFactory.getSessionfactory().openSession();
            String query = "Delete from SFASSETS_THREATS_VULN where ASSET_THREAT_VULN_ID ="+obj.getAssetsThreatsVulnId();
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

    public List<SFAssetsThreatsVuln> fetchSFAssetsThreatsVuln(String query) {
        Session session=null;
        List<SFAssetsThreatsVuln> assetsThreatsVuln = new ArrayList<SFAssetsThreatsVuln>();
        try{
            session = MySQLDAOFactory.getSessionfactory().openSession();
            session.beginTransaction().begin();
            Query queryResult = session.createQuery(query);
            
            assetsThreatsVuln=queryResult.list();
            System.out.println("Fetched"+assetsThreatsVuln.size()+" Records");
            session.beginTransaction().commit();
            
        }catch(Exception e){
            System.out.println("Exception while fetching records"+e.getMessage());
        } finally{

            session.flush();
            session.close();
        }
        return assetsThreatsVuln;
    }
}
