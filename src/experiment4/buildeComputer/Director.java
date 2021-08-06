package experiment4.buildeComputer;

public class Director {
    public Builder builder ;
    public Director(Builder builder){
        this.builder = builder;
    }

    public Computer construct(){
        builder.buildComputer();
        return builder.getResult();
    }
}
