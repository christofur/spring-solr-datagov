package co.linular.service;

import co.linular.persistence.model.IEntity;

public abstract class AbstractService<T extends IEntity> implements IService {
    public AbstractService() {
        super();
    }
}
