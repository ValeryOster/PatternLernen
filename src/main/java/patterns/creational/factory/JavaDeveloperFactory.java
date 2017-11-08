package patterns.creational.factory;

public class JavaDeveloperFactory implements DeveloperFactory{

    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
