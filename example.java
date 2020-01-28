//Demonstrate the if-else statement
class example {
    public static void main(String args[]){
        int x,y;
        x=10;
        y=20;
        if(x<y)
            System.out.println("x is less than y");
        x=x*2;
        if(x==y)
            System.out.println("x now equals to y");
        x=x*2;
        if(x>y)
            System.out.println("x now greater than y");

        //this wont display anything
        if(x==y)
            System.out.println("you wont see this");
    }
}