import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int pontos = 0;
        List<Questao> questoes = new ArrayList<>();

        System.out.println("+------------------------------+");
        System.out.println("|         QUIZ - Anime         |");
        System.out.println("+------------------------------+");

        Questao q1 = new Questao();
        q1.setPergunta("1. Em Naruto, qual é o nome da raposa selada dentro de Naruto Uzumaki?");
        q1.setOpcaoA("A - Shukaku");
        q1.setOpcaoB("B - Kurama");
        q1.setOpcaoC("C - Gyuki");
        q1.setOpcaoD("D - Son Goku");
        q1.setOpcaoE("E - Matatabi");
        q1.setCorreta("B");
        questoes.add(q1);

        System.out.println("-----------------------------------------------------------");

        q1.escrevaQuestao();
        if (q1.isCorreta(q1.leiaResposta())){
            pontos++;
        }

        Questao q2 = new Questao();
        q2.setPergunta("2. Qual é o nome do protagonista de Death Note??");
        q2.setOpcaoA("A - Light Yagami");
        q2.setOpcaoB("B - L Lawliet");
        q2.setOpcaoC("C - Misa Amane");
        q2.setOpcaoD("D - Near");
        q2.setOpcaoE("E - Ryuk");
        q2.setCorreta("A");
        questoes.add(q2);

        System.out.println("-----------------------------------------------------------");

        q2.escrevaQuestao();
        if (q2.isCorreta(q2.leiaResposta())) {
            pontos++;
        }

        Questao q3 = new Questao();
        q3.setPergunta("3. Em Dragon Ball Z, quem derrota Cell?");
        q3.setOpcaoA("A - Goku");
        q3.setOpcaoB("B - Vegeta");
        q3.setOpcaoC("C - Trunks");
        q3.setOpcaoD("D - Piccolo");
        q3.setOpcaoE("E - Gohan");
        q3.setCorreta("E");
        questoes.add(q3);

        System.out.println("-----------------------------------------------------------");

        q3.escrevaQuestao();
        if (q3.isCorreta(q3.leiaResposta())) {
            pontos++;
        }

        Questao q4 = new Questao();
        q4.setPergunta("4. Qual é o poder principal de Luffy em One Piece???");
        q4.setOpcaoA("A - Controlar a água");
        q4.setOpcaoB("B - Transformar-se em fogo");
        q4.setOpcaoC("C - Esticar o corpo como borracha");
        q4.setOpcaoD("D - Ficar invisível");
        q4.setOpcaoE("E - Ler mentes");
        q4.setCorreta("C");
        questoes.add(q4);

        System.out.println("-----------------------------------------------------------");

        q4.escrevaQuestao();
        if (q4.isCorreta(q4.leiaResposta())) {
            pontos++;
        }

        Questao q5 = new Questao();
        q5.setPergunta("5. Qual destes animes foi criado por Hayao Miyazaki e produzido pelo Studio Ghibli?");
        q5.setOpcaoA("A - Akira");
        q5.setOpcaoB("B - A Viagem de Chihiro");
        q5.setOpcaoC("C - Your Name");
        q5.setOpcaoD("D - Bleach");
        q5.setOpcaoE("E - Perfect Blue");
        q5.setCorreta("B");
        questoes.add(q5);

        System.out.println("-----------------------------------------------------------");

        q5.escrevaQuestao();
        if (q5.isCorreta(q5.leiaResposta())) {
            pontos++;
        }

        Questao q6 = new Questao();
        q6.setPergunta("6. Em Attack on Titan (Shingeki no Kyojin), qual é o verdadeiro nome do Titã de Eren?");
        q6.setOpcaoA("A - Titã Fundador");
        q6.setOpcaoB("B - Titã Blindado");
        q6.setOpcaoC("C - Titã de Ataque");
        q6.setOpcaoD("D - Titã Bestial");
        q6.setOpcaoE("E - Titã Colossal");
        q6.setCorreta("C");
        questoes.add(q6);

        System.out.println("-----------------------------------------------------------");

        q6.escrevaQuestao();
        if (q6.isCorreta(q6.leiaResposta())) {
            pontos++;
        }

        Questao q7 = new Questao();
        q7.setPergunta("7. Em Fullmetal Alchemist: Brotherhood, qual é a principal regra da alquimia?");
        q7.setOpcaoA("A - É proibido transmutar humanos");
        q7.setOpcaoB("B - Energia ilimitada pode ser criada do nada");
        q7.setOpcaoC("C - Para obter algo, algo de valor igual deve ser perdido");
        q7.setOpcaoD("D - Sempre é necessário um círculo de transmutação");
        q7.setOpcaoE("E - O chumbo nunca pode ser transformado em ouro");
        q7.setCorreta("C");
        questoes.add(q7);

        System.out.println("-----------------------------------------------------------");

        q7.escrevaQuestao();
        if (q7.isCorreta(q7.leiaResposta())) {
            pontos++;
        }

        Questao q8 = new Questao();
        q8.setPergunta("8. Qual desses personagens é um Shinigami em Bleach?");
        q8.setOpcaoA("A - Naruto Uzumaki");
        q8.setOpcaoB("B - Ichigo Kurosaki");
        q8.setOpcaoC("C - Goku");
        q8.setOpcaoD("D - Eren Yeager");
        q8.setOpcaoE("E - Gon Freecss");
        q8.setCorreta("B");
        questoes.add(q8);

        System.out.println("-----------------------------------------------------------");

        q8.escrevaQuestao();
        if (q8.isCorreta(q8.leiaResposta())) {
            pontos++;
        }

        Questao q9 = new Questao();
        q9.setPergunta("9. Qual é o objetivo principal dos personagens em Hunter x Hunter?");
        q9.setOpcaoA("A - Tornarem-se Hunters profissionais");
        q9.setOpcaoB("B - Conquistarem reinos");
        q9.setOpcaoC("C - Recuperarem um tesouro lendário");
        q9.setOpcaoD("D - Vingarem suas famílias");
        q9.setOpcaoE("E - Se tornarem ninjas lendários");
        q9.setCorreta("A");
        questoes.add(q9);

        System.out.println("-----------------------------------------------------------");

        q9.escrevaQuestao();
        if (q9.isCorreta(q9.leiaResposta())) {
            pontos++;
        }

        Questao q10 = new Questao();
        q10.setPergunta("10. Quem é o autor de Demon Slayer (Kimetsu no Yaiba)?");
        q10.setOpcaoA("A - Tite Kubo");
        q10.setOpcaoB("B - Masashi Kishimoto");
        q10.setOpcaoC("C - Eiichiro Oda");
        q10.setOpcaoD("D - Koyoharu Gotouge");
        q10.setOpcaoE("E - Akira Toriyama");
        q10.setCorreta("D");
        questoes.add(q10);

        System.out.println("-----------------------------------------------------------");

        q10.escrevaQuestao();
        if (q10.isCorreta(q10.leiaResposta())) {
            pontos++;
        }

        Questao q11 = new Questao();
        q11.setPergunta("11. Qual destes animes se passa em um mundo virtual de MMORPG?");
        q11.setOpcaoA("A - Sword Art Online");
        q11.setOpcaoB("B - Tokyo Ghoul");
        q11.setOpcaoC("C - Death Parade");
        q11.setOpcaoD("D - Black Clover");
        q11.setOpcaoE("E - Blue Exorcist");
        q11.setCorreta("A");
        questoes.add(q11);

        System.out.println("-----------------------------------------------------------");

        q11.escrevaQuestao();
        if (q11.isCorreta(q11.leiaResposta())) {
            pontos++;
        }

        Questao q12 = new Questao();
        q12.setPergunta("12. Em Tokyo Ghoul, o que são os 'Ghouls'??");
        q12.setOpcaoA("A - Espíritos que caçam humanos");
        q12.setOpcaoB("B - Criaturas que se alimentam de humanos");
        q12.setOpcaoC("C - Vampiros que brilham no sol");
        q12.setOpcaoD("D - Robôs disfarçados de pessoas");
        q12.setOpcaoE("E - Humanos que controlam monstros");
        q12.setCorreta("B");
        questoes.add(q12);

        System.out.println("-----------------------------------------------------------");

        q12.escrevaQuestao();
        if (q12.isCorreta(q12.leiaResposta())) {
            pontos++;
        }

        Questao q13 = new Questao();
        q13.setPergunta("13. Qual destes personagens é conhecido como 'O Mago das Chamas' em Fairy Tail?");
        q13.setOpcaoA("A - Laxus Dreyar");
        q13.setOpcaoB("B - Gray Fullbuster");
        q13.setOpcaoC("C - Gajeel Redfox");
        q13.setOpcaoD("D - Natsu Dragneel");
        q13.setOpcaoE("E - Erza Scarlet");
        q13.setCorreta("D");
        questoes.add(q13);

        System.out.println("-----------------------------------------------------------");

        q13.escrevaQuestao();
        if (q13.isCorreta(q13.leiaResposta())) {
            pontos++;
        }

        Questao q14 = new Questao();
        q14.setPergunta("14. Em My Hero Academia, qual é o nome do poder de Izuku Midoriya?");
        q14.setOpcaoA("A - Gear Second");
        q14.setOpcaoB("B - Sharingan");
        q14.setOpcaoC("C - Titan Form");
        q14.setOpcaoD("D - One For All");
        q14.setOpcaoE("E - Bankai");
        q14.setCorreta("D");
        questoes.add(q14);

        System.out.println("-----------------------------------------------------------");

        q14.escrevaQuestao();
        if (q14.isCorreta(q14.leiaResposta())) {
            pontos++;
        }

        Questao q15 = new Questao();
        q15.setPergunta("15. Qual destes animes tem como tema principal o jogo de cartas?");
        q15.setOpcaoA("A - One Punch Man");
        q15.setOpcaoB("B - Yu-Gi-Oh!");
        q15.setOpcaoC("C - Fairy Tail");
        q15.setOpcaoD("D - Demon Slayer");
        q15.setOpcaoE("E - Naruto");
        q15.setCorreta("B");
        questoes.add(q15);

        System.out.println("-----------------------------------------------------------");

        q15.escrevaQuestao();
        if (q15.isCorreta(q15.leiaResposta())) {
            pontos++;
        }

        System.out.println("-----------------------------------------------------------");

        System.out.println("Este é o fim! Olha só, você fez "+pontos+" pontos!");
        System.out.println("Total: " + (float)pontos*100/15 + "%");

        System.out.println("-----------------------------------------------------------");

    }
}
