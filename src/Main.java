import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int num1 = (int)(Math.random()*100+1);
        int num2 = (int)(Math.random()*100+1);
        int num3 = (int)(Math.random()*100+1);
        int smallest=0;

        if (num1<=num2 && num1<=num3){
            smallest = num1;
        } else if (num2<=num1 && num2<=num3){
            smallest = num2;
        } else  {
            smallest = num3;
        }
        
        System.out.println("Los números elegidos son: "+num1+", "+num2+" y "+num3);
        System.out.println("El número más pequeño es: "+smallest);
    }
}