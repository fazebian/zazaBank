package xyz.sahia.zazaBank;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CompteController {

    @GetMapping("/")
    public String viewBalance(Model model) {

        var compte = new Compte();

        model.addAttribute("balance", formattageDeMoney(compte.balance()));

        return "compte-balance";
    }
    public String formattageDeMoney(int montant){
        return "0 ar";
    }
}