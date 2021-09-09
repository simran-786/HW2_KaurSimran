package com.example.hw2kaur;

public class LinkedList
{
    private Node head;

    public LinkedList()
    {
        this.head = null;
    }

    public int count()
    {
        if (this.head == null)
        {
            return 0;
        }
        int count = 1;
        Node currNode = this.head;
        while (currNode.getNextNode() != null)
        {
            currNode = currNode.getNextNode();
            count++;
        }
            return count;
        }

        public int getAtPos ( int pos)
        {
            Node currNode = this.head;
            for(int i = 0; i < pos; i++);
            {
                currNode = currNode.getNextNode();
            }
        return currNode.getPayload();
    }

    public int removeEnd()
    {
        if(this.head.getNextNode() == null)
        {
            int valToReturn = this.head.getPayload();
            this.head = null;
            return valToReturn;
        }
        else
        {
            Node currNode = this.head;
            while(currNode.getNextNode().getNextNode() != null)
            {
                currNode = currNode.getNextNode();
            }
            int valToReturn = currNode.getNextNode().getPayload();
            currNode.setNextNode(null);
            return valToReturn;
        }
    }

    public void addEnd(int payload)
    {
        Node n = new Node(payload);
        if (this.head == null)
        {
            this.head = n;
        }
        else
            {
            Node currPos = this.head;
            while (currPos.getNextNode() != null)
            {
                currPos = currPos.getNextNode();
            }
            currPos.setNextNode(n);
        }
    }

    public int removeFront()
        {
            Node temp = this.head;
            this.head = this.head.getNextNode();
            temp.setNextNode(null);
            return temp.getPayload();
        }

    public void addFront(int payload)
    {
        Node n = new Node(payload);
        if(this.head == null)
        {
            this.head = n;
        }
        else
        {
            //there is already at least one thing in the list
            n.setNextNode(this.head);
            this.head = n;
        }
    }

    public void display()
    {
        if(this.head == null)
        {
            System.out.println("Empty List");
        }
        else
        {
            //difficulty stuff
            this.head.display();
        }
    }
}
