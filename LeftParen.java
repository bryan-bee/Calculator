//********************************************************************************************************
// CLASS: LeftParen (LeftParen.java)
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
 * Represents a left parenthesis in the expression.
 */
public class LeftParen extends Parenthesis {

    public LeftParen() {
    }

    /**
     * Returns the normal precedence level of LeftParen which is highest at 5.
     */
    @Override
    public int precedence() {
        return 5;
    }

    /**
     * Returns the precedence level of LeftParen when on it is on the operator
     * stack, it is lowest at 0.
     */
    @Override
    public int stackPrecedence() {
        return 0;
    }

}
