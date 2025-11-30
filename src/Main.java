import java.util.Scanner;

class Questao {
    String pergunta;
    String opcaoA;
    String opcaoB;
    String opcaoC;
    String opcaoD;
    String correta;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cabeçalho exibido na tela
        System.out.println("============================================");
        System.out.println("               FACULDADE UNIFAN");
        System.out.println("Autor: Carlos Eduardo Ribeiro Dourado");
        System.out.println("Professor: Brenno Pimenta");
        System.out.println("Data: 30/11");
        System.out.println("Atividade: Quiz sobre Goiânia");
        System.out.println("============================================\n");

        Questao[] questoes = new Questao[15];

        // Questão 1
        questoes[0] = new Questao();
        questoes[0].pergunta = "Em que ano Goiânia foi fundada?";
        questoes[0].opcaoA = "1933";
        questoes[0].opcaoB = "1935";
        questoes[0].opcaoC = "1940";
        questoes[0].opcaoD = "1929";
        questoes[0].correta = "B";

        // Questão 2
        questoes[1] = new Questao();
        questoes[1].pergunta = "Quem foi o fundador de Goiânia?";
        questoes[1].opcaoA = "Pedro Ludovico Teixeira";
        questoes[1].opcaoB = "Antônio Ramos Caiado";
        questoes[1].opcaoC = "Marechal Rondon";
        questoes[1].opcaoD = "Bernardo Sayão";
        questoes[1].correta = "A";

        // Questão 3
        questoes[2] = new Questao();
        questoes[2].pergunta = "Qual é o nome do principal parque de Goiânia?";
        questoes[2].opcaoA = "Parque Flamboyant";
        questoes[2].opcaoB = "Parque Ibirapuera";
        questoes[2].opcaoC = "Parque da Cidade";
        questoes[2].opcaoD = "Parque do Sabiá";
        questoes[2].correta = "A";

        // Questão 4
        questoes[3] = new Questao();
        questoes[3].pergunta = "Qual é o gentílico de quem nasce em Goiânia?";
        questoes[3].opcaoA = "Goianense";
        questoes[3].opcaoB = "Goianiense";
        questoes[3].opcaoC = "Goiano";
        questoes[3].opcaoD = "Goianês";
        questoes[3].correta = "B";

        // Questão 5
        questoes[4] = new Questao();
        questoes[4].pergunta = "Qual é o principal estádio de Goiânia?";
        questoes[4].opcaoA = "Serra Dourada";
        questoes[4].opcaoB = "Mané Garrincha";
        questoes[4].opcaoC = "Maracanã";
        questoes[4].opcaoD = "Castelão";
        questoes[4].correta = "A";

        // Questão 6
        questoes[5] = new Questao();
        questoes[5].pergunta = "Qual rio corta a cidade de Goiânia?";
        questoes[5].opcaoA = "Rio Meia Ponte";
        questoes[5].opcaoB = "Rio Tocantins";
        questoes[5].opcaoC = "Rio Araguaia";
        questoes[5].opcaoD = "Rio Vermelho";
        questoes[5].correta = "A";

        // Questão 7
        questoes[6] = new Questao();
        questoes[6].pergunta = "Qual é o nome da avenida mais famosa de Goiânia?";
        questoes[6].opcaoA = "Avenida Goiás";
        questoes[6].opcaoB = "Avenida Paulista";
        questoes[6].opcaoC = "Avenida Anhanguera";
        questoes[6].opcaoD = "Avenida Tocantins";
        questoes[6].correta = "C";

        // Questão 8
        questoes[7] = new Questao();
        questoes[7].pergunta = "Em qual estado brasileiro fica Goiânia?";
        questoes[7].opcaoA = "Mato Grosso";
        questoes[7].opcaoB = "Tocantins";
        questoes[7].opcaoC = "Goiás";
        questoes[7].opcaoD = "Distrito Federal";
        questoes[7].correta = "C";

