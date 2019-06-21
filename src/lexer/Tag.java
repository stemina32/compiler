//same package
package lexer;

////declare all tags that will be using as int. Need a true/false tag
public class Tag {

// And + Or token ID will be 251 and 252 respectively
    public final static int AND = 251, OR = 252;

    public final static int MINUS = 269;    
//Equals etc will be 253, 254 etc respectively
    public final static int EQ = 253, NE = 254, EG = 255, LE = 256;

//for the loops and if/else we gives them token ID as well
    public final static int IF = 257, ELSE = 258, DO = 259, WHILE = 260, BREAK = 261;

//T&F token ID
    public final static int FALSE = 262, TRUE = 263;

    public final static int ID = 264, NUM = 265, REAL = 266, BASIC_TYPE = 267, ARRAY_TYPE = 268;

    



    
    
    public final static int TEMP = 273;

}
