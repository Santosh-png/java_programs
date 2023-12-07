package inheritanceexample;

public class Triangle extends Rectangle{
    Triangle(int u, int v){
        super(u,v);
    }
    void areaOfTriangle(){
        
        float area = ((float)first_value * (float)second_value)/2;
        System.out.println("The area of Triangle is :"+area);
    }
}
