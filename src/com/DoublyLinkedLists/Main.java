package com.DoublyLinkedLists;

public class Main
{
    public static void main(String[] args)
    {
        DLL list1 = new DLL();
        list1.display();
        list1.insertFirstNode(8);
        list1.display();
        list1.insertNodeAtHead(5);
        list1.insertNodeAtHead(6);
        list1.insertNodeAtHead(1);
        list1.display();
        list1.insertNodeAtTail(9);
        list1.insertNodeAtTail(7);
        list1.insertNodeAtTail(2);
        list1.display();
        list1.deleteNodeWithData(7);
        list1.display();
        list1.insertNodeAfterData(9,7);
        list1.display();
        list1.insertNodeBeforeData(5,6);
        list1.display();
        list1.deleteNodeAtTail();
        list1.display();
        list1.deleteNodeAtHead();
        list1.display();
        list1.deleteNodeWithData(5);
        list1.display();
        list1.deleteNodeWithData(7);
        list1.display();
        list1.insertNodeBeforeData(1,6);
        list1.display();
        list1.insertNodeBeforeData(3,9);
        list1.display();
        list1.insertNodeAfterData(1,7);
        list1.display();
        list1.insertNodeAfterData(9,4);
        list1.display();
        list1.deleteNodeWithData(1);
        list1.display();
        list1.deleteNodeWithData(4);
        list1.display();
    }
}
