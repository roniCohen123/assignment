package assignment.app;

import main.java.assignment.rest.OrdersRestService;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class OrdersApplication extends Application {
    private Set<Object> singletons = new HashSet<Object>();

    public OrdersApplication() {
        singletons.add(new OrdersRestService());
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}