# Linked Lists
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