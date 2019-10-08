public class Square{
    boolean isShip;
    private int xPos;
    private int yPos;
    private String data = "*";
    Square(int x, int y){
        xPos = x;
        yPos = y;
    }

    public void emptySpace(){
        data = "*";
    }

    public String getData(){
        return data;
    }

    public void setData(String newData){
        data = newData;
    }
} 