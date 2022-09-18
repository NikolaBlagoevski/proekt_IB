package mk.ukim.bazi.aplikacija.web;

import mk.ukim.bazi.aplikacija.model.MyorderEntity;
import mk.ukim.bazi.aplikacija.model.ShowAvailableBooksEntity;
import mk.ukim.bazi.aplikacija.model.ShowBooksEntity;
import mk.ukim.bazi.aplikacija.model.UserAccountEntity;
import mk.ukim.bazi.aplikacija.repository.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class  ShowAvailableBooksController {
    private final ShowAvailableBooksInterface showAvailableBooksInterface;
    private final ShowBooksEntityInterface showBooksEntityInterface;
    private final ShowOrderEntityInterface showOrderEntityInterface;
    private final MyOrderInterface myOrderInterface;
    private final UserInterface userInterface;

    public ShowAvailableBooksController(ShowAvailableBooksInterface showAvailableBooksInterface, ShowBooksEntityInterface showBooksEntityInterface, ShowOrderEntityInterface showOrderEntityInterface, MyOrderInterface myOrderInterface, UserInterface userInterface) {
        this.showAvailableBooksInterface = showAvailableBooksInterface;
        this.showBooksEntityInterface = showBooksEntityInterface;

        this.showOrderEntityInterface = showOrderEntityInterface;
        this.myOrderInterface = myOrderInterface;
        this.userInterface = userInterface;
    }

    @GetMapping("/{id}")
    public String showAvailablebooks(@PathVariable Integer id,   Model model){
        List<ShowAvailableBooksEntity> showAvailableBooksEntities = showAvailableBooksInterface.findAll();
        model.addAttribute("Show_available_books", showAvailableBooksEntities);
        List<ShowBooksEntity> showBooksEntities = showBooksEntityInterface.findAll();
        model.addAttribute("Show_books", showBooksEntities);
        List<MyorderEntity> showOrderEntities = myOrderInterface.findAllByAccId(id);
        model.addAttribute("Oreders", showOrderEntities);
        return "test_file";
    }

    @GetMapping("/logiranje")
    public String login(Model model){

        return "login";
    }

    @GetMapping("/")
    public String greet(Model model){
        return "greet";
    }

    @PostMapping("/logiranje")
    public String login(Model model, @RequestParam String username, @RequestParam String password){
        Optional<UserAccountEntity> user=userInterface.findByUsernameAndPassword(username, password);
        if(user.isPresent())
        {
            return "redirect:/"+user.get().getIdAcc();
        }
        return "login";
    }

    @GetMapping("/register")
    public String register(Model model){

        return "register";
    }


    @PostMapping("/register")
    public String login(Model model, @RequestParam String username, @RequestParam String password,
                        @RequestParam String name, @RequestParam String surname,
                        @RequestParam String email, @RequestParam String address){
        userInterface.save(new UserAccountEntity(username, password, name, surname, address, email));
        return "redirect:/logiranje";
    }
}
