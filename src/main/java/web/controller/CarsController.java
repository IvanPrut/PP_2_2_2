package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String show(@RequestParam(value = "count", required = false) Integer count, Model model) {
        count = count == null ? 5 : count;
        model.addAttribute("cars", carService.getCountCars(count));
        return "cars";
    }

}
