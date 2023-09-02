public class PhoneNumber {
    public static void main(String[] args) {
        phone("", "223");
        
    }

    static void phone(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        int d=up.charAt(0)-'0';
        for(int i=(d-1)*3;i<d*3;i++)
        {
            char ch=(char)('a'+i);
            phone(p+ch, up.substring(1));
        }
    }

    
}
