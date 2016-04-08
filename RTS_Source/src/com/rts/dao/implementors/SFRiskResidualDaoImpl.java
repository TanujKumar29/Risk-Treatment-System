/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rts.dao.implementors;


import com.rts.dao.daofactory.MySQLDAOFactory;
import com.rts.dao.interfaces.SFRiskResidualDao;
import com.rts.pojoclasses.SFRiskResidual;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
/**
 *
 * @author kumartan
 */
public class SFRiskResidualDaoImpl implements  SFRiskResidualDao {

    public int insertSFRiskResidual(SFRiskResidual obj) {
        Session session=null;
        int resultCode=-1;
        try{
            session=MySQLDAOFactory.getSessionfactory().openSession();
            if(obj.getRiskResidualId()==0) {
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

    public int deleteSFRiskResidual(SFRiskResidual obj) {
    Session session=null;
    int resultCode=-1;
        try{
            session=MySQLDAOFactory.getSessionfactory().openSession();
            String query = "Delete from SFRISK_RESIDUAL where RISK_RESIDUAL_ID ="+obj.getRiskResidualId();
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

    public List<SFRiskResidual> fetchSFRiskResidual(String query) {
        Session session=null;
        List<SFRiskResidual> riskTreatment = new ArrayList<SFRiskResidual>();
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

    public String[] fetchSFRiskResidualCol(String query) {
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

    

}
