package practice;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<Account> accounts = new ArrayList<>();
	private int totalAccount = 0;

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public int getTotalAccount() {
		return totalAccount;
	}

	public void setTotalAccount(int totalAccoaunt) {
		this.totalAccount = totalAccoaunt;
	}

	public Bank() {
		this.accounts = new ArrayList<>();
		this.totalAccount = 0;
	}


	public void addAccount(String accountNo, String name) {
		Account account = new Account();
		account.setAccountNo(accountNo);
		account.setName(name);
		accounts.add(account);

		totalAccount++;
	}

	public Account getAccount(String accountNo) {
		// 계좌번호로 계좌찾기
		for (Account a : accounts) {
			if (a.getAccountNo().equals(accountNo)) {
				return a;
			}
		}
		return null;

	}

	public List<Account> findAccounts(String name) {
		// 소유자명으로 계좌찾기
		List<Account> list = new ArrayList<>();
		for (Account a : accounts) {
			if (a.getName().equals(name)) {
				list.add(a);				
			}
		}
		return list;
	}

	public List<Account> getAccountsMethod() {
		// 계좌목록 불러오기
		List<Account> list = new ArrayList<>();
		for (Account a : accounts) {
			list.add(a);
		}
		return list;
	}

	
	public int getTotalAccountMethod() {
		// 총 계좌수		
		return accounts.size();
	}

}
