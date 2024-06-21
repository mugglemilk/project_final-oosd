
public class Demo
{
    public static void main(String[] args)
    {
        CustomerView custView = new CustomerView();
        KitchenModel kitModel = new KitchenModel();
        WaiterController waiterControl = new WaiterController(custView,kitModel);
        
        String NCustomer = "customer";
        String order = "noodle";
        waiterControl.takeOrder(order, NCustomer);
    }
}
