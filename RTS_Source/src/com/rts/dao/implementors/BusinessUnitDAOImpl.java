/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.dao.implementors;

import com.rts.dao.daofactory.MySQLDAOFactory;
import com.rts.dao.interfaces.BusinessUnitDAO;
import com.rts.pojoclasses.BusinessUnitPojo;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author gosavpus
 */
public class BusinessUnitDAOImpl  implements BusinessUnitDAO
{
    Session session=null;
    Query queryResult;
    //code to add BU to database
     public void addBUToDb(BusinessUnitPojo obj)
     {
        session = MySQLDAOFactory.getSessionfactory().openSession();
         session.beginTransaction().begin();

         session.save(obj);

         session.getTransaction().commit();
         session.close();

       

     }

    //code to modify BU to database
     public void modifyBUToDb(BusinessUnitPojo obj)
    {
         session = MySQLDAOFactory.getSessionfactory().openSession();
         session.getTransaction().begin();
         System.out.println("Bu ID is: "+obj.getBuId());
         session.update(obj);

         session.getTransaction().commit();
         session.close();
    }

     //code to delete BU to database
    public void deleteBUFrmDb(String obj)
    {
        session = MySQLDAOFactory.getSessionfactory().openSession();
         session.beginTransaction().begin();
       BusinessUnitPojo businessUnitPojo = new BusinessUnitPojo();
       businessUnitPojo.setBuName(obj);


         System.out.println("BU to be deleted: "+obj);
         queryResult = session.createSQLQuery("select bu_id from business_unit where bu_name='"+obj+"'");
         List buList = queryResult.list();

         int buId= (Integer)buList.get(0);
         
         businessUnitPojo.setBuId(buId);

         session.delete(businessUnitPojo);


         session.getTransaction().commit();
         session.close();
    }

    //code to get the list of BUs from database
    public Object[] getBUFromDb()
    {
        session =MySQLDAOFactory.getSessionfactory().openSession();
        session.getTransaction().begin();

        queryResult = session.createQuery("select buName from BusinessUnitPojo");
        List allCReq;
         allCReq =  queryResult.list();
        
         Object [] array=allCReq.toArray();
          
         session.getTransaction().commit();

         session.close();

         return array;

       // return new ArrayList<BusinessUnitPojo>();
    }

    public int getBuForProjectFromDb(String str)
    {
        
         session = MySQLDAOFactory.getSessionfactory().openSession();
        session.beginTransaction().begin();
       queryResult=session.createSQLQuery("select bu_id from business_unit where bu_name='"+str+"'");
        List buIdList =queryResult.list();
        int buId=(Integer)buIdList.get(0);

        session.getTransaction().commit();
        session.close();
        return buId;
    }

     
}
