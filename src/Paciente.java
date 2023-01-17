import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Paciente extends Pessoa{
    private String [] sintomas;
    private Boolean necessitaCirurgia = false;


    public Paciente() {
    }
    public Paciente(String nome, Integer idade, String[] sintomas) {
        super(nome, idade);
        this.sintomas = sintomas;
    }

    public String[] getSintomas() {
        return sintomas;
    }

    public void setSintomas(String[] sintomas) {
        this.sintomas = sintomas;
    }

    public Boolean getNecessitaCirurgia() {
        return necessitaCirurgia;
    }

    public void setNecessitaCirurgia(Boolean necessitaCirurgia) {
        this.necessitaCirurgia = necessitaCirurgia;
    }

    public List listarSintomas(){
       return new ArrayList<String>(Arrays.asList (sintomas));
    }

}
