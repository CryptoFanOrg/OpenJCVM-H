/*
 * ConstantClass.java
 *
 * Created on 2007��12��1��, ����8:53
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sourceforge.openjcvm.parser;

/**
 *
 * @author Louis
 */
public class ConstantClass {
    private int iIndex;
    private String className;
    
    /** Creates a new instance of ConstantClass */
    public ConstantClass() {
    }

    public int getIIndex() {
        return iIndex;
    }

    public void setIIndex(int iIndex) {
        this.iIndex = iIndex;
    }
    
    public void setClassName(String sClassName){
        this.className = sClassName;
    }
    
    public String toString(){
        return this.className;
    }
}
