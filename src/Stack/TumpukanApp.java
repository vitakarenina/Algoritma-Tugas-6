package Stack;
public class TumpukanApp {
    public static void main (String [] args){
        Tumpukan tumpukan=new Tumpukan(10);
        tumpukan.push(50);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(100);
        tumpukan.baca();
        tumpukan.pop();
        //System.out.println("nilai1 = "+nilai1);
        System.out.println(" ");
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(60);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(80);
        tumpukan.baca();
        tumpukan.pop();
        //System.out.println("nilai2 = "+nilai2);
        System.out.println(" ");
        tumpukan.baca();
        System.out.println(" ");
        long nilai = tumpukan.peek();
        System.out.println("nilai top = "+nilai);
       
        
    } 
    
}
