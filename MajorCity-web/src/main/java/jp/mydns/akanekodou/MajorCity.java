package jp.mydns.akanekodou;

import javax.ejb.EJB;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.io.Serializable;
import java.util.List;

import jp.mydns.akanekodou.dao.CityDAO;
import jp.mydns.akanekodou.entity.City;

@SuppressWarnings("serial")
@ManagedBean
@SessionScoped
public class MajorCity implements Serializable {
    @EJB
    private CityDAO dao;
    private List<City> cities;
    private City city;

    @PostConstruct
    private void init() {
        cities = dao.all();
    }

    public List<City> getCities() {
        return cities;
    }
    public City getCity() {
        return city;
    }

    public String detail(int id) {
        city = dao.find(id);
        return "detail";
    }
}
