public interface I{
    void washDishes();
    void serveFood();
    void cookFood();
}
class waiter implements ResturantEmployee{
    public void washDishes(){
    //this  is no a job of waiter
    }
    public void serveFood(){                //-> this is not following interface segmented principle
        // this is waiters job
    }
}

public interface Waiter{
    void serveCustomers();
}
public interface Chef{
    void cookFood();
}

class Waiter implements Waiter{
    public void serveCustomers();
    // serving customers
}
public class Chef implements Chef{
    public void cookFood();
    //cooking food
}