package assignment.common;

/**
 * This class represent an order with all the necessary details
 *
 */
public class Order {

    protected String name;
    protected String cellNumber;
    protected String address;
    protected String orderDetails;

    // Expected template
    public static final String TEMPLATE =
            String.format("Expected template: {name(max length:%d), cellNumber(max length:%d, only numbers), " +
            "address(max length:%d), orderDetails(max length:%d)}",  Properties.MAX_NAME_LEN,
            Properties.CELL_NUMBER_LEN, Properties.MAX_ADDRESS_LEN, Properties.MAX_DETAILS_LEN);

    public Order(){}

    public Order(String name, String cellNumber, String address, String orderDetails){
        setName(name);
        setCellNumber(cellNumber);
        setAddress(address);
        setOrderDetails(orderDetails);
    }

    public String getName() {
        if (cellNumber == null) return Properties.NULL_STRING_VALUE;

        return name;
    }

    public void setName(String name) {
        if ((name != null) && (name.length() <= Properties.MAX_NAME_LEN)){
            this.name = name;
        }
    }

    public String getCellNumber() {
        if (cellNumber == null) return Properties.NULL_STRING_VALUE;

        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        if ((cellNumber != null) && (cellNumber.matches("[0-9]+")) &&
                (cellNumber.length() <= Properties.CELL_NUMBER_LEN)) {
            this.cellNumber = cellNumber;
        }
    }

    public String getAddress() {
        if (address == null) return Properties.NULL_STRING_VALUE;


        return address;
    }

    public void setAddress(String address) {
        if ((address != null) && (address.length() <= Properties.MAX_ADDRESS_LEN)) {
            this.address = address;
        }
    }

    public String getOrderDetails() {
        if (orderDetails == null) return Properties.NULL_STRING_VALUE;

        return orderDetails;
    }

    public void setOrderDetails(String orderDetails) {
        if ((orderDetails != null) && (orderDetails.length() <= Properties.MAX_DETAILS_LEN)) {
            this.orderDetails = orderDetails;
        }
    }


    public boolean isValid(){
        return (name != null) && (cellNumber != null) && (address != null) && (orderDetails != null);
    }
}