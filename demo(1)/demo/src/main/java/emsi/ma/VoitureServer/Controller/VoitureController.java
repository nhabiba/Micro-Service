package emsi.ma.VoitureServer.Controller;

import emsi.ma.VoitureServer.Model.Voiture;
import emsi.ma.VoitureServer.Repository.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VoitureController {

    @Autowired
    VoitureRepository voitureRepository;

    @GetMapping("/voitures")
    public List<Voiture> findAll() {
        return voitureRepository.findAll();
    }


    @GetMapping("/voiture/{id}")
    public Voiture findById(@PathVariable int id) throws Exception {

        return this.voitureRepository.findById(id).orElseThrow(() -> new Exception("Voiture inexistnt"));
    }
}