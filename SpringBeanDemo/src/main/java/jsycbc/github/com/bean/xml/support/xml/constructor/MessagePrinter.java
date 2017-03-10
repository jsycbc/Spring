/**
 * 
 */
package jsycbc.github.com.bean.support.xml.constructor;

public class MessagePrinter implements IMessagePrinter {

    private IMessageService service;

    private String name;

    public MessagePrinter(IMessageService service) {
	this.service = service;
	this.name = "constructor service";
    }

    public MessagePrinter(IMessageService service, String name) {
	this.service = service;
	this.name = name;
    }

    public void printMessage() {
	System.out.println(this.service.getMessage() + "," + this.name + "!");

    }
}
