class MacBook {
    private final wiredKeyboard;
    private final wirelessKeyboard;
    public MacBook(){
        keyboard = new Wiredkeyboard();
        mouse = new wirelessmouse();
        //here wehard coded the wired mouse and keyboard 
        //this is not following a dependenccy inversion principle   

    }
}
//to solve this we have to implement the interface  and pass it using this keywoard
class Macbook{
    private final keyboard keyboard;
    private final mouse mouse;
   
    public MacBook(keyboard keyboard,mouse mouse){
        this . keyboard = keyboard;
        this.mouse=mouse;
    }
}