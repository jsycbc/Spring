/**
 * 
 */
package jsycbc.github.com.bean.java.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

//@Configuration
//@ComponentScan
public class Application {

//    @Bean
//    IMessageService mockMessageService() {
//	return new IMessageService() {
//	    public String getMessage() {
//		return "Hello World!";
//	    }
//	};
//    }

    public static void main(String[] args) {
	AbstractApplicationContext context = new AnnotationConfigApplicationContext(MessageService.class);

	MessagePrinter printer = context.getBean(MessagePrinter.class);
	printer.printMessage();

	context.close();
    }
}
