import java.util.*;
class Node
{
	int data;
	Node next;
	Node(int d)
	Node prev;	
	{
		data=d;
	}
}
class operations
{
	Node start;
	void insertfirst(int d)
	{
		Node newnode=new Node(d);
		newnode.next=start;
		start=newnode;
	}
	void deletefirst()
	{
		start=start.next;
	}
	void forwardtraversal()
	{
		if(start==null)
		{
			System.out.ptintln("Emplty list");
			return;
		}
		Node ad=start;
		while(ad!=null)
		{
			System.out.print(ad.data+"\t");
			ad=ad.next;
		}
	}
	void revtraversal()
	{
		if(last==null)
		{
			System.out.println("Empty list");
			return;
		}
		Node ad=last;
		while(ad!=null)
		{
			System.out.print(ad.data+"\t");
			ad=ad.prev;
		}
	}
	void insertafter(int key,int data)
	{
		Node ptr=start;
		while(ptr.data!=key)
		{
			if(ptr.next==null)
			{
				System.out.println("KEY NOT FOUND");
				return;
			}
			else
				ptr=ptr.next;
		}
		Node newnode=new Node(data);
		newnode.next=ptr.next;
		ptr.next=newnode;
	}
	void deletekey(int key)
	{
		Node ptr=start;
		Node prev=start;
		while(ptr.data!=key)
		{
			if(ptr.next==null)
			{
				System.out.println("ELEMENT NOT FOUND");
				return;
			}
			prev=ptr;
			ptr=ptr.next;
		}
		if(ptr==start)
			start=start.next;
		else
			prev.next=ptr.next;

	}
}
class List
{
	public static void main(String args[])
	{
		operations o1=new operations();
		Scanner s=new Scanner(System.in);
		int ch;
		do
		{
			System.out.print("ENTER YOUR CHOICE 1.INSERTFIRST 2.DELETEFIRST 3.INSERTAFTER 4.FORWARD TRAVERSAL 5. REV TRAVERSAL: ");
			ch=s.nextInt();
			switch(ch)
			{
				case 1:
				System.out.print("ENTER THE ELEMENT: ");
				int e=s.nextInt();
				o1.insertfirst(e);
				o1.display();
				break;
				case 2:
				o1.deletefirst();
				o1.display();
				break;
				case 3:
				System.out.print("ENTER THE KEY: ");
				int k=s.nextInt();
				System.out.print("ENTER THE DATA: ");
				int d=s.nextInt();
				o1.insertafter(k,d);
				o1.display();
				break;
				case 4:
				o1.forwardtraversal();
				break;
				case 5:
				o1.revtraversal();
				break;

			}

		}
		while(ch<5);
	}
}
