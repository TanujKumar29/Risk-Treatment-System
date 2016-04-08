/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.dao.implementors;

import com.rts.dao.daofactory.MySQLDAOFactory;
import com.rts.dao.interfaces.AssetsDao;
import com.rts.pojoclasses.Assets;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
/**
 *
 * @author rasanvin
 */
public class AssetsDaoImpl implements  AssetsDao {

    public int insetAssetsToDb(Assets obj) {
        Session session=null;
        int resultCode=-1;
        try{
            session=MySQLDAOFactory.getSessionfactory().openSession();
            if(obj.getAssetId()==0)
            {
                session.beginTransaction().begin();
                session.save(obj);
                resultCode=0;
                System.out.println("Result code: "+resultCode+" and projectId = "+obj.getProjectId().getProjectId());
                session.beginTransaction().commit();
            }
            else
            {
                session.update(obj);
                resultCode=1;
                System.out.println("Result code: "+resultCode+" and projectId = "+obj.getProjectId().getProjectId());
            }
        }
        catch (Exception e)
        {
            System.out.println("Exception while fetching Asset:"+e.getMessage());
        }
        finally
        {
            session.flush();
            session.close();
        }
        return resultCode;
   }

    public int deleteAssetsFromDb(Assets obj) {
    Session session=null;
    int resultCode=-1;
        try{
            session=MySQLDAOFactory.getSessionfactory().openSession();
            String query = "Delete from ASSETS where Asset_id ="+obj.getAssetId();
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

    public List<Assets> fetchAssetsListFromDb(String query) {
        Session session=null;
        List<Assets> assets = new ArrayList<Assets>();
        try{
            session = MySQLDAOFactory.getSessionfactory().openSession();
            session.beginTransaction().begin();
            Query queryResult = session.createQuery(query);
            
            assets=queryResult.list();
            System.out.println("Fetched"+assets.size()+" Records");
            session.beginTransaction().commit();
            
        }catch(Exception e){
            System.out.println("Exception while fetching records"+e.getMessage());
        } finally{

            session.flush();
            session.close();
        }
        return assets;
    }

     public String[] fetchAssetsCol(String query) {
        Session session=null;
        String[] colData=null;
        List<String> list= new ArrayList<String>();
        try{
            session = MySQLDAOFactory.getSessionfactory().openSession();
            session.beginTransaction().begin();

            Query queryResult = session.createQuery(query);
            list=queryResult.list();

            colData= (String[])list.toArray(new String[list.size()]);
            System.out.println("Fetched"+queryResult.list().size()+"Assets Names Records");
            session.beginTransaction().commit();

        }catch(Exception e){
            System.out.println("Exception while fetching Column records for Assets: "+e.getMessage());
        } finally{

            session.flush();
            session.close();
        }
        return colData;
    }

}
