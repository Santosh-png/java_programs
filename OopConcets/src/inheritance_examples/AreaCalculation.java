package inheritance_examples;
//class to calculate area of rectangle
class Rectangle{
    int first_parameter,second_parameter; //instance variables declaration
    Rectangle(int x, int y){ // constructor (Rectangle)
        first_parameter=x; //value assignment
        second_parameter=y; //value assignment
    }//closing of constructor
    void areaOfRectangle(){ // no - returning type function
        int area = first_parameter*second_parameter; //area calculation
        System.out.println("Area of Rectangle: "+area); //result out statement
    } //closing of areaOfRectangle method/function
} //closing of class

class Triangle extends Rectangle{
    Triangle(int u, int v){
        super(u,v);
    }
    void areaOfTriangle(){
        int area = (first_parameter*second_parameter)/2;
        System.out.println("Area of Triangle: "+area);
    }
}

public class AreaCalculation {
    public AreaCalculation(){
        Triangle t=new Triangle(5,4);
        t.areaOfRectangle();
        t.areaOfTriangle();
    }
}
