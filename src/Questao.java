import java.util.Scanner;

public class Questao {
    private String pergunta = "";
    private String opcaoA = "";
    private String opcaoB = "";
    private String opcaoC = "";
    private String opcaoD = "";
    private String opcaoE = "";
    private String correta = "";

    public String getPergunta() {
        return pergunta;
    }
    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }
    public String getOpcaoA() {
        return opcaoA;
    }
    public void setOpcaoA(String opcaoA) {
        this.opcaoA = opcaoA;
    }
    public String getOpcaoB() {
        return opcaoB;
    }
    public void setOpcaoB(String opcaoB) {
        this.opcaoB = opcaoB;
    }
    public String getOpcaoC() {
        return opcaoC;
    }
    public void setOpcaoC(String opcaoC) {
        this.opcaoC = opcaoC;
    }
    public String getOpcaoD() {
        return opcaoD;
    }
    public void setOpcaoD(String opcaoD) {
        this.opcaoD = opcaoD;
    }
    public String getOpcaoE() {
        return opcaoE;
    }
    public void setOpcaoE(String opcaoE) {
        this.opcaoE = opcaoE;
    }
    public String getCorreta() {
        return correta;
    }
    public void setCorreta(String correta) {
        this.correta = correta;
    }

    public boolean isCorreta(String resposta){
        if(resposta.equalsIgnoreCase(this.correta)){
            System.out.println("Parabéns resposta Correta! - Letra: " + this.correta);
            System.out.println("");
            return true;
        } else {
            System.out.println("Resposta Errada!");
            System.out.println("A opção correta é a letra: " + this.correta);
            System.out.println("");
            return false;
        }
    }

    public String leiaResposta() {
        Scanner ler = new Scanner(System.in);
        String resp;
        do {
            System.out.println("Digite a resposta: ");
            resp = ler.next();
        } while (!respostaValida(resp));
        return resp;
    }

    private boolean respostaValida(String resp){
        if(resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
                resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")){
            return true;
        }
        System.out.println("Resposta inválida! Digite opção A, B, C, D ou E. ");
        System.out.println("");
        return false;
    }

    public void escrevaQuestao(){
        System.out.println(this.pergunta);
        System.out.println();
        System.out.println(this.opcaoA);
        System.out.println(this.opcaoB);
        System.out.println(this.opcaoC);
        System.out.println(this.opcaoD);
        System.out.println(this.opcaoE);
        System.out.println();
    }
}
