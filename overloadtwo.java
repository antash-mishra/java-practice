class Box{
    int width;
    int height;
    int depth;
    Box(Box ob){
        width =ob.width;
        height=ob.height;
        depth=ob.depth;
    }
    Box(int w,int h,int d){
        width=w;
        height=h;
        depth=d;
    }
    Box(){
        width=-1;
        height=-1;
        depth=-1;
    }
    Box(int len){
        width=height=depth=len;
    }
    double volume(){
        return width*height*depth;
    }
}
class overloadtwo{
    public static void main(String args[]){
        Box mybox1=new Box(10,25,30);
        Box mybox2=new Box();
        Box mybox3=new Box(25);
        Box myclone=new Box(mybox1);
        double vol;
        vol=mybox1.volume();
        System.out.println("Volume of mybox1 is "+ vol);

        vol=mybox2.volume();
        System.out.println("Volume of mybox2 is "+ vol);

        vol=mybox3.volume();
        System.out.println("Volume of mybox3 is "+ vol);

        vol=myclone.volume();
        System.out.println("Volume of myclone is "+ vol);
    }
}