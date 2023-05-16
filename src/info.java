import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class info {

    private List<String> codigosDigitais = new ArrayList<>();

    public void registrarAcesso(String codigoDigital) {
        if (codigosDigitais.contains(codigoDigital)) {
            System.out.println("Obrigado pela visita");
        } else {
            System.out.println("Bem-vindo, acesso liberado");
            codigosDigitais.add(codigoDigital);
        }
    }

    public void registrarSaida(String codigoDigital) {
        if (codigosDigitais.contains(codigoDigital)) {
            System.out.println("Saída registrada");
            codigosDigitais.remove(codigoDigital);
        } else {
            System.out.println("Código digital não encontrado");
        }
    }

    public String calcularTempoPermanencia(LocalDateTime dataEntrada, LocalDateTime dataSaida) {
        long segundos = dataEntrada.until(dataSaida, java.time.temporal.ChronoUnit.SECONDS);
        long minutos = segundos / 60;
        segundos = segundos % 60;
        return minutos + " minutos e " + segundos + " segundos";
    }

}
