//**************************************************************************************************************
// CLASS: MultOperator
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering Program
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// http://www.devlang.com
//**************************************************************************************************************

/**
 * Represents the multiplication operator which is a specific type of binary operator.
 */
public class MultOperator extends BinaryOperator {
    public MultOperator() {
        
    }
    
    public Operand evaluate(Operand pLhsOperand, Operand pRhsOperand) {
        return new Operand(pLhsOperand.getValue() * pRhsOperand.getValue());
    }
    
    public int precedence() {
      return 3;
    }
    
    public int stackPrecedence() {
        return 3;
    }
}