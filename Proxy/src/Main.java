import java.util.LinkedList;

import Proxy_model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");
        Image image3 = new ProxyImage("HiRes_10MB_Photo3");
        Image image4 = new ProxyImage("HiRes_10MB_Photo4");
        Image image5 = new ProxyImage("HiRes_10MB_Photo5");

        LinkedList<Image> ls = new LinkedList<Image>();
        ls.addLast(image1);
        ls.addLast(image2);
        ls.addLast(image3);
        ls.addLast(image4);
        ls.addLast(image5);

        System.out.println("Album containing the following photos: \n");
        for (int i = 0; i < ls.size(); i++) {
            System.out.println(ls.get(i).showData());
        }

        boolean cont = true;
        while (cont) {
            System.out.println("Choose which picture to inspect 1-" + ls.size() + " (0 to exit)");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if(choice == 0){
                cont = false;
            }else{
                ls.get(choice - 1).displayImage();
            }
        }
    }
}