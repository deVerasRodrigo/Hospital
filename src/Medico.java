import java.util.List;
import java.util.Random;

public abstract class Medico extends Funcionario{
    private Random random = new Random();
    public Medico() {
    }
    public Medico(String nome, Integer idade, String id) {
        super(nome, idade, id);
    }

    public Random getRandom() {
        return random;
    }

    public abstract String realizarDiagnostico(List<String> sintomas);

    @Override
    public final void baterPonto(int hora, int minuto) {
        if (hora >= 8 && minuto > 0){
            System.out.printf("Dr(a) %s - %s chegou atrasado ao hospital as %02d:%02d\n", this.getNome(), this.getId(), hora, minuto);
        } else{
            System.out.printf("Dr(a) %s - %s chegou ao hospital as %02d:%02d\n", this.getNome(), this.getId(), hora, minuto);
        }
    }
    @Override
    public void iniciarAtendimento(Paciente paciente) {
        System.out.printf("Dr(a) %s está atendendo %s.\n", this.getNome(), paciente.getNome());
        System.out.println("Diagnóstico: " + realizarDiagnostico(paciente.listarSintomas()));
        paciente.setNecessitaCirurgia(random.nextBoolean());
    }
}
