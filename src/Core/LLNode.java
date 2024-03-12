package Core;

public class LLNode {

    LLNode nextNode;
    private LLNodeObject val;
    private String key;

    public LLNode (LLNodeObject val)
    {
        this.val = val;
    }

    public LLNode (String key, LLNodeObject val)
    {
        this.key = key;
        this.val = val;
    }

    public LLNode (LLNode nextNode, String key, LLNodeObject val)
    {
        this.nextNode = nextNode;
        this.key = key;
        this.val = val;
    }

    public LLNodeObject getVal()
    {
        return val;
    }

    public boolean matchesNode (LLNode node2)
    {
        return this.key.equals(node2.getKey());
    }

    public void setKey(String key)
    {
        this.key = key;
    }

    public String getKey()
    {
        return key;
    }

    public void setVal(LLNodeObject newVal)
    {
        this.val = newVal;
    }

}
