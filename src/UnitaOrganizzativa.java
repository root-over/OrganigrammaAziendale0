import java.util.ArrayList;
import java.util.List;

class UnitaOrganizzativa { //Classe per definire un unità organizativa
    private String nome;
    private List<String> ruoli; //Ruoli per unità
    private List<Impiegato> impiegati; //Elenco impiegati unità

    public UnitaOrganizzativa(String Nome){ //Costruttore organigramma
        this.nome=Nome;
        ruoli=new ArrayList<>();
        impiegati=new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public void addRuolo(String ruolo){
        ruoli.add(ruolo);
    }

    public List<String> getRuoli(){
        return ruoli;
    }

    public List<Impiegato> getImpiegati(){
        return impiegati;
    }



}

