/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.dao.implementors;


import com.rts.dao.daofactory.MySQLDAOFactory;
import com.rts.dao.interfaces.RiskEvaluationDao;
import com.rts.pojoclasses.RiskEvaluation;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
/**
 *
 * @author rasanvin
 */
public class RiskEvaluationDaoImpl implements  RiskEvaluationDao {

    public int insertRiskEvaluation(RiskEvaluation obj) {
        Session session=null;
        int resultCode=-1;
        try{
            session=MySQLDAOFactory.getSessionfactory().openSession();
            if(obj.getRiskEvaluationId()==0) {
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

    public int deleteRiskEvaluation(RiskEvaluation obj) {
    Session session=null;
    int resultCode=-1;
        try{
            session=MySQLDAOFactory.getSessionfactory().openSession();
            String query = "Delete from RISK_EVALUATION where RISK_EVALUATION_ID ="+obj.getRiskEvaluationId();
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

    public List<RiskEvaluation> fetchRiskEvaluation(String query) {
        Session session=null;
        List<RiskEvaluation> Risks = new ArrayList<RiskEvaluation>();
        try{
            session = MySQLDAOFactory.getSessionfactory().openSession();
            session.beginTransaction().begin();
            Query queryResult = session.createQuery(query);
            
            Risks=queryResult.list();
            System.out.println("Fetched "+Risks.size()+" Records");
            session.beginTransaction().commit();
            
        }catch(Exception e){
            System.out.println("Exception while fetching records"+e.getMessage());
        } finally{

            session.flush();
            session.close();
        }
        return Risks;
    }

    public String[] fetchRiskEvaluationCol(String query) {
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
        return colData;    }

}
