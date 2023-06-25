import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        // Declarandoas variáveis do tipo funcionário
        Funcionario f1, f2;
        
        // Instanciando (criando) os objetos
        f1 = new Funcionario();
        f2 = new Funcionario();
       
        System.out.println("Dados do primeiro funcionáro:");
        f1.nome = sc.next();
        f1.valorPorHora = sc.nextDouble();
        f1.horas = sc.nextInt();

        System.out.println("Dados do segundo funcionáro:");
       	f2.nome = sc.next();
        f2.valorPorHora = sc.nextDouble();
        f2.horas = sc.nextInt();

        //double total = f1.valorPorHora * f1.horas + f2.valorPorHora * f2.horas;
        double total = f1.total() + f2.total();

        System.out.printf("Total dos dois funcionários = %.2f%n",  total);
    }
}