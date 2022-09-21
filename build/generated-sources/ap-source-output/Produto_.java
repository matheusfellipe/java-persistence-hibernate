import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Produto.class)
public abstract class Produto_ {

	public static volatile SingularAttribute<Produto, String> marca;
	public static volatile SingularAttribute<Produto, Integer> qtdEstoque;
	public static volatile SingularAttribute<Produto, String> vlrUnitario;
	public static volatile SingularAttribute<Produto, Integer> id;
	public static volatile SingularAttribute<Produto, String> descricao;

	public static final String MARCA = "marca";
	public static final String QTD_ESTOQUE = "qtdEstoque";
	public static final String VLR_UNITARIO = "vlrUnitario";
	public static final String ID = "id";
	public static final String DESCRICAO = "descricao";

}

