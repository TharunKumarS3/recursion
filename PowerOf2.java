public class PowerOf2 {

    public static void main(String[] args) {
        System.out.println(check(16,0));
        
    }
    
       
        public static  boolean check(int n,int i)
        {
            if(Math.pow(2,i)>n)
            return false;
            if(Math.pow(2,i)==n)
            return true;
    
            return check(n,i+1);
    
            
    
            
        }
    }
    

