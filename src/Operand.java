/**
 * An operand is a numeric value represented as a Double.
 */
public class Operand extends Token {

    private double mValue;

    public Operand(double pValue) {
        setValue(pValue);
    }

    /**
     * accessor method for Operand
     *
     * @return
     */
    public Double getValue() {
        return mValue;
    }

    /**
     * mutator method for Operand
     *
     * @param pValue
     */
    public void setValue(Double pValue) {
        mValue = pValue;
    }
}
