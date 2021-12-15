package practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Transaction {
	private String transactionDate;
	private String transactionTime;
	private String kind;
	private long amount;
	private long balance;

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public Transaction() {
		//simpleDateFormat을 필드로 빼면 더 편하게 사용할 수 있다.
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");

		Calendar c1 = Calendar.getInstance();

		this.transactionDate = sdfDate.format(c1.getTime());
		this.transactionTime = sdfTime.format(c1.getTime());
		this.kind = "";
		this.amount = 0;
		this.balance = 0;
	}

	@Override
	public String toString() {
		return "거래일: " + transactionDate + ", " + "거래시간: " + transactionTime + ", " + "구분: " + kind + ", " + "거래금액: "
				+ amount + ", " + "잔고: " + balance;
	}

}
