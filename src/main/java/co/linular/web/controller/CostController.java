package co.linular.web.controller;

import co.linular.persistence.model.impl.Cost;
import co.linular.service.IService;
import co.linular.service.impl.CostService;
import co.linular.util.RouteMappings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.misc.Request;

import java.util.List;

@Controller
@RequestMapping(value = RouteMappings.COSTS)
public class CostController extends AbstractController {

    @Autowired
    private CostService costService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Cost> findAll(){
        return costService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Cost findById(@PathVariable("id") final String id){
        return costService.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody final Cost resource){
        createInternal(resource);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable("id") final String id, @RequestBody final Cost resource){
        updateInternal(resource);
    }

    @Override
    public IService getService() {
        return costService;
    }
}
