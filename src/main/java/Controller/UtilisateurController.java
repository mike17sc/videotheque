package Controller;

import Service.UtilisateurServiceImpl;
import model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class UtilisateurController {
    @Autowired
    private UtilisateurServiceImpl utilisateurServiceImpl;

    @GetMapping("/Users")
    public List<Utilisateur> getUtilisateurs(){
        return utilisateurServiceImpl.getUtilisateurs();
    }

}
