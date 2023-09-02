import java.util.ArrayList;

public class PhoneNumberArrayList {
    public static void main(String[] args) {
        System.out.println(phone("", "223"));

        
    }

    static ArrayList<String> phone(String p,String up)
    {
        if(up.isEmpty())
        {
           ArrayList<String> list=new ArrayList<>();
           list.add(p);
            return list;
        }
        int d=up.charAt(0)-'0';
        ArrayList<String> ans=new ArrayList<>();
        for(int i=(d-1)*3;i<d*3;i++)
        {
            char ch=(char)('a'+i);
            ans.addAll(phone(p+ch, up.substring(1)));
        }
        return ans;
    }

    
}
