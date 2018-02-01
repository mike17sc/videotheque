package Service;

import DAO.UtilisateurRepository;
import model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UtilisateurServiceImpl {
    @Autowired
    private UtilisateurRepository utilisateurRepository;

    public List<Utilisateur> getUtilisateurs() {
        return utilisateurRepository.findAll();
    }
}
