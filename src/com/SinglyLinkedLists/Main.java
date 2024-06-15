package com.SinglyLinkedLists;

public class Main{
    public static void main(String[] args)
    {
        SLL list1 = new SLL();
        list1.deleteNodeAtTail();
        list1.insertFirstNode(5);
        list1.insertNodeAtTail(2);
        list1.insertNodeAtTail(7);
        list1.insertNodeAtTail(1);
        list1.insertNodeAtTail(3);
        list1.deleteNodeAtTail();
        list1.insertNodeAtTail(9);
        list1.deleteNodeWithData(5);
        list1.displayLinkedList();
        list1.insertNodeAtHead(11);
        list1.displayLinkedList();
        list1.deleteHead();
        list1.displayLinkedList();
        list1.insertNodeNextToData(9,6);
        list1.displayLinkedList();
    }
}