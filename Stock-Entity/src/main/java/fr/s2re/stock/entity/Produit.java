/**
 * Créé le 19 mai 2016 par Jérome LE BARON
 */
package fr.s2re.stock.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Un produit de la base de stock.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
@Entity
@Table(name = "produit")
public class Produit implements Serializable {

    /**
     * Pour la sérialisation.
     */
    private static final long serialVersionUID = 1L;
    /**
     * L'identifiant unique du produit pour la bdd.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produit")
    private Integer id;
    /**
     * La référence du produit pour le stock.
     */
    @Column(name = "reference", nullable = false, length = 25)
    private String reference;
    /**
     * La quantité en stock du produit.
     */
    @Column(name = "quantite_stock", nullable = false)
    private Integer quantiteStock;

    /**
     * Constructeur vide.
     */
    public Produit() {
        // EMPTY
    }

    /**
     * Accesseur en lecture du champ <code>id</code>.
     * @return le champ <code>id</code>.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Accesseur en écriture du champ <code>id</code>.
     * @param paramId la valeur à écrire dans <code>id</code>.
     */
    public void setId(Integer paramId) {
        id = paramId;
    }

    /**
     * Accesseur en lecture du champ <code>reference</code>.
     * @return le champ <code>reference</code>.
     */
    public String getReference() {
        return reference;
    }

    /**
     * Accesseur en écriture du champ <code>reference</code>.
     * @param paramReference la valeur à écrire dans <code>reference</code>.
     */
    public void setReference(String paramReference) {
        reference = paramReference;
    }

    /**
     * Accesseur en lecture du champ <code>quantiteStock</code>.
     * @return le champ <code>quantiteStock</code>.
     */
    public Integer getQuantiteStock() {
        return quantiteStock;
    }

    /**
     * Accesseur en écriture du champ <code>quantiteStock</code>.
     * @param paramQuantiteStock la valeur à écrire dans <code>quantiteStock</code>.
     */
    public void setQuantiteStock(Integer paramQuantiteStock) {
        quantiteStock = paramQuantiteStock;
    }

}
