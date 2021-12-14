package practice;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		Bank bank = new Bank();
		// 계좌등록		
		bank.addAccount("1111", "김");	
		bank.addAccount("2222", "이");	
		bank.addAccount("3333", "박");	
		bank.addAccount("4444", "정");	
		bank.addAccount("5555", "최");	
		bank.addAccount("6666", "김");	
		
		// 전체계좌보기 + 총 계좌수
		List<Account> list = bank.getAccountsMethod();
		for(Account a : list) {
			System.out.println(a.toString());
		}
		System.out.printf("총 계좌 수: %d\n", bank.getTotalAccountMethod());
		
		// 소유자명으로 검색해서 계좌정보보기
		System.out.println();
		System.out.println("<소유자명으로 검색해서 계좌정보보기 - 이름이 김인 계좌보기>");
		list = bank.findAccounts("김");
		for(Account a : list) {
			System.out.println(a.toString());
		}
		
		// 계좌번호로 검색해서 계좌정보보기 
		System.out.println();
		System.out.println("<계좌번호로 검색해서 계좌정보보기 - 최의 계좌보기>");
		Account a = bank.getAccount("5555");
		System.out.println(a.toString());
		
		// 입금하기
		System.out.println();
		System.out.println("<입금하기 - 최에게 20000원 입금>");
		bank.getAccount("5555").deposit(20000);
		System.out.println(a.toString());
		
		// 출금하기
		System.out.println();
		System.out.println("<출금하기 - 최에게 10000원, 20000원 출금>");
		bank.getAccount("5555").withdraw(10000);
		System.out.println(a.toString());
		bank.getAccount("5555").withdraw(20000);
		System.out.println(a.toString());
		
		// 거래내역보기
		System.out.println();
		System.out.println("<거래내역보기 - 최의 거래내역>");
		List<Transaction> tList = bank.getAccount("5555").getTransationMethod();
		for(Transaction t : tList) {
		    System.out.println(t.toString());
		}
		
//		System.out.println(bank.getAccounts().toString());
//		System.out.println(bank.getTotalAccountMethod());
//		bank.getAccount("1111").deposit(10000);
//		bank.getAccount("1111").deposit(10000);
//		bank.getAccount("1111").withdraw(10000);;
//		System.out.println(bank.getAccount("1111").getTransaction().toString());
		
		

}
}
