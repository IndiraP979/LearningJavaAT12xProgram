package ex_14_Strings;

public class Lab135_String_Immutable
{
    public static void main(String[] args) {
        String name = "Pramod"; // SCP (String constant pool)
        name.toUpperCase();
        System.out.println(name); //PRAMOD x because we have not assigned new string will created

    }
}
