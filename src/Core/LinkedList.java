package Core;

public class LinkedList {

    LLNode headNode;
    private int size;

    public LinkedList ()
    {
        size = 0;
    }

    public LinkedList (LLNode headNode)
    {
        this.headNode = headNode;
        size = 1;
    }

    public boolean removeNode(String key)
    {
        LLNode prevNode = headNode;
        LLNode wkgNode = headNode;

        while(wkgNode != null)
        {
            if (key.equals(wkgNode.getKey()) && wkgNode == headNode)
            {
                headNode = wkgNode.nextNode;
                size--;
                return true;
            }
            else if (key.equals(wkgNode.getKey()))
            {
                prevNode.nextNode = wkgNode.nextNode;
                size--;
                return true;
            }

            prevNode = wkgNode;
            wkgNode = wkgNode.nextNode;
        }
        return false;
    }

    public LLNode getNode(String key)
    {
        LLNode wkgNode = headNode;
        while(wkgNode != null)
        {
            if (key.equals(wkgNode.getKey()))
                return wkgNode;
            wkgNode = wkgNode.nextNode;
        }
        return null;
    }

    public boolean containsNode(String key)
    {
        return getNode(key) != null;
    }

    public Boolean prependNode(LLNode newNode)
    {
        if(containsNode(newNode.getKey()))
        {
            return false;
        }
        else
        {
            newNode.nextNode = headNode;
            headNode = newNode;
            size++;
            return true;
        }
    }

    public String getString()
    {
        LLNode wkgNode = headNode;
        String returnStr = "";
        while(wkgNode != null)
        {
            returnStr += wkgNode.getVal().getString() + " -> ";
            wkgNode = wkgNode.nextNode;
        }
        return returnStr + "\n";
    }

    public int getSize()
    {
        return size;
    }

}
