class StackNaCiklList {

    private CiklList theList;


    public StackNaCiklList(){

        theList = new CiklList();
        //theList.insert(-1);


    }
    public void push(long d){


        theList.insert(d);

    }

    public long pop(){

        if(theList.getItems()==0){

            System.out.println("Pysto");
            return -1;
        }

        else{
            return theList.delete().dData;
        }

    }

    public long peek()
    {
        return theList.peek().dData;
    }

    public boolean isEmpty()
    {
        return (theList.getItems() == 1);
    }





}
