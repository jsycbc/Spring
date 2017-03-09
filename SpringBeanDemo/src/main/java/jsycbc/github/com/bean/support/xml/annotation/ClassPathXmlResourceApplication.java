/**
 * 
 */
package jsycbc.github.com.bean.support.xml.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathXmlResourceApplication {

    /**
     * @param args
     */
    public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeanResource.xml");
	IMessagePrinter printer = (IMessagePrinter)context.getBean("MessagePrinter");
	printer.printMessage();
	context.close();
    }
}
