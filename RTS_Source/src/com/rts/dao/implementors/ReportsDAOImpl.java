 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.dao.implementors;

import com.rts.dao.interfaces.ReportsDAO;
import com.rts.dao.daofactory.MySQLDAOFactory;
import com.rts.pojoclasses.Assets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.classic.Session;


/**
 *
 * @author panwadee
 */
public class ReportsDAOImpl implements ReportsDAO{
    
    public List<Object> fetchAssetRegisterFromDb(String query)
    {
         Session session=null;
         //List<Assets> assets = new ArrayList<Assets>();
          List<Object> assetList = new ArrayList<Object>();
         try{
            session = MySQLDAOFactory.getSessionfactory().openSession();
            session.beginTransaction().begin();
            Query queryResult = session.createSQLQuery(query);
            
            //assets=(List<Assets>) queryResult.list();
            assetList = queryResult.list();
            System.out.println("Fetched"+assetList.size()+" Records");
            session.beginTransaction().commit();
            
            
        }catch(Exception e){
            System.out.println("Exception while fetching records"+e.getMessage());
        } finally{

            session.flush();
            session.close();
        }
        return assetList;
    }
    
    public List<Object> fetchContractualReqFromDb(String query)
    {
        Session session=null;
         //List<Assets> assets = new ArrayList<Assets>();
        System.out.println("Inside fetchContractualReqFromDb");
          List<Object> ContractualReq = new ArrayList<Object>();
         try{
             System.out.println("Inside fetchContractualReqFromDb try");
            session = MySQLDAOFactory.getSessionfactory().openSession();
            session.beginTransaction().begin();
            System.out.println("Fetching queryresult");
            Query queryResult = session.createSQLQuery(query);
            
            System.out.println("Fetched queryresult");
            ContractualReq = queryResult.list();
            System.out.println("Fetched"+ContractualReq.size()+" Records");
            session.beginTransaction().commit();
            
            
        }catch(Exception e){
            System.out.println("Exception while fetching records"+e.getMessage());
        } finally{

            session.flush();
            session.close();
        }
        return ContractualReq;
    }
    public List<Object> fetchRiskAssessmentReportFromDb(String query)
    {
        Session session=null;
         //List<Assets> assets = new ArrayList<Assets>();
          List<Object> RiskAssessmentReport = new ArrayList<Object>();
         try{
            session = MySQLDAOFactory.getSessionfactory().openSession();
            session.beginTransaction().begin();
            Query queryResult = session.createSQLQuery(query);
            
           
            RiskAssessmentReport = queryResult.list();
            System.out.println("Fetched"+RiskAssessmentReport.size()+" Records");
            session.beginTransaction().commit();
            
            
        }catch(Exception e){
            System.out.println("Exception while fetching records"+e.getMessage());
        } finally{

            session.flush();
            session.close();
        }
        return RiskAssessmentReport;
    }

}
