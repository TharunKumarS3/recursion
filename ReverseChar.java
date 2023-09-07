class ReverseChar {

    public static void main(String[] args) {
        char[] s={'T','H','A','R','U','N'};
        reverseString(s);
        
    }

    public static void reverseString(char[] s) {
        int start=0,end=s.length-1;
        char[] c=rev(s,start,end);
        System.out.println(c);
    }
    public static char[] rev(char[] s,int start,int end)
    {
        if(start>end)
            return s;
        
        char temp=s[start];
        s[start]=s[end];
        s[end]=temp;
        return rev(s,start+1,end-1);
        
            
    }
}
