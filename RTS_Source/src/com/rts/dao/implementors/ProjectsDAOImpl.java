/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.dao.implementors;

import com.rts.dao.daofactory.MySQLDAOFactory;
import com.rts.dao.interfaces.ProjectsDAO;
import com.rts.pojoclasses.BusinessUnitPojo;
import com.rts.pojoclasses.ProjectSpoc;
import com.rts.pojoclasses.Projects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;

import org.hibernate.Session;
import org.infinispan.loaders.bucket.BucketBasedCacheStore;

/**
 *
 * @author gosavpus
 */
public class ProjectsDAOImpl implements ProjectsDAO{
 Session session=null;
 Query queryResult;
    //code to add BU to database
     public void addProjectToDb(Projects obj)
     {
         session = MySQLDAOFactory.getSessionfactory().openSession();
         session.getTransaction().begin();

         session.save(obj);

         session.getTransaction().commit();
         session.close();

     }

    //code to modify BU to database
     public void modifyProjectToDb(Projects obj)
    {
          session = MySQLDAOFactory.getSessionfactory().openSession();
          session.getTransaction().begin();

          session.update(obj);

          session.getTransaction().commit();
          session.close();
    }

     //code to delete BU to database
    public void deleteProjectFrmDb(Projects obj)
    {
        session = MySQLDAOFactory.getSessionfactory().openSession();
        session.beginTransaction().begin();

        queryResult = session.createQuery("delete from ProjectSpoc where projectId = "+obj.getProjectId());

        System.out.println("Spocs deleted!");

        session.delete(obj);
        System.out.println("Project Deleted");

        session.getTransaction().commit();
        session.close();


        
    }

    //code to get the list of BUs from database
    public List<Projects> getProjectFromDb(String bu)
    {
        session =MySQLDAOFactory.getSessionfactory().openSession();
        session.getTransaction().begin();

        //code to get buId to store in projects object
        queryResult=session.createSQLQuery("select bu_id from business_unit where bu_name='"+bu+"'");
        List buIdList =queryResult.list();
        int buId=(Integer)buIdList.get(0);
        System.out.println("The buId is: "+buId);

     
        //queryResult = session.createSQLQuery("select project_name from projects where bu_id = (select bu_id from business_unit where bu_name='"+str+"')");
        queryResult = session.createQuery("from Projects where businessUnit.buId = "+buId);
        List<Projects> projectsList = queryResult.list();
        session.getTransaction().commit();
        session.close();
        return projectsList;
       
    }

    public List<ProjectSpoc> getProjectSpocsFromDb(int projectId)
    {
        session =MySQLDAOFactory.getSessionfactory().openSession();
        session.getTransaction().begin();

        queryResult = session.createQuery("select spocName from ProjectSpoc where project.projectId="+projectId);
        List spocList = queryResult.list();
        session.getTransaction().commit();
        session.close();
        return spocList;

    }

    public void addSpocsToProjectToDb(ProjectSpoc projectSpoc)
    {
        session = MySQLDAOFactory.getSessionfactory().openSession();
        session.getTransaction().begin();

        session.save(projectSpoc);

        session.getTransaction().commit();
        session.close();

    }
    public void addOwnerToDb(Projects projects)
    {
        session =MySQLDAOFactory.getSessionfactory().openSession();
        session.getTransaction().begin();

        session.update(projects);

        session.getTransaction().commit();
        session.close();
    }

    public int getSpocsFromName(String names)
    {
        session= MySQLDAOFactory.getSessionfactory().openSession();
        session.getTransaction().begin();

        ProjectSpoc projectSpoc= new ProjectSpoc();
        queryResult=session.createQuery("select spocId from ProjectSpoc where spocName='"+names+"'");
        List<Integer> projectSpocsId = queryResult.list();

        Integer id=projectSpocsId.get(0);
        //int id = projectSpoc.getSpocId();
        session.getTransaction().commit();
        session.close();
        return id;
    }
     public void deleteSpocToDb(ProjectSpoc projectSpoc)
     {
         session= MySQLDAOFactory.getSessionfactory().openSession();
        session.getTransaction().begin();

        session.delete(projectSpoc);
        
        session.getTransaction().commit();
        session.close();

     }

     public void modifySpocToDb(ProjectSpoc projectSpoc)
     {
         session= MySQLDAOFactory.getSessionfactory().openSession();
        session.getTransaction().begin();

        session.update(projectSpoc);

        session.getTransaction().commit();
        session.close();

     }
}
