/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.dao.implementors;

import com.rts.dao.daofactory.MySQLDAOFactory;
import com.rts.dao.interfaces.SFThreatsDao;
import com.rts.pojoclasses.SFThreats;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
/**
 *
 * @author rasanvin
 */
public class SFThreatsDaoImpl implements SFThreatsDao {

    public int insertSFThreats(SFThreats obj) {
        Session session=null;
        int resultCode=-1;
        try{
            session=MySQLDAOFactory.getSessionfactory().openSession();
            if(obj.getThreatId()==0) {
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

    public int deleteSFThreats(SFThreats obj) {
    Session session=null;
    int resultCode=-1;
        try{
            session=MySQLDAOFactory.getSessionfactory().openSession();
            String query = "Delete from SFThreat where Asset_id ="+obj.getThreatId();
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

    public String[] fetchSFThreatsCol(String query) {
        Session session=null;
        String[] colData=null;
        List<String> list= new ArrayList<String>();
        try{
            session = MySQLDAOFactory.getSessionfactory().openSession();
            session.beginTransaction().begin();
            Query queryResult = session.createQuery(query);
            list=queryResult.list();
            
            colData= (String[])list.toArray(new String[list.size()]);
            System.out.println("Fetched"+queryResult.list().size()+"Threat Type Records");
            session.beginTransaction().commit();
            
        }catch(Exception e){
            System.out.println("Exception while fetching Column records for Threats"+e.getMessage());
        } finally{

            session.flush();
            session.close();
        }
        return colData;
    }
        public List<SFThreats> fetchSFThreats(String query) {
        Session session=null;
        List<SFThreats> threat = new ArrayList<SFThreats>();
        try{
            session = MySQLDAOFactory.getSessionfactory().openSession();
            session.beginTransaction().begin();
            Query queryResult = session.createQuery(query);

            threat=queryResult.list();
            System.out.println("Fetched"+threat.size()+" Records");
            session.beginTransaction().commit();

        }catch(Exception e){
            System.out.println("Exception while fetching records"+e.getMessage());
        } finally{

            session.flush();
            session.close();
        }
        return threat;
    }

public String[] fetchSFThreatsForType(String query){
        Session session=null;
        String[] colData=null;
        List<String> list= new ArrayList<String>();
        try{
            session = MySQLDAOFactory.getSessionfactory().openSession();
            session.beginTransaction().begin();
            Query queryResult = session.createQuery(query);
            list=queryResult.list();

            colData= (String[])list.toArray(new String[list.size()]);
            System.out.println("Fetched"+queryResult.list().size()+"Threat Type Records");
            session.beginTransaction().commit();
            
        }catch(Exception e){
            System.out.println("Exception while fetching Column records for SFThreats"+e.getMessage());
        } finally{

            session.flush();
            session.close();
        }
        return colData;

}
}
