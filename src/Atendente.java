public class Atendente extends Funcionario{

    public Atendente() {
    }

    public Atendente(String nome, Integer idade, String id) {
        super(nome, idade, id);
    }

    public void iniciarAtendimento(Paciente paciente){
        System.out.printf("%s está atendendo %s\n", this.getNome(), paciente.getNome());
    }
    public final String encaminharParaMedico(Paciente paciente){
        if (paciente.listarSintomas().contains("osso quebrado")){
            System.out.println(paciente.getNome() + " Será encaminhado ao Neurologista");
            return "Cirurgiao";
        } else if (paciente.listarSintomas().contains("dor de cabeca")) {
            System.out.println(paciente.getNome() + " Será encaminhado ao Cirurgião");
            return "Neuro";
        } else {
            System.out.println(paciente.getNome() + " será encaminhado ao Clínico Geral");
            return "ClinicoGeral";
        }
    }
    public final void baterPonto(int hora, int minuto) {
        if (hora >= 6 && minuto > 0){
        System.out.printf("%s - %s chegou atrasado ao hospital as %02d:%02d\n", this.getNome(), this.getId(), hora, minuto);
        } else{
        System.out.printf("%s - %s chegou ao hospital as %02d:%02d\n", this.getNome(), this.getId(), hora, minuto);
        }
    }
}
