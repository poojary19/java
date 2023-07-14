package program;

import java.util.Scanner;

public class Gknapsack {
	void knapsack(int n,float weight[],float value[],float w) {
		float x[]=new float[20],tp=0;
		int i,u;
		u=(int)w;
		for(i=0;i<n;i++)
			x[i]=0;
		for(i=0;i<n;i++)
			x[i]=0;
		for(i=0;i<n;i++)
		{
			if(weight[i]>u)
				break;
			else
			{
				x[i]=1;
				tp=tp+value[i];
				u=(int)(u-weight[i]);
				}
			}
		if(i<n)
			x[i]=u/weight[i];
		tp=tp+(x[i]*value[i]);
		System.out.println("\n----------");
		System.out.println("\n weight");
		for(i=0;i<n;i++)
		{
			System.out.println("\n value");
			for(i=0;i<n;i++)
			{
				System.out.println(value[i]+"\t");
			}
			System.out.println("\n x:");
			for(i=0;i<n;i++)
			{
				System.out.println(x[i]+"\t");
			}
			System.out.println("\n------");
			System.out.println("\n maximum value that knapsack carry is"+tp);
			System.out.println("\n--------");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float weight[]=new float[20],value[]=new float[20],w;
int n,i,j;
float ratio[]=new float[20],temp;
System.out.println("\n----");
System.out.println("\n knapsack problem using greedy apporach");
System.out.println("\n-----");
Scanner s= new Scanner(System.in);
System.out.println("\n enter the no of objectives you want");
n=s.nextInt();
System.out.println("\n enter the weight and values of each object");
for(i=0;i<n;i++)
{
	System.out.println("\n enter weight and value for object"+(i+1));
	weight[i]=s.nextFloat();
	value[i]=s.nextFloat();
}
System.out.println("\n enter the capacity of knapsack");
w=s.nextFloat();
for(i=0;i<n;i++)
{
	ratio[i]=value[i]/weight[i];
	System.out.println(ratio[i]+"\t");
}
for(i=0;i<n;i++) {
	for(j=i+1;j<n;j++) {
		if(ratio[i]<ratio[j]) {
			temp=ratio[j];
			ratio[j]=ratio[i];
			ratio[i]=temp;
			temp=weight[j];
			weight[j]=weight[i];
			weight[i]=temp;
			temp=value[j];
			value[j]=value[i];
			value[i]=temp;
		}
	}
}
Gknapsack k=new Gknapsack();
k.knapsack(n, weight, value, w);

	}

}
