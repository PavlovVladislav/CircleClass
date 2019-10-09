/**
 *  Create class Circle
 * @author Pavlov Vladislav
 *  */
public class Circle{

    /**Radius circle*/
    public double r;

    /**Constructor without parameters*/
    Circle(){
        r = 4;
    }

    /**Constructor with parameters*/
    Circle(double Radius){
        r = Radius;
    }

    /**Calculation perimeter circle without arguments*/
    public double Perimetr(){
        double P = 2 * Math.PI * r;
        return P;
    }

    /**Calculation perimeter circle with arguments*/
    public double Perimetr(double r){
        double P = 2 * Math.PI * r;
        return P;
    }

    /**Calculation square circle without arguments*/
    public double Square(){
        double S = Math.PI * Math.pow(r, 2);
        return S;
    }

    /**Calculation square circle with arguments*/
    public double Square(double r){
        double S = Math.PI * Math.pow(r, 2);
        return S;
    }

    public void show (){
        System.out.println("Значение периметра = " + Perimetr() + " Значение площи = " + Square());
    }

}