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
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");

		Calendar c1 = Calendar.getInstance();

		transactionDate = sdfDate.format(c1.getTime());
		transactionTime = sdfTime.format(c1.getTime());
		String kind = "";
		long amount = 0;
		long balance = 0;
	}

	@Override
	public String toString() {
		return "거래일: " + transactionDate + ", " + "거래시간: " + transactionTime + ", " + "구분: " + kind + ", " + "거래금액: "
				+ amount + ", " + "잔고: " + balance;
	}

}
