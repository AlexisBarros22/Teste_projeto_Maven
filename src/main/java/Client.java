import java.util.ArrayList;
import java.util.Collection;

public class Client {

    private String name;

    private int age;

    private  double debt;

    private int numberChildren;
    private final  ArrayList<Account> bankAccount = new ArrayList<>();


    /**
     * @param name      - nome of the client
     * @param age       - age of the clint
     * @param debt      - ammount of debt of the clikent
     * @param numberChildren    - Number of children of the client  
     */
    public Client(String name, int age, double debt, int numberChildren) {
        this.name = name;
        this.age = age;
        this.debt = debt;
        this.numberChildren = numberChildren;
    }

    public boolean addAccount(Account... accounts) {
        for (Account account : accounts){
            if ( ! bankAccount.contains( account)){
                bankAccount.add (account);
            }
            else {
                throw new ArrayStoreException( "This Client is .....");
            }
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public int getAg() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    public int getNumberChildren() {
        return numberChildren;
    }

    public void setNumberChildren(int numberChildren) {
        this.numberChildren = numberChildren;
    }


    public ArrayList<Account> getBankAccounts() {
        return bankAccount;
    }
}
