package weboblig3.oblig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class javaKontroller {
    //for å registrere
    @Autowired
    private kundeRepository rep;

    //for å lagre
    @PostMapping("/lagre")
    public void lagre(Billett i) {
        rep.lagreBillett(i);
    }

    @GetMapping("/hent")
    public List<Billett> visKjop() {
        return rep.hentAlleReg();
    }

    @GetMapping("/slett")
    public void slett() {
        rep.slettAlleBilletter(); }
}
