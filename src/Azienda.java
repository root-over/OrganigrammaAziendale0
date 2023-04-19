import java.util.ArrayList;
import java.util.List;

class Azienda {//Gestione dell'organigramma e dei dati
//TODO non sono sicuro sia giusto
    private Organigramma org;
    private List<Ruolo> ruoli;
    private List<Impiegato> impiegati;
    public Azienda(){
        ruoli=new ArrayList<>();
        impiegati=new ArrayList<>();
    }

    public void setOrganigramma(Organigramma org){
        this.org=org;
    }

    public Organigramma getOrganigramma(){
        return org;
    }

    public void addRuolo(Ruolo ruolo){
        ruoli.add(ruolo);
    }
    public List<Ruolo> getRuoli(){
        return ruoli;
    }
    public void addImpiegato(Impiegato impiegato){
        impiegati.add(impiegato);
    }
    public List<Impiegato> getImpiegati(){
        return impiegati;
    }

}
