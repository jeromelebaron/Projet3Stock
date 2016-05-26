/*
 * Créé le 19 mai 2016 par Jérome LE BARON
 */
package fr.s2re.stock.business.dto;

import fr.s2re.stock.dto.ProduitDto;
import fr.s2re.stock.entity.Produit;

/**
 * Description de la classe
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
public class Assembleur {

    /**
     * Constructeur privé.
     */
    private Assembleur() {
        // EMPTY
    }

    /**
     * Pour transfomer un {@link Produit} en {@link ProduitDto}.
     * @param paramProduit le {@link Produit} à transfomer.
     * @return un {@link ProduitDto}.
     */
    public static ProduitDto fromProduitEntityToProduitDto(final Produit paramProduit) {
        final ProduitDto produitDto = new ProduitDto();
        produitDto.setId(paramProduit.getId());
        produitDto.setReference(paramProduit.getReference());
        produitDto.setQuantiteStock(paramProduit.getQuantiteStock());
        return produitDto;
    }

    /**
     * Pour transfomer un {@link ProduitDto} en {@link Produit}.
     * @param paramProduit le {@link ProduitDto} à transfomer.
     * @return un {@link Produit}.
     */
    public static Produit fromProduitDtoToProduitEntity(final ProduitDto paramProduitDto) {
        final Produit produit = new Produit();
        produit.setId(paramProduitDto.getId());
        produit.setReference(paramProduitDto.getReference());
        produit.setQuantiteStock(paramProduitDto.getQuantiteStock());
        return produit;
    }
}
