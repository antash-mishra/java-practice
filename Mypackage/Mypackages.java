//DEmonstration of package 
package Mypackage;

class Balance{
    String name;
    double bal;
    Balance(String n, double b){
        name = n;
        bal = b;
    }
    void show(){
        if(bal<0)
            System.out.println("-->");
        System.out.println(name + ": $"+ bal);
    }
}
class Mypackages{
    public static void main(String args[]){
        Balance current[]=new Balance[3];
        current[0]=new Balance("Antash_Mishra", 28000);
        current[1]=new Balance("Akash", 45000);
        current[2]=new Balance("Sagar", 38000);
        for(int i=0;i<3;i++)
            current[i].show();
        }
        }
