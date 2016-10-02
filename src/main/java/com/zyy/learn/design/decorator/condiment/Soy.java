package com.zyy.learn.design.decorator.condiment;

import com.zyy.learn.design.decorator.Beverage;
import com.zyy.learn.design.decorator.size.SizeInterface;

/**
 * Created by zhouyinyan on 16/10/2.
 */
public class Soy extends CondimentDecrotor {
    Beverage wrappered;

    public Soy(Beverage wrappered){
        this.wrappered = wrappered;
    }

    @Override
    public String getDescrption() {
        return wrappered.getDescrption() + " with soy";
    }

    @Override
    public double cost() {
        double cost = wrappered.cost() ;
        if(getSize() == SizeInterface.SizeEnum.TALL) {
            cost +=  0.34;
        }else if(getSize() == SizeInterface.SizeEnum.GRANDE){
            cost +=  0.43;
        }else if(getSize() == SizeInterface.SizeEnum.VENTI){
            cost +=  0.53;
        }
        return cost;
    }
}
