import java.time.LocalDateTime;

public class testeinfo {

    public static void main(String[] args) {
        info controle = new info();

        // Teste 1 - Acesso liberado
        System.out.println("Teste 1 - Acesso liberado");
        String codigo1 = "123456";
        LocalDateTime dataEntrada1 = LocalDateTime.now();
        controle.registrarAcesso(codigo1);
        LocalDateTime dataSaida1 = dataEntrada1.plusMinutes(5);
        controle.registrarSaida(codigo1);
        System.out.println("Tempo de permanência: " + controle.calcularTempoPermanencia(dataEntrada1, dataSaida1));

        // Teste 2 - Acesso já registrado
        System.out.println("Teste 2 - Acesso já registrado");
        String codigo2 = "654321";
        LocalDateTime dataEntrada2 = LocalDateTime.now();
        controle.registrarAcesso(codigo2);
        controle.registrarAcesso(codigo2);
        LocalDateTime dataSaida2 = dataEntrada2.plusMinutes(10);
        controle.registrarSaida(codigo2);
        System.out.println("Tempo de permanência: " + controle.calcularTempoPermanencia(dataEntrada2, dataSaida2));

        // Teste 3 - Código não encontrado
        System.out.println("Teste 3 - Código não encontrado");
        String codigo3 = "111111";
        controle.registrarSaida(codigo3);
    }

}
