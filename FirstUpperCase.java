public class FirstUpperCase {
    public static void main(String[] args) {
        String str = "geeksforGeeKS";
        char res = first(str,0);
        if (res == 0)
            System.out.println("No uppercase letter");
        else
            System.out.println (res );
    }
    static char first(String s,int index)
    {
        if(index>=s.length())
        return 0;

        if(Character.isUpperCase(s.charAt(index)))
        {
            return s.charAt(index);
        }
        return first(s, index+1);
    }
}
