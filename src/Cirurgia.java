import java.util.Random;

public class Cirurgia {
    Paciente paciente;
    Cirurgiao cirurgiao;
    Sala sala;

    public Cirurgia(Paciente paciente, Cirurgiao cirurgiao, Sala sala) {
        this.paciente = paciente;
        this.cirurgiao = cirurgiao;
        this.sala = sala;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Cirurgiao getCirurgiao() {
        return cirurgiao;
    }

    public Sala getSala() {
        return sala;
    }

    public void marcarCirurgia(int dia, int mes, int ano){
        this.sala.reservar(dia, mes, ano);
        System.out.printf("Cirurgia de %s marcada para o dia %02d/%02d/%02d com o(a) Dr(a) %s na sala %s\n",
                this.paciente.getNome(),
                dia,
                mes,
                ano,
                this.cirurgiao.getNome(),
                this.sala.getNumeroDaSala());
    }
    public void realizarCirurgia(){
        System.out.println("[...]");
        System.out.println("A cirurgia está ocorrendo no dia marcado");
        System.out.println("[...]");

        if (isCirurgiaSucedida()){
            System.out.println("A cirurgia foi um sucesso!");
        } else {
            System.out.println("Infelizmente, A cirurgia foi mal sucedida!");
        }
    }
    private Boolean isCirurgiaSucedida(){
        Random resultado = new Random();
        return resultado.nextBoolean();

    }
}
