import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ElectronicManaget electronicManaget = new ElectronicManaget();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn là ai");
        System.out.println("1. Admin");
        System.out.println("2. khách hang");
        int choices=scanner.nextInt();
        scanner.nextLine();
        switch (choices){
            case 1:{

                int choice;
                do {

                    menuAdmin();
                    choice = scanner.nextInt();
                    switch (choice){
                        case 1:{
                            electronicManaget.addElectronic();
                            break;
                        }
                        case 2:{
                            electronicManaget.showElectronic();
                            break;
                        }
                        case 3:{
                            electronicManaget.removeElectronic();
                            break;
                        }
                        case 4:{
                            electronicManaget.repairElectronic();
                            break;
                        }
                        case 5:{
                            electronicManaget.sortByPrice();
                            System.out.println("Danh sách sản phẩm sau khi sắp xếp là:");
                            electronicManaget.showElectronic();
                            break;
                        }
                        case 6:{
                            electronicManaget.findMaxPrice();
                            break;
                        }
                        case 7:{
                            electronicManaget.findElectronicById();
                            break;

                        }
                        case 8:{
                            electronicManaget.writeToFile();
                            break;
                        }
                        case 9:{
                            electronicManaget.readToFile();
                            break;
                        }
                        case 10:{
                            electronicManaget.statiscial();
                            break;
                        }
                        case 0:{
                            System.out.println("Tạm biệt");

                            break;
                        }
                        default:
                            System.out.println("Vui lòng nhập đúng chức năng");
                            break;


                    }

                } while (choice != 0);
            }
            case 2:{
                int choice;
                do {
                    menuKhachHang();
                    choice=scanner.nextInt();
                    switch (choice){
                        case 1:{
                            electronicManaget.showElectronic();
                            break;
                        }
                        case 2:{
                            electronicManaget.sortByPrice();
                            break;
                        }
                        case 3:{
                            electronicManaget.findMaxPrice();
                            break;
                        }
                        case 4:{
                            electronicManaget.findElectronicById();
                            break;
                        }
                        case 5:{
                            electronicManaget.statiscial();
                            break;
                        }
                    }
                } while (choice!=0);
            }
            break;
        }

    }

    private static void menuAdmin() {
        System.out.println("---------------------------------------------------");
        System.out.println("|       **    Quản lý đồ gia dụng     **          |");
        System.out.println("|-------------------------------------------------|");
        System.out.println("| Nhập lựa chọn của bạn :                         |");
        System.out.println("| 1. Nhập thông tin của từng loại sản phẩm        |");
        System.out.println("| 2.Hiển thị thông tin của sản phẩm trong cửa hàng|");
        System.out.println("| 3. Xóa thông tin sản phẩm                       |");
        System.out.println("| 4. Chỉnh sửa thông tin sản phẩm                 |");
        System.out.println("| 5. Sắp xếp giá sản phẩm                         |");
        System.out.println("| 6. Tìm sản phẩm có giá cao nhất                 |");
        System.out.println("| 7.Tìm kiếm sản phẩm theo mã                     |");
        System.out.println("| 8.Ghi thông tin sản phẩm                        |");
        System.out.println("| 9.Đọc file                                      |");
        System.out.println("| 10.Tìm ra có bao nhiêu sản phẩm ở các hãng      |");

    }
    private static void menuKhachHang(){
        System.out.println("---------------------------------------------------");
        System.out.println("| ** Chào mừng đến với cửa hàng của OPG Twyler ** |");
        System.out.println("|-------------------------------------------------|");
        System.out.println("| 1.Hiển thị thông tin của sản phẩm trong cửa hàng|");
        System.out.println("| 2. Sắp xếp giá sản phẩm                         |");
        System.out.println("| 3. Tìm sản phẩm có giá cao nhất                 |");
        System.out.println("| 4.Tìm kiếm sản phẩm theo mã                     |");
        System.out.println("| 5 .Tìm ra có bao nhiêu sản phẩm ở các hãng      |");
    }

}

