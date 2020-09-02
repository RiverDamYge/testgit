package game.bag.controller;
import game.bag.entity.Goods;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import game.bag.repository.GoodsRepository;

@Controller
@RequestMapping("/game/bag")
public class controller {
    @Autowired
    private GoodsRepository goodsRepository;
    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("list",goodsRepository.FindAll());
        return modelAndView;
    }
     @GetMapping("/DeleteByid/{id}")
       public String DeleteByid(@PathVariable("id") long id){
          goodsRepository.DeleteByid(id);
           return "redirect:/game/bag/index";
     }
     @PostMapping("/save")
    public String save(Goods goods){
        goodsRepository.Save(goods);
         return "redirect:/game/bag/index";
     }
    @PostMapping("/update")
    public String update(Goods goods){
        goodsRepository.Update(goods);
        return "redirect:/game/bag/index";
    }
    @GetMapping("/findById/{id}")
    public ModelAndView FindByid(@PathVariable("id") long id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("update");
        modelAndView.addObject("student",goodsRepository.FindByid(id));
        return modelAndView;

    }

}
