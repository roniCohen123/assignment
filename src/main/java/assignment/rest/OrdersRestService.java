package main.java.assignment.rest;

import assignment.common.Order;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/")
public class OrdersRestService {
    // Holds all the orders added so far
    private List<Order> m_orders = new ArrayList();

    @POST
    @Path("/placeorder")
    @Consumes({MediaType.APPLICATION_JSON})
    public Response addOrder(Order order) {
        // If order is invalid - return error status and the expected template to send
        if (order == null || !order.isValid()){
            return Response.status(Response.Status.BAD_REQUEST).entity(order.TEMPLATE).build();
        }

        m_orders.add(order);
        return Response.status(Response.Status.CREATED).build();
    }
}