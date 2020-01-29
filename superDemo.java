//demonstration of super()

class box {
    double width;
    double height;
    double depth;

    box(box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}
class boxWeight extends box{
    double weight;
    boxWeight(boxWeight ob){
        super(ob);
        weight=ob.weight;
    }
    boxWeight(double w,double h,double d,double m){
        super(w,h,d);
        weight=m;
    }
    boxWeight(){
        super();
        weight=-1;
    }
    boxWeight(double len,double m){
        super(len);
        weight=m;
    }
}
class superDemo{
    public static void main(String args[]){
        boxWeight mybox1 =new boxWeight(10,20,30,34.2);
        boxWeight mybox2 =new boxWeight(2,3,4,4.3);
        boxWeight mybox3 = new boxWeight();
        boxWeight mybox4 = new boxWeight(23,43);
        boxWeight myclone = new boxWeight(mybox1);

        System.out.println("Volume of mybox1 is: "+ mybox1.volume());
        System.out.println("Weight of mybox1 is: "+mybox1.weight);
        System.out.println();

        System.out.println("Volume of mybox2 is: "+ mybox2.volume());
        System.out.println("Weight of mybox2 is: "+mybox2.weight);
        System.out.println();

        System.out.println("Volume of mybox3 is: "+ mybox3.volume());
        System.out.println("Weight of mybox3 is: "+mybox3.weight);
        System.out.println();

        System.out.println("Volume of myclone is: "+ myclone.volume());
        System.out.println("Weight of myclone is: "+myclone.weight);
        System.out.println();
    }
}




