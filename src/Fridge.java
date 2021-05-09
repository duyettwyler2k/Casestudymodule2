import java.util.Scanner;

public class Fridge extends Electronic{
    private int door;
    public Fridge(){}

    public Fridge(int door) {
        this.door = door;
    }

    public Fridge(int id, String name, double price, String produce, String color, int door) {
        super(id, name, price, produce, color);
        this.door = door;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }
    public void inputInFoFridge(){
        super.inputInfoElectronic();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Tủ lạnh có mấy cánh:");
        this.door=scanner.nextInt();
    }
    public void showInFoElectronic(){
        super.showInFoElectronic();
        System.out.printf("Tủ lạnh có : %s",this.door+" cánh \n");
    }
}