        // Questão 9
        questoes[8] = new Questao();
        questoes[8].pergunta = "Qual é o principal time de futebol de Goiânia?";
        questoes[8].opcaoA = "Vila Nova";
        questoes[8].opcaoB = "Atlético Goianiense";
        questoes[8].opcaoC = "Goiás Esporte Clube";
        questoes[8].opcaoD = "Todos os anteriores";
        questoes[8].correta = "D";

        // Questão 10
        questoes[9] = new Questao();
        questoes[9].pergunta = "Qual famoso acidente ocorreu em Goiânia em 1987?";
        questoes[9].opcaoA = "Desabamento de prédio";
        questoes[9].opcaoB = "Vazamento de petróleo";
        questoes[9].opcaoC = "Acidente radiológico com Césio-137";
        questoes[9].opcaoD = "Incêndio em hospital";
        questoes[9].correta = "C";

        // Questão 11
        questoes[10] = new Questao();
        questoes[10].pergunta = "Qual é o nome do aeroporto de Goiânia?";
        questoes[10].opcaoA = "Aeroporto Internacional de Brasília";
        questoes[10].opcaoB = "Aeroporto Santa Genoveva";
        questoes[10].opcaoC = "Aeroporto Juscelino Kubitschek";
        questoes[10].opcaoD = "Aeroporto dos Bandeirantes";
        questoes[10].correta = "B";

        // Questão 12
        questoes[11] = new Questao();
        questoes[11].pergunta = "Qual é a principal feira popular de Goiânia?";
        questoes[11].opcaoA = "Feira Hippie";
        questoes[11].opcaoB = "Feira do Brás";
        questoes[11].opcaoC = "Feira de Caruaru";
        questoes[11].opcaoD = "Feira da Madrugada";
        questoes[11].correta = "A";

        // Questão 13
        questoes[12] = new Questao();
        questoes[12].pergunta = "Goiânia é conhecida por ter muitas:";
        questoes[12].opcaoA = "Praias";
        questoes[12].opcaoB = "Montanhas";
        questoes[12].opcaoC = "Praças e áreas verdes";
        questoes[12].opcaoD = "Cachoeiras";
        questoes[12].correta = "C";

        // Questão 14
        questoes[13] = new Questao();
        questoes[13].pergunta = "Qual é o estilo arquitetônico predominante no centro de Goiânia?";
        questoes[13].opcaoA = "Barroco";
        questoes[13].opcaoB = "Art Déco";
        questoes[13].opcaoC = "Moderno";
        questoes[13].opcaoD = "Colonial";
        questoes[13].correta = "B";

        // Questão 15
        questoes[14] = new Questao();
        questoes[14].pergunta = "Qual é o apelido carinhoso de Goiânia?";
        questoes[14].opcaoA = "Cidade Maravilhosa";
        questoes[14].opcaoB = "Capital do Sertão";
        questoes[14].opcaoC = "Cidade Verde";
        questoes[14].opcaoD = "Capital do Cerrado";
        questoes[14].correta = "D";

        int acertos = 0;

        // Execução do quiz
        for (int i = 0; i < questoes.length; i++) {
            System.out.println("\nQuestão " + (i + 1) + ": " + questoes[i].pergunta);
            System.out.println("A) " + questoes[i].opcaoA);
            System.out.println("B) " + questoes[i].opcaoB);
            System.out.println("C) " + questoes[i].opcaoC);
            System.out.println("D) " + questoes[i].opcaoD);

            String resposta;
            while (true) {
                System.out.print("Sua resposta (A, B, C ou D): ");
                resposta = sc.nextLine().trim().toUpperCase();

                if (resposta.matches("[ABCD]")) {
                    break;
                } else {
                    System.out.println("❌ Erro na digitação! Responda apenas com A, B, C ou D.");
                }
            }

            if (resposta.equals(questoes[i].correta)) {
                acertos++;
            }
        }

        System.out.println("\nVocê acertou " + acertos + " de " + questoes.length + " questões.");
        double porcentagem = (acertos * 100.0) / questoes.length;
        System.out.printf("Porcentagem de acertos: %.2f%%\n", porcentagem);

        sc.close();
    }
}
