package co.linular.service.impl;

import co.linular.persistence.model.impl.Cost;
import co.linular.repository.CostRepository;
import co.linular.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CostService extends AbstractService<Cost> {

    private CostRepository costRepository;

    @Override
    public Cost findById(String id) {
        return costRepository.findOne(id);
    }

    @Override
    public List<Cost> findAll() {
        List<Cost> target = new ArrayList<>();
        costRepository.findAll().forEach(target::add);
        return target;
    }

    @Autowired
    public void setCostRepository(CostRepository costRepository) {
        this.costRepository = costRepository;
    }
}
