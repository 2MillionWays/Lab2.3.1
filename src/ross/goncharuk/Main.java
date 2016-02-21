package ross.goncharuk;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MyWindow window1 = new MyWindow(10.5,3.3,1,"black",false);
        MyWindow window2 = new MyWindow(5.5,3.4,2,"white",false);
        MyWindow window3 = new MyWindow(6.5,1.4,3,"green",false);
        MyWindow window4 = new MyWindow(7.5,5.4,1,"grey",false);
        MyWindow window5 = new MyWindow(8.5,2.4,1,"blue",false);

        MyWindow window0 = new MyWindow();

        MyWindow[] myWindows = {window1,window2,window3,window4,window5};

        System.out.println(myWindows[0].printFields());
        System.out.println(myWindows[1].printFields());
        System.out.println(myWindows[2].printFields());
        System.out.println(myWindows[3].printFields());
        System.out.println(myWindows[4].printFields());

    }
}
