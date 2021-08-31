package ClassWork2_Switch;

public class Switch {

    public static void main(String[] args){
        int choice = 1;

        // vendingIf(choice);
     //    System.out.println(choice);
     //    System.out.println(++choice);
     //   System.out.println(++choice);
     //   System.out.println(++choice);
     //   System.out.println(++choice);
     //   System.out.println(++choice);
     //   System.out.println(++choice);
     //   System.out.println(++choice);
     //   System.out.println(++choice);
     //   System.out.println(++choice);

        //postWhileMetod(choice);
        //  инициализация;        условия;        итерация;
        for(int i = 0, j = 10; i < 11 && j >0; i++, j-=2){
            System.out.printf("I=%d, J = %d\n", i,j);
            // printf - форматированый метод. Внутри метода String. формат()
            // %d - прессхолдер int
            //%c - character
            //%f - floating
            //%s - string
            //%b - boolean
        }






    }

    private static void postWhileMetod(int choice) {
        while(true){
            choice++;
            if (choice % 2 != 0);
            System.out.println(choice);
            if(choice > 15) break;
        }
    }

    private static void vendingSwith(int choice) {
        switch (choice){
            case 1:
                System.out.println("Gve me Snickers");
                break;
            case 2:
                System.out.println("Gve me Coca cola");
                break;
            case 3:
                System.out.println("Gve me pepsi");
                break;
            case 4:
                System.out.println("Gve me Mars");
                break;
            case 5:
                System.out.println("Gve me Chupa chups");
                break;
            case 6:
                System.out.println("Gve me Kinder");
                break;
            default:
                System.out.println("Неверный номер");
                break;
        }
    }

    private static void vendingIf(int choice) {
        if(choice ==1){
            System.out.println("Gve me Snickers");
        }   else if (choice ==2) {
            System.out.println("Gve me Coca cola");
        }   else if (choice ==3) {
            System.out.println("Gve me pepsi");
        }   else if (choice ==4) {
            System.out.println("Gve me Mars");
        }   else if (choice ==5) {
            System.out.println("Gve me Chupa chups");
        }   else if (choice ==6) {
            System.out.println("Gve me Kinder");
        }
    }


}
