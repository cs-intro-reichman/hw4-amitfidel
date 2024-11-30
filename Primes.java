public class Primes {
    public static void main(int n) 
    {
        String[] args=new String[n+1];
        for(int i=0;i<n+1;i++)
        {
            args[i]=String.valueOf(i);
        }
        //String[] args2=new String[7];
        if(args.length<2)
        {
        System.out.println("no primes here");
        return;
        }
        else
        {
        int[] numbers=new int[args.length];
        boolean[] isPrime=new boolean[numbers.length];
        int counter=0;
        for (int i=0;i<isPrime.length;i++)
        {
            numbers[i]=Integer.parseInt(args[i]);
            isPrime[i]=true;
        }
        isPrime[0]=false;
        isPrime[1]=false;
        for(int i=2;i<isPrime.length;i++)
        {
            if (isPrime[i]==true) 
            {
                for (int j=i+1;j<numbers.length;j++)
                {
                    if (numbers[j]%numbers[i]==0)
                    {
                        isPrime[j]=false; 
                    }
                }
            }
        }
        for (int i=2;i<isPrime.length;i++)
        {
            if(isPrime[i])
            {
                System.out.println(numbers[i]);
                counter++;
            }
        }
        int num=numbers.length-1;
        int precent=(int)(((double)counter/(double)(num))*100);
        System.out.println("There are "+counter+" primes between 2 and "+num+" ("+precent+"% are primes)");
    }
    }
}