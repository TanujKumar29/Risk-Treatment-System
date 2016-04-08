/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.dao.implementors;


import com.rts.dao.interfaces.ContractReqDAO;
import com.rts.dao.daofactory.MySQLDAOFactory;
import com.rts.pojoclasses.ContractReq;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author gosavpus
 */
public class ContractReqDAOImpl implements ContractReqDAO
{
    public int deleteContractReqFrmDb(ContractReq reqObj){
    Session session=null;
    int row=-1;
                try
                {
                    session =MySQLDAOFactory.getSessionfactory().openSession();
                    session.getTransaction().begin();
                    //create TAble object.
                    String hql = "delete from ContractReq contractreq where contractId = "+reqObj.getContractReqId();
                    Query query = session.createQuery(hql);
                     row = query.executeUpdate();
                    session.getTransaction().commit();
                }
                catch (Exception e)
                {
                  System.out.println("Eception while deleting a row"+e.getMessage());
                }
                finally
                {
                    session.flush();
                    session.close();

                }
          return row;
    }

    public void addContractReqToDb(List<ContractReq> obj)
    {
        Session session =null;
                try
                {
                    session = MySQLDAOFactory.getSessionfactory().openSession();
                    System.out.println("after session: "+session.isConnected());
                    session.getTransaction().begin();
                    for(ContractReq i:obj)
                    {
                        if(i.getContractReqId()==0){
                        System.out.println("adding row to db: "+ i);
                        session.save(i);
                        } else {
                            System.out.println("Updating row to db: "+ i);
                            session.update(i);
                        }
                    }
                    session.getTransaction().commit();
                }
                catch (Exception e)
                {
                    System.out.println("Exception in Adding Row: "+e.getMessage());
                }
                finally
                {
                    if (session.isConnected()){
                    session.flush();
                    session.close();
                    }
                }
    }

    public void modifyContractReqToDb(ContractReq obj){
        System.out.println("modifyContractReqToDb called!!");
    }

    public List<ContractReq> getContractListReqFromDb(String query){
        Session session=null;
        List<ContractReq> ContractObjList = new ArrayList<ContractReq>();
        try{
        session=MySQLDAOFactory.getSessionfactory().openSession();
        session.beginTransaction().begin();
           Query queryResult = session.createQuery(query);
           ContractObjList = queryResult.list();
        session.beginTransaction().commit();
        }catch(Exception e){
            System.out.println("Exception while fetching Records from ContractReq table"+e.getMessage());
        } finally{
            if(session.isConnected()){
                session.flush();
                session.close();
            }
        }

        return ContractObjList;
    }

        public void addSingleContractToDb(ContractReq obj)
        {
             Session session =null;
            session = MySQLDAOFactory.getSessionfactory().openSession();
            session.getTransaction().begin();

            session.save(obj);

            session.flush();
            session.close();
        }
}
