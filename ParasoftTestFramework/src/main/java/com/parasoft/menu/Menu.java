package com.parasoft.menu;

import java.security.Provider;

public class Menu {

    public static AboutUsMenu aboutUsMenu(){
        AboutUsMenu aboutUsMenu = new AboutUsMenu();
        return aboutUsMenu;
    }

    public static ServicesMenu servicesMenu(){
        ServicesMenu servicesMenu = new ServicesMenu();
        return servicesMenu;
    }

    public static ProductsMenu productsMenu(){
        ProductsMenu productsMenu = new ProductsMenu();
        return productsMenu;
    }

    public static LocationsMenu locationsMenu(){
        LocationsMenu locationsMenu = new LocationsMenu();
        return locationsMenu;
    }

    public static AdminPageMenu adminPageMenu(){
        AdminPageMenu adminPageMenu = new AdminPageMenu();
        return adminPageMenu;
    }
}
