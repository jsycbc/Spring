/**
 * 
 */
package jsycbc.github.com.bean.xml.support.xml.constructor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathXmlConstructorApplication {

    /**
     * @param args
     */
    public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeanConstructor.xml");
	IMessagePrinter printer = (IMessagePrinter)context.getBean("MessagePrinter");
	printer.printMessage();
	context.close();
    }
}
