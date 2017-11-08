package patterns.behavioral.observer;

import java.util.Observable;

public class Amount extends Observable{
    private int amount = 0;

    public void amountPlus() {
        this.amount++;
        super.setChanged();
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
        super.setChanged();
    }
}

