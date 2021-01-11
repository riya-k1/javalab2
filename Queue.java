/*Define a class Queue for representing a queue data structure .The class must define a default constructor ,a parameterized constructor and a function for enqueue ,dequeue and display operation .Write a java program to implement this. */

public class Queue 
{
	int size = 5;
	int q[]=new int[size];
	int front ,rear;
	
	Queue()
    {
		front =-1;
		rear =-1;
		
	}
	boolean isFull()
	{
		if (front==0&&rear==size-1)
		{
			return true;
		}
		return false;
	}
	boolean isEmpty()
	{
		if(front==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	Queue(int a)
	{
		this.Dequeue();
		for(int i =0;i<a;i++)
		{
			this.Enqueue(i);
		}
		this.Display();
		this.Dequeue();
		this.Display();
	}
	
	void Enqueue(int element)
	{
       if(isFull())
		{
			System.out.println("Queue is full");
		}
	   else
		{
			if(front==-1)
			{
				front=0;
			}
			rear++;
			q[rear]=element;
			System.out.println("Insert"+element);
		}		
	}
	int Dequeue()
	{
		int element;
		if (isEmpty())
		{
			System.out.println("Queue is Empty");
			return(-1);
			
		}
		else{
			element=q[front];
			if(front>=rear)
			{
				front=-1;
				rear=-1;
			}
			else{
				front++;
				
			}
			System.out.println(element+"Deleted");
			return (element);
		}
	}
	void Display()
	{
		int i;
		if(isEmpty())
		{
			System.out.println("Empty Queue");
		}
		else{
			System.out.println("\nFront Index ="+front);
			System.out.println("Elements:");
			for(i=front;i<=rear;i++)
			   System.out.println(q[i] + " ");
		   System.out.println("\nrear index "+rear);
		}
	}
	public static void main(String args[])
	{
		Queue Q =new Queue();
		Queue U =new Queue(6);
	}
	
}
/*
OUTPUT

0Deleted
Insert0
Insert1
Insert2
Insert3
Insert4
Queue is full

Front Index =0
Elements:
0
1
2
3
4

rear index 4
0Deleted

Front Index =1
Elements:
1
2
3
4

rear index 4
*/