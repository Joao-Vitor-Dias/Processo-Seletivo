import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        contato();


    }

    static double salario;
    static int aprovados;
    static String [] nomes = {"Heber","Jse","Urie","Rapa","Pleio","Reio","Plego","Roger","Peitos","Seios"};
    static int i = 0;
    static boolean atendeu = false;
    static int cont;

    public static void ligar(){
        if (salario < 2000){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if (salario == 2000){
            System.out.println("LIGAR COM CONTRAPROPOSTA");
        }else {
            System.out.println("AGUARDAR OS OUTRO CANDIDATOS");
        }
    }

    public static double salarioPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    public static void aprovar(){
        while (aprovados < 5 && i <= nomes.length - 1){
            salario = salarioPretendido();
            if (salario <= 2000){
                aprovados++;
                System.out.println("O CANDIDATO " + nomes[i] + " FOI APROVADO");
            }else{
                System.out.println("O CANDIDATO " + nomes[i] + " FOI REPROVADO  E PEDIU " + salario);
            }
            i++;
        }
    }

    public static void lista(){
        String [] nomes = {"Heber","Jse","Urie","Rapa","Pleio"};
        System.out.println("LISTA DOS APROVADOS COM INDICE");
        for(i=0;i <= nomes.length -1 ; i++){
            int posicao = i;
            posicao++;
            System.out.println(nomes[i] + " " + posicao);
        }
        System.out.println("COM FOR EACH");
        for (String candidato: nomes){
            System.out.println("O CANDIDATO " + candidato + " FOI APROVADO");
        }

    }

    public static boolean teste(){
        return new Random().nextBoolean();
    }


    public static void contato(){
        String [] nomes = {"Heber","Jse","Urie","Rapa","Pleio"};
        for(String candidato:nomes) {
            cont = 0;
            do {
                System.out.println("LIGANDO ...");
                atendeu = teste();
                cont++;
            } while (!atendeu && cont <= 2);

            if (atendeu) {
                System.out.println("CONSEGUIMOS ENTRAR EM CONTATO COM O CANDIDATO " + candidato + " APOS " + cont + " TENTATIVAS");
            } else {
                System.out.println("NAO CONSEGUIMOS ENTRAR EM CONTATO COM O CANDIDATO "+ candidato);
            }
        }
    }

}