//demonstration of overload method example1

class demooverload{
    void test(){
        System.out.println("No parameter");
    }
    void test(int a){
        System.out.println("a: "+ a);
    }
    void test(int a,int b){
        System.out.println("a and b"+ a + " "+ b);
    }
    double test (double a){
        System.out.println("double a: "+ a);
        return a*a;
    }sa
}

class overload{
    public static void main(String args[]){
        demooverload ob = new demooverload();
        double result;
        ob.test();
        ob.test(10);
        ob.test(10,20);
        result = ob.test(123.05);
        System.out.println("Result of ob.test(123.05): "+ result);
    }
}