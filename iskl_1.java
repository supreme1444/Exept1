package iskl;

public class iskl_1 {
    public static void main(String[] args) {
    int a = 10;
    int b=0;
    divide(a,b);    
    }
    public static void divide(int g,int a)
    {
        try { 
        int d = g/a;
        System.out.println(d);
        }
        catch (ArithmeticException e) {
        System.out.println("Ошибка записи файла");  
        }
        
     
    }
}

