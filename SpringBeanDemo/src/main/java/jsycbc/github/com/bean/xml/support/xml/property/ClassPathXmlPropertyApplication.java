/**
 * 
 */
package jsycbc.github.com.bean.xml.support.xml.property;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathXmlPropertyApplication {

    /**
     * @param args
     */
    public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
	IMessagePrinter printer = (IMessagePrinter)context.getBean("MessagePrinter");
	printer.printMessage();
	context.close();
    }
}
