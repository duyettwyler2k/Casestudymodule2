import java.io.Serializable;
import java.util.Scanner;

public class Electronic implements Serializable {
  private int id;
  private String name;
  private double price;
  private String produce;
  private String color;



  public Electronic() {
  }

  public Electronic(int id, String name, double price, String produce, String color) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.produce = produce;
    this.color = color;

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getProduce() {
    return produce;
  }

  public void setProduce(String produce) {
    this.produce = produce;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void inputInfoElectronic(){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Nhập mã sản phẩm :");
    this.id=scanner.nextInt();
    scanner.nextLine();
    System.out.println("Nhập tên sản phẩm:");
    this.name=scanner.nextLine();
    System.out.println("Nhập giá tiền sản phẩm:");
    this.price=scanner.nextDouble();
    scanner.nextLine();
    System.out.println("Nhập nhà sản xuất của sản phẩm:");
    this.produce=scanner.nextLine();
    System.out.println("Nhập màu sắc sản phẩm:");
    this.color=scanner.nextLine();

  }
  public void showInFoElectronic(){
    System.out.printf("Mã sản phẩm là: %s, Tên sản phẩm là: %s, Giá tiền sản phẩm là: %s ,Nhà sản xuất là: %S,Màu sản phẩm là :%s \n",id,name,price,produce,color);
  }

}

