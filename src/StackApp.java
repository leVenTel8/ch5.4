class StackApp {

    public static void main(String[] args){

        StackNaCiklList theStack = new StackNaCiklList();
        theStack.push(10);
        theStack.push(5);
        theStack.push(7);
        theStack.push(11);
        theStack.push(12);


        System.out.println(theStack.pop());
        System.out.println(theStack.pop());
        System.out.println(theStack.pop());
        System.out.println(theStack.pop());



    }

}
