public class Primes {
    public static void main(String[] args) 
    {
        int n=Integer.parseInt(args[0]);
        if(n<2)
        {
            System.out.println("no primes here");
            return;
        }
        boolean[] isPrime=new boolean[n+1];
        int counter=0;
        for (int i=0;i<isPrime.length;i++)
        {
            isPrime[i]=true;
        }
        isPrime[0]=false;
        isPrime[1]=false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if (isPrime[i]==true) 
            {
                for (int j=i+1;j<isPrime.length;j++)
                {
                    if (j%i==0)
                    {
                        isPrime[j]=false; 
                    }
                }
            }
        }
        System.out.println("Prime numbers up to "+n+":");
        for (int i=2;i<isPrime.length;i++)
        {
            if(isPrime[i])
            {
                System.out.println(i);
                counter++;
            }
        }
        int num=n;
        int precent=(int)(((double)counter/(double)(num))*100);
        System.out.println("There are "+counter+" primes between 2 and "+num+" ("+precent+"% are primes)");
    }
}