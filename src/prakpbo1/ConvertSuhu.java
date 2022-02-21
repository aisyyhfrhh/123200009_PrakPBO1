/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakpbo1;

/**
 *
 * @author asus
 */
public class ConvertSuhu {
    
    double Celcius;

    public ConvertSuhu(double Celcius) {
        this.Celcius = Celcius;
    }
    
    double Fahrenheit(){
        return (Celcius*1.8+32);
    }
    double Reamur(){
        return (Celcius*0.8);
    }
    double Kelvin(){
        return (Celcius+273.15);
    }
    

}
