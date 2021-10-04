

package br.edu.iftm.ecommerce.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public class Marca implements Serializable {
    
    private Integer id;
    private String nome; 

}
