package br.edu.iftm.ecommerce.logic;

import br.edu.iftm.ecommerce.model.Tag;
import br.edu.iftm.ecommerce.repository.TagRepository;
import br.edu.iftm.ecommerce.util.Assert;
import br.edu.iftm.ecommerce.util.exception.ErroNegocioException;
import br.edu.iftm.ecommerce.util.exception.ErroSistemaException;
import java.util.List;
import javax.inject.Inject;


public class TagLogic implements CrudLogic<Tag> {

    @Inject
    private TagRepository repository;

    @Override
    public Tag salvar(Tag entidade) throws ErroNegocioException, ErroSistemaException {
        if(Assert.isStringNullOrEmpty(entidade.getNome())) {
            throw new ErroNegocioException("Por favor informe o nome da Tag.");
        }
        entidade = this.repository.salvar(entidade);
        return entidade;
    }

    @Override
    public void deletar(Tag entidade) throws ErroNegocioException, ErroSistemaException {
        this.repository.remover(entidade.getId());
    }

    @Override
    public Tag buscarPorId(Tag entidade) throws ErroNegocioException, ErroSistemaException {
        entidade = this.repository.buscarPorID(entidade.getId());
        return entidade;
    }

    @Override
    public List<Tag> buscar(Tag entidade) throws ErroNegocioException, ErroSistemaException {
        return this.repository.listar();
    }
    
}
