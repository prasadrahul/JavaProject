package ocjp.java.questions;

public class DummyClass
{
    public static void main(String[] args)
    {

        String s = new String("rahul");
        s.concat(" prasad");
        System.out.println(s); // rahul

        StringBuffer sb = new StringBuffer("rahul");
        sb.append(" prasad");
        System.out.println(sb); // rahul prasad


        String s1 = new String("rahul");

        String s2 = new String("rahul");

        System.out.println(s1==s2);  // False

        System.out.println(s1.equals(s2)); // True

    }
}
