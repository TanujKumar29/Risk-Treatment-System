/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.dao.daofactory;

import com.rts.dao.implementors.AssetsDaoImpl;
import com.rts.dao.implementors.AssetsThreatsVulnDaoImpl;
import com.rts.dao.implementors.BusinessUnitDAOImpl;
import com.rts.dao.implementors.ContractReqDAOImpl;
import com.rts.dao.implementors.ProjectsDAOImpl;
import com.rts.dao.implementors.ReportsDAOImpl;
import com.rts.dao.implementors.RiskEvaluationDaoImpl;
import com.rts.dao.implementors.RiskTreatmentDaoImpl;
import com.rts.dao.implementors.SFAssetsThreatsVulnDaoImpl;
import com.rts.dao.implementors.SFRiskEvaluationDaoImpl;
import com.rts.dao.implementors.SFRiskResidualDaoImpl;
import com.rts.dao.implementors.SFRiskTreatmentDaoImpl;
import com.rts.dao.implementors.SFThreatsDaoImpl;
import com.rts.dao.implementors.SFVulnDaoImpl;
import com.rts.dao.implementors.SF_AssetsDaoImpl;
import com.rts.dao.implementors.SupportFunctionsDaoImpl;
import com.rts.dao.implementors.ThreatsDaoImpl;
import com.rts.dao.implementors.VulnDaoImpl;
import com.rts.dao.interfaces.AssetsDao;
import com.rts.dao.interfaces.AssetsThreatsVulnDao;
import com.rts.dao.interfaces.BusinessUnitDAO;
import com.rts.dao.interfaces.ContractReqDAO;
import com.rts.dao.interfaces.ProjectsDAO;
import com.rts.dao.interfaces.ReportsDAO;
import com.rts.dao.interfaces.RiskEvaluationDao;
import com.rts.dao.interfaces.RiskTreatmentDao;
import com.rts.dao.interfaces.SFAssetsThreatsVulnDao;
import com.rts.dao.interfaces.SFRiskEvaluationDao;
import com.rts.dao.interfaces.SFRiskResidualDao;
import com.rts.dao.interfaces.SFRiskTreatmentDao;
import com.rts.dao.interfaces.SFThreatsDao;
import com.rts.dao.interfaces.SF_AssetsDao;
import com.rts.dao.interfaces.SupportFunctionsDAO;
import com.rts.dao.interfaces.ThreatsDao;
import com.rts.dao.interfaces.VulnDao;

import com.rts.dao.interfaces.SFAssetsThreatsVulnDao;
import com.rts.dao.interfaces.SFVulnDao;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class MySQLDAOFactory{
        private static MySQLDAOFactory daoFactory;
        private static SessionFactory sessionFactory;

        static{
               daoFactory = new MySQLDAOFactory();
               sessionFactory = new Configuration().configure().buildSessionFactory();
        }

        //Define the factory method, return the instance of specific classes
        public static MySQLDAOFactory getDAOFactory(){
               return daoFactory;
        }

        public static SessionFactory getSessionfactory(){
            return sessionFactory;
        }

        public ContractReqDAO getContractReqDAO(){
               return new ContractReqDAOImpl();
        }

        public BusinessUnitDAO getBUDAO()
        {
            return new BusinessUnitDAOImpl();
        }

        public ProjectsDAO getProjectsDAO()
        {
            return new ProjectsDAOImpl();
        }
   public AssetsDao getAssetsDao(){
            return new AssetsDaoImpl();
        }

    public ThreatsDao getThreatsDao(){
            return new ThreatsDaoImpl();
        }
        public VulnDao getVulnDao(){
            return new VulnDaoImpl();
        }
        public AssetsThreatsVulnDao getAssetsThreatsVulnDao(){
            return new AssetsThreatsVulnDaoImpl();
        }

        public SupportFunctionsDAO getSupportFunctionsDAO()
        {
            return new SupportFunctionsDaoImpl();
        }

          public RiskEvaluationDao getRiskEvaluationDao(){
            return new RiskEvaluationDaoImpl();
        }
        public RiskTreatmentDao getRiskTreatmentDao(){
            return new RiskTreatmentDaoImpl();
        }
          public ReportsDAO getReportsDao(){
            return new ReportsDAOImpl();
        }
           public SFAssetsThreatsVulnDao getSFAssetsThreatsVulnDao(){
            return new SFAssetsThreatsVulnDaoImpl();
        }

            public SFRiskEvaluationDao getSFRiskEvaluationDao(){
            return new SFRiskEvaluationDaoImpl();
        }
        public SFRiskTreatmentDao getSFRiskTreatmentDao(){
            return new SFRiskTreatmentDaoImpl();
        }
       public SFRiskResidualDao getSFRiskResidualDao()
        {
          return new SFRiskResidualDaoImpl();
         }
      
         public SFThreatsDao getSFThreatsDao(){
            return new SFThreatsDaoImpl();
        }
         public SF_AssetsDao getSF_AssetsDao(){
            return new SF_AssetsDaoImpl();
        }

          public SFVulnDao getSFVulnDao(){
            return new SFVulnDaoImpl();
        }
   
}