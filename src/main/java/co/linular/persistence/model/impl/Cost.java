package co.linular.persistence.model.impl;

import co.linular.persistence.model.IEntity;

public class Cost implements IEntity {

    private long id;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
