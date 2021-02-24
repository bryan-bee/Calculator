//********************************************************************************************************
// CLASS: BinaryOperator (BinaryOperator.java)
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Spring 2021
// Project Number: 4
// TEAM NAME: gg
// AUTHOR:
// Bryan Bee, bbee2, bbee2@asu.edu
// Camille Wolf, ceswan, ceswan@asu.edu
// Anthony Passetti, apassett, apassett@asu.edu
//********************************************************************************************************

/**
 * BinaryOperator is the superclass of all binary operators.
 */
public abstract class BinaryOperator extends Operator {

    public BinaryOperator() {
    }

    /**
     * Called to evaluate the operator.
     */
    public abstract Operand evaluate(Operand pLhsOperand, Operand pRhsOperand);

    /**
     * Returns true since all subclasses of BinaryOperator are binary operators.
     */
    @Override
    public boolean isBinaryOperator() {
        return true;
    }

}
