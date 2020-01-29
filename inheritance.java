import java.util.Scanner;

class  staff{
    int staffId;
    String name;
    int phone;
    int salary;
    void readDisplay(){
        Scanner myobj = new Scanner(System.in);
        name = myobj.nextLine();
        staffId = myobj.nextInt();
        phone=myobj.nextInt();
        salary=myobj.nextInt();
        System.out.println("Enter StaffId: "+ staffId);
        System.out.println("Enter name: "+ name);
        System.out.println("Enter phone : "+ phone);
        System.out.println("Enter salary: "+ salary);
    }
}

class teaching extends staff{
    String domain;
    int publication;
    void showteaching(){
        Scanner obj =new Scanner(System.in);
        domain=obj.nextLine();
        publication=obj.nextInt();

        System.out.println("Domain: "+ domain);
        System.out.println("publication: "+ publication);
    }
}

class technical extends staff{
    String skills;
    void showskills(){
        Scanner newobj = new Scanner(System.in);
        skills =newobj.nextLine();

        System.out.println("skills: "+skills);
    }
}
class contract extends staff{
    int period;
    void showperiod() {
        Scanner obj2=new Scanner(System.in);
        period =obj2.nextInt();

        System.out.println("periods: "+period);
    }
}
class inheritance{
    public static void main(String args[]){
        teaching a = new teaching();
        technical b = new technical();
        contract c = new contract();
        System.out.println("Details of teaching staff: ");
        System.out.println("Enter name,staffId,phoneno. and salary");
        a.readDisplay();
        System.out.println("Enter domain and publication: ");
        a.showteaching();
        System.out.println("Details of technical staff: ");
        System.out.println("Enter name,staffId,phoneno. and salary");
        b.readDisplay();
        System.out.println("Enter skill:");
        b.showskills();
        System.out.println("Details of contract staff: ");
        System.out.println("Enter name,staffId,phoneno. and salary");
        c.readDisplay();
        System.out.println("Enter no. of periods");
        c.showperiod();
    }
}