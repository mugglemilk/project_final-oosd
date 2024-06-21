public class WaiterController
{
    private CustomerView custView;
    private KitchenModel kitModel;
    
    public WaiterController(CustomerView custView,KitchenModel kitModel)
    {
        this.custView = custView;
        this.kitModel = kitModel;
    }
    public void takeOrder(String order,String NCustomer){
        custView.restuarant(order,NCustomer);
        System.out.println("waiter received order : "+order+" from "+" "+NCustomer);
        System.out.println("waiter sending order : "+order+" to "+" "+"kitchen");
        kitModel.recives(order);
        kitModel.prepareOrder(order);
        kitModel.returnOrder(order);
        System.out.println("waiter received : "+order+" from "+" kitchen");
        System.out.println("waiter sending : "+order+" to "+NCustomer);
        
        String admixture = kitModel.getAdmixture();
        custView.receiveOrder(NCustomer, order, admixture);
    }
}
