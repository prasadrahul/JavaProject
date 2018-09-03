### <span style="color:darkgreen">Identifiers</span>

A name in java Program is called as __identifiers__, 
Which can be used for identification purpose. It can be  
 
    * Class name  or
    * Method name or
    * Variable or
    * Lable etc..

```
public class _01_Identifiers
{
    public static void main(String[] args)
    {
        int xyz = 10;
    }
}

```

In above Program - List of Identifiers

    * _01_Identifiers   : name of class
    * main              : name of method
    * String            : It is predefinde java class name
    * args              : name of the array
    * xyz               : name of vaiable

Rules for __identifiers__ :

    1. Only allowed characters in identifiers is shown below, If we use any other charactor 
        we will get compile time error 
        * a to z 
        * A to Z
        * 0 to 9
        * $ ( Dollor sign )
        * _  ( Under score sign )
          
    2. Identifiers can't start with digit
        * 123xyz    : Not allowed
        * xyz123    : Right
          
    3. Java identifiers are case senstive. ( Even java language is itself treated as case senstive language )
    4. There is no length limit for java identifiers
    5. Reserved word can't be used as identifiers, else it will give compile time error.
    6. All predifiened java class name and interface name we can use as identifiers.
        eventough it is valid but is not a good programming practice beacuse 
        it reduces readablity and creats confustion.
        
   
### <span style="color:darkgreen">Reserved Words</span>

```
                    Reserved word (53)
                            |    
    ---------------------------------------------------------
    |                                                       |
    |                                                       |
  Keywords (50)                                    Reserved Literlas (3)
        |                                                   * true
        |                                                   * false           
  ------------------------                                  * null
  |                       |                                     
  |                 Unused Keywords (2)                                     
  |                        * goto
  |                        * const                                                                         
  | 
 Used Keywords (48)
 
 if,else,switch ... etc
 
 
 ```
 
 Keywords for Data types ( 8 )
 
     * byte
     * short
     * int
     * long
     * float
     * double
     * boolean
     * char
     
  Keywords for Flow Control ( 11 )
  
     * if
     * else
     * switch
     * case
     * default
     * while
     * do
     * for
     * break
     * contine
     * return
    
  Keywords for Modifiers ( 12 )
        
       *  (default- if not mentioned any thing ) 
       * public
       * private
       * protected
       * static
       * final
       * abstract
       * synchronized
       * native
       * strictfp (1.2 V)
       * transient
       * volatile
       
  Keywords for Exception Handling ( 6 )
         
        * try
        * catch
        * throw
        * throws
        * finally
        * assert ( 1.4 V)
        
  Keywords related to class ( 6 )
   
        * class
        * interface
        * extends
        * implements
        * package
        * import

  Keywords related to object ( 4 )        
   
        * new
        * instanceof
        * super
        * this
  
 Keywords for return type ( 1 )

        * void

 Keywords that are unused ( 2 )        
        
        * goto : uses of goto create problem in old lanuge that why sun people baned this keyword in java
        * const : use final instead of const
        
  Keywords reserved for literals ( 3 )   
        
        * true
        * false
        * null        
         
  Keywords reserved for extras ( 1 )   
        
        * enum ( 1.5 V ) : used to difiened a group of named constant

### <span style="color:darkgreen">Conclusion</span>
```  
1. All 53 reserved words in java contains only lower case alphabet symbol      
2. In Java there is **new** keyword and no **delete** keyword beacuse Destruction of useless object is 
    responsibility of Garbage collector
3. enum (1.5 V) , assert (1.4 V) and strictfp (1.2 V) are new keywords in java introduced later.
4. Confusing keywords 
            * strictfp ( not strictFp ) 
            * instanceof (not instanceOf )
            * synchronized (not synchronised )
            * implements (not implement )
            * import (not imports )
            * const  (not constant )

```