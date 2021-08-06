package experiment5.share;

import java.util.Hashtable;

public class Share {

    private String s;

    public Share(String s) {
        this.s = s;
    }


    public void display(Color color, Size size) {
        System.out.println("字符：" + s + "\n颜色：" + color.getS() +
                "\n大小：" + size.getS());
    }
}

class Color {
    private String s;

    public Color(String s) {
        this.s = s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }
}

class Size {
    private String s;

    public Size(String s) {
        this.s = s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }
}


class ShareFactory {
    private Hashtable ht;

    public ShareFactory() {
        ht = new Hashtable();
    }

    public Share getShare(String s) {
        if (ht.containsKey(s)) {
            return (Share) ht.get(s);
        } else {
            Share share = new Share(s);
            ht.put(s, share);
            return share;
        }
    }
}

class Client{
    public static void main(String[] args) {
        ShareFactory shareFactory = new ShareFactory();
        Share share1 = shareFactory.getShare("java");
        Share share2 = shareFactory.getShare("java");
        System.out.println("share1与share2是否相等:");
        System.out.println(share1 == share2);

        share1.display(new Color("black"),new Size("200"));
        share1.display(new Color("red"),new Size("500"));
        share2.display(new Color("green"),new Size("20"));
        share2.display(new Color("yellow"),new Size("40"));
    }
}
