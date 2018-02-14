/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_1;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author vcarvado7.alumnes
 */
public class Practica_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("test_file");
        
        try{
            file.createNewFile();
            ComUtils cmUtils = new ComUtils(file);
            cmUtils.writeTest();
            System.out.println(cmUtils.readTest());
        }catch(IOException e){
            System.out.println("Error found during Operation:" + e.getMessage());
            e.printStackTrace();
        }
    }
    
}
