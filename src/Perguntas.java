import java.util.Scanner;

public class Perguntas {

    String pergunta = "";

    String alternativaA= "";
    String alternativaB = "";
    String AlternativaC= "";
    String AlternativaD = "";
    String AlternativaE = "";
    String certa = "";

    private boolean verifica(String r){
        if (r.equalsIgnoreCase("a")   ||
                r.equalsIgnoreCase("b") ||
                        r.equalsIgnoreCase("c") ||
                                r.equalsIgnoreCase("d")||
                                        r.equalsIgnoreCase("e")){
             return true;
        }
        return false;

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
    public void escrevaPerguntas(){
        System.out.println(this.pergunta);
        System.out.println();
        System.out.println();
        System.out.println(this.alternativaA);
        System.out.println(this.alternativaB);
        System.out.println(this.AlternativaC);
        System.out.println(this.AlternativaD);
        System.out.println(this.AlternativaE);
        System.out.println();
        System.out.println();

    }
}
