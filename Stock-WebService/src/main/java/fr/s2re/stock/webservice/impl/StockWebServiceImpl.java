/**
 * Créé le 19 mai 2016 par Jérome LE BARON
 */
package fr.s2re.stock.webservice.impl;

import javax.jws.WebService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import fr.s2re.stock.api.data.IProduitDao;
import fr.s2re.stock.api.webservice.IStockWebService;
import fr.s2re.stock.business.dto.Assembleur;
import fr.s2re.stock.dto.ProduitDto;
import fr.s2re.stock.entity.Produit;

/**
 * Implémentation pour le webservice de gestion du stock.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
@WebService(targetNamespace = "http://webservice.stock.s2re.fr", endpointInterface = "fr.s2re.stock.api.webservice.IStockWebService", serviceName = "webServiceStock")
public class StockWebServiceImpl implements IStockWebService {

    /**
     * Pour faire du log.
     */
    private static final Logger LOGGER = Logger.getLogger(StockWebServiceImpl.class);
    /**
     * Pour avoir accès au dao.
     */
    @Autowired
    private IProduitDao produitDao;

    /**
     * {@inheritDoc}
     */
    @Override
    public ProduitDto getProduitByReference(final String paramReference) {
        LOGGER.debug("Méthode WebService getProduitByReference");
        ProduitDto produitDto = null;
        try {
            final Produit produit = produitDao.getProduitByReference(paramReference);
            produitDto = Assembleur.fromProduitEntityToProduitDto(produit);
        } catch (Exception localE) {
            LOGGER.error("Erreur avec Hibernate");
            LOGGER.error(localE);
        }
        return produitDto;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProduitDto updateProduit(final ProduitDto paramProduit) {
        LOGGER.debug("Méthode WebService updateProduit");
        try {
            Produit produit = Assembleur.fromProduitDtoToProduitEntity(paramProduit);
            produitDao.updateProduit(produit);
            Assembleur.fromProduitEntityToProduitDto(produit);
        } catch (Exception localE) {
            LOGGER.error("Erreur avec Hibernate");
            LOGGER.error(localE);
        }
        return paramProduit;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer decrementerStock(int paramQteStock, int paramQteCommande) {
        LOGGER.debug("Méthode WebService decrementerStock");
        int nouvelleQte = paramQteStock - paramQteCommande;
        return nouvelleQte;
    }

}
