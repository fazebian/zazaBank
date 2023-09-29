package xyz.sahia.zazaBank;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CompteController {
    private final Compte compte;
    public CompteController(Compte compte) {
        this.compte = compte;
    }
    @GetMapping("/")
    public String viewBalance(Model model) {
        compte.depot(10);
        model.addAttribute("balance", formattageDeMoney(compte.balance()));
        return "compte-balance";
    }
    public String formattageDeMoney(int montant){
        return  montant + " ar";
    }

    @PostMapping("/depot")
    public String depot(DepotCommand depotCommand){
        return " ";
    }
    public String viewBalance(){
        return formattageDeMoney(compte.balance());
    }
}