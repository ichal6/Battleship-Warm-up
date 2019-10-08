import java.util.ArrayList;

public class Ocean{
    ArrayList<ArrayList<Square>> board = new ArrayList();
    int maximumVer, maximumHor;

    Ocean(){
        
    }

    public void createOcean(int maxVer, int maxHor){
        maximumVer = maxVer;
        maximumHor = maxHor;
        for(int indexVer = 0; indexVer < maxVer; indexVer++){
                ArrayList<Square> list = new ArrayList<>();
                board.add(list);
            for(int indexHor = 0; indexHor < maxHor; indexHor++){
                Square squareNew = new Square(indexVer, indexHor);
                board.get(indexVer).add(squareNew);
            }
        }
    }

    public void addDataToOcean(int x, int y){
        board.get(x).get(y).emptySpace();
    }

    public void printOcean(){
        for(int indexVer = 0; indexVer < maximumVer; indexVer++){
            for(int indexHor = 0; indexHor < maximumHor; indexHor++){
                String data = board.get(indexVer).get(indexHor).getData();
                System.out.print(data);
            }
            System.out.print("\n");
        }
    }

    public void addShip(int PosX, int PosY, int length, boolean horizontal){
        if (horizontal){
            for(int index = 0; index < length; index++, PosX++){
                board.get(PosX).get(PosY).setData("X");
            }
        }
        else{
            for(int index = 0; index < length; index++, PosY++){
                board.get(PosX).get(PosY).setData("X");
            }
        }
        
    }

}