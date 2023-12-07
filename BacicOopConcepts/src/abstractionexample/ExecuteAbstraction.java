package abstractionexample;
class Common implements UsingInterface{
    @Override
    public void Sound(){
        System.out.println("Different Sounds.");
    }
}
public class ExecuteAbstraction {
    public static void main(String[] args){
        Common c = new Common();
        c.Sound();
    }
}
