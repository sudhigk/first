class constructor{

    int x;
    constructor(){
        System.out.println("constructor called");
        x=1011;
    }
    public static void main(String[] args) {
        constructor ob = new constructor();
        System.out.println(ob.x);
        
    }
}