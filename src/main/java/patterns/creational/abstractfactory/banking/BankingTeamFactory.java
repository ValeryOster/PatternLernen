package patterns.creational.abstractfactory.banking;

import patterns.creational.abstractfactory.Developer;
import patterns.creational.abstractfactory.ProjectManager;
import patterns.creational.abstractfactory.ProjectTeamFactory;
import patterns.creational.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    public Tester getTester() {
        return new QMTester();
    }

    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
