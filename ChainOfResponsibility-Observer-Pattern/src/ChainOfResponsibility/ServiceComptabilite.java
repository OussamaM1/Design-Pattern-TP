package ChainOfResponsibility;

import Observer.Budget;
import Observer.Demande;

public class ServiceComptabilite implements Service {

    private Service service;

    @Override
    public void setNextHandler(Service service) {
        this.service = service;
    }

    @Override
    public void handleDemande(Demande demande, Budget budget) {
        if (demande.getMontantGlobale() <= budget.getBudget()) {
            System.out.println("Operation en cours ...");
            budget.setMontantBloque(demande.getMontantGlobale());
            System.out.println("Montant bloque : " + budget.getMontantBloque());
            System.out.println("Traitement fini...");
            service.handleDemande(demande, budget);
        } else {
            System.out.println("Budget insuffisant pour effectuer l'opération !");
        }
    }
}
