import java.util.ArrayList;

class NDigitNumbers
{
    public static void main(String[] args)
    {
        //System.out.println(increasingNumbers(2));
        
    }

 
    static ArrayList<Integer> list = new ArrayList<>();
	public static ArrayList<Integer> increasingNumbers(int n) {
	    if (n == 1) {
	        for (int i = 0; i <= 9; i++) {
	            list.add(i);
	            return list;
	        }
	    } else {
	        rec(1, n, 0);
	    }
	    return list;
	}
	
	public static void rec(int last, int n, int num) {
	    if (n == 0) {
	        list.add(num);
	        return;
	    }
	    for (int i = last; i <= 9; i++) {
	        int a = num * 10 + i;
	        rec(i + 1, n - 1, a);
	    }
	}
}
