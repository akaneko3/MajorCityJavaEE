package jp.mydns.akanekodou.dao;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import java.util.List;

import jp.mydns.akanekodou.entity.City;

@Stateless
@LocalBean
public class CityDAO {
    @PersistenceContext
    private EntityManager manager;

    public List<City> all() {
        Query query = manager.createQuery("from City");
        @SuppressWarnings("unchecked")
        List<City> result = query.getResultList();
        return result;
    }

    public City find(int id) {
        return manager.find(City.class, id);
    }
}
