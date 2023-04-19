import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Organigramma { //Definizione dell'organigramma
    private UnitaOrganizzativa unita;
    private Map<UnitaOrganizzativa, List<UnitaOrganizzativa>> sottoUnita; //Le sotto unità di ogni unità

    public Organigramma(UnitaOrganizzativa unita){
        this.unita=unita;
        sottoUnita=new HashMap<>();
    }

    //TODO controlla
    public void addSottoUnita(UnitaOrganizzativa padre, UnitaOrganizzativa figlio){
        if (sottoUnita.containsKey(padre)){
            sottoUnita.get(padre).add(figlio);
        } else {
            List<UnitaOrganizzativa> unita = new ArrayList<>();
            unita.add(figlio);
            sottoUnita.put(padre,unita);
        }
    }

    public UnitaOrganizzativa getUnita(){
        return unita;
    }
    public List<UnitaOrganizzativa> getSottoUnita(UnitaOrganizzativa padre){
        return sottoUnita.get(padre);
    }

}
