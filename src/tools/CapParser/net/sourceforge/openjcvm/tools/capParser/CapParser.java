/*
 * CapParser.java
 *
 * Created on 2007��11��30��, ����11:49
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sourceforge.openjcvm.tools.capParser;


/**
 *
 * @author Louis
 */
public class CapParser {
    
    /** Creates a new instance of CapParser */
    public CapParser() {
    }
    
    public static void main(String[] args){
        String sFileName="NullApp.cap";
        
        try{
            //Tools.unzip(sFileName,".\\");
            Tools.readCap(sFileName);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
