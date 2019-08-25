package testmvnv;

import org.joda.time.LocalTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class App implements CommandLineRunner {
	
	private static final Logger logger = LoggerFactory.getLogger(App.class);
	
   @Override
    public void run(String... args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("test-bean.xml");
	     Greeter objA = (Greeter) context.getBean("helloWorld");

	      //objA.setMessage("I'm object A");
	      System.out.println(objA.getMessage());

	     // Greeter objB = (Greeter) context.getBean("helloWorld");
	   //   System.out.println( objB.getMessage());
		//
	     Rates r = (Rates) context.getBean("getRates");
	    System.out.println(r);
	    
	   /*
        if (args.length > 0) {
            System.out.println(helloService.getMessage(args[0].toString()));
        } else {
            System.out.println(helloService.getMessage());
        }
*/
        System.exit(0);
    }
   
   public static void main(String[] args) throws Exception {
	   SpringApplication app = new SpringApplication(App.class);
       //app.setBannerMode(Banner.Mode.OFF);
       app.run(args);	   
			   
   }
	public static void backup_main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("test-bean.xml");
	      Greeter objA = (Greeter) context.getBean("helloWorld");

	      //objA.setMessage("I'm object A");
	      System.out.println(objA.getMessage());

	     // Greeter objB = (Greeter) context.getBean("helloWorld");
	   //   System.out.println( objB.getMessage());
		//
	     Rates r = (Rates) context.getBean("getRates");
	    System.out.println(r);
		SpringApplication.run(App.class, args);
		// TODO Auto-generated method stub
		
		/*
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
		
		Greeter g = new Greeter();
		System.out.println(g.sayHello());
		*/

	}

}
