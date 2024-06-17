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
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        Node newNode = new Node(x);
        newNode.next=head;
        head=newNode;
        return head;
    }
    
    //Function to insert a node at the end of the linked list.
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
