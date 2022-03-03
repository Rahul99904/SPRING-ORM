package com.spring.orm;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.Student_dao;
import com.spring.orm.entities.Student;

public class App 
{
	
    public static void main( String[] args )
    {
    	int opt;

 	   int id_ins;
 	   String name;
 	   String add;
    	Scanner sc=new Scanner(System.in);
       ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
       Student_dao stud=(Student_dao)context.getBean("studentdao");
      

           do {

               System.out.println( "Enter the operation that u want to perform \n 1]insert \n 2]get single data \n 3]get all data \n 4]delete  data \n 5]update data \n 6]Exit" ); 
                opt=sc.nextInt();

               switch (opt)
               {

               case 1:
            	   
            	   System.out.println("Enter id");
            	   id_ins=sc.nextInt();
            	   System.out.println("Enter name");
            	   name=sc.next();
            	   System.out.println("Enter City");
            	   add=sc.next();
            	   Student student=new Student(id_ins,name,add);	
          		 int res=stud.insert(student); 
          		 System.out.println("Inserted!! "+ res );
                   break;
                   
               case 2:
            	   
            	   System.out.println("Enter id");
            		Student st_ins=stud.getstudent(sc.nextInt());
            		System.out.println("Id " + st_ins.getStud_id());
            		System.out.println("Name " + st_ins.getStud_name());
            		System.out.println("City " + st_ins.getStud_city());
            		System.out.println("-------------------------");
                   break;
                   
               case 3:
            	   List<Student> list_all=stud.getall();
            	   for(Student stt:list_all) {
            		   System.out.println("Id  " + stt.getStud_id());
            		   System.out.println("Name " + stt.getStud_name());
            		   System.out.println("City " + stt.getStud_city());
            		   System.out.println("------------------------------");
            	   }
                   break;
               case 4:
            	   System.out.println("Enter id");
                   stud.delete(sc.nextInt());
                   System.out.println("---------------------------------");
                   break;
               case 5:
            	   System.out.println("Enter id");
            	   id_ins=sc.nextInt();
            	   System.out.println("Enter name");
            	   name=sc.next();
            	   System.out.println("Enter City");
            	   add=sc.next();
            	   Student stdd=new Student(id_ins,name,add);
            	   
            	   stud.update(stdd);
            	   System.out.println("---------------------------------");
                   break;
               default:
                   System.out.println("Invalid input");
                   break;
               }
           } while (opt != 6);
       
       
      
		 
	
       
       
       
       
       
    }
}
