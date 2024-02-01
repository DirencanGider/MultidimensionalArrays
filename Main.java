import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6};

        int[][] array2 = new int[2][2]; //Bu uzun yol. Bir de kısa yolu görelim.
        array2[0][0] = 10;
        array2[0][1] = 20;
        array2[1][0] = 30;
        array2[1][1] = 40;

        int[][] array3 = {{10,20},{30,40}}; //Kısa yolu.

        System.out.println(array3[1][0]);

        //Array elemanlarını kullanıcıdan aldığımız bir örnek daha yapalım.

        int[][] array4 = new int[2][2];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i< array4.length; i++) { //array4.length yerine i ve j 'ye tanımlanmış 2 değerini de yazabilirdik. Aynı şey.
            for (int j = 0 ; j< array4.length ; j++) {

                //System.out.println("i = " + i + " j = " + j); //Array içeriğini iç içe for dögüsü ile doldurduk. Çıktıyı gördük.

                System.out.print("Array içeriğini giriniz: ");
                array4[i][j] = scanner.nextInt();

            }
        }

        System.out.println("*********************************");

        for(int i = 0; i< array4.length; i++) {

            for(int j = 0; j< array4.length; j++) {

                System.out.print(array4[i][j] + "  "); //Matris formunda yan yana basılmalarını sağladık.


            }
            System.out.println(" "); //Küçük döngü sona erdikten sonra bir alt satıra geçmesi için yazdık.
        }




    }

}
