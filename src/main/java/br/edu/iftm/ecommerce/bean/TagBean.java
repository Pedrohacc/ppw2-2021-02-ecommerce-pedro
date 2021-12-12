package br.edu.iftm.ecommerce.bean;

import br.edu.iftm.ecommerce.logic.CrudLogic;
import br.edu.iftm.ecommerce.logic.TagLogic;
import br.edu.iftm.ecommerce.model.Tag;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@SessionScoped
public class TagBean extends CrudBean<Tag, TagLogic>{

    @Inject
    private TagLogic logic;

    public TagBean() {
        super(Tag.class);
    }
    
    @Override
    public TagLogic getLogic() {
        return this.logic;
    }
    
}
