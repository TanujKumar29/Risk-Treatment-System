/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.dao.interfaces;
import com.rts.pojoclasses.*;
import java.util.List;
/**
 *
 * @author gosavpus
 */
public interface ContractReqDAO {
    

    public void addContractReqToDb(List<ContractReq> obj);
    public void modifyContractReqToDb(ContractReq obj);
    public int deleteContractReqFrmDb(ContractReq obj);
    public List<ContractReq> getContractListReqFromDb(String query);
    public void addSingleContractToDb(ContractReq obj);
}
