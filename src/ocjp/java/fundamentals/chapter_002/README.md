### <span style="color:darkgreen">Data Types</span>

1. In __Java__ every variable and every expression has some time
2. Each and every data type is clearly defined.
3. Every assignment should be checked by compiler for type compatibility

because of above reason we can conclude __Java__ language is strongly typed programming language


Java is not considered as pure object oriented programming language because 
several oops feature are not satisfied by java ( like operator loading and multiple inheritance etc..)

More over we are depending on primitive data types which are non objects.

```
                     Primitive Data Types (8)
                                |    
         ---------------------------------------------------------
         |                                                       |
         |                                                       |
  Numeric Data Types                                    Non-Numeric Data Types (2)
          |                                                   * char
          |                                                   * boolean           
  ------------------------                                  
  |                       |                                     
  |                 Floating Point Data Types (2)                                     
  |                        * float
  |                        * double                                                                         
  | 
 Integral Data Types (4) 
        * byte
        * short
        * int
        * long
    
 ```
 
 Except Boolean and Char remaing data types are considered as Signed data types, 
 because we can represent both positive and negative numbers
 
 
### 1. bytes 

    * Size : 1 byte (8 bit)
    * Max Value : +127
    * Min Value : -128
    * Range : -128 to + 127


#### 8-bit representaion

             64 + 32 +16 +8 + 4 + 2 + 1 = 127
        
        | X | 1 | 1 | 1 | 1 | 1 | 1 | 1 |   
          |
         MSB    
        (Most Significant Bit )

       
       * MSB acts as sign bit and remaing 7 bit represents value
       
       * First bit (MSB) is reserved for sign.
       
#### How to represent 128 using this system ? 

        * Positive Number will be represented directly in the meomry
        
        * To represent Negative number we use 2's complement form of that number and first bit represnt sign.
   
#### Possible Compile time error   

           byte b = 128 ;       //#java: incompatible types: possible lossy conversion from int to byte
           byte b = 12.5 ;      //#java: incompatible types: possible lossy conversion from double to byte
           byte b = true ;      //#java: incompatible types: boolean cannot be converted to byte
           byte b = "rahul" ;   //#java: incompatible types: java.lang.String cannot be converted to byte

#### Where byte data type is the best choice ?
  
            If you want to handle data in the terms of streams either from the File or from the Network 
            ( beacause file & network supported form is byte ) .
            
            There are two type of streams-
                    * Charcheter streams
                    * Byte streams
                    
#### Example :-
```
                    /** File Output Stream- Write Method need byte array type data Only to write in a file */
                    
                    try {
                        FileOutputStream fout=new FileOutputStream("../testout.txt");
                        String s="Java byte Concept ..";
                        byte b[]=s.getBytes();      // converting string into byte array
                        fout.write(b);
                        fout.close();
                        System.out.println("Success...");
            
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
```                    
                    

### 2. Short

    * Most rarely used data type in Java
    * Size : 2 byte (16 bit)
    * Max Value : +32767
    * Min Value : -32768
    * Range : (-2^15) to + (2^15-1)  
    
    
**Short** data type is best suitable for 16-bit processor like 8085 processor 
because in those  type of processor data will be present in 16 bit style.
( Due to outdated processor type this data type is outdated) 

So when we use Short data type read/write process is quite efficient.


### 3. int

    * Most commanly used data type in Java
    * Size : 4 byte (32 bit)
    * Max Value : +2147483647
    * Min Value : -2147483648
    * Range : (-2^31) to + (2^31-1)
    

### 4. long

    * Size : 8 byte (64 bit)
    * Range : (-2^63) to + (2^63-1)                    
    

Note: All the above data type ( Byte/Short/Int/Long) meant for representing values. 
If we want to represent floating point values the we should go for floating point data types.

## Floating Point Data Type:

    