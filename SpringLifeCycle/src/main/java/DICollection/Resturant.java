package DICollection;

import java.util.List;

public class Resturant {
    private List resturanctWaitersList;
    public void setResturanctWaitersList(List resturanctWaitersList){
        this.resturanctWaitersList = resturanctWaitersList;
    }
    public void  displayWaitersName(){
        System.out.println("All waiters working in resturant:"+ resturanctWaitersList);
    }


}
