import java.util.*;
public class ArrayOperation {
public int[] readArr()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of numbers you want to add");
	int n=sc.nextInt();
	System.out.println("Enter "+n+" number ");
	int ar[]=new int[n];
	for(int i=0;i< ar.length;i++)
	{
		ar[i]=sc.nextInt();
	}
	return ar;
}

public void writeArr(int ar[])
{
	for(int i=0;i< ar.length;i++)
	{
		System.out.println(ar[i]+" ");
	}
	System.out.println();
}

public int countPalindrome(int[] ar)
{
	int count=0;
	for (int i = 0; i < ar.length; i++)
	{
		boolean rs=isPalindrum(ar[i]);
		if(rs==true)
			count++;
	}
	return count;
}

public boolean isPalindrum(int i)
{
	 int rev=0,t=i;
	 do {
		int r=i/10;
		rev=rev*10+r;
		i=i/10;
		
	} while (i!=0);
	 if(rev==t)
		 return true;
	 else
		 return false;
}

public int SumofPrime(int ar[]) 
{
	int sum=0;
	for (int i = 0; i < ar.length; i++)
	{
		boolean rs=isPrime(ar[i]);
		if(rs==true)
			sum=sum+ar[i];
	}
	return sum;
}

public boolean isPrime(int x) 
{
	int i=2;
	while(i<=x/2)
	{
		if(x%i==0)
			return false;
		i++;
	}
	return true;
}

public int CountStrong(int[] ar)
{
	int count=0;
for (int i = 0; i < ar.length; i++)
	{
		boolean x=isStrong(ar[i]);
		if(x==true)
			count++;
	}
	return count;
}

public boolean isStrong(int x) 
{
	int t=x;
	int sum=0;
	do {
		int r=x%10;
		sum=sum+fact(r);
		x=x/10;
	}while(x!=0);
	
	if(t==sum)
		return true;
	else 
		return false;
	
}

static int fact(int y)
{
	int fact=1;
	for(int i=1;i<=y;i++)
	{
		fact=fact*i;
	}
	return fact;
}

public int SumElement(int[] ar) 
{
	int sum=0;
	for(int i=0;i< ar.length;i++)
	{
		sum=sum+ar[i];
	}
	
	return sum;
}

public int[] combineArray(int[] ar,int[] r)
{
	int[] coar = new int[ar.length+r.length];
	for(int i=0;i< ar.length;i++)
	{
		 coar[i]=ar[i];
	}
	for(int i=0;i< r.length;i++)
	{
		 coar[i+ar.length]=r[i];
	}
	
	return coar;
}

public int[] countEO(int[] ar)
{
	int count[]= {0,0};
	for (int i = 0; i < count.length; i++) {
		if(ar[i]%2==0)
			count[0]++;
		else
			count[1]++;
		//count[ar[i]%2]++;
	}
	return count;
}

public int[] combineArrayZicZack(int[] ar, int[] r) {
	int[] coar = new int[ar.length+r.length];
	int i=0,j=0;
	
		while( i<ar.length && i<r.length)
		{
			coar[j]=ar[i];
			j++;
		
			coar[j]=r[i];
			j++;
			i++;
			
		}
	while(i<ar.length)
	{
		coar[j]=ar[i];
		j++;
		i++;
	}
		
	while(i<r.length)
	{
		coar[j]=r[i];
		j++;
		i++;
	}
		
	
	return coar;
	
}

public int[] combineShortedArrayShortedFormat(int[] ar, int[] r) {
	int[] coar = new int[ar.length+r.length];
	int i=0,j=0,k=0;
	
		while( i<ar.length && j<r.length)
		{
			if(ar[i]<r[j])
			{
			coar[k++]=ar[i++];
			}
			else
			{
			coar[k++]=r[j++];
			}		
		}
	while(i<ar.length)
	{
		coar[k++]=ar[i++];
		
	}
		
	while(j<r.length)
	{
		coar[k++]=r[j++];
		
	}
	return coar;
}
public int[] combineShortedArrayDecendingShortedFormat(int[] ar, int[] r) {
	int[] coar = new int[ar.length+r.length];
	int i=ar.length-1,j=ar.length-1,k=0;
	
		while( i>=0 && j>=0)
		{
			if(ar[i]>r[j])
			{
			coar[k++]=ar[i--];
			}
			else
			{
			coar[k++]=r[j--];
			}		
		}
	while(i>=0)
	{
		coar[k++]=ar[i--];
		
	}
		
	while(j>=0)
	{
		coar[k++]=r[j--];
		
	}
	return coar;
}

