import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Fila filaRecepcao = new Fila();
        Fila filaNeuro = new Fila();
        Fila filaClinicoGeral = new Fila();
        Fila filaCirurgiao = new Fila();
        Fila filaCirurgia = new Fila();

        Sala salaDeCirurgia = new Sala("123");

        Atendente atendente = new Atendente("Joao", 29, "A001");
        Neuro neurologista = new Neuro("Paula", 40, "M001");
        ClinicoGeral clinicoGeral = new ClinicoGeral("Daniel", 60, "M002");
        Cirurgiao cirurgiao = new Cirurgiao("Antonia", 55, "M003");

        atendente.baterPonto(5, 50);
        neurologista.baterPonto(8, 0);
        clinicoGeral.baterPonto(7, 55);
        cirurgiao.baterPonto(8, 10);
        System.out.println();

        Paciente paciente1 = new Paciente ("Ricardo", 25, new String [] {"dor de cabeca", "febre"});
        Paciente paciente2 = new Paciente ("Maria", 62, new String [] {"dor de barriga", "febre"});
        Paciente paciente3 = new Paciente ("Carlos", 50, new String [] {"dor no corpo", "osso quebrado"});


        filaRecepcao.entrarNaFila(paciente1);
        filaRecepcao.entrarNaFila(paciente2);
        filaRecepcao.entrarNaFila(paciente3);


        while (filaRecepcao.getFila().size() != 0){
            Paciente pacienteDaVez = filaRecepcao.getFila().get(0);
            atendente.iniciarAtendimento(pacienteDaVez);

            switch ((atendente.encaminharParaMedico(pacienteDaVez))){
                case "Neuro":
                    filaNeuro.entrarNaFila(pacienteDaVez);
                    break;
                case "Cirurgiao":
                    filaCirurgiao.entrarNaFila(pacienteDaVez);
                    break;
                default:
                    filaClinicoGeral.entrarNaFila(pacienteDaVez);
                    break;
            }

            filaRecepcao.andarFila();
            System.out.println();
        }

        while (filaNeuro.getFila().size() != 0){
            Paciente pacienteDaVez = filaNeuro.getFila().get(0);
            neurologista.iniciarAtendimento(pacienteDaVez);
            if (pacienteDaVez.getNecessitaCirurgia()){
                System.out.println(pacienteDaVez.getNome() + " Deverá realizar cirurgia!");
                filaCirurgia.entrarNaFila(pacienteDaVez);
            } else {
                System.out.println(pacienteDaVez.getNome() + " não necessita de cirurgia e foi liberado");
            }
            System.out.println();
            filaNeuro.andarFila();
        }
        while (filaClinicoGeral.getFila().size() != 0){
            Paciente pacienteDaVez = filaClinicoGeral.getFila().get(0);
            clinicoGeral.iniciarAtendimento(pacienteDaVez);
            if (pacienteDaVez.getNecessitaCirurgia()){
                System.out.println(pacienteDaVez.getNome() + " Deverá realizar cirurgia!");
                filaCirurgia.entrarNaFila(pacienteDaVez);
            } else {
                System.out.println(pacienteDaVez.getNome() + " não necessita de cirurgia e foi liberado");
            }
            System.out.println();
            filaClinicoGeral.andarFila();
        }
        while (filaCirurgiao.getFila().size() != 0){
            Paciente pacienteDaVez = filaCirurgiao.getFila().get(0);
            cirurgiao.iniciarAtendimento(pacienteDaVez);
            if (pacienteDaVez.getNecessitaCirurgia()){
                System.out.println(pacienteDaVez.getNome() + " Deverá realizar cirurgia!");
                filaCirurgia.entrarNaFila(pacienteDaVez);
            } else {
                System.out.println(pacienteDaVez.getNome() + " não necessita de cirurgia e foi liberado");
            }
            System.out.println();
            filaCirurgiao.andarFila();
        }
        while (filaCirurgia.getFila().size() != 0){
            Paciente pacienteDaVez = filaCirurgia.getFila().get(0);
            int dia = random.nextInt(28)+1;
            int mes = random.nextInt(12)+1;
            int ano = 2023;
            Cirurgia cirurgia = new Cirurgia(pacienteDaVez, cirurgiao, salaDeCirurgia);
            cirurgia.marcarCirurgia(dia, mes, ano);
            cirurgia.realizarCirurgia();
            filaCirurgia.andarFila();
            System.out.println();
        }
    }
}