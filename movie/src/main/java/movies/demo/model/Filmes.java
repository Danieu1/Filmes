package movies.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;/*gerar métodos gets and sets em tempo de compilação */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/* Transformar essa classe em uma intindade*/

@NoArgsConstructor /* traduzir*/
@AllArgsConstructor/* traduzir */
@Entity/* entidade para o bd*/
@Data/* criar todos os gets sets metodo hashcod e equal (comparar objetos) */


public class Filmes {
    @Id /*Transformar id em chave primaria*/
    @GeneratedValue( strategy = GenerationType.IDENTITY) /* Gerar ids automáticos*/
    private int id;
    private String titulo;
    private String diretor;
    private int  anoLancamento;
    private String imagem;
    private String sinopse;
    private int avaliacao;
}
