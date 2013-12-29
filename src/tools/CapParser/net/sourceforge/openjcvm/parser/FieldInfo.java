/*
 * FieldInfo.java
 *
 * Created on 2007��12��1��, ����10:49
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sourceforge.openjcvm.parser;

import java.util.*;
/**
 *
 * @author Louis
 */
public class FieldInfo {
    protected byte bToken;
    protected int accessFlags;
    protected int nameIndex;
    protected int descriptorIndex;
    protected ArrayList attribList;
    private String sFieldName;
    private String sDescipotName;
    
    /** Creates a new instance of FieldInfo */
    public FieldInfo() {
        attribList=new ArrayList();
    }

    public String toString() {
        return this.sFieldName+" "+this.sDescipotName;
    }

    public void setFieldName(String sFieldName) {
        this.sFieldName=sFieldName;
    }

    public void setDescipotName(String sDescipotName) {
        this.sDescipotName = sDescipotName;
    }
}
