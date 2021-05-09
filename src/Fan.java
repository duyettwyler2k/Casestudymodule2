import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fan extends Electronic{
    private double duongkinh;
    private String congsuat;
    public Fan(){}

    public Fan(double duongkinh, String congsuat) {
        this.duongkinh = duongkinh;
        this.congsuat = congsuat;
    }

    public Fan(int id, String name, double price, String produce, String color, double duongkinh, String congsuat) {
        super(id, name, price, produce, color);
        this.duongkinh = duongkinh;
        this.congsuat = congsuat;
    }
    public void inputInFoFan(){
        super.inputInfoElectronic();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập đường kính của quạt:");
        this.duongkinh=scanner.nextDouble();
        System.out.println("Nhập công suất quạt (VD:120W)");
        while (true){
            this.congsuat=scanner.nextLine();
            String regex="[0-10000][W]";
            Pattern pattern=Pattern.compile(regex);
            Matcher matcher = pattern.matcher(congsuat);
            if (matcher.find()){
                break;
            } else {
                System.out.println("Nhập theo mẫu xxxW");
            }
        }

    }
    public void showInFoElectronic(){
        super.showInFoElectronic();
        System.out.printf("Đường kính của quạt là: %s, Công suất là: %s \n",this.duongkinh,this.congsuat);
    }
}
