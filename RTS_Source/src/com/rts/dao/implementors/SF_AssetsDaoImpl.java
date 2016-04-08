/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.dao.implementors;

import com.rts.dao.daofactory.MySQLDAOFactory;
import com.rts.dao.interfaces.SF_AssetsDao;
import com.rts.pojoclasses.SF_Assets;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
/**
 *
 * @author rasanvin
 */
public class SF_AssetsDaoImpl implements SF_AssetsDao {

    public int insetSF_AssetsToDb(SF_Assets obj) {
        Session session=null;
        int resultCode=-1;
        try{
            session=MySQLDAOFactory.getSessionfactory().openSession();
            if(obj.getAssetId()==0) {
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

    public int deleteSF_AssetsFromDb(SF_Assets obj) {
    Session session=null;
    int resultCode=-1;
        try{
            session=MySQLDAOFactory.getSessionfactory().openSession();
            String query = "Delete from SF_ASSETS where Asset_id ="+obj.getAssetId();
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

    public List<SF_Assets> fetchSF_AssetsListFromDb(String query) {
        Session session=null;
        List<SF_Assets> assets = new ArrayList<SF_Assets>();
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

    public String[] fetchSF_AssetsCol(String query) {
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
