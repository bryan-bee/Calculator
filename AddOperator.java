//********************************************************************************************************
// CLASS: AddOperator (AddOperator.java)
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
 * Represents the addition operator which is a specific type of binary operator.
 */
public class AddOperator extends BinaryOperator {

    public AddOperator() {
    }

    /**
     * Returns the sum of the left-hand side operand and the right-hand side
     * operand.
     */
    @Override
    public Operand evaluate(Operand pLhsOperand, Operand pRhsOperand) {
        return new Operand(pLhsOperand.getValue() + pRhsOperand.getValue());
    }

    /**
     * Returns the normal precedence level of this operator.
     */
    @Override
    public int precedence() {
        return 2;
    }

    /**
     * Returns the precedence level of this operator when on it is on the
     * operator stack.
     */
    @Override
    public int stackPrecedence() {
        return 2;
    }

}
