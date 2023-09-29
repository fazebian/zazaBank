package xyz.sahia.zazaBank;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.util.Collections;

@Controller
public class CompteController {
    private final Compte compte;
    public CompteController(Compte compte) {
        this.compte = compte;
    }
    @GetMapping("/")
    public String viewBalance(Model model) {
        model.addAttribute("balance", formattageDeMoney(compte.balance()));
        model.addAttribute("depot0" , new DepotCommand(0));
        model.addAttribute("transactions", Collections.singleton(new Transaction(
                LocalDate.now(),"Orange Money",10000,"cadeau anniversaire"
        )));
        return "compte-balance";
    }
    public String formattageDeMoney(int montant){
        return  montant + " ar";
    }

    @PostMapping("/depot")
    public String depot(DepotCommand depotCommand){
        compte.depot(depotCommand.montant());
        return "redirect:/";
    }
    public String viewBalance(){
        return formattageDeMoney(compte.balance());
    }

}