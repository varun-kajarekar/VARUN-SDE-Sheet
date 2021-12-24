class fibonacci
{
    static int fib(int n)
    {
    if (n <= 1)
       return n;
    return fib(n-1) + fib(n-2);
    }
      
    public static void main (String args[])
    {
    int n = 9;
    System.out.println(fib(n));
    }
class fibonacci
{
    static int fib(int n)
	{
	int f[] = new int[n+2]; 
	int i;
	
	f[0] = 0;
	f[1] = 1;
	
	for (i = 2; i <= n; i++)
	{
		f[i] = f[i-1] + f[i-2];
	}
	
	return f[n];
	}
	
	public static void main (String args[])
	{
		int n = 9;
		System.out.println(fib(n));
	}
}

