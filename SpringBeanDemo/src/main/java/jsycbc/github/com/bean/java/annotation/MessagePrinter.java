/**
 * 
 */
package jsycbc.github.com.bean.java.annotation;

/**
 * @author bianchao
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

    final private IMessageService service;

    @Autowired
    public MessagePrinter(IMessageService service) {
        this.service = service;
    }

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}

