public class StringLength {
    public static void main(String[] args) {
        String str ="GeeksforGeeks";
        System.out.println(recLen(str));
    }
    static int recLen(String s)
    {
        if(s.isEmpty())
        return 0;

        return recLen(s.substring(1))+1;
    }
}
