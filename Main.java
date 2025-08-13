public class Main {
    

    int powerofTwo(int n )
    {
        if(n == 0) return 0;
        if(n % 2 == 0)
        {
            n /= 2;

        }
             return n ;
    }

    public  static void main(String s[])
    {
        Main obj = new Main();
        int n = 4;
        int res = obj.powerofTwo(n);
        System.out.println("The result is: " + res);

    }
}
