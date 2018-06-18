import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> list= new ArrayList<Book>();
        Scanner scn =new Scanner(System.in);
        boolean flag =true;
        while(flag){
            System.out.println("1.新增書籍");
            System.out.println("2.顯示目前的書籍");
            System.out.println("3.尋找書籍");
            System.out.println("4.結束");
            int a =scn.nextInt();
            switch (a){
                case 1:
                    System.out.println("請設置書籍資訊");
                    list.add(new Book(scn.next(),scn.next(),scn.next(),scn.next(),scn.nextInt()));
                    break;
                case 2:
                    for(int i=0 ; i<list.size() ; i++){
                        Book books = list.get(i);
                        books.showAll();
                    }
                    break;
                case 3:
                    System.out.println("輸入書名或ISBN碼");
                    for(int i =0 ; i<list.size() ; i++) {
                        Book books =(Book)list.get(i);
                        if (books.getCategory().equals(scn.next())){
                            books.showAll();
                        }
                    }
                    break;
                case 4:
                    flag =false;
                    System.out.println("謝謝您的使用!");
                    break;
            }
        }
    }
}
