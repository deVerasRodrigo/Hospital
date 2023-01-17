import java.util.ArrayList;
import java.util.List;

public class Fila {
    private List<Paciente> fila = new ArrayList<>();

    public Fila() {
    }

    public List<Paciente> getFila() {
        return fila;
    }

    public void entrarNaFila(Paciente paciente){

        if (paciente.getIdade() > 59 && !fila.isEmpty()){
            for (int i = 0; i < fila.size(); i++) {
                if (fila.get(i).getIdade() < 59){
                    fila.add(i, paciente);
                    break;
                }
            }
        } else {
            fila.add(paciente);
        }
    }

    public void andarFila (){
        fila.remove(0);
    }

}
