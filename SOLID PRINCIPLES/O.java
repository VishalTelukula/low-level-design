class Invoice{
    Invoice invoice;
    public saveToDb(Invoice invoice){
        this.invoice=invoice;
    }
    public void saveToDb(){
        //saving to db                  -> THIS IS NOT FOLLOWING OPEN CLOSE PRINCHIPLE
                                        //-> 
    }
    public void saveToFile(){
        //saviong to db
    }
}

public interface O {
    public void save(Invoice invoice);

    
}
class Dbsave implements O{
    public void save(Invoice invoice);               //-> here we ccan extend but dont have the need to modify
    // saving top dbb
}
class Savetofile{
    public void save(Invoice invoice);
    //saving to file
}