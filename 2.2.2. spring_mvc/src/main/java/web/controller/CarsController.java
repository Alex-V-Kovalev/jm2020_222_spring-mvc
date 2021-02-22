package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    private CarService carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String getCarsPage(ModelMap model) {
        List<Car> cars = carService.getAll();
        for (Car car :
                cars) {
            System.out.println(car);
        }
        model.addAttribute("carsList", cars);
        return "cars";
    }

}
