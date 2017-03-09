/**
 * 
 */
package jsycbc.github.com.bean.support.xml.property;

public class MessagePrinter implements IMessagePrinter {

    private IMessageService service;

    public IMessageService getService() {
	return service;
    }

    public void setService(IMessageService service) {
	this.service = service;
    }

    public void printMessage() {
	this.service.sendMessage();
    }
}
