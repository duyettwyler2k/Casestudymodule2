import java.io.*;
import java.util.*;

public class ElectronicManaget {
    List<Electronic> electronicList = new ArrayList<>();

    //thêm sản phẩm
    public void addElectronic() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn nhập thông tin của đồ gia dụng nào?");
        System.out.println("1. Quạt");
        System.out.println("2. Ti Vi");
        System.out.println("3. Tủ lạnh");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1: {
                Fan fan = new Fan();
                fan.inputInFoFan();
                electronicList.add(fan);
                break;
            }
            case 2: {
                Television television = new Television();
                television.inputInFoTelevision();
                electronicList.add(television);
                break;
            }
            case 3: {
                Fridge fridge = new Fridge();
                fridge.inputInFoFridge();
                electronicList.add(fridge);
                break;
            }
        }

    }

    //hiển thị thông tin tất cả đ
    public void showElectronic() {
        for (Electronic electronic : electronicList) {
            electronic.showInFoElectronic();
        }
    }

    //xóa thông tin sản phẩm
    public void removeElectronic() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm bạn muốn xóa");
        int id = scanner.nextInt();
        for (Electronic electronic : electronicList) {
            if (electronic.getId() == id) {
                electronicList.remove(electronic);
                break;


            } else System.out.println("Không tìm thấy sản phẩm có mã id này");

        }
    }

    //chỉnh sửa sản phẩm khi biết id
    public void repairElectronic() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm bạn muốn sửa");
        int id = scanner.nextInt();
        for (Electronic electronic : electronicList) {
            if (electronic.getId() == id) {
                electronic.inputInfoElectronic();
            } else System.out.println("Không tìm thấy sản phẩm có mã id này");
        }
    }

    //sắp xếp sản phẩm theo giá
    public void sortByPrice() {
        for (int i = 0; i < electronicList.size() - 1; i++) {
            for (int j = electronicList.size() - 1; j > i; j--) {
                if (electronicList.get(j).getPrice() > electronicList.get(j - 1).getPrice()) {
                    Collections.swap(electronicList, j, j - 1);
                }
            }
        }
    }

    //tìm kiếm sản phẩm có giá cao nhất
    public void findMaxPrice() {
        double max = 0;
        for (Electronic electronic : electronicList) {
            if (electronic.getPrice() > max) {
                max = electronic.getPrice();
            }
        }
        for (Electronic electronic : electronicList) {
            if (electronic.getPrice() == max) {
                electronic.showInFoElectronic();
            }
        }
    }

    //tim san pham gia thap nhat
    public void findMinPrice() {
        double min = 0;
        for (Electronic electronic : electronicList) {
            if (electronic.getPrice() < min) {
                min = electronic.getPrice();
            }
        }
        for (Electronic electronic : electronicList) {
            if (electronic.getPrice() == min) {
                electronic.showInFoElectronic();
            }
        }
    }

    public void sortById() {
        for (int i = 0; i < electronicList.size() - 1; i++) {
            for (int j = electronicList.size() - 1; j > i; j--) {
                if (electronicList.get(j).getId() > electronicList.get(j - 1).getId()) {
                    Collections.swap(electronicList, j, j - 1);
                }
            }
        }
    }

    //tìm kiếm sản phẩm theo tên dùng tìm kiếm nhị phân
    public void findElectronicById() {
        sortById();
        System.out.println("Nhập id sản phẩm cần tìm");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        int low = 0;
        int high = electronicList.size() - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (electronicList.get(mid).getId() == id) {
                electronicList.get(mid).showInFoElectronic();
                break;
            }
            if (electronicList.get(mid).getId() < id) {
                high = mid - 1;
            }
            if (electronicList.get(mid).getId() > id) {
                low = mid + 1;
            }
        }
    }

    //tim kiem co bao nhieu san pham thuoc hang nao
    public void statiscial() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < electronicList.size(); i++) {
            map.put(electronicList.get(i).getProduce(), 0);
        }
        for (int i = 0; i < electronicList.size(); i++) {
            if (map.containsKey(electronicList.get(i).getProduce())) {
                map.replace(electronicList.get(i).getProduce(), map.get(electronicList.get(i).getProduce()) + 1);
            }
        }
        System.out.println("Số sản phẩm ở các hãng đó là :" + map);
    }

    //ghi file
    public void writeToFile() {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Pham Duyet\\Desktop\\New folder\\test.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(electronicList);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //doc file
    public void readToFile() {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Pham Duyet\\Desktop\\New folder\\test.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            electronicList = (List<Electronic>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (Electronic electronic : electronicList) {
            electronic.showInFoElectronic();
        }
    }

}
