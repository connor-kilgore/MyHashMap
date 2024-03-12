package Core;

public class MyHashMap {
    LinkedList[] listArray;

    public MyHashMap ()
    {
        listArray = new LinkedList[8];
        for(int index = 0; index < listArray.length; index++)
        {
            listArray[index] = new LinkedList();
        }
    }

    public String getString ()
    {
        String returnStr = "";
        for(int index = 0; index < listArray.length; index++)
        {
            returnStr += "[" + index + "] " + listArray[index].getString();
        }
        return returnStr;
    }

    public static int getHashCode(String key)
    {
        int hashCode = 0;
        for(int index = 0; index < key.length(); index++)
        {
            hashCode += key.charAt(index);
        }
        return hashCode;
    }

    public int getHashIndex(String key)
    {
        return getHashCode(key) % listArray.length;
    }

    public boolean put(String key, LLNodeObject newVal)
    {
        LLNode newNode = new LLNode(key, newVal);
        return listArray[getHashIndex(key)].prependNode(newNode);
    }

    public boolean remove(String key)
    {
        return listArray[getHashIndex(key)].removeNode(key);
    }

    public LLNodeObject get(String key)
    {
        LLNode gotNode = listArray[getHashIndex(key)].getNode(key);
        return (gotNode != null) ? gotNode.getVal() : null;
    }

    public boolean set(String key, LLNodeObject newVal)
    {
        LLNode gotNode = listArray[getHashIndex(key)].getNode(key);

        if(gotNode == null)
            return false;

        gotNode.setVal(newVal);
        return true;
    }

    public int size()
    {
        int size = 0;
        for(int index = 0; index < listArray.length; index++)
        {
            size += listArray[index].getSize();
        }
        return size;
    }

}
