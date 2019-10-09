public class Elipse extends Circle{

    /**Radius Elipse*/
    public double r2;

    /**Constructor without parameters*/
    Elipse(){
        r2 = 10;
    }

    /**Constructor with parameters*/
    Elipse(double Radius, double Radius2){
        r = Radius;
        r2 = Radius2;
    }

    /**Calculation perimeter Elipse without arguments*/
    public double Perimetr(){
        double P = 2 * Math.PI * Math.sqrt((Math.pow(r, 2)+Math.pow(r2, 2))/2);
        return P;
    }

    /**Calculation perimeter Elipse with arguments*/
    public double Perimetr(double r, double r2){
        double P = 2 * Math.PI * Math.sqrt((Math.pow(r, 2)+Math.pow(r2, 2))/2);
        return P;
    }

    /**Calculation square Elipse without arguments*/
    public double Square(){
        double S = Math.PI * r * r2;
        return S;
    }

    /**Calculation square Elipse with arguments*/
    public double Square(double r, double r2){
        double S = Math.PI * r * r2;
        return S;
    }

}
