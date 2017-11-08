package patterns.creational.abstractfactory.website;

import patterns.creational.abstractfactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    public void manageProject() {
        System.out.println("Website PM manages Website project..");
    }
}
