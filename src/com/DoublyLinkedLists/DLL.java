package com.DoublyLinkedLists;

public class DLL
{
    private Node head;
    private Node tail;
    private Node current;
    private int size=0;

    void display()
    {
        if(this.head==null)
        {
            System.out.println("The List is Empty!");
        }
        else
        {
            this.current=this.head;
            System.out.print("null->");
            while(this.current!=null)
            {
                System.out.print(this.current.data);
                System.out.print("->");
                this.current=this.current.next;
            }
            System.out.println("null");
        }
    }

    void insertFirstNode(int _data)
    {
        Node newNode = new Node();
        newNode.data=_data;
        this.head=newNode;
        this.tail=newNode;
        this.size++;
    }

    void insertNodeAtTail(int _data)
    {
        Node newNode = new Node();
        newNode.data=_data;
        newNode.prev=this.tail;
        this.tail.next=newNode;
        this.tail=newNode;
        this.size++;
    }

    void insertNodeAtHead(int _data)
    {
        Node newNode = new Node();
        newNode.data=_data;
        newNode.prev=null;
        newNode.next=this.head;
        this.head=newNode;
        this.head.next.prev=newNode;
        this.size++;
    }

    void insertNodeBeforeData(int _data, int _search)
    {
        if(this.head.data==_search)
        {
            insertNodeAtHead(_data);
        }

        else{
            this.current = this.head;
            while (this.current.next != null && this.current.next.data != _search) {
                this.current = this.current.next;
            }
            if (this.current.next == null) {
                System.out.println("No Node Found with Given Data!");
            } else {
                Node newNode = new Node();
                newNode.data = _data;
                newNode.next = this.current.next;
                this.current.next = newNode;
                this.size++;
            }
        }
    }

    void insertNodeAfterData(int _search, int _data)
    {
        if(this.head.data==_search)
        {
            Node newNode = new Node();
            newNode.data=_data;
            newNode.next=this.head.next;
            this.head.next=newNode;
            newNode.prev=this.head;
            newNode.next.prev=newNode;
            this.size++;
        }
        else if(this.tail.data==_search)
        {
            insertNodeAtTail(_data);
        }
        else {
            this.current=this.head;
            while(this.current!=null && this.current.data!=_search)
            {
                this.current=this.current.next;
            }
            if(this.current==null)
            {
                System.out.println("No Node Found with Given Data!");
            }
            else
            {
                Node newNode = new Node();
                newNode.data=_data;
                newNode.next=this.current.next;
                newNode.next.prev=newNode;
                newNode.prev=this.current;
                this.current.next=newNode;
                this.size++;
            }
        }
    }

    void deleteNodeAtTail()
    {
        this.tail.prev.next=null;
        this.tail=this.tail.prev;
        this.size--;
    }

    void deleteNodeAtHead()
    {
        this.head.next.prev=null;
        this.head=this.head.next;
        this.size--;
    }

    void deleteNodeWithData(int _search)
    {
        if(this.head.data==_search)
        {
            deleteNodeAtHead();
        }
        else if (this.tail.data==_search)
        {
            deleteNodeAtTail();
        }
        else
        {
            this.current=this.head;
            while(this.current.next!=null && this.current.next.data!=_search)
            {
                this.current=this.current.next;
            }
            if(this.current.next==null)
            {
                System.out.println("No Node Found with Given Data!");
            }
            else
            {
                this.current.next=this.current.next.next;
                this.current.next.prev=this.current;
                this.size--;
            }
        }
    }

    private class Node
    {
        private int data;
        private Node next;
        private Node prev;

        void Node(int _data)
        {
            this.data=_data;
        }

        void Node(int _data, Node _next)
        {
            this.data = _data;
            this.next = _next;
        }
    }
}
