/**
 * 
 */
package jsycbc.github.com.bean.java.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author bianchao
 *
 */
@Configuration
@ComponentScan
public class MessageService implements IMessageService {

    /*
     * (non-Javadoc)
     * 
     * @see jsycbc.github.com.bean.annotation.IMessageService#getMessage()
     */
    @Override
    public String getMessage() {
	return "Hello World!";
    }

}
