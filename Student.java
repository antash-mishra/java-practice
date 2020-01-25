class Student {
    int usn;
    String name;
    String branch;
    int phone;
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.usn = 23;
        s1.name = "Antash";
        s1.branch = "cse";
        s1.phone = 73003;
       System.out.println("Students information:");
       System.out.println("Student 1:");
       System.out.println("USN :"+ s1.usn);
       System.out.println("Name :"+ s1.name);
       System.out.println("Branch :"+ s1.branch);
       System.out.println("Phone No. :" +s1.phone);
    }
}
