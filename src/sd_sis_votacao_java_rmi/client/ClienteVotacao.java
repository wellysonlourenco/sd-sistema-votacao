package sd_sis_votacao_java_rmi.client;


import java.rmi.Naming;
import java.util.Scanner;

import sd_sis_votacao_java_rmi.server.ServicoDeVotacao;

public class ClienteVotacao {
    public static void main(String[] args) {
        try {
            // Conexao com o serviço de votação remoto
            ServicoDeVotacao servicoDeVotacao = (ServicoDeVotacao) Naming.lookup("rmi://localhost/ServicoDeVotacao");

            // Solicitacao do nome do eleitor
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o nome do eleitor: ");
            String eleitor = scanner.nextLine();

            // Opções de candidatos
            System.out.println("Opções de candidatos:");
            System.out.println("13 - Lula");
            System.out.println("22 - Bolsonaro");

            // Voto do eleitor
            System.out.print("Digite o número do candidato: ");
            String candidato = scanner.nextLine();

            // Registre o voto remotamente
            if(candidato.equals("13") || candidato.equals("22")){
            servicoDeVotacao.votar(eleitor, candidato);
            //condição
                System.out.println("Voto registrado com sucesso.");
            } else {
                System.out.println("Candidato inválido.");
            }
        } catch (Exception e) {
            System.err.println("Erro no cliente de votação: " + e.toString());
            e.printStackTrace();
        }
    }
}
