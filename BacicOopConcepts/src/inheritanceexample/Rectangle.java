package inheritanceexample;

public class Rectangle {
    int first_value,second_value;
    Rectangle(int x,int y){
        first_value = x;
        second_value = y;
    }
    void areaOfRectangle(){
        int area = first_value * second_value;
        System.out.println("The area of rectangle is : "+area);
    }
}
