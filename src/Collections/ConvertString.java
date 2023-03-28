package Collections;

import Utils.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertString {
    public static void main(String[] args) throws ParseException {
        ConvertString convert=new ConvertString();
        convert.date(Utils.scanner().next());
    }

    public void date(String data1) throws ParseException {
        SimpleDateFormat format1= new SimpleDateFormat("dd/MM/yyyy" );
        Date date=format1.parse(data1);
        System.out.println(date);
    }
}

