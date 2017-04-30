package co.linular.web.controller;

import co.linular.persistence.model.IEntity;
import co.linular.service.IService;

public abstract class AbstractController<T extends IEntity> {

    public abstract IService getService();

    public void createInternal(T resource){
        IService service = getService();
        service.create(resource);
    }

    public void updateInternal(T resource){
        IService service = getService();
        service.update(resource);
    }

}
