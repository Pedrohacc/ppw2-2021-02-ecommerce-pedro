

package br.edu.iftm.ecommerce.converter;

import br.edu.iftm.ecommerce.model.Tag;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(forClass = Tag.class)
public class TagConverter implements Converter<Tag>{

    @Override
    public Tag getAsObject(FacesContext fc, UIComponent uic, String id) {
        System.out.println(id);
        if (id != null && !"".equals(id)) {
            Tag tag = (Tag) uic.getAttributes().get("tag_" + id);
            return tag;

        }
        return null;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Tag tag) {
        if(tag == null){
            return "";
        }

        if(tag.getId() != null){
            uic.getAttributes().put("tag_"+tag.getId(), tag);
            return tag.getId().toString();
        }
        return "";
    }
    
}
