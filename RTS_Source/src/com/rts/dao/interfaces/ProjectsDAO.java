/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rts.dao.interfaces;

import com.rts.pojoclasses.ProjectSpoc;
import com.rts.pojoclasses.Projects;
import java.util.List;

/**
 *
 * @author gosavpus
 */
public interface ProjectsDAO
{
    public void addProjectToDb(Projects obj);
    //public void addProjectOwner(String name);
    public void modifyProjectToDb(Projects obj);
    public void deleteProjectFrmDb(Projects projName);
    public List<Projects> getProjectFromDb(String buName);
    public List<ProjectSpoc> getProjectSpocsFromDb(int projId);
    public void addSpocsToProjectToDb(ProjectSpoc projectSpoc);
    public void addOwnerToDb(Projects projects);
    public int getSpocsFromName(String names);
    public void deleteSpocToDb(ProjectSpoc projectSpoc);
    public void modifySpocToDb(ProjectSpoc projectSpoc);
}
