package experiment7.army;

public class Officer {
    private Officer successor;

    public void setSuccessor(Officer successor) {
        this.successor = successor;
    }

    public Officer getSuccessor() {
        return successor;
    }

    public void request(Mission mission) {
    }

}

class Banzhang extends Officer {
    public void request(Mission mission) {
        if (mission.getNum() < 10) {
            System.out.println("班长处理命令");
        } else {
            super.getSuccessor().request(mission);
        }

    }
}

class Paizhang extends Officer {
    public void request(Mission mission) {
        if (10 <= mission.getNum() && mission.getNum() < 50) {
            System.out.println("排长处理命令");
        } else {
            super.getSuccessor().request(mission);
        }

    }
}

class Yingzhang extends Officer {
    public void request(Mission mission) {
        if (50 <= mission.getNum() && mission.getNum() < 200) {
            System.out.println("营长处理命令");
        } else {
            System.out.println("开会处理");
        }

    }
}


class Mission {
    private int num;

    public Mission(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}

class Client {

    public static void main(String[] args) {

        //设置职责链
        Officer banzhang = new Banzhang();
        Officer paizhang = new Paizhang();
        Officer yingzhang = new Yingzhang();
        banzhang.setSuccessor(paizhang);
        paizhang.setSuccessor(yingzhang);

        //改变命令人数，交由职责链处理
        Mission mission = new Mission(5);
        banzhang.request(mission);
        mission = new Mission(30);
        banzhang.request(mission);
        mission = new Mission(300);
        banzhang.request(mission);
    }
}
