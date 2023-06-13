package iskl;

public class iskl_2 {
    public static void main(String[] args) {
        String[] Names = {"Тула", "Калуга", "БМВ"};
        myarr(Names);
    }

    public static void myarr(String[] myArray1) {

        try {
            myArray1[3] = "Жигули";

        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Нет такого значения");

        }
    }
}
