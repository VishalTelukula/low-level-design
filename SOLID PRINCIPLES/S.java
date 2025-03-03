class Marker{
    String name;
    String colour;
    int price;
    int year;
    public Marker(String nam,String colour,int price,int year){
        this.name=name;
        this .colour=colour;
        this . price=price;
        this.year=year;
    }
}
class Invoice{
    private Marker marker;
    private int quantity;
    public Invoice(Marker marker,int quantity){
        this.marker=marker;
        this.quantity=quantity;
    }
    public int calculateTot(){
        int price = ((marker.price) * quantity);                      //-> THIS IS NOT FOLLOWING SINGLE RESPONSIBILITY PRINCIPLE
                                                                      // -> THIS IS HAVING  MULTIPLE REASONS TO CCHANG
                                                                      // -> THIS SHOULD HAVE ONLYH ONE REASON TO CHANGE
        return price;
    }
    public void printInvoice(){
        //printing invoice
    }
    public void saveToDb(){
        //saving to db
    }
}

class Invoice{
    private Marker marker;
    private int quantity;
    public Invoice(Marker marker,int quantity){
        this.marker=marker;
        this.quantity=quantity;
    }
    public calculateTotal(){
        int price = ((marker.price) * quantity);  
        return tot;
    }
}
class Dbsave{
    Invoice invoice;
    public Dbsave(Invoice invoice){
        this.invoice=invoice;
    }
    public void saveToDb(){
        //saving to db
    }
}

class Print{
    Invoice invoice;
    public Dbsave(Invoice invoice){
        this.invoice=invoice;
    }
    public void printmarker{
        //printing the markerinvoice
    }
}