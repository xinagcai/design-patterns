package experiment7.momento;
import java.util.Stack;

public class Chess {
    private int x;
    private int y;

    public Chess(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void restore(ChessMemento chessMemento) {
        this.x = chessMemento.getX();
        this.y = chessMemento.getY();
    }

    public ChessMemento save() {
        return new ChessMemento(x, y);
    }

    public void display() {
        System.out.println("我的位置是：(" + x + "," + y + ")");
    }

}

class ChessMemento {
    private int x;
    private int y;

    public ChessMemento(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
}

class MementoCareTaker {
    private Stack<ChessMemento> chessMementos = new Stack<>();

    public ChessMemento getChessMemento() {
        return chessMementos.pop();
    }

    public void saveChessMemento(ChessMemento chessMemento) {
        chessMementos.push(chessMemento);
    }
}

class Client {
    public static void main(String[] args) {
        Chess chess = new Chess(3, 4);
        chess.display();
        MementoCareTaker mc = new MementoCareTaker();
        mc.saveChessMemento(chess.save());
        chess.setX(6);
        chess.display();
        mc.saveChessMemento(chess.save());
        chess.setY(11);
        chess.display();
        mc.saveChessMemento(chess.save());
        System.out.println("我悔棋了");
        chess.restore(mc.getChessMemento());
        chess.display();
        chess.restore(mc.getChessMemento());
        chess.display();
        chess.restore(mc.getChessMemento());
        chess.display();


    }
}

