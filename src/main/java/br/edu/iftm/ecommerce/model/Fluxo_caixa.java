

package br.edu.iftm.ecommerce.model;


import java.io.Serializable;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public class Fluxo_caixa implements Serializable {
    
    private Integer id;
    private String  descricao;
    private String  tipo_movimento;
    private Double  valor;
    private Date dataMovimento;
    
}
