package rattrapage.rattrapageSpring.controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import rattrapage.rattrapageSpring.dto.ClasseDto;
import rattrapage.rattrapageSpring.entities.Classe;
import rattrapage.rattrapageSpring.repositories.ClasseRepository;

@Controller
public class ClasseController {

    @Autowired
    private ClasseRepository classeRepository;


    @GetMapping("/liste-classes")
    public String listerClasse(Model model,
                               @RequestParam(name = "page",defaultValue = "0") int page,
                               @RequestParam(name = "size",defaultValue = "5") int size){

        Page<Classe> classePage=classeRepository.findAll(PageRequest.of(page,size));
        model.addAttribute("listClasse",classePage.getContent());
        model.addAttribute("pages",new int[classePage.getTotalPages()]);
        model.addAttribute("currentPage",page);

        return "classe";
    }
    @GetMapping("/form-classe")
    public String loadForm(Model model){
        ClasseDto classe=ClasseDto.builder().build();
        model.addAttribute("classe",classe);
        return "form.classe";
    }

    @PostMapping("/save-classe")
    public String saveClasse(Model model,
                             @Valid Classe classe,
                             BindingResult bindingResult,
                             RedirectAttributes redirectAttributes){
        if (bindingResult.hasErrors()){
            redirectAttributes.addFlashAttribute("mode","error");
            redirectAttributes.addFlashAttribute("message","Erreur de saisie");
        }else {
            classe = classeRepository.save(classe);
            redirectAttributes.addFlashAttribute("mode","success");
            redirectAttributes.addFlashAttribute("message","Classe Enregistre avec success");
        }

        return "redirect:/form-classe";
    }
}
