import java.io.IOException;
import java.util.Scanner;

public class Media3 {
  public static void main(String[] args) throws IOException {
  
    double n1,n2,n3,n4,media,emexame;
    double ntfinal;
    Scanner sc = new Scanner(System.in);
    n1 = sc.nextDouble();
    n2 = sc.nextDouble();
    n3 = sc.nextDouble();
    n4 = sc.nextDouble();

    media = (( n1*2 ) + ( n2*3 ) + ( n3*4 ) + ( n4*1 )) / 10;
    System.out.printf("Media: %.1f\n",media);

    if (media >= 7.0 ){
     System.out.println("Aluno aprovado.");
    }

    else if (media < 5){
     System.out.println("Aluno reprovado.");
    }

else if (media >= 5.0 && media <= 6.96){
     System.out.println("Aluno em exame.");
     emexame = sc.nextFloat();
     System.out.printf("Nota do exame: %.1f\n", emexame);
      ntfinal = (emexame + media) / 2;

      if (ntfinal >= 5){
        System.out.printf("Aluno aprovado.\n");
        System.out.printf("Media final: %.1f\n", ntfinal);
      }
      else{
        System.out.printf("Aluno reprovado\n");
        System.out.printf("Media final: %.1f\n",ntfinal);
      }
    }
    sc.close();
  }
}
