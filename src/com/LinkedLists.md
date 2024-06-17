# SINGLY LINKED LISTS
## Q1 - https://www.geeksforgeeks.org/problems/introduction-to-linked-list/1
```java
class Solution {
    static Node constructLL(int arr[])
    {
        Node current=null;
        for(int i=arr.length-1; i>=0; i--)
        {
            Node newNode = new Node(arr[i]);
            newNode.next=current;
            current = newNode;
        }
        return current;
    }
}
```
```cpp
class Solution {
  public:
    Node * constructLL(vector<int>& arr) {
    Node * header=NULL;
    Node * jaadu=NULL;
    for(int i=0; i<arr.size(); i++)
    {
        Node * temp = new Node(arr[i]);
        
        if(i==0)
        {
        header = temp;
        jaadu = temp;
        }
        else if(i==arr.size())
        {
            jaadu->next=NULL;
        }
        else
        {jaadu->next=temp;
        jaadu=temp;
        }
        
    }
    return header;
    }
};
```
## Q2 - https://www.geeksforgeeks.org/problems/linked-list-insertion-1587115620/0
```java
class Solution
{
    Node insertAtBeginning(Node head, int x)
    {
        Node newNode = new Node(x);
        newNode.next=head;
        head=newNode;
        return head;
    }
    
    Node insertAtEnd(Node head, int x)
    {
        Node newNode = new Node(x);
        if(head!=null)
        {
        Node current;
        current = head;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=newNode;
        }
        if(head==null)
        {
            head=newNode;
        }
        return head;
    }
}
```
## Q3 - https://leetcode.com/problems/delete-node-in-a-linked-list/
```java
class Solution
{
    public void deleteNode(ListNode node)
    {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
```
## Q4 - https://www.geeksforgeeks.org/problems/count-nodes-of-linked-list/0
```java
class Solution
{
    public static int getCount(Node head)
    {
        int count=1;
        Node current = head;
        while(current.next!=null && current.next.next!=null)
        {
            current=current.next.next;
            count+=2;
        }
        if(current.next!=null)
        {
            count++;
        }
        return count;
    }
}
```
```cpp
class Solution
{
    public:
    
    int getCount(struct Node* head)
    {
        Node * pointer =head;
        int size=1;
        while(pointer->next!=NULL && pointer->next->next!=NULL)
        {
            pointer=pointer->next->next;
            size+=2;
        }
        if(pointer->next!=NULL)
        {
            size++;
        }
        return size;
    }
};
```
## Q5 - https://www.geeksforgeeks.org/problems/search-in-linked-list-1664434326/1
```java
class Solution
{
    static boolean searchKey(int n, Node head, int key)
    {
        Node current = head;
        
        while(current!=null && current.data!=key)
        {
            current=current.next;
        }
        if(current==null)
        {
            return false;
        }
        return true;
    }
}
```

# DOUBLY LINKED LISTS
## Q1 - https://www.geeksforgeeks.org/problems/introduction-to-doubly-linked-list/1
```java
class Solution
{
    Node constructDLL(int arr[])
    {
        Node head = new Node(arr[0]);
        Node current = head;
        for(int i=1; i<arr.length; i++)
        {
            Node newNode = new Node(arr[i]);
            newNode.prev=current;
            current.next=newNode;
            current=newNode;
        }
        return head;
    }
}
```
## Q2 - https://www.geeksforgeeks.org/problems/insert-a-node-in-doubly-linked-list/1
```java
class GfG
{
    //Function to insert a new node at given position in doubly linked list.
    void addNode(Node head_ref, int pos, int data)
    {
	    if(pos==0)
	    {
	       Node newNode = new Node(data);
	       newNode.next=head_ref.next;
	       head_ref.next=newNode;
	       newNode.prev=head_ref;
	    }
	    else
	    {
    		Node current = head_ref;
    		int count = 0;
            while(current.next!=null && count!=pos)
            {
            count++;
            current=current.next;
            }
            if(current.next!=null)
            {
            Node newNode = new Node(data);
    		newNode.next=current.next;
    		current.next.prev=newNode;
    		current.next=newNode;
    		newNode.prev=current;
            }
    		else
    		{
    		    Node newNode = new Node(data);
    		    current.next=newNode;
    		    newNode.prev=current;
    		}
	    }
    }
}
```
## Q3 - https://www.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/1
```java
public static Node reverseDLL(Node  head)
{
    int count=1;
    Node temp_tail = head;
    while(temp_tail.next!=null)
    {
        count++;
        temp_tail=temp_tail.next;
    }
    Node temp_head=head;
    for(int i=0; i<(count/2); i++)
    {
        int temp = temp_tail.data;
        temp_tail.data=temp_head.data;
        temp_head.data=temp;
        temp_head=temp_head.next;
        temp_tail=temp_tail.prev;
    }
    return head;
}
```
## Q4 - https://www.geeksforgeeks.org/problems/delete-node-in-doubly-linked-list/1
```java
class Solution
{
    // function returns the head of the linkedlist
    Node deleteNode(Node head,int x)
    {
        Node current = head;
        int pos=1;
    	while(current.next!=null && pos<x)
    	{
    	    pos++;
    	    current=current.next;
    	}
    	if(current.next == null)
    	{
    	    return head;
    	}

else{    	current.next=current.next.next;
    	current.next.prev=current;
    }
    return head;
}
}
```