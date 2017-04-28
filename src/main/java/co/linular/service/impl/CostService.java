package co.linular.service.impl;

import co.linular.persistence.model.impl.Cost;
import co.linular.service.AbstractService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CostService extends AbstractService<Cost> {

    @Override
    public List<Cost> findAll() {
        List<Cost> costs = new ArrayList<>();
        Cost cost1 = new Cost();
        cost1.setId(12345L);
        costs.add(cost1);
        return costs;
    }
}
