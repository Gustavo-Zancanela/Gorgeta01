public class Tip01 {
   
    public static void main(String[] args) {
        
        int pessoa1 = 10;
       int pessoa2 = 12;
       int pessoa3 = 9;
       int pessoa4 = 8;
       int pessoa5 = 7;
       int pessoa6 = 15;
       int pessoa7 = 11;
       int pessoa8 = 30;
       double taxa = 0.05;
       double gorjeta = 0.15;
       
        //Find everyone's indivudlal total after tax(5%) and tip(15%)
         double total = pessoa1 * (1 + taxa + gorjeta);
         double total2 = pessoa2 * (1 + taxa + gorjeta);
         double total3 = pessoa3 * (1 + taxa + gorjeta);
         double total4 = pessoa4 * (1 + taxa + gorjeta);
         double total5 = pessoa5 * (1 + taxa + gorjeta);
         double total6 = pessoa6 * (1 + taxa + gorjeta);
         double total7 = pessoa7 * (1 + taxa + gorjeta);
         double total8 = pessoa8 * (1 + taxa + gorjeta);
        
        System.out.println(total);
        System.out.println(total2);
        System.out.println(total3);
        System.out.println(total4);
        System.out.println(total5);
        System.out.println(total6);
        System.out.println(total7);
        System.out.println(total8);
       
       
       
    }    
}
