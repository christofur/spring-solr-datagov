package co.linular.service;

import co.linular.persistence.model.IEntity;
import co.linular.persistence.model.impl.Cost;

import java.util.List;

public abstract class AbstractService<T extends IEntity> implements IService {
    public AbstractService() {
        super();
    }
}
