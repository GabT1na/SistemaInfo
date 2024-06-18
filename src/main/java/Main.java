import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite seu primeiro nome:");
    String nome = sc.next();

    System.out.println("digite seu sobrenome");
    String sobrenome = sc.next();

    System.out.println("digite sua idade");
    int idade = sc.nextInt();
    
    System.out.println("digite sua massa");
    double massa = sc.nextDouble();

    System.out.println("digite sua altura");
    double altura =sc.nextDouble();

   System.out.println("");
    
    System.out.println("Seu nome completo é:" + nome + " " + sobrenome);
    System.out.println("");
    System.out.println("Sua idade é:" + idade);
    System.out.println("");
    System.out.println("Sua massa é: " + massa);
    System.out.println("");
    System.out.println("Sua altura é:" + altura);
    System.out.println("");
    System.out.println("Seu IMC é " + massa / (altura * altura));

    sc.close();

    
  }
}