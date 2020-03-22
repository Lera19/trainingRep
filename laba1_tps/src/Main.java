import com.sun.org.apache.xml.internal.utils.StringToIntTable;

import java.util.*;
import java.util.stream.*;

import static java.lang.Integer.parseInt;


class Main{

    public static void main(String[] args) {

        // Список имен, номеров телефонов и адресов электронной почты.
        ArrayList<NamePhonel> myList = new ArrayList<>();

        myList.add(new NamePhonel("Larry", "5555555"));
        myList.add(new NamePhonel("James", "5554444"));
        myList.add(new NamePhonel("Mary", "5553333"));

        myList.stream().forEach((a)->{System.out.println(a.name+ " " +a.phonenum);});
        System.out.println();

        // Отобразить только имена и номера телефонов на новый поток данных.

        Optional<NamePhonel> minVal = myList.stream().min(Comparator.comparing(NamePhonel::getPhoneNum));
        if(minVal.isPresent())
            System.out.println("min:" + minVal.get().getPhoneNum());

        Optional<NamePhonel> maxVal = myList.stream().max(Comparator.comparing(NamePhonel::getPhoneNum));
        if(maxVal.isPresent())
            System.out.println("max"+ maxVal.get().getPhoneNum());

        Stream<NamePhonel> sortedStream = myList.stream().sorted(Comparator.comparing(NamePhonel::getPhoneNum).reversed()).filter((n) -> (parseInt(n.getPhoneNum()) % 2) == 1);;
        Iterator<NamePhonel> itr = sortedStream.iterator();
        while (itr.hasNext())
        {
            NamePhonel obj = itr.next();

            System.out.println(obj.name + " " + obj.phonenum );
        }
        System.out.println();

        Stream<NamePhonel> sortedStream1 = myList.stream().sorted(Comparator.comparing(NamePhonel::getPhoneNum).reversed());
        Iterator<NamePhonel> itr1 = sortedStream1.iterator();
        while (itr1.hasNext())
        {
            NamePhonel obj = itr1.next();

            System.out.println(obj.name + " " + obj.phonenum );
        }
        System.out.println();

        Scanner in=new Scanner(System.in);

        System.out.println();
        System.out.println("Input:");
        int num=in.nextInt();
        in.close();

        Stream<NamePhonel> myStream = myList.stream();
        Iterator<NamePhonel> itr2 = myStream.iterator();
        while (itr2.hasNext())
        {
            NamePhonel obj=itr2.next();
            if(

                    parseInt(obj.getPhoneNum()) > num)
            {
                System.out.println(obj.name + " " + obj.phonenum );
            }
            System.out.println();
        }


    }
}
