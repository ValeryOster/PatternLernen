package patterns.creational.abstractfactory.banking;

import patterns.creational.abstractfactory.ProjectManager;

public class BankingPM implements ProjectManager {
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
