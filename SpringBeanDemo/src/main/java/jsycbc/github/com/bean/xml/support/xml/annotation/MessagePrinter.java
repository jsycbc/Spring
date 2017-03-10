/**
 * 
 */
package jsycbc.github.com.bean.support.xml.annotation;

import javax.annotation.Resource;

public class MessagePrinter implements IMessagePrinter {
    @Resource
    private IMessageService service;

    public MessagePrinter() {
    }

    public MessagePrinter(IMessageService service) {
	this.service = service;
    }

    public void printMessage() {
	this.service.sendMessage();
    }
}
