package br.edu.iftm.ecommerce.repository;


import br.edu.iftm.ecommerce.model.Tag;


public class TagRepository extends GenericRepository<Tag, Integer>{
    
    public TagRepository() {
        super(Tag.class);
    }
    
}
