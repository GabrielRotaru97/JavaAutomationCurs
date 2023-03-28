package JavaBasicPart2;

import Utils.Utils;

public class FootballMatchReports {
    public static void main(String[] args) {
        FootballMatchReports matchReports = new FootballMatchReports();
        matchReports.players(Utils.scanner().nextInt());
    }
    public void players(int nr){
        switch (nr) {
            case 1:
                System.out.println("goalie");
                break;
            case 2:
                System.out.println("left back");
                break;
            case 3:
            case 4:
                System.out.println("center back");
                break;
            case 5:
                System.out.println("right back");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("midfielder");
                break;
            case 9:
                System.out.println("left wing");
                break;
            case 10:
                System.out.println("striker");
                break;
            case 11:
                System.out.println("right wing");
                break;
            default:
                throw new IllegalArgumentException("numarul nu se gaseste in echipa");
        }

    }
}
