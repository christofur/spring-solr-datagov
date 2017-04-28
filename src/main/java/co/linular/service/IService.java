package co.linular.service;

import co.linular.persistence.model.IEntity;

import java.util.List;

public interface IService <T extends IEntity> {

    List<T> findAll();
}