public int[] combineShortedArrayShortedFormatDec(int[] ar, int[] r) {
	int[] coar = new int[ar.length+r.length];
	int i=0,j=0,k=0;
	
		while( i<ar.length && j<r.length)
		{
			if(ar[i]>r[j])
			{
			coar[k++]=ar[i++];
			}
			else
			{
			coar[k++]=r[j++];
			}		
		}
	while(i<ar.length)
	{
		coar[k++]=ar[i++];
		
	}
		
	while(j<r.length)
	{
		coar[k++]=r[j++];
		
	}
	return coar;
}

public boolean isDuplicate(int[] ar, int[] r) {
	
	if(ar.length==r.length)
	{
		return false;
	}
	for (int i = 0; i < r.length; i++) 
	{
		if(ar[i] != r[i])
			return false;
	}		
	return true;
	
	
}

public int[] countPosetiveNegative(int[] ar) {
	int count[]= {0,0};
	for (int i = 0; i < count.length; i++) {
		if(ar[i]>0)
			count[0]++;
		else
			count[1]++;
		
	}
	return count;
}

public int[] sumEO(int[] ar) 
{
	int sum[]= {0,0};
	for (int i = 0; i < sum.length; i++) {
		if(ar[i]%2==0)
			sum[0]=sum[0]+ar[i];
		else
			sum[1]=sum[1]+ar[i];
		
	}
	return sum;
}

public int CountSpecial(int[] ar) 
{
	int count=0;
	for (int i = 0; i < ar.length; i++)
		{
			boolean x=isSpecial(ar[i]);
			if(x==true)
				count++;
		}
		return count;
}

public boolean isSpecial(int x) 
{
	int z=0;
		int n=x%10;
		int m=x/10;
		
		z=(n+m)+(m*n);
		
	
	if(x==z)
		return true;
	else
		return false;
}

public int[] insertElement(int[] a, int i, int j) 
{
	if(j<0||j>a.length)
	{
		System.out.println("Index value is out of range");
		return a;
	}
	int b[]=new int[a.length+1];
	a[j]=i;
	for (int j2 = 0; j2 < a.length; j2++) 
	{
		if(j2<j)
			b[j2]=a[j2];
		else
			b[j2+1]=a[j2];
	}
	return b;
}

public int[] deleteElement(int[] a, int j)
{
	if(j<0||j>=a.length)
	{
		System.out.println("Index value is out of range");
		return a;
	}
	int b[]=new int[a.length-1];
	
	for (int j2 = 0; j2 < a.length-1; j2++)
	{
		if(j2<j)
			b[j2]=a[j2];
		else
			b[j2]=a[j2+1];
	}
		return b;
}

public int[] insertArray(int[] a, int[] b, int in) 
{
	if(in<0||in>a.length)
	{
		System.out.println("Index value is out of range");
		return a;
	}
	int n[]=new int[a.length+b.length];
	
	for (int j2 = 0; j2 < a.length; j2++) 
	{
		if(j2<in)
			n[j2]=a[j2];
		
		else
			n[j2+b.length]=a[j2];
		
	}
	for(int i=0;i<b.length;i++)
		n[i+in]=b[i];
	return n;
}

public static void countFrequency(int arr[]) 
{ 
	int n=arr.length;
	
  for (int i = 0; i < arr.length; i++) 
  { 
		int count =1;
		for (int j = i+1; j < n; j++) 
		{
			if(arr[i]==arr[j])
			{
				count ++;
				arr[j]=arr[n-1];
				n--;
				j--;
			}
		}
		 System.out.println(arr[i] + "---->" + count);
	}
 /* int big=arr[0];
  for (int i = 0; i < arr.length; i++) 
  {
	if(big<arr[i])
		big=arr[i];
  }
  int count[]=new int[big+1];
  for(int i = 0; i < arr.length; i++)
  {
  	count[arr[i]]++;
  }
  for(int i = 0; i < arr.length; i++)
  {
  	if(count[i]!=0)
  	System.out.println(arr[i] + "---->" + count);
  }
  */
}

 public static int[] swapPairs(int[] a)
 {
                
    for(int i=0; i<a.length-1; i=i+2)
    {
    	int t=a[i];
        a[i]=a[i+1];  
        a[i+1]=t;
    }   
    return a;
}

public int searchArray(int[] a, int x) {
	for (int i = 0; i < a.length; i++) {
		if(a[i]==x)
			return i;
	}
	return -1;
	
}

public int highSumOfPairs(int[] a) {
	int big=a[0]+a[1];
	for (int i = 1; i < a.length-1; i++) 
	{
		if(big<a[i]+a[i+1])
		{
			big=a[i]+a[i+1];
		}
	}
	return big;
}

public void sumOfPairs(int[] a,int b) {
	for (int i = 0; i < a.length; i++) {
		for (int j = 1; j < a.length; j++) {
			if(a[i]+a[j]==b)
			{
				System.out.println("Pair is ("+a[i]+","+a[j]+")");
			}
			
		}
	}
	
}


   

}	



