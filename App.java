package in.tejashande.SpringJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.tejashande.resources.SpringConfigFile;


public class App 
{
    public static void main( String[] args )

    {
    	int Rollno=101;
    	String Name="Tejas";
    	float Marks=67;
    	
       ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
      JdbcTemplate jdbcTemplate= context.getBean(JdbcTemplate.class);
      
      String insert_sql_query = "Insert into student Values(?,?,?)";
      jdbcTemplate.update(insert_sql_query,Rollno,Name,Marks);
      System.out.println("Success");
      
    }
}
