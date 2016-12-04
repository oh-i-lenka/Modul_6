package Task_1;

public class UserUtils {

    static User[] uniqueUsers(User[] users){

        User[] uniqUsersPreview = new User[users.length];
        int k = 0;
        boolean marker = true;
        for (int i=0; i < users.length; i++) {
            marker = true;
            if (users[i]==null){
                continue;
            }
            for (int j = 0; j < k; j++) {
                if (uniqUsersPreview[j].equals(users[i]) == true) {
                    marker = false;
                    break;
                }
            }
            if (marker == true){
                uniqUsersPreview[k] = users[i];
                System.out.println(uniqUsersPreview[k].toString());
                k++;
            }
        }
        User[] uniqueUserResult = new User[k];
        for (int i=0; i< uniqUsersPreview.length; i++){
            if (uniqUsersPreview[i] != null){
                uniqueUserResult[i] = uniqUsersPreview[i];
            } else {
                break;
            }
        }
        return uniqueUserResult;
    }

    static User[] usersWithContitionalBalance(User[] users, int balance){
        int quantityUsersExactBal = 0;
        for (int i = 0; i < users.length; i++){
            if (users[i] != null){
                if (users[i].getBalance() == balance){
                    quantityUsersExactBal++;
                }
            }
        }

        User[] usersWithExactBal = new User[quantityUsersExactBal];
        int k = 0;
        for (int i = 0; i < users.length; i++){
            if (users[i] != null){
                if (users[i].getBalance() == balance) {
                    usersWithExactBal[k] = users[i];
                    System.out.println(usersWithExactBal[k].toString());
                    k++;
                }
            }
        }
        return usersWithExactBal;
    }

    static final User[] paySalaryToUsers(User[] users){
        for (User usArray: users){
            if (usArray != null){
                usArray.setBalance(usArray.getSalary()+usArray.getBalance());
                System.out.println(usArray.toString()+". Current balance is " + usArray.getBalance());
            }
        }
        return users;
    }

    static final long[] getUsersId(User[] users){

        int lengthIDArray = users.length;
        for (int i=0; i< users.length; i++){
            if (users[i] == null){
                lengthIDArray--;
            }
        }
        long[] arrayID = new long[lengthIDArray];
        int k=0;
        for (int i=0; i< users.length; i++) {
            if (users[i] != null) {
                arrayID[k] = users[i].getId();
                System.out.println(arrayID[k]);
                k++;
            }
        }
        return arrayID;
    }

    static User[] deleteEmptyUsers(User[] users){
        int lengthWithoutNull = users.length;

        for (int i=0; i< lengthWithoutNull-1; i++){
            if (users[i] == null){
                for (int j=i; j< lengthWithoutNull-1; j++){
                    users[j] = users[j+1];
                }
                lengthWithoutNull--;
            }
        }

        User[] usersWithoutNull = new User[lengthWithoutNull];
        for (int i=0; i< lengthWithoutNull; i++){
            usersWithoutNull[i] = users[i];
            System.out.println(usersWithoutNull[i]);
        }
        return usersWithoutNull;
    }
}
