import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int pontos = 0;

        System.out.println("+------------------------------+");
        System.out.println("|         QUIZ - Anime         |");
        System.out.println("+------------------------------+");

        //Parte das Questões

        Questao q1 = new Questao();
        q1.pergunta = "1. Em Naruto, qual é o nome da raposa selada dentro de Naruto Uzumaki?";
        q1.opcaoA = "A - Shukaku";
        q1.opcaoB = "B - Kurama";
        q1.opcaoC = "C - Gyuki";
        q1.opcaoD = "D - Son Goku";
        q1.opcaoE = "E - Matatabi";
        q1.correta = "B";

        System.out.println("-----------------------------------------------------------");

        q1.escrevaQuestao();
        if (q1.isCorreta(q1.leiaResposta())){
            pontos++;
        }

        Questao q2 = new Questao();
        q2.pergunta = "2. Qual é o nome do protagonista de Death Note??";
        q2.opcaoA = "A - Light Yagami";
        q2.opcaoB = "B - L Lawliet";
        q2.opcaoC = "C - Misa Amane";
        q2.opcaoD = "D - Near";
        q2.opcaoE = "E - Ryuk";
        q2.correta = "A";

        System.out.println("-----------------------------------------------------------");

        q2.escrevaQuestao();
        if (q2.isCorreta(q2.leiaResposta())) {
            pontos++;
        }

        Questao q3 = new Questao();
        q3.pergunta = "3. Em Dragon Ball Z, quem derrota Cell?";
        q3.opcaoA = "A - Goku";
        q3.opcaoB = "B - Vegeta";
        q3.opcaoC = "C - Trunks";
        q3.opcaoD = "D - Piccolo";
        q3.opcaoE = "E - Gohan";
        q3.correta = "E";

        System.out.println("-----------------------------------------------------------");

        q3.escrevaQuestao();
        if (q3.isCorreta(q3.leiaResposta())) {
            pontos++;
        }

        Questao q4 = new Questao();
        q4.pergunta = "4. Qual é o poder principal de Luffy em One Piece???";
        q4.opcaoA = "A - Controlar a água";
        q4.opcaoB = "B - Transformar-se em fogo";
        q4.opcaoC = "C - Esticar o corpo como borracha";
        q4.opcaoD = "D - Ficar invisível";
        q4.opcaoE = "E - Ler mentes";
        q4.correta = "C";

        System.out.println("-----------------------------------------------------------");

        q4.escrevaQuestao();
        if (q4.isCorreta(q4.leiaResposta())) {
            pontos++;
        }

        Questao q5 = new Questao();
        q5.pergunta = "5. Qual destes animes foi criado por Hayao Miyazaki e produzido pelo Studio Ghibli?";
        q5.opcaoA = "A - Akira";
        q5.opcaoB = "B - A Viagem de Chihiro";
        q5.opcaoC = "C - Your Name";
        q5.opcaoD = "D - Bleach";
        q5.opcaoE = "E - Perfect Blue";
        q5.correta = "B";

        System.out.println("-----------------------------------------------------------");

        q5.escrevaQuestao();
        if (q5.isCorreta(q5.leiaResposta())) {
            pontos++;
        }

        Questao q6 = new Questao();
        q6.pergunta = "6. Em Attack on Titan (Shingeki no Kyojin), qual é o verdadeiro nome do Titã de Eren?";
        q6.opcaoA = "A - Titã Fundador";
        q6.opcaoB = "B - Titã Blindado";
        q6.opcaoC = "C - Titã de Ataque";
        q6.opcaoD = "D - Titã Bestial";
        q6.opcaoE = "E - Titã Colossal";
        q6.correta = "C";

        System.out.println("-----------------------------------------------------------");

        q6.escrevaQuestao();
        if (q6.isCorreta(q6.leiaResposta())) {
            pontos++;
        }

        Questao q7 = new Questao();
        q7.pergunta = "7. Em Fullmetal Alchemist: Brotherhood, qual é a principal regra da alquimia?";
        q7.opcaoA = "A - É proibido transmutar humanos";
        q7.opcaoB = "B - Energia ilimitada pode ser criada do nada";
        q7.opcaoC = "C - Para obter algo, algo de valor igual deve ser perdido";
        q7.opcaoD = "D - Sempre é necessário um círculo de transmutação";
        q7.opcaoE = "E - O chumbo nunca pode ser transformado em ouro";
        q7.correta = "C";

        System.out.println("-----------------------------------------------------------");

        q7.escrevaQuestao();
        if (q7.isCorreta(q7.leiaResposta())) {
            pontos++;
        }

        Questao q8 = new Questao();
        q8.pergunta = "8. Qual desses personagens é um Shinigami em Bleach?";
        q8.opcaoA = "A - Naruto Uzumaki";
        q8.opcaoB = "B - Ichigo Kurosaki";
        q8.opcaoC = "C - Goku";
        q8.opcaoD = "D - Eren Yeager";
        q8.opcaoE = "E - Gon Freecss";
        q8.correta = "B";

        System.out.println("-----------------------------------------------------------");

        q8.escrevaQuestao();
        if (q8.isCorreta(q8.leiaResposta())) {
            pontos++;
        }

        Questao q9 = new Questao();
        q9.pergunta = "9. Qual é o objetivo principal dos personagens em Hunter x Hunter?";
        q9.opcaoA = "A - Tornarem-se Hunters profissionais";
        q9.opcaoB = "B - Conquistarem reinos";
        q9.opcaoC = "C - Recuperarem um tesouro lendário";
        q9.opcaoD = "D - Vingarem suas famílias";
        q9.opcaoE = "E - Se tornarem ninjas lendários";
        q9.correta = "A";

        System.out.println("-----------------------------------------------------------");

        q9.escrevaQuestao();
        if (q9.isCorreta(q9.leiaResposta())) {
            pontos++;
        }

        Questao q10 = new Questao();
        q10.pergunta = "10. Quem é o autor de Demon Slayer (Kimetsu no Yaiba)?";
        q10.opcaoA = "A - Tite Kubo";
        q10.opcaoB = "B - Masashi Kishimoto";
        q10.opcaoC = "C - Eiichiro Oda";
        q10.opcaoD = "D - Koyoharu Gotouge";
        q10.opcaoE = "E - Akira Toriyama";
        q10.correta = "D";

        System.out.println("-----------------------------------------------------------");

        q10.escrevaQuestao();
        if (q10.isCorreta(q10.leiaResposta())) {
            pontos++;
        }

        Questao q11 = new Questao();
        q11.pergunta = "11. Qual destes animes se passa em um mundo virtual de MMORPG?";
        q11.opcaoA = "A - Sword Art Online";
        q11.opcaoB = "B - Tokyo Ghoul";
        q11.opcaoC = "C - Death Parade";
        q11.opcaoD = "D - Black Clover";
        q11.opcaoE = "E - Blue Exorcist";
        q11.correta = "A";

        System.out.println("-----------------------------------------------------------");

        q11.escrevaQuestao();
        if (q11.isCorreta(q11.leiaResposta())) {
            pontos++;
        }

        Questao q12 = new Questao();
        q12.pergunta = "12. Em Tokyo Ghoul, o que são os “Ghouls”??";
        q12.opcaoA = "A - Espíritos que caçam humanos";
        q12.opcaoB = "B - Criaturas que se alimentam de humanos";
        q12.opcaoC = "C - Vampiros que brilham no sol";
        q12.opcaoD = "D - Robôs disfarçados de pessoas";
        q12.opcaoE = "E - Humanos que controlam monstros";
        q12.correta = "B";

        System.out.println("-----------------------------------------------------------");

        q12.escrevaQuestao();
        if (q12.isCorreta(q12.leiaResposta())) {
            pontos++;
        }

        Questao q13 = new Questao();
        q13.pergunta = "13. Qual destes personagens é conhecido como “O Mago das Chamas” em Fairy Tail?";
        q13.opcaoA = "A - Laxus Dreyar";
        q13.opcaoB = "B - Gray Fullbuster";
        q13.opcaoC = "C - Gajeel Redfox";
        q13.opcaoD = "D - Natsu Dragneel";
        q13.opcaoE = "E - Erza Scarlet";
        q13.correta = "D";

        System.out.println("-----------------------------------------------------------");

        q13.escrevaQuestao();
        if (q13.isCorreta(q13.leiaResposta())) {
            pontos++;
        }

        Questao q14 = new Questao();
        q14.pergunta = "14. Em My Hero Academia, qual é o nome do poder de Izuku Midoriya?";
        q14.opcaoA = "A - Gear Second";
        q14.opcaoB = "B - Sharingan";
        q14.opcaoC = "C - Titan Form";
        q14.opcaoD = "D - One For All";
        q14.opcaoE = "E - Bankai";
        q14.correta = "D";

        System.out.println("-----------------------------------------------------------");

        q14.escrevaQuestao();
        if (q14.isCorreta(q14.leiaResposta())) {
            pontos++;
        }

        Questao q15 = new Questao();
        q15.pergunta = "15. Qual destes animes tem como tema principal o jogo de cartas?";
        q15.opcaoA = "A - One Punch Man";
        q15.opcaoB = "B - Yu-Gi-Oh!";
        q15.opcaoC = "C - Fairy Tail";
        q15.opcaoD = "D - Demon Slayer";
        q15.opcaoE = "E - Naruto";
        q15.correta = "B";

        System.out.println("-----------------------------------------------------------");

        q15.escrevaQuestao();
        if (q15.isCorreta(q15.leiaResposta())) {
            pontos++;
        }

        System.out.println("-----------------------------------------------------------");

        System.out.println("Este é o fim! Olha só, você acertou "+pontos+" pontos!");
        System.out.println("Total: " + (float)pontos*100/15 + "%");

        System.out.println("-----------------------------------------------------------");

    }
}
