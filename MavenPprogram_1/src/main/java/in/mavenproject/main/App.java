package in.mavenproject.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.mavenproject.bean.Student;

public class App 
{
    public static void main( String[] args )
    {
    	    String config_loc = "/com/mavenproject/config/appConfigFile.xml";
    	  ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
    	      Student st = context.getBean(Student.class);
//    	              st.getId()  ;
//    	              st.getName();
    	       st.display();
        System.out.println( "Hello World!" );
    }
}
