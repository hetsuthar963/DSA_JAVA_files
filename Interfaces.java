public class Interfaces{
    public static void main(String args[]){
       Queen q = new Queen();
       q.moves(); 
       King k = new King();
       k.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Up, Down, Right, Left, Diagonal (in all directions)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Up, Down, Right, Left");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("Up, Down, Right, Left, Diagonal (Only 1 step)");
    }
}