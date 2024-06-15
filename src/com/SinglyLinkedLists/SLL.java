package com.SinglyLinkedLists;

public class SLL
{
    private int size;
    Node head;
    Node tail;
    Node current;

    public void displayLinkedList()
    {
        if(head==null)
        {
            System.out.println("List is Empty!");
        }
        else
        {
            this.current = this.head;
            while (this.current != null)
            {
                System.out.print(current.data);
                System.out.print("->");
                this.current = this.current.next;
            }
            System.out.println("null");
            this.current = this.head;
        }
    }

    public void insertFirstNode(int data)
    {
        Node temp = new Node(data);
        temp.next=null;
        head = temp;
        tail=temp;
        size+=1;
    }

    public void insertNodeAtTail(int data)
    {
        Node temp = new Node(data);
        tail.next=temp;
        tail=temp;
        size+=1;
    }

    public void deleteNodeAtTail()
    {
        if(head==null)
        {
            System.out.println("List is Empty!");
        }
        else
        {
            this.current = this.head;
            while (this.current.next != this.tail)
            {
                this.current = this.current.next;
            }
            this.current.next = null;
            this.tail = this.current;
            this.current = this.head;
            this.size--;
        }
    }

    public void deleteNodeWithData(int _data)
    {
        if(this.head==null)
        {
            System.out.println("List is Empty!");
        }
        else if (this.head.data==_data)
        {
              this.head=this.head.next;
              this.size--;
        }
        else
        {
              this.current=this.head;
              while(this.current!=this.tail && this.current.next.data!=_data)
              {
                  this.current=this.current.next;
              }
              if(this.current==this.tail)
              {
                  System.out.println("No Node Present with Given Data!");
              }
              else
              {
                  Node temp = this.current.next.next;
                  this.current.next = temp;
              }
              this.size--;
        }
    }

    public void deleteHead()
    {
        this.head=this.head.next;
        this.size--;
    }

    public void insertNodeAtHead(int _data)
    {
        Node temp = new Node(_data, this.head);
        this.head=temp;
        size+=1;
    }

    public void insertNodeNextToData(int _search, int _data)
    {
        if(this.head==null)
        {
            System.out.println("List is Empty!");
        }
        else
        {
            this.current=this.head;
            while(this.current!=null && this.current.data!=_search)
            {
                this.current=this.current.next;
            }
            if(this.current==null)
            {
                System.out.println("No Node Present with Given Data!");
            }
            else
            {
                Node temp = new Node(_data,this.current.next);
                this.current.next=temp;
            }
        }
    }

        private class Node
        {
            private int data;
            private Node next;

            public Node(int _data)
            {
                this.data=_data;
            }
            public Node(int _data, Node _next)
            {
                this.data=_data;
                this.next=_next;
            }
        }

}



