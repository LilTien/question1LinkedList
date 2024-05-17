import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("How many data: ");
        Scanner userInp = new Scanner(System.in);
        int data = userInp.nextInt();
        userInp.nextLine();
        LinkedList productLL = new LinkedList();
        for(int i =0; i < data; i++){
            System.out.println("code: " );
            String code = userInp.nextLine();
            System.out.println("Exp Date : " );
            String expDate = userInp.nextLine();
            System.out.println("Distribution : ");
            String dist = userInp.nextLine();
            System.out.println("sale price : ");
            double price = userInp.nextDouble();
            userInp.nextLine();
            ProList product = new ProList(code, expDate, dist, price);
            productLL.insertAtBack(product);
        }

        //display all product
        Object obj = productLL.getFirst();
        while (obj != null){
            ProList disp = (ProList) obj;
            if(disp.getExpDate().equalsIgnoreCase("31/5/2024")){
                System.out.println(disp);
            }
            obj = productLL.getNext();
        }

        obj = productLL.getFirst();
        int count =0;
        while (obj != null){
            ProList disp = (ProList) obj;
            if(disp.getDist().equalsIgnoreCase("Sun Co")){
                count++;
            }
            obj = productLL.getNext();
        }

        System.out.println("Total product by Sun Co : " + count);

    }
}