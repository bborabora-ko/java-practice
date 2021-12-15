package practice;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<Account> accounts;
	private int totalAccount;

	// 항상 겟터와 셋터를 만들 필요는 없다.(간접할당을 위한 것이기에)
	// 쓰이지도 않는데 불필요한 행동이었음
	

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

	// return은 최소한으로 쓰는 것이 좋다.
	// 책: 이펙티브자바(성능에 대한 책)
	
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

	public List<Account> getAccounts() {
		// 계좌목록 불러오기
		List<Account> list = new ArrayList<>();
		for (Account a : accounts) {
			list.add(a);
		}
		return list;
	}

	
	public int getTotalAccount() {
		// 총 계좌수		
		return accounts.size();
	}

}
