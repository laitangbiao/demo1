package test;

import com.alibaba.fastjson.JSON;

import javax.swing.filechooser.FileSystemView;
import java.io.File;

public class HelloWord {
    public static void main(String[] args) {
        //获取本地桌面路径
        /* FileSystemView fsv = FileSystemView.getFileSystemView();
         File com = fsv.getHomeDirectory();
         String deskPath = com.getPath();
         System.out.println( deskPath );*/

        String code="123456";
        String format = String.format("{\"code\":%s}",code);
        System.out.println(format);


    }
}
