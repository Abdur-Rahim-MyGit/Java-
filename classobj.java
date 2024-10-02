
public class classobj{
    public static void main(String[] args) {
        asection rahim1=new asection();
        tvs souban=new tvs();
        System.out.println(rahim1.roll + " " + rahim1.name + souban.regid);
        System.out.println(souban.regid + " " + souban.address);
    }
}
class dsection{
    int roll=100;
    String name="souban";
}
class asection{
    int roll=101;
    String name="rahim";
}
class tvs{
    int regid=8123;
    String address="chennai";
}
class Lambo{
    int regid=8122;
    String owner="afzal sir";
}
