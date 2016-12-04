package Task_1;

public class Main {

    public static void main(String[] args) {
        int[] arraySample = {0,1,2,3,4,5,6,7,8};

        ArraysUtils.findEvenElements(arraySample);
        ArraysUtils.reverse(arraySample);

        User[] usersArray = new User[10];
        usersArray[0] = new User(111111111, "Birgit", "Maider",4500, 10000);
        usersArray[1] = new User(222222222, "Petra", "Szabo", 2920, 5000);
        usersArray[3] = new User(333333333, "David", "Smith",3560,5000);
        usersArray[4] = new User(444444444, "Sam", "Scott", 2500,5200);
        usersArray[5] = new User(222222222, "Petra", "Szabo", 2920, 5000);
        usersArray[6] = new User(555555555, "Jao", "Chi", 2800, 60000);
        usersArray[7] = new User(666666666, "Xiaoly","Chu", 2100,85000);
        usersArray[9] = new User(222222222, "Petra", "Szabo", 2920, 5000);

        UserUtils.uniqueUsers(usersArray);
        UserUtils.usersWithContitionalBalance(usersArray, 5000);
        UserUtils.getUsersId(usersArray);
        UserUtils.paySalaryToUsers(usersArray);
        UserUtils.deleteEmptyUsers(usersArray);
    }
}

