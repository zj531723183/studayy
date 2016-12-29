package com.model.structure.Adapter;
public class AdapterTest {  
  
    public static void main(String[] args) {  
        Targetable target = new Adapter();  
        target.method1();  
        target.method2(); 
        
        Source source = new Source();  
        Targetable target1 = new Wrapper(source);  
        target1.method1();  
        target1.method2();  
    }  
}  