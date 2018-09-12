## Java FAQ

1. Difference between final, finally and finalize ?

- **final :**  final is a modifier applicable for classes, method and variable. 
	
	- If a variable is declared as final : we can not perform reassigment. (beacuse we made it constant )

	- If a method is declared as final : we can not override that method in the child class

	- If a class is declared as final : we can not extends that class or we cannot create child class for that class.

- **finally:** finally is a block always associated with try/catch.

    - finally

```
        try {
        
            // Risky code which might produce exception
        
        } catch (Exception e) {
        
            // Handling codes
        
        } finally {
        
            // Clean up code like resource deallocation
            // Ex- close database connection
        }

```
	

- **finalize:** finalize is a method present in object class.

    - finalize() is a method which is always invoked by garbage collector just before destroying an object to perform
        clean up activities.
        
    - For Example before distroying a object Database connection or network connection need to close as object 
        final death wish

        
```
        finalize() {
        
            // Clean up activities before destroying any object
         
            // Ex- close database connection or network connection
        }

```

Note: finally meant for cleanup activities related to try block. 
        Where as finalize() meant for cleanup activities related to objects.


2. Difference between String and StringBuffer ?

```
        //String
        
        String s = new String("rahul");
        s.concat(" prasad");
        System.out.println(s); // rahul
       
        //StringBuffer
                
        StringBuffer sb = new StringBuffer("rahul");
        sb.append(" prasad");
        System.out.println(sb); // rahul prasad

```

- **String:** Strings are immutable

    - Once we create a String object we cann't perform any changes in the existing object. If we trying to perform any
        changes with those changes a new object will be created.
    
    - This non changeable nature is nothing but called immutability of **String** object.      

- **StringBuffer:** StringBuffer are mutable. 
    
    - Once we create a StringBuffer object we can perform any type of changes in the existing object.
    
    - This changeable nature is nothing called mutability of **StringBuffer** object.
    

3. Difference between "== operator" and "equals() method" in java?


- In general  we use **== operator** for Reference comparision or address comparison where as 
    **.equals() method** used for content comparison.

```

        String s1 = new String("rahul");
        
        String s2 = new String("rahul");

        System.out.println(s1==s2);  // False - because s1 and s2 object have two different address / Reference
        
        System.out.println(s1.equals(s2)); // True - because content of s1 & s2 are same
        
```

- **Note:**
     - **.equals() method** present in object class also meant for refrence comparison only based on our requirement
            we can override for content comparison.
            
     - In String class, all wrapper class and all collection classes  **.equals() method** is overridden for 
            content comparison.


4. What are the various modifiers available in java ?

    modifiers|Outer class|Inner class|Method|Variable|blocks|Outer Interface|Inner Interface|Outer Enum|Inner Enum|Constructor
    |:--------:|:-----------:|:--------:|:-----------:|:--------:|:-----------:|:--------:|:-----------:|:--------:|:-----------:|:--------:|
    public|Y|Y|Y|Y||Y|Y|Y|Y|Y
    private||Y|Y|Y|||Y||Y|Y
    protected||Y|Y|Y|||Y||Y|Y
    default|Y|Y|Y|Y||Y|Y|Y|Y|Y
    final|Y|Y|Y|Y||XX|XX|XX||
    abstract|Y|Y|Y|||Y|Y|XX||
    static||Y|Y|Y|Y||Y||Y|
    synchronized|||Y||Y|||||
    native|||Y|||||||
    strictfp|Y|Y|Y|||Y|Y|Y|Y|
    transient||||Y||||||
    volatile||||Y||||||