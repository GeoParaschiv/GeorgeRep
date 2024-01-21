package org.example.tema;

public class Tema {


    /*public static void exercitiul1() {
        //public static void main(String[] args) {
        Scanner ob1 = new Scanner(System.in);
        System.out.println("Introduceti un numar: ");
        int numar1 = ob1.nextInt();
        ob1.close();

        int randomNum = (int) (Math.random() * 101);
        System.out.println("Numarul random este: " + randomNum);
        if (numar1 < randomNum) {
            System.out.println("Numarul" + numar1 + " este mai mic decat " + randomNum);
        } else {
            System.out.println("Numarul " + numar1 + " este mai mare decat " + randomNum);
        }

    }*/


    /*public static void exercitiul2() {

        System.out.println("Introduceti un caracter: ");
        Scanner obj1 = new Scanner(System.in);
        char caracter = obj1.next().charAt(0);
        System.out.println("Introduceti primul numar: ");
        int numar1 = obj1.nextInt();
        System.out.println("Introduceti al 2-lea numar: ");
        int numar2 = obj1.nextInt();
        obj1.close();


        int suma = numar1 + numar2;
        int scadere = numar1 - numar2;
        int inmultire = numar1 * numar2;
        int impartire = numar1 / numar2;
        int modul = numar1 % numar2;

        switch (caracter) {
            case 'a':
                System.out.println("Suma celor doua numere este: " + suma);
                break;

            case 's':
                System.out.println("Diferenta celor doua numare este: " + scadere);
                break;

            case 'i':
                System.out.println("Inmultirea celor doua numere este: " + inmultire);
                break;

            case 'p':
                System.out.println("Impartirea celor doua numere este: " + impartire);
                break;

            case 'm':
                System.out.println("Modulul celor doua numere este: " + modul);
                break;

            default:
                System.out.println("Caracterul introdus este invalid");
        }*/


    //public static void exercitiul3() {

    //int[][] arr = {{1, 2, 3}, {10, 11, 12, 13, 14}};
        /*cars[0][0] = "bmw";
        cars[0][1] = "audi";
        cars[0][2] = "mercedes";
        cars[0][3] = "opel";
        cars[0][4] = "vw";
        cars[1][0] = "volvo";
        cars[1][1] = "dacia";
        cars[1][2] = "renault";
        cars[1][3] = "bugatti";
        cars[1][4] = "cls63amg";
        cars[2][0] = "seat";
        cars[2][1] = "skoda";
        cars[2][2] = "scania";
        cars[2][3] = "daf";
        cars[2][4] = "man";*/

    //for (int i = 0; i < 2; i++) {
    //for (int j = 0; j < 2; j++) {
    //System.out.print(arr[i][j] + " ");

    //System.out.println(([0][0]) + " " + ([0][1]));
    //System.out.println(([2][3]) + " " + ([2][4]));
    //}
    //}


   /* public static void exercitiul4() {

        char array[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};


        for (int i = 0; i < array.length; i += 2) {
            System.out.println("Numarul de pe pozitia " + i + " este " + array[i]);
        }
    }*/

   /* public static void exercitiul3v2(){
 int[][] arr = {{1, 2, 3}, {10, 11, 12, 13, 14}};
        System.out.println((arr[0][0]) + " , " + (arr[0][1])+" si " + (arr[1][0])+" , " + (arr[1][1]));
        System.out.println((arr[0][1]) + " , " + (arr[0][2])+ " si " + (arr[1][3])+ " , " + (arr[1][4]));
    }*/

    /*public static void exercitiul5() {

        double[] numere = {2.2, 3.1, 4.5 , 6.6 , 8.5 , 12.5,};
        for (int i = 0; i < numere.length; i++) {
            if (numere[i] == 4.5) {
                System.out.println(numere[i]);
            }if (numere[i] > 5) {
                System.out.println("Numarul " + numere[i] + " este peste 5");
            }
        }
    }*/

   /* public static void exercitiul6() {

        int[] array = {12, 42, 23, 14, 53, 65, 75, 28, 94};

        for (int i = 0; i < 9; i++) {
            if (i == 2) {
                continue;
            }
            if (i == 7) {
                break;
            } else {
                System.out.println("Index invalid, indexul de la pozitia " + i + " este " + array[i]);
            }
        }
    }*/

   /* public static void exercitiul7() {

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(1);
        lista.add(1);
        lista.add(1);
        lista.add(1);

        Integer sum = 0;
        int i;
        for (i = 0; i < lista.size(); ) {
            do {
                sum = sum + lista.get(i);
                i++;

            } while (i < lista.size());
            System.out.println("The sum is: " + sum);
        }
    }*/
  /* public static void exercitiul8() {

       List<Integer> lista = new ArrayList<>(10);
       {

           int[] array = {2};

           boolean rasp1 = lista.isEmpty();
           boolean rasp2 = array.length == 0;
           if (rasp2 == true)
               //if (rasp1 == true)
               System.out.println("Lista este goala");
           else
               System.out.println("Lista nu este goala");

       }
   }*/

   /* public static void main(String[] args) {


        Integer[] array = {1, 17, 2, 9, 4, 3, 22};
        Arrays.sort(array);
        System.out.println("Sortare crescatoare" + Arrays.toString(array));


        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Sortare descrescatoare: " + Arrays.toString(array));

    }

*/
}









