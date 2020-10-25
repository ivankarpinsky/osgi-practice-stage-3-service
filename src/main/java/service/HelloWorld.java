package service;

import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.ConfigurationPolicy;
import org.apache.felix.scr.annotations.Service;
import org.osgi.service.component.ComponentContext;

@Service(value = service.Affable.class)
@Component(name="hello")
public class HelloWorld implements service.Affable {

    public void Greeting() {
        System.out.println("Hello OSGi World");
    }
}

