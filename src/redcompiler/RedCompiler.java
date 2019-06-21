/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package redcompiler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import lexer.Lexer;
import parser.Parser;

/**
 *
 * @author amanuel
 */
public class RedCompiler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream(new File(args[0])));
        Lexer lexer = new Lexer();
        Parser parser = new Parser(lexer);
        parser.start();
    }
    
}
