/**
 * Créé le 19 mai 2016 par Jérome LE BARON
 */
package fr.s2re.stock.impl;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.s2re.stock.api.IProduitDao;
import fr.s2re.stock.entity.Produit;

/**
 * Pour la communication avec la bdd pour les {@link Produit}.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
@Service
public class ProduitDaoImpl implements IProduitDao {

    /**
     * Pour faire du log.
     */
    private static final Logger LOGGER = Logger.getLogger(StockWebServiceImpl.class);
    /**
     * Pour faire les requetes.
     */
    private SessionFactory sessionFactory;
    /**
     * Pour récupérer un produit via sa référence.
     */
    private static final String GET_PRODUIT_BY_REFERENCE = "FROM Produit p WHERE p.reference = :reference";

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public Produit getProduitByReference(final String paramReference) {
        LOGGER.debug("Méthode Dao getProduitByReference");
        final Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(GET_PRODUIT_BY_REFERENCE);
        query.setParameter("reference", paramReference);
        return (Produit) query.uniqueResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public Produit updateProduit(Produit paramProduit) {
        LOGGER.debug("Méthode Dao updateProduit");
        final Session session = sessionFactory.getCurrentSession();
        session.merge(paramProduit);
        session.flush();
        return paramProduit;
    }

    /**
     * Accesseur en écriture du champ <code>sessionFactory</code>.
     * @param paramSessionFactory la valeur à écrire dans <code>sessionFactory</code>.
     */
    @Autowired
    public void setSessionFactory(SessionFactory paramSessionFactory) {
        sessionFactory = paramSessionFactory;
    }

    
    
}
