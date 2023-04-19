
public class Main {
    public static void main(String[] args) {

        //Dati dell'organigramma
        UnitaOrganizzativa admin = new UnitaOrganizzativa("Consiglio di amministrazione");
        UnitaOrganizzativa tech = new UnitaOrganizzativa("Comitato tecnico Scientifico");
        UnitaOrganizzativa research = new UnitaOrganizzativa("Ricerca e sviluppo");
        UnitaOrganizzativa purchase = new UnitaOrganizzativa("Acquisti");
        UnitaOrganizzativa prod = new UnitaOrganizzativa("Produzione");
        UnitaOrganizzativa sales = new UnitaOrganizzativa("Area Vendite");
        UnitaOrganizzativa marketing = new UnitaOrganizzativa("Marketing");
        UnitaOrganizzativa Customer = new UnitaOrganizzativa("Customer Care");


        admin.addRuolo("Presidente");
        Impiegato user1 = new Impiegato("Giuseppe Magliano");
        user1.addUnita(admin);
        user1.addUnita(purchase);
        user1.addRuolo("Presidente");
        user1.addRuolo("Venditore");


        tech.addRuolo("Programmatore");
        Impiegato user2 = new Impiegato("Francesco Magliano");
        user2.addUnita(tech);
        user2.addRuolo("Programmatore");

        //Creo l'organigramma
        Organigramma org;
        org = new Organigramma(admin);
        org.addSottoUnita(admin, tech);
        org.addSottoUnita(admin, purchase);
        org.addSottoUnita(admin, prod);
        org.addSottoUnita(admin, sales);
        org.addSottoUnita(tech, research);
        org.addSottoUnita(sales, marketing);
        org.addSottoUnita(sales, Customer);

    }
}