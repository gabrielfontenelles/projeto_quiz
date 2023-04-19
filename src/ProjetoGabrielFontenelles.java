import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProjetoGabrielFontenelles {
    public static void main(String[] args) {
        Cabecalho cab = new Cabecalho();
        cab.escreva();

        Scanner leia = new Scanner(System.in);
        List<Perguntas> perguntas = new ArrayList<>();

        int acertos = 0;

        Perguntas p1 = new Perguntas();
        p1.pergunta +="1 - Palmeiras tem Mundial?\n";
        p1.pergunta +=" A - Sim\n";
        p1.pergunta +=" B - Não\n";
        p1.pergunta +=" C - Ce ta ficando doido?\n";
        p1.pergunta +=" D - Nunca terá\n";
        p1.pergunta +=" E - Todas as alternativas excluindo a alternativa A\n";
        p1.certa ="E";
        System.out.println(p1.pergunta);
       if ( p1.isCerta(leia.nextLine())){
           acertos++;
       }
        perguntas.add(p1);



        Perguntas p2 = new Perguntas();
        p2.pergunta +="2 - Quantas vezes o Corinthians foi rebaixado?\n";
        p2.pergunta +=" A - Sim\n";
        p2.pergunta +=" B - 1\n";
        p2.pergunta +=" C - 3\n";
        p2.pergunta +=" D - 4\n";
        p2.pergunta +=" E - corinthians nunca foi rebaixado ta maluco?\n";
        p2.certa ="B";
        System.out.println(p2.pergunta);
        if ( p2.isCerta(leia.nextLine())){
            acertos++;
        }
        perguntas.add(p2);


        Perguntas p3 = new Perguntas();
        p3.pergunta +="3 - Qual o mascote do vila nova?\n";
        p3.pergunta +=" A - Dragão\n";
        p3.pergunta +=" B - Periquito\n";
        p3.pergunta +=" C - Leão\n";
        p3.pergunta +=" D - Tigre\n";
        p3.pergunta +=" E - Palhaço\n";
        p3.certa ="D";
        System.out.println(p3.pergunta);
        if ( p3.isCerta(leia.nextLine())){
            acertos++;
        }
        perguntas.add(p3);

        Perguntas p4 = new Perguntas();
        p4.pergunta +="4 - Qual foi o campeão da Libertadores de 2022?\n";
        p4.pergunta +=" A - Flamengo\n";
        p4.pergunta +=" B - Palmeiras\n";
        p4.pergunta +=" C - Vasco\n";
        p4.pergunta +=" D - Atlético mineiro\n";
        p4.pergunta +=" E - São Paulo?\n";
        p4.certa ="A";
        System.out.println(p4.pergunta);
        if ( p4.isCerta(leia.nextLine())){
            acertos++;
        }
        perguntas.add(p4);

        Perguntas p5 = new Perguntas();
        p5.pergunta +="5 - Qual time que o mascote é representado por um dragão?\n";
        p5.pergunta +=" A - Atlético Paranaense\n";
        p5.pergunta +=" B - Atlético Mineiro\n";
        p5.pergunta +=" C - Atlético Goianiense\n";
        p5.pergunta +=" D - Vitória\n";
        p5.pergunta +=" E - Santa Cruz\n";
        p5.certa ="C";
        System.out.println(p5.pergunta);
        if ( p5.isCerta(leia.nextLine())){
            acertos++;
        }
        perguntas.add(p5);

        Perguntas p6 = new Perguntas();
        p6.pergunta +="6 - Atualmente qual time tem o recorde de maior pontuação da história do campeonato brasileiro?\n";
        p6.pergunta +=" A - São paulo\n";
        p6.pergunta +=" B - Cruzeiro\n";
        p6.pergunta +=" C - Palmeiras\n";
        p6.pergunta +=" D - Fluminense\n";
        p6.pergunta +=" E - Flamengo\n";
        p6.certa = "E";
        System.out.println(p6.pergunta);
        if (p6.isCerta(leia.nextLine())){
            acertos++;
        }
        perguntas.add(p6);

        Perguntas p7 = new Perguntas();
        p7.pergunta +="7 - Em qual ano a seleção brasileira conquistou o tetracampeonato mundial?\n";
        p7.pergunta +=" A - 1996\n";
        p7.pergunta +=" B - 1998\n";
        p7.pergunta +=" C - 1990\n";
        p7.pergunta +=" D - 1994\n";
        p7.pergunta +=" E - 2000\n";
        p7.certa = "D";
        System.out.println(p7.pergunta);
        if (p7.isCerta(leia.nextLine())){
            acertos++;
        }
        perguntas.add(p7);

        Perguntas p8 = new Perguntas();
        p8.pergunta +="8 - Quem foi o vencedor do prêmio puskas 2014?\n";
        p8.pergunta +=" A - Neymar\n";
        p8.pergunta +=" B - James Rodriguez\n";
        p8.pergunta +=" C - Van Persie\n";
        p8.pergunta +=" D - Mbappé\n";
        p8.pergunta +=" E - Benzema\n";
        p8.certa = "B";
        System.out.println(p8.pergunta);
        if (p8.isCerta(leia.nextLine())){
            acertos++;
        }
        perguntas.add(p8);

        Perguntas p9 = new Perguntas();
        p9.pergunta +="9 - Quantas Champions League o Real Madrid possui?\n";
        p9.pergunta +=" A - 15\n";
        p9.pergunta +=" B - 13\n";
        p9.pergunta +=" C - 14\n";
        p9.pergunta +=" D - 12\n";
        p9.pergunta +=" E - 11\n";
        p9.certa = "C";
        System.out.println(p9.pergunta);
        if (p9.isCerta(leia.nextLine())){
            acertos++;
        }
        perguntas.add(p9);

        Perguntas p10 = new Perguntas();
        p10.pergunta +="10 - Quem foi o artilheiro do campeonato brasileiro 2022?\n";
        p10.pergunta +=" A - German Cano\n";
        p10.pergunta +=" B - Marcos Leonardo\n";
        p10.pergunta +=" C - Gabriel Barbosa\n";
        p10.pergunta +=" D - Pedro Raul\n";
        p10.pergunta +=" E - Hulk\n";
        p10.certa = "A";
        System.out.println(p10.pergunta);
        if (p10.isCerta(leia.nextLine())){
            acertos++;
        }
        perguntas.add(p10);

        Perguntas p11 = new Perguntas();
        p11.pergunta +="11 - Em que ano Neymar Jr foi transferido a o PSG?\n";
        p11.pergunta +=" A - 2018\n";
        p11.pergunta +=" B - 2016\n";
        p11.pergunta +=" C - 2019\n";
        p11.pergunta +=" D - 2015\n";
        p11.pergunta +=" E - 2017\n";
        p11.certa = "E";
        System.out.println(p11.pergunta);
        if (p11.isCerta(leia.nextLine())){
            acertos++;
        }
        perguntas.add(p11);

        Perguntas p12 = new Perguntas();
        p12.pergunta +="12 - Qual time ganhou a Libertadores 2012?\n";
        p12.pergunta +=" A - Corinthians\n";
        p12.pergunta +=" B - Riverplate\n";
        p12.pergunta +=" C - Boca Juniors\n";
        p12.pergunta +=" D - Peñarol\n";
        p12.pergunta +=" E - Flamengo\n";
        p12.certa = "A";
        System.out.println(p12.pergunta);
        if (p12.isCerta(leia.nextLine())){
         acertos++;
        }
        perguntas.add(p12);

        Perguntas p13 = new Perguntas();
        p13.pergunta +="13 - Em que país o futebol foi criado?\n";
        p13.pergunta +=" A - França\n";
        p13.pergunta +=" B - Italia\n";
        p13.pergunta +=" C - Inglaterra\n";
        p13.pergunta +=" D - Brasil\n";
        p13.pergunta +=" E - Alemanha\n";
        p13.certa = "C";
        System.out.println(p13.pergunta);
        if (p13.isCerta(leia.nextLine())){
         acertos++;
        }
         perguntas.add(p13);

        Perguntas p14 = new Perguntas();
        p14.pergunta +="14 - Qual país sediou a copa de 2006\n";
        p14.pergunta +=" A - Russia\n";
        p14.pergunta +=" B - Alemanha\n";
        p14.pergunta +=" C - Estados Unidos\n";
        p14.pergunta +=" D - Brasil\n";
        p14.pergunta +=" E - Africa do Sul\n";
        p14.certa = "B";
        System.out.println(p14.pergunta);
        if (p14.isCerta(leia.nextLine())){
         acertos++;
        }
        perguntas.add(p14);

        Perguntas p15 = new Perguntas();
        p15.pergunta +="15 - Quantos gols ao todo Pelé fez em sua carreira?\n";
        p15.pergunta +=" A - 1183\n";
        p15.pergunta +=" B - 1093\n";
        p15.pergunta +=" C - 1190\n";
        p15.pergunta +=" D - 1283\n";
        p15.pergunta +=" E - 1203\n";
        p15.certa = "D";
        System.out.println(p15.pergunta);
        if (p15.isCerta(leia.nextLine())){
         acertos++;
        }
        perguntas.add(p15);

        System.out.println("///////////////////////////////////////////////////////////");
        System.out.println("Parabéns você acertou " + acertos + "de 15 perguntas" );
        if (acertos > 11){
            System.out.println(
                    "⠀⠀⠀⠀⣰⠞⠛⠛⠛⠛⠷⠶⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡿⠀⠀⠀⠀⠀⠀⠀⠉⠙⠓⠶⢦⣄⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⢀⣾⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢾⡆⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⢀⡟⠁⠀⢀⣀⠀⠀⢀⣠⣀⡴⢿⣤⣤⣤⠀⠀⠀⠻⣄⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⣾⠃⠀⣰⠞⠋⠛⠛⠛⠉⠉⠀⠀⠀⠀⠙⠻⣦⣴⡶⢻⡄⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⣠⣷⠖⣶⣿⠶⠶⠶⠶⢶⣤⣤⣤⡴⠖⠒⠒⠶⢿⣾⡇⠀⡇⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠰⡇⢿⠀⠸⡇⠀⢴⣶⣶⢆⡷⠶⢾⣷⣿⣿⡧⠀⢀⡟⠀⢠⡇⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⢻⣸⡇⠀⡟⠶⢤⣤⣤⠞⠁⠀⠀⠻⠦⣤⣤⠴⢿⠁⠀⢸⡇⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠸⣇⣷⠰⡇⠀⠀⠀⠀⠿⠴⢦⣴⠾⠇⠀⠀⠀⢸⡇⠀⣸⠁⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⢻⣹⣄⣿⠀⠀⠀⣀⡤⠤⠤⠤⠤⣄⡀⠀⠀⣼⣇⣠⡏⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠈⠉⠉⠙⢷⡄⠀⠻⣟⠶⠶⠶⣟⡟⠀⠀⣰⡟⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⣤⡤⠴⠶⢦⡄⣤⠴⠶⠶⣿⣦⣠⣬⣭⣿⡉⠁⠀⢀⡴⣫⣤⣤⣀⡀⢠⣤⣤⣤⠀\n" +
                    "⠀⠸⢶⣻⠆⠀⣿⣿⠀⣶⣶⣿⣸⠋⢀⣄⡀⠹⣦⡶⠋⣿⢁⣀⣀⠉⠹⣶⡇⠀⣿⠀\n" +
                    "⠀⢠⣼⣧⡄⠚⣯⣛⣒⣦⠀⢹⣿⠀⢸⣻⡟⢀⡿⠀⠐⣇⠀⢿⡼⠃⠀⣿⣇⠀⣿⠀\n" +
                    "⠀⢿⣌⣉⣀⣤⠟⣯⣉⣁⣤⠞⠙⢧⣄⣀⣤⠾⠁⠀⠀⠙⢶⣤⣤⠀⣻⡅⣿⣀⣿\n" +
                            "Brabo demais!");

        }if (acertos <= 5){
         System.out.println("⡏⠉⠉⠉⠉⠉⠉⠋⠉⠉⠉⠉⠉⠉⠋⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠙⠉⠉⠉⠹\n" +
                 " ⡇⢸⣿⡟⠛⢿⣷⠀⢸⣿⡟⠛⢿⣷⡄⢸⣿⡇⠀⢸⣿⡇⢸⣿⡇⠀⢸⣿⡇\n" +
                 "⠀⡇⢸⣿⣧⣤⣾⠿⠀⢸⣿⣇⣀⣸⡿⠃⢸⣿⡇⠀⢸⣿⡇⢸⣿⣇⣀⣸⣿⡇⠀\n" +
                 " ⡇⢸⣿⡏⠉⢹⣿⡆⢸⣿⡟⠛⢻⣷⡄⢸⣿⡇⠀⢸⣿⡇⢸⣿⡏⠉⢹⣿⡇\n" +
                 "⠀⡇⢸⣿⣧⣤⣼⡿⠃⢸⣿⡇⠀⢸⣿⡇⠸⣿⣧⣤⣼⡿⠁⢸⣿⡇⠀⢸⣿⡇\n⠀" +
                 " ⣇⣀⣀⣀⣀⣀⣀⣄⣀⣀⣀⣀⣀⣀⣀⣠⣀⡈⠉⣁⣀⣄⣀⣀⣀⣠⣀⣀⣀⣰");
     }
    }

}

