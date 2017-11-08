package patterns.creational.abstractfactory.website;

import patterns.creational.abstractfactory.Developer;

public class PhpDeveloper implements Developer {

    public void writeCode() {
        System.out.println("Write some PHP code...");
    }
}
