package practice;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private List<Transaction> transaction;
	private String accountNo;
	private String name;
	private long balance;

	public List<Transaction> getTransaction() {
		return transaction;
	}

	public void setTransaction(List<Transaction> transaction) {
		this.transaction = transaction;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public Account() {
		transaction = new ArrayList<>();
		accountNo = "";
		name = "";
		balance = 0;
	}

	@Override
	public String toString() {
		return "계좌번호: " + accountNo + ", " + "소유자명: " + name + ", " + "잔액: " + balance;
	}


	public void deposit(long amount) {
		// 입금한다
		Transaction t = new Transaction();

		t.setKind("입금");
		if(amount <= 0) {
			System.out.println("금액을 정확히 입력해주세요.");			
		} else {
			t.setAmount(amount);
			t.setBalance(balance + amount);

			transaction.add(t);

			balance += amount;
		}
		

	}

	public void withdraw(long amount) {
		// 출금한다
		Transaction t = new Transaction();
		t.setKind("출금");
		t.setAmount(amount);
		if(balance - amount < 0) {
			System.out.println("잔고가 부족합니다.");			
		} else {
			t.setBalance(balance - amount);
			transaction.add(t);
			balance -= amount;
		}
		
	}

	public long getBalanceMethod() {		
		// 잔고확인한다
		return balance;
	}

	public List<Transaction> getTransationMethod() {
		// 거래내역본다.
		List<Transaction> list = new ArrayList<>();
		for (Transaction t : transaction) {
			list.add(t);
		}
		return list;
		
	}

}
