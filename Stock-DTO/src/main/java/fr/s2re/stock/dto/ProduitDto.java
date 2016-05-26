/**
 * Créé le 19 mai 2016 par Jérome LE BARON
 */
package fr.s2re.stock.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Un objet {@link Produit} pour le passer à travers le réseau.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
@XmlRootElement(namespace = "http://webservice.stock.s2re.fr")
public class ProduitDto implements Serializable {

    /**
     * Pour la sérialisation.
     */
    private static final long serialVersionUID = 1L;
    /**
     * L'identifiant unique du produit pour la bdd.
     */
    private Integer id;
    /**
     * La référence du produit pour le stock.
     */
    private String reference;
    /**
     * La quantité en stock du produit.
     */
    private Integer quantiteStock;

    /**
     * Constructeur vide.
     */
    public ProduitDto() {
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
