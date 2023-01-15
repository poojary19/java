package program;

import java.util.Random;

class SquareThread implements Runnable{
int x;
SquareThread(int x){
	this.x=x;
}

@Override
public void run() {
	// TODO Auto-generated method stub
	System.out.println("thread name=SquareThread and Squareis"+x+"is:"+x*x);
}
}
class CubeThread implements Runnable{
int x;
CubeThread(int x){
	this.x=x;
}

@Override
public void run() {
	// TODO Auto-generated method stub
System.out.println("thread name=CubeThread and Cube of"+x+"is:"+x*x*x);	
}
}
class RandomThread implements Runnable{
Random r;
Thread t2,t3;
@Override
public void run() {
	// TODO Auto-generated method stub
	int num;
	r=new Random();
	try {
		while(true) {
			num=r.nextInt(100);
			System.out.println("main Thread and generated number"+num);
			t2=new Thread( new SquareThread(num));
			t2.start();
			t3=new Thread(new CubeThread(num));
			t3.start();
			
			Thread.sleep(1000);
			System.out.println("--------------");
		}
		}catch(InterruptedException e) {
			System.out.println("interrupted Exception");
		}	
}
}
public class Threaddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RandomThread Thread_obj=new RandomThread();
Thread t1=new Thread(Thread_obj);
t1.start();
	}

}
