package experiment7.state;

public class Game {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void play(int score, String result) {
        state.display();
        state.play(score, result);
    }

    public void doubleScore(int score, String result) {
        state.display();
        state.doubleScore(score, result);
    }

    public void changeCards() {
        state.display();
        state.changeCards();
    }

    public void peekCards() {
        state.display();
        state.peekCards();
    }
}

abstract class State {

    protected Game game;
    protected int point;
    protected String grade;

    public void display() {
        System.out.println(grade + ":");
    }

    public abstract void play(int score, String result);

    public abstract void doubleScore(int score, String result);

    public abstract void changeCards();

    public abstract void peekCards();

    public abstract void check();
}

class PrimaryState extends State {

    public PrimaryState(Game game) {
        this.point = 0;
        this.grade = "入门级";
        this.game = game;
    }

    public PrimaryState(State state) {
        this.point = state.point;
        this.grade = "入门级";
        this.game = state.game;
    }

    @Override
    public void play(int score, String result) {
        if (result.equals("win")) {
            this.point += score;
            System.out.println("获胜，增加积分" + score + "当前积分" + point);
        } else {
            this.point -= score;
            System.out.println("失利，减少积分" + score + "当前积分" + point);
        }
        check();
    }

    @Override
    public void doubleScore(int score, String result) {
        System.out.println("暂不支持该功能");
    }

    @Override
    public void changeCards() {
        System.out.println("暂不支持该功能");
    }

    @Override
    public void peekCards() {
        System.out.println("暂不支持该功能");
    }

    @Override
    public void check() {
        if (point >= 10000)
            this.game.setState(new FinalState(this));
        else if (point >= 5000)
            this.game.setState(new ProfessionState(this));
        else if (point >= 1000)
            this.game.setState(new SecondaryState(this));
    }
}

class SecondaryState extends State {

    public SecondaryState(Game game) {
        this.point = 1000;
        this.grade = "熟练级";
        this.game = game;
    }

    public SecondaryState(State state) {
        this.point = state.point;
        this.grade = "熟练级";
        this.game = state.game;
    }

    @Override
    public void play(int score, String result) {
        if (result.equals("win")) {
            this.point += score;
            System.out.println("获胜，增加积分" + score + "当前积分" + point);
        } else {
            this.point -= score;
            System.out.println("失利，减少积分" + score + "当前积分" + point);
        }
        check();
    }

    @Override
    public void doubleScore(int score, String result) {
        if (result.equals("win")) {
            score *= 2;
            this.point += score;
            System.out.println("获胜，增加双倍积分" + score + "当前积分" + point);
        } else {
            score *= 2;
            this.point -= score;
            System.out.println("失利，减少双倍积分" + score + "当前积分" + point);
        }
        check();
    }

    @Override
    public void changeCards() {
        System.out.println("暂不支持该功能");
    }

    @Override
    public void peekCards() {
        System.out.println("暂不支持该功能");
    }

    @Override
    public void check() {
        if (point >= 10000)
            this.game.setState(new FinalState(this));
        else if (point >= 5000)
            this.game.setState(new ProfessionState(this));
        else if (point >= 1000)
            this.game.setState(new SecondaryState(this));
    }
}

class ProfessionState extends State {

    public ProfessionState(Game game) {
        this.point = 0;
        this.grade = "高手级";
        this.game = game;
    }

    public ProfessionState(State state) {
        this.point = state.point;
        this.grade = "高手级";
        this.game = state.game;
    }

    @Override
    public void play(int score, String result) {
        if (result.equals("win")) {
            this.point += score;
            System.out.println("获胜，增加积分" + score + "当前积分" + point);
        } else {
            this.point -= score;
            System.out.println("失利，减少积分" + score + "当前积分" + point);
        }
        check();
    }

    @Override
    public void doubleScore(int score, String result) {
        if (result.equals("win")) {
            score *= 2;
            this.point += score;
            System.out.println("获胜，增加双倍积分" + score + "当前积分" + point);
        } else {
            score *= 2;
            this.point -= score;
            System.out.println("失利，减少双倍积分" + score + "当前积分" + point);
        }
        check();
    }

    @Override
    public void changeCards() {
        System.out.println("使用换牌功能");
    }

    @Override
    public void peekCards() {
        System.out.println("暂不支持该功能");
    }

    @Override
    public void check() {
        if (point >= 10000)
            this.game.setState(new FinalState(this));
        else if (point >= 5000)
            this.game.setState(new ProfessionState(this));
        else if (point >= 1000)
            this.game.setState(new SecondaryState(this));
    }
}

class FinalState extends State {

    public FinalState(Game game) {
        this.point = 0;
        this.grade = "骨灰级";
        this.game = game;
    }

    public FinalState(State state) {
        this.point = state.point;
        this.grade = "骨灰级";
        this.game = state.game;
    }

    @Override
    public void play(int score, String result) {
        if (result.equals("win")) {
            this.point += score;
            System.out.println("获胜，增加积分" + score + "当前积分" + point);
        } else {
            this.point -= score;
            System.out.println("失利，减少积分" + score + "当前积分" + point);
        }
        check();
    }

    @Override
    public void doubleScore(int score, String result) {
        if (result.equals("win")) {
            score *= 2;
            this.point += score;
            System.out.println("获胜，增加双倍积分" + score + "当前积分" + point);
        } else {
            score *= 2;
            this.point -= score;
            System.out.println("失利，减少双倍积分" + score + "当前积分" + point);
        }
        check();
    }

    @Override
    public void changeCards() {
        System.out.println("使用换牌功能");
    }

    @Override
    public void peekCards() {
        System.out.println("使用他人的牌功能");
    }

    @Override
    public void check() {
        if (point >= 10000)
            this.game.setState(new FinalState(this));
        else if (point >= 5000)
            this.game.setState(new ProfessionState(this));
        else if (point >= 1000)
            this.game.setState(new SecondaryState(this));
    }
}

class Client {
    public static void main(String[] args) {
        Game game = new Game();
        game.setState(new PrimaryState(game));
        game.play(400,"win");
        game.doubleScore(200,"win");

        game.play(1000,"win");
        game.changeCards();
        game.doubleScore(3000,"win");

        game.changeCards();
        game.peekCards();
        game.doubleScore(5000,"win");
        game.peekCards();

        game.doubleScore(5000,"lose");
        game.peekCards();

    }

}

