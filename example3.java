//Demonstration of returning a value
class Box {
    int width;
    int height;
    int length;
    Box(int w,int h,int l){
        width = w;
        height = h;
        length = l;
    }
    int volume() {
        return width*height*length;
    }
}
class example3{
    public static void main(String args[]){
        Box mybox = new Box(20,25,30);
        Box mybox2 = new Box(25,30,45);
        System.out.println("volume is "+ mybox.volume());
        System.out.println("volume is "+ mybox2.volume());
    }
}