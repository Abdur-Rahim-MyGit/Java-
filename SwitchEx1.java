public class SwitchEx1 {
    public static void main(String[] args) {
        // Saturday == 6 (its My Birth Day)

        int birth=6;
        switch (birth) {
            case 1:
                System.out.println("Mon Day");
                break; 
            case 2:
                System.out.println("Tues Day");
                break;
            case 3:
                System.out.println("Wed Day");
                break;
            case 4:
                System.out.println("Thurs Day");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong Option");
                break;
        }
    }
}
