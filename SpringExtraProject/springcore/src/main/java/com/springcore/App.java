

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	Student st = new Student();
    	System.out.println(st.name);
    }
}

  class Student{
	  String name;
	  Student(){
		  name=null;
	  }
  }
