//********************************************************************************************************
// CLASS: Operator (Operator.java)
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
 * Operator is the abstract superclass of all binary and unary operators.
 */
public abstract class Operator extends Token {

    public Operator() {

    }

    public abstract boolean isBinaryOperator();

    public abstract int precedence();

    public abstract int stackPrecedence();

}
