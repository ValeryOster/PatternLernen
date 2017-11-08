package patterns.behavioral.observer;

public class main {
    public static void main(String[] args) {
        Aclass aclass = new Aclass();
        Bclass bclass = new Bclass();

        Amount amount = new Amount();
        amount.addObserver(aclass);
        amount.addObserver(bclass);

        amount.amountPlus();
        amount.notifyObservers();
    }
}
