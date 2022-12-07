public class Main {
    public static void main(String[] args) {
        String[] array1 = {" I want ", " to learn ", " how to code! "};
        String[] array2 = new String[3];

        array2[0] = array1[0].trim();
        array2[1] = array1[1].trim();
        array2[2] = array1[2].trim();

        int statement1 = array2[0].compareTo("I want"); //ritorna 0
        int statement2 = array2[1].compareToIgnoreCase("To learn"); //ritorna 0

        System.out.println(!(statement1 > statement2));
    }
}