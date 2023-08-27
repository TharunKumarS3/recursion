public class PermutationsCount {
    public static void main(String[] args) {
        System.out.println("no of count " +permutations("","abca"));
    }
    static int permutations(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return 1;

        }
        char ch=up.charAt(0);
        int ans=0;
        for(int i=0;i<=p.length();i++)
        {
            String first=p.substring(0,i);
            String second=p.substring(i,p.length());
            ans+=permutations(first+ch+second, up.substring(1));

        }
        return ans;
    }

    
}
