class CiklList {

    private Link current;
    private int nItems;

    public CiklList(){

        current = null;
        nItems = 0;

    }
    public boolean isEmpty(){

        return current == null;

    }

    public long getItems(){

        return nItems;

    }

    public void step(){

        current = current.next;

    }
    public void insert(long d){
        Link newLink = new Link(d);
        if(isEmpty()){
            current = newLink;
        }
        else{
            newLink.next = current.next;
            current.next = newLink;
        }
        nItems++;
    }
    public Link find(long key){

        for(int i = 0; i < nItems; i++)
        {
            if(current.dData == key)
            {
                System.out.println("naideno " + key);
                return current;
            }
            else step();
        }
        System.out.println("ne naideno " + key + ".");
        return null;

    }

    public Link delete() {
        if(isEmpty())
        {
            System.out.println("Pysto.");
            return null;
        }
        else if(nItems == 1)
        {
            current = null;
            nItems = 0;
            return null;
        }
        else
        {
            Link temp = current.next;
            current.next = current.next.next;
            nItems--;
            return temp;
        }
    }

    public Link peek()
    {
        return current;
    }

    public void display()
    {
        System.out.print("ciclicheskii spisok (s nachala): ");
        Link index = current;
        for(int i = 0; i < nItems; i++)
        {
            System.out.print(index.dData + " ");
            index = index.next;
        }
        System.out.println("");
    }
}
