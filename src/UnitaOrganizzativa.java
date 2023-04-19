import java.util.ArrayList;
import java.util.List;

class UnitaOrganizzativa { //Classe per definire un unità organizativa
    private String nome;
    private List<Ruolo> ruoli; //Ruoli per unità
    private List<Impiegato> impiegati; //Elenco impiegati unità

    public UnitaOrganizzativa(String Nome){ //Costruttore organigramma
        this.nome=Nome;
        ruoli=new ArrayList<>();
        impiegati=new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public void addRuolo(Ruolo ruolo){
        ruoli.add(ruolo);
    }

    public List<Ruolo> getRuoli(){
        return ruoli;
    }

    public List<Impiegato> getImpiegati(){
        return impiegati;
    }



}

