public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();
        ////////////////////////////////////////
        names.add("john");
        names.add("sarah");
        names.add("james");
        names.add("brenda");
        /////////////////////
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        ///////////////////////////
        grades.add(99.78);
        grades.add(88.66);
        grades.add(77.66);
        grades.add(66.55);
        //////////////////////////
        System.out.println("INDEX   NAMES");
        System.out.println("-------------------");
        for (int i=0; i<names.size(); i++){
            System.out.println(i + "\t\t" + names.get(i));
        }
        //////////////
        System.out.println("INDEX   NUMBERS");
        System.out.println("-------------------");
        for (int i=0; i<numbers.size(); i++){
            System.out.println(i + "\t\t" + numbers.get(i));
        }
        //////////////////////////////
        System.out.println("INDEX   GRADES");
        System.out.println("-------------------");
        for (int i=0; i<grades.size(); i++){
            System.out.println(i + "\t\t" + grades.get(i));
        }
        System.out.println("-------------------------------");
        System.out.println("INDEX\tID\tNAMES\tGRADES");
        for (int i=0; i<numbers.size(); i++){
            System.out.println(i+ "\t"+ numbers.get(i)+ "\t"+names.get(i)+"\t"+grades.get(i));
        }
        /////////////////////////////////////////////////
        names.remove(2);
        numbers.remove(2);
        grades.remove(2);

        System.out.println("INDEX   NAMES");
        System.out.println("-------------------");
        for (int i=0; i<names.size(); i++){
            System.out.println(i + "\t\t" + names.get(i));
        }
        /////////////////////////
        System.out.println("-------------------------------");
        System.out.println("INDEX\tID\tNAMES\tGRADES");
        for (int i=0; i<numbers.size(); i++){
            System.out.println(i+ "\t"+ numbers.get(i)+ "\t"+names.get(i)+"\t"+grades.get(i));
        }
        ////////////////////////////////////

        names.set(2,"eliza");
        numbers.set(2, 77);
        grades.set(2, 75.99);
        System.out.println("INDEX   NAMES");
        System.out.println("-------------------");
        for (int i=0; i<names.size(); i++){
            System.out.println(i + "\t\t" + names.get(i));
        }
        ///////////////////
        System.out.println("-------------------------------");
        System.out.println("INDEX\tID\tNAMES\tGRADES");
        for (int i=0; i<numbers.size(); i++){
            System.out.println(i+ "\t"+ numbers.get(i)+ "\t"+names.get(i)+"\t"+grades.get(i));
        }
        ////////////////////////////////////////////////////////////

        System.out.printf("Enter student id: ");
        numbers.add(scan.nextInt());
        System.out.printf("Enter student names: ");
        names.add(scan.next());
        System.out.printf("Enter student grades: ");
        grades.add(scan.nextDouble());
        System.out.println("-------------------------------");
        System.out.println("INDEX\tID\tNAMES\tGRADES");
        for (int i=0; i<numbers.size(); i++){
            System.out.println(i+ "\t"+ numbers.get(i)+ "\t"+names.get(i)+"\t"+grades.get(i));
        }

    }
}
//////////////////////
import  java.util.*;
public class css122 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Double> grades1 = new ArrayList<>();
        ArrayList<Double> grades2 = new ArrayList<>();
        double average=0.0;
        char grade=' ';
        char again = 'y';
        while (again == 'y') {
            ////////// add data//////
            System.out.printf("Enter student id: ");
            numbers.add(scan.nextInt());
            System.out.printf("Enter student names: ");
            names.add(scan.next());
            System.out.printf("Enter student grade 1: ");
            grades1.add(scan.nextDouble());
            System.out.printf("Enter student grade 2: ");
            grades2.add(scan.nextDouble());
            /////////////////display the data///////////////////////////////
            System.out.println("-------------------------------");
            System.out.println("INDEX\tID\tNAMES\tGRADE1\tGRADE2\tAVERAGE\tGRADE");
            for (int i = 0; i < numbers.size(); i++) {
                average=(grades1.get(i) + grades2.get(i))/2;
                if(average>=90){
                    grade='A';
                }
                else if (average>=80){
                    grade='B';
                }
                else if (average>=70){
                    grade='C';
                }
                else if (average>=60){
                    grade='D';
                }
                else{
                    grade='F';
                }
                System.out.println(i + "\t\t" + numbers.get(i) + "\t\t" + names.get(i) +
                        "\t\t" + grades1.get(i)+"\t\t"+grades2.get(i) +"\t\t"+ average +"\t\t"+grade);
            }
            System.out.printf("Would you like to enter more students y/n: ");
            again=scan.next().charAt(0);
        }
        ////////////////////////display data after quiting//////////////////////////////////
        System.out.println("-------------------------------");
        System.out.println("INDEX\tID\tNAMES\tGRADE1\tGRADE2\tGRADE");
        for (int i = 0; i < numbers.size(); i++) {
            average=(grades1.get(i) + grades2.get(i))/2;
            System.out.println(i + "\t" + numbers.get(i) + "\t" + names.get(i) + "\t"
                    + grades1.get(i)+"\t"+grades2.get(i)+"\t"+ average + "\t"+grade);
        }
    }

}
////////////////////////////
 
