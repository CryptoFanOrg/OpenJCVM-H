/*
 * ParseUtils.java
 *
 * Created on 2007��12��1��, ����5:30
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sourceforge.openjcvm.parser;

/**
 *
 * @author Louis
 */
public class ParseUtils {
    
    /** Creates a new instance of ParseUtils */
    public ParseUtils() {
    }
    
    public static int makeInt(byte[] bArray, int startPos){
        return  (0xFF&bArray[startPos]<<24)|
                (0xFF&bArray[startPos+1]<<16)|
                (0xFF&bArray[startPos+2]<<8)|
                (0xFF&bArray[startPos+3]);
    }
    
    public static int makeShortInt(byte[] bArray, int startPos){
        return (0xFF&bArray[startPos])<<8|(0xFF&bArray[startPos+1]);
        
    }
    
}
