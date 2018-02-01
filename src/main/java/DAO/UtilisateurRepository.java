package DAO;
import model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer>{
    Utilisateur findByNom(String nom);
    Utilisateur findByIdUtilisateur(int idUtilistateur);
}
