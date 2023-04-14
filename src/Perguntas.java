import java.util.Scanner;

public class Perguntas {

    String pergunta = "";


    String certa = "";

    private boolean verifica(String r){
        return r.equalsIgnoreCase("a") ||
                r.equalsIgnoreCase("b") ||
                r.equalsIgnoreCase("c") ||
                r.equalsIgnoreCase("d") ||
                r.equalsIgnoreCase("e");

    }
    public boolean isCerta(String  resposta){

        while ((!verifica(resposta))){
            System.out.println("Digite uma resposta válida!");
            Scanner leia = new Scanner(System.in);
            resposta = leia.next();
        }

        if(resposta.equalsIgnoreCase(this.certa)){
            System.out.println("Certa resposta");

            return true;
        }else{
            System.out.println("Errouuuu");
            System.out.println("A resposta correta é a letra: "+ certa);
            return false;
        }
    }
}
