package com.mj.minhajlib.spotfoodcenter.modal;

/**
 * Created by Minhaj lib on 7/18/2017.
 */

public class PizzaModal {

    private String pizzaName,pizzaDesc,pizzaPriceS,pizzaPriceM,pizzaPriceL;

    public PizzaModal(String pizzaName,String pizzaDesc,String pizzaPriceS,String pizzaPriceM,String pizzaPriceL){

        setPizzaName(pizzaName);
        setPizzaDesc(pizzaDesc);
        setPizzaPriceS(pizzaPriceS);
        setPizzaPriceM(pizzaPriceM);
        setPizzaPriceL(pizzaPriceL);
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String getPizzaDesc() {
        return pizzaDesc;
    }

    public void setPizzaDesc(String pizzaDesc) {
        this.pizzaDesc = pizzaDesc;
    }

    public String getPizzaPriceS() {
        return pizzaPriceS;
    }

    public void setPizzaPriceS(String pizzaPriceS) {
        this.pizzaPriceS = pizzaPriceS;
    }

    public String getPizzaPriceM() {
        return pizzaPriceM;
    }

    public void setPizzaPriceM(String pizzaPriceM) {
        this.pizzaPriceM = pizzaPriceM;
    }

    public String getPizzaPriceL() {
        return pizzaPriceL;
    }

    public void setPizzaPriceL(String pizzaPriceL) {
        this.pizzaPriceL = pizzaPriceL;
    }
}