import java.util.ArrayList;
import java.util.List;

class Impiegato { //Classe per definire i dipendenti
    private String nome;
    private List<String> ruoli; //Ruoli assegnati al dipendente
    private List<UnitaOrganizzativa> unita; //Unità di cui fa parte
    public Impiegato(String nome){
        this.nome=nome;
        ruoli=new ArrayList<String>();
        unita=new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public void addUnita(UnitaOrganizzativa unita){
        this.unita.add(unita);
    }

    public void addRuolo(String ruolo) {
        boolean ruoloAggiunto=false;
        for (UnitaOrganizzativa u: unita ){
            if (u.getRuoli().contains(ruolo)){
                ruoli.add(ruolo);
                ruoloAggiunto=true;
            }
        }
        if (!ruoloAggiunto){
            System.out.println("Il ruolo non esiste nelle unità di cui fa parte l'impiegato");
        }
    }

    public List<String> getRuoli(){
        return ruoli;
    }
    public List<UnitaOrganizzativa> getUnita(){
        return unita;
    }


}
