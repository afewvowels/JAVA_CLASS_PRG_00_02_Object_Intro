/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_class_prg_00_02_object_intro;

import java.util.Stack;
/**
 *
 * @author kbsmith01
 */
public class Demo {
    public static void mani(String[] args) {
        
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        s1.push("Larry");
        s2 = (Stack)s1.clone();
        
        /*
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        s2 = s1;
        s2.push("Larry");
        */
        
        /*
        int size = 10;
        int[] a= new int[size];
        
        for (int i = 0 ; i < a.length ; i++) {
            a[i] = 13;
        }
        */
        
        /*
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        s1.push("Larry");
        */
    }
}
