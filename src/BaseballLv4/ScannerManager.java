package BaseballLv4;

import java.util.Scanner;

public class ScannerManager {
    /*
    여기에는 무슨 필드가 필요한가
    다른 곳에서 인스턴스 생성x
    String? Scanner;
     */
    private Scanner scanner;// Scanner타입 변수
    private String num;//scannerManage()로 받을 값


    public String getNum() {
        return num;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void scannerManage(){
        scanner= new Scanner(System.in);
        this.num=scanner.nextLine();
    }
}
