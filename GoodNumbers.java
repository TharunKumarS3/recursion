class GoodNumbers
{
    public static long mod = 1000000007; //This is the mod value given in question.
    public static void main(String[] args) {
        long n=4;
        System.out.println(countGoodNumbers(n));
        
    }

    
    public static int countGoodNumbers(long n) {
        
        //Indexing is 0 based according to the question.
        long odd = n/2; //It gives the number of odd indices starting from 1 to n. 
        long even = (n+1)/2; //It gives number of even indices. It is basically n/2 + n%2;
        return (int)(pow(5, even)*pow(4, odd)% mod); //As there are 4 prime numbers and 5 even numbers
                                                    // from 0 to 9.
        
    }
    
    // To understand this pow function properly you can solve leetcode problem 50
    // where you will have to contruct it. I will attach the link above.
    public static long pow(long x, long n) {
        
        if(n==0) return 1;
        System.out.println(n);
        
        long temp = pow(x,n/2);
        System.out.println("x"+x);
        System.out.println("///"+n);
        System.out.println("temp"+temp);
        
        if(n%2==0){
            long ans1= (temp*temp)%mod;
              System.out.println("ans1"+ans1);
              return ans1;
        }
        else{
            long ans2= (x*temp*temp)%mod;
            System.out.println("ans2"+ans2);
              return ans2;
        }
    }
}