/**
 * Créé le 19 mai 2016 par Jérome LE BARON
 */
package fr.s2re.stock.api.data;

import org.springframework.stereotype.Service;

import fr.s2re.stock.entity.Produit;

/**
 * Pour la persistance du {@link Produit}.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
@Service
public interface IProduitDao {

    /**
     * Pour récupérer un {@link Produit} via sa référence.
     * @param paramReference la référence du {@link Produit}.
     * @return le {@link Produit} trouvé.
     */
    Produit getProduitByReference(String paramReference);

    /**
     * Pour mettre à jour le stock d'un {@link Produit}.
     * @param paramProduit le {@link Produit} à mettre à jour.
     * @return le {@link Produit} mise à jour.
     */
    Produit updateProduit(Produit paramProduit);
}
