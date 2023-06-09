package rattrapage.rattrapageSpring.controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import rattrapage.rattrapageSpring.entities.Classe;
import rattrapage.rattrapageSpring.entities.Etudiant;
import rattrapage.rattrapageSpring.repositories.ClasseRepository;
import rattrapage.rattrapageSpring.repositories.EtudiantRepository;

import java.util.List;

@Controller
public class EtudiantController {

    @Autowired
    private ClasseRepository classeRepository;
    @Autowired
    private EtudiantRepository etudiantRepository;


    @GetMapping("/liste-inscription")
    public String listerCours(Model model,
                              @RequestParam(name = "page",defaultValue = "0") int page,
                              @RequestParam(name = "size",defaultValue = "5") int size){

        Page<Etudiant> etudiantPage=etudiantRepository.findAll(PageRequest.of(page,size));
        List<Classe> listeClasse = classeRepository.findAll();
        model.addAttribute("listClasses",listeClasse);
        model.addAttribute("listEtudiant",etudiantPage.getContent());
        model.addAttribute("pages",new int[etudiantPage.getTotalPages()]);
        model.addAttribute("currentPage",page);
        return "inscription";
    }

    @GetMapping("/form-etudiant")
    public String showInscriptionForm(Model model) {
        List<Classe> listesClasses = classeRepository.findAll();
        model.addAttribute("etudiant", new Etudiant());
        model.addAttribute("listClasses", listesClasses);
        return "form.inscription";
    }

    @PostMapping("/save-etudiant")
    public String saveEtudiant(Model model,
                                 @Valid Etudiant etudiant,
                                 @RequestParam(name = "id", defaultValue = "") Long idClasse,
                                 BindingResult bindingResult,
                                 RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("mode", "error");
            redirectAttributes.addFlashAttribute("message", "Erreur de saisie");
        } else {
            etudiant = etudiantRepository.save(etudiant);
            etudiant.setId(idClasse);
            redirectAttributes.addFlashAttribute("mode", "success");
            redirectAttributes.addFlashAttribute("message", "Etudiant Enregistre avec success");
        }

        return "redirect:/form-etudiant";
    }

    @GetMapping("/")
    public String index(){

        return "redirect:/liste-inscription";
    }
}
