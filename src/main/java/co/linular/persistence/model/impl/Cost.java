package co.linular.persistence.model.impl;

import co.linular.persistence.model.IEntity;
import co.linular.persistence.model.SearchableCostDefinition;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(solrCoreName = "govdata2")
public class Cost implements IEntity, SearchableCostDefinition {

    private @Id @Indexed long id;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
