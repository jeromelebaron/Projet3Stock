/**
 * Créé le 19 mai 2016 par Jérome LE BARON
 */
package fr.s2re.stock.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import fr.s2re.stock.dto.ProduitDto;

/**
 * Toutes les méthodes exposées pour le webservice de stock.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
@WebService(targetNamespace = "http://webservice.stock.s2re.fr")
public interface IStockWebService {

    /**
     * Pour récupérer un {@link Produit} via sa référence.
     * @param paramReference la référence du {@link Produit}.
     * @return le {@link Produit} trouvé.
     */
    @WebMethod(operationName = "getProduitByReference")
    @WebResult(name = "produitByReference")
    ProduitDto getProduitByReference(@WebParam(name = "paramReference") String paramReference);

    /**
     * Pour mettre à jour le stock d'un {@link Produit}.
     * @param paramProduit le {@link Produit} à mettre à jour.
     * @return le {@link Produit} mise à jour.
     */
    @WebMethod(operationName = "updateProduit")
    @WebResult(name = "produitUpdate")
    ProduitDto updateProduit(@WebParam(name = "paramProduit") ProduitDto paramProduitDto);

    @WebMethod(operationName = "decrementerStock")
    @WebResult(name = "nouvelleQuantite")
    Integer decrementerStock(@WebParam(name = "qteStock") int qteStock,
            @WebParam(name = "qteCommande") int qteCommande);

}
