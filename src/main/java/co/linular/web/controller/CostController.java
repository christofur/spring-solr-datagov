package co.linular.web.controller;

import co.linular.persistence.model.impl.Cost;
import co.linular.service.impl.CostService;
import co.linular.util.RouteMappings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = RouteMappings.COSTS)
public class CostController {

    @Autowired
    private CostService costService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Cost> findAll(){
        return costService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Cost findById(@PathVariable("id") String id){
        return costService.findById(id);
    }

}
