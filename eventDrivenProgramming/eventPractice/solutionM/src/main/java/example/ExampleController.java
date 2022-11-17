package example;

public class ExampleController
{
    private String myString;


    public ExampleController(){
        myString = "this is a string";
    }

    public void setString(String ss){
        myString = ss;
    }

    @Override
    public String toString()
    {
        return myString;
    }

}