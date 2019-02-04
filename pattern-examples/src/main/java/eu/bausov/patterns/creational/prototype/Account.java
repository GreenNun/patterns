package eu.bausov.patterns.creational.prototype;

/**
 * Created by GreenNun on 2019-02-04.
 */
public abstract class Account implements Cloneable {
    public abstract void accountType();

    @Override
    protected Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
