

package br.edu.iftm.ecommerce.model;


import java.io.Serializable;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public class Imagen implements Serializable {
    
    private Integer id;
    private String nome;
    private String codigo;
    private Date dataCriacao;
    

}
