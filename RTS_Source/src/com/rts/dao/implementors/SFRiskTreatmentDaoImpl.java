/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rts.dao.implementors;


import com.rts.dao.daofactory.MySQLDAOFactory;
import com.rts.dao.interfaces.SFRiskTreatmentDao;
import com.rts.pojoclasses.SFRiskTreatment;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
/**
 *
 * @author rasanvin
 */
public class SFRiskTreatmentDaoImpl implements  SFRiskTreatmentDao {

    public int insertSFRiskTreatment(SFRiskTreatment obj) {
        Session session=null;
        int resultCode=-1;
        try{
            session=MySQLDAOFactory.getSessionfactory().openSession();
            if(obj.getRiskTreatmentId()==0) {
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
            System.out.println("Exception while fetching Risk Treatment:"+e.getMessage());
        }
        finally{
            session.flush();
            session.close();
        }
        return resultCode;
   }

    public int deleteSFRiskTreatment(SFRiskTreatment obj) {
    Session session=null;
    int resultCode=-1;
        try{
            session=MySQLDAOFactory.getSessionfactory().openSession();
            String query = "Delete from SFRISK_TREATMENT where RISK_TREATMENT_ID ="+obj.getRiskTreatmentId();
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

    public List<SFRiskTreatment> fetchSFRiskTreatment(String query) {
        Session session=null;
        List<SFRiskTreatment> riskTreatment = new ArrayList<SFRiskTreatment>();
        try{
            session = MySQLDAOFactory.getSessionfactory().openSession();
            session.beginTransaction().begin();
            Query queryResult = session.createQuery(query);
            
            riskTreatment=queryResult.list();
            System.out.println("Fetched "+riskTreatment.size()+" Records");
            session.beginTransaction().commit();
            
        }catch(Exception e){
            System.out.println("Exception while fetching records"+e.getMessage());
        } finally{

            session.flush();
            session.close();
        }
        return riskTreatment;
    }

    public String[] fetchSFRiskTreatmentCol(String query) {
        Session session=null;
        String[] colData=null;
        List<String> list= new ArrayList<String>();
        try{
            session = MySQLDAOFactory.getSessionfactory().openSession();
            session.beginTransaction().begin();
            Query queryResult = session.createQuery(query);
            list=queryResult.list();

            colData= (String[])list.toArray(new String[list.size()]);
            System.out.println("Fetched"+queryResult.list().size()+"Risk Treatment Type Records");
            session.beginTransaction().commit();

        }catch(Exception e){
            System.out.println("Exception while fetching Column records for Risk Treatment"+e.getMessage());
        } finally{

            session.flush();
            session.close();
        }
        return colData;
    }

}
