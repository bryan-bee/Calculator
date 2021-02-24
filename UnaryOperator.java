//********************************************************************************************************
// CLASS: UnaryOperator (UnaryOperator.java)
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Spring 2021
// Project Number: 4
// Team Name: gg
// AUTHOR:
// Bryan Bee, bbee2, bbee2@asu.edu
// Camille Wolf, ceswan, ceswan@asu.edu
// Anthony Passetti, apassett, apassett@asu.edu
//********************************************************************************************************

/**
 * UnaryOperator is the superclass of all unary operators.
 */
public abstract class UnaryOperator extends Operator {

    public UnaryOperator() {
    }

    /**
     * Called to evaluate the operator.
     */
    public abstract Operand evaluate(Operand pOperand);

    /**
     * Returns false since all subclasses of UnaryOperator are unary operators.
     */
    @Override
    public boolean isBinaryOperator() {
        return false;
    }

}
