package patterns.creational.builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder {
    void buildName() {
        website.setName("Enterprise web site");
    }

    void buildCms() {
        website.setCms(Cms.ALIFRESSCO);
    }

    void buildPrice() {
        website.setPrice(600);
    }
}
