package emsi.ma.VoitureServer.Repository;

import emsi.ma.VoitureServer.Model.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoitureRepository extends JpaRepository<Voiture,Integer>{

}