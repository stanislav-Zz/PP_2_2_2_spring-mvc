package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {

    CarServiceImpl carService;

    @Autowired
    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }




    @GetMapping
    public String getCars (ModelMap model) {

        List<Car> cars = carService.getMyCar();
        model.addAttribute("list", cars);
        return "cars";



    }
    @GetMapping("/cars")
    public String getCarLimit(@RequestParam(defaultValue = "0") int count, ModelMap model) {
        List<Car> cars = carService.getMyCar();
        if(count > 0 && count <= cars.size()) {
            cars = cars.subList(0, count);
        }
        model.addAttribute("list", cars);
        return "cars";
    }

}
