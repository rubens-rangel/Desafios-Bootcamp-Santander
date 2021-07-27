import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class AnaliseDeNumeros {
	
    public static void main(String[] args) throws IOException{
int contador = 0;
int contador2 = 0;
int par = 0;
int impar = 0;
int positivo = 0;
int negativo = 0;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       for(int i = 1; i <= 5; i++){
           StringTokenizer st = new StringTokenizer(br.readLine());
           int a = Integer.parseInt(st.nextToken());
           if (a % 2 == 0){par++;}
          else if (a % 1 == 0){impar++;}
           if (a > 0){positivo++;}
           if (a < 0){negativo++;}
           contador2++;
            }
 
           System.out.println( par + " valor(es) par(es)");
           System.out.println( impar + " valor(es) impar(es)");
           System.out.println( positivo + " valor(es) positivo(s)");
           System.out.println( negativo + " valor(es) negativo(s)");
    }
}

