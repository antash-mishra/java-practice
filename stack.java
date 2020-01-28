class stack2 {
    int stck[]=new int[10];
    int tos; //top-of-stack
    stack2(){
        tos=-1;
    }
    //push an item in stack
    void push(int item){
        if(tos==9)
            System.out.println("Stack is full");
        else
            stck[++tos]=item;
    }
    int pop(){
        if(tos<0) {
            System.out.println("Stack underflow");
            return 0;
        }
        else
            return stck[tos--];
    }
}
class stack{
    public static void main(String args[]){
        stack2 mystack1 = new stack2();
        stack2 mystack2 = new stack2();

        //push some item
        for(int i=0; i<10; i++)
            mystack1.push(i);
        for(int i=10;i<20;i++)
            mystack2.push(i);

        //pop items
        System.out.println("Stack in mystack:");
        for(int i=0;i<10;i++)
            System.out.println(mystack1.pop());

        System.out.println("Stack in mystack2:");
        for(int i=0;i<10;i++)
            System.out.println(mystack2.pop());
    }
}