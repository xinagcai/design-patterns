package experiment3.Meditor;


public class Mediator {
    private Button button;
    private List list;
    private ComboBox comboBox;
    private TextBox textBox;
    private Label label;

   public void change(Component component){
       if(component ==button){
           list.update();
           comboBox.update();
           textBox.update();
           label.update();
       }else if (component == list){
           comboBox.update();
           textBox.update();
       }else if (component == comboBox){
           list.update();
           textBox.update();
       }else if (component == textBox){
           list.update();
           comboBox.update();
       }
   }
}
