public class CustomerView
{
    WaiterController waiterController;
    public void restuarant(String order,String NCustomer)
    {
        System.out.println(NCustomer+" food list : "+order);
    }
    public void receiveOrder(String NCustomer, String order, String admixture){
        System.out.println(NCustomer+" recieve list : "+order+"("+ admixture +")");
    }
}
