package sd_sis_votacao_java_rmi.client;


import java.rmi.Naming;
import java.util.Map;

import sd_sis_votacao_java_rmi.server.ServicoDeResultados;

public class ClienteConsultaResultados {
    public static void main(String[] args) {
        try {
            // Conecta com o serviço de resultados remoto
            ServicoDeResultados servicoDeResultados = (ServicoDeResultados) Naming.lookup("rmi://localhost/ServicoDeResultados");

            // Pesquisa do resultado da votação
            Map<String, Integer> resultados = servicoDeResultados.getResultados();

            // Imprime os resultados na tela
            System.out.println("Resultados da votação:");
            for (Map.Entry<String, Integer> entry : resultados.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " votos");
            }
        } catch (Exception e) {
            System.err.println("Erro no cliente de consulta de resultados: " + e.toString());
            e.printStackTrace();
        }
    }
}
