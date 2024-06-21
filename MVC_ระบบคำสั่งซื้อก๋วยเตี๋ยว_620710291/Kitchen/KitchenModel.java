public class KitchenModel
{
    private String order;
    private String admixture;
    private WaiterController waiterControl;
    public KitchenModel()
    {
        order = "something";
        admixture = "something";
    }
    public String getOrder(){
        return order;
    }
    public String getAdmixture(){
        return admixture;
    }
    public void recives(String order){
        System.out.println("received order : "+order+" from waiter");
    }
    public void returnOrder(String order){
        System.out.println("return order : "+order+" from waiter");
    }
    public void prepareOrder(String order){
        if(order.equals("noodle")){
            this.order = order;
            this.admixture = "meatball, bean sprout, meat, soup, ramen";
        }else{
            this.order = "something";
            this.admixture = "something";
        }
    }
    public String getPreparedAdmixture(){
        return admixture;
    }
}
