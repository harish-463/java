class Employee
{  
    int id;  
    String name;  
    int salary;  
    void insert(int i, String n, int s)
 {  
        id=i;  
        name=n;  
        salary=s;  
    }  
    void display()
{System.out.println(id+"-"+name+"-"+salary);}  
}  
public class TestEmployee {  
public static void main(String[] args) 
{  
    Employee e1=new Employee();  
    Employee e2=new Employee();  
    Employee e3=new Employee();  
    e1.insert(101,"harish",45000);  
    e2.insert(102,"vishwa",25000);  
    e3.insert(103,"jafrin",55000);  
    e1.display();  
    e2.display();  
    e3.display();  
}  
}  