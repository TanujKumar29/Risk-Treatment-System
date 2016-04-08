/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rts.dao.implementors;


import com.rts.dao.daofactory.MySQLDAOFactory;
import com.rts.dao.interfaces.RiskTreatmentDao;
import com.rts.pojoclasses.RiskTreatment;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
/**
 *
 * @author rasanvin
 */
public class RiskTreatmentDaoImpl implements  RiskTreatmentDao {

    public int insertRiskTreatment(RiskTreatment obj) {
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

    public int deleteRiskTreatment(RiskTreatment obj) {
    Session session=null;
    int resultCode=-1;
        try{
            session=MySQLDAOFactory.getSessionfactory().openSession();
            String query = "Delete from RISK_TREATMENT where RISK_TREATMENT_ID ="+obj.getRiskTreatmentId();
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

    public List<RiskTreatment> fetchRiskTreatment(String query) {
        Session session=null;
        List<RiskTreatment> riskTreatment = new ArrayList<RiskTreatment>();
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

    public String[] fetchRiskTreatmentCol(String query) {
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
