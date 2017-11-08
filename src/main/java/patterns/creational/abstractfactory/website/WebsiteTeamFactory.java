package patterns.creational.abstractfactory.website;

import patterns.creational.abstractfactory.Developer;
import patterns.creational.abstractfactory.ProjectManager;
import patterns.creational.abstractfactory.ProjectTeamFactory;
import patterns.creational.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {

    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    public Tester getTester() {
        return new ManualTester();
    }

    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
