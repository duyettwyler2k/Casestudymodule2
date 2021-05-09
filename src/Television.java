import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Television extends Electronic {
    private int inch;
    private String dophangiai;
    Television(){}

    public Television(int inch, String dophangiai) {
        this.inch = inch;
        this.dophangiai = dophangiai;
    }

    public Television(int id, String name, double price, String produce, String color, int inch, String dophangiai) {
        super(id, name, price, produce, color);
        this.inch = inch;
        this.dophangiai = dophangiai;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    public String getDophangiai() {
        return dophangiai;
    }

    public void setDophangiai(String dophangiai) {
        this.dophangiai = dophangiai;
    }
    public void inputInFoTelevision(){
        super.inputInfoElectronic();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập inch của TV:");
        this.inch=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập độ phân giải của TV: ví dụ(1020 HD)");
        while (true){
            this.dophangiai=scanner.nextLine();
            String regex="[0-10000][HD]";
            Pattern pattern=Pattern.compile(regex);
            Matcher matcher=pattern.matcher(dophangiai);
            if (matcher.find()){
                break;
            } else {
                System.out.println("Nhập theo dạng xxxx HD");
            }
        }

    }
    public void showInFoElectronic(){
        super.showInFoElectronic();
        System.out.printf("TV có số inch là : %s, Độ phân giải của TV là :%s \n",this.inch,this.dophangiai);
    }
}
