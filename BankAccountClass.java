class MyClass{
    public static void main(String[] args){
        BankAccount user1 = new BankAccount("Chase","Claire Simmons",30000);
        System.out.println(user1.withdrawMoney(2000));
        user1 = new BankAccount("Chase","Claire Simmons",user1.withdrawMoney(2000));
        System.out.println(user1.depositMoney(10000));
        user1 = new BankAccount("Chase","Claire Simmons",user1.depositMoney(10000));
        System.out.println(user1.pastime(93));

        BankAccount user2 = new BankAccount("Bank Of America","Remy Clay",10000);
        System.out.println(user2.withdrawMoney(5000));
        user2 = new BankAccount("Bank Of America","Remy Clay",user2.withdrawMoney(5000));
        System.out.println(user2.depositMoney(12000));
        user2 = new BankAccount("Bank Of America","Remy Clay",user2.depositMoney(12000));
        System.out.println(user2.pastime(505));

    }
}

class BankAccount{
    public String bankName;
    public String ownerName;
    public int savings;

    public BankAccount(String bankName,String ownerName,int savings){
        this.bankName = bankName;
        this.ownerName = ownerName;
        this.savings = savings;
    }

    

    public int depositMoney(int depositAmount){
        if (this.savings <= 20000) return this.savings+depositAmount-100;
        return this.savings+depositAmount;
    }

    public int withdrawMoney(int withdrawAmount){
        if ((double)withdrawAmount >= (double)this.savings*0.2){
            double withdrawMoney = (double)this.savings*0.8;
            return (int)withdrawMoney; 
        }
        return this.savings-withdrawAmount;
    }

    public double pastime(int days){
        return (double)this.savings+(double)0.25*days;
    }
}