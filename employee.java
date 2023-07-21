import java.util.*;
class empdetail {
    void display() {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        String name = sc.next();
        int age = sc.nextInt();
        long mobile = sc.nextInt();
        String mailid = sc.next();
        System.out.println("employee id:" + id);
        System.out.println("employee name:" + name);
        System.out.println("employee age:" + age);
        System.out.println("employee mobile:" + mobile);
        System.out.println("employee mailid:" + mailid);
    }
    
        class Emp
        {
            public static void main(String args[])
            {
                empdetail sc=new empdetail();
                sc.display();
                
            }
        }
        
}