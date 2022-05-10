package client;

import com.dao.AccountInMemoryImpl;
import com.entity.Account;
import com.service.TransferServiceImpl;

public class AppConfig {
	
	
	public Account acc() {
		return new Account();
	}
	
	public AccountInMemoryImpl accimpl(){
		return new AccountInMemoryImpl();
	}
	
	public TransferServiceImpl transimpl(accimpl) {
		return new TransferServiceImpl();
	}
	
	

}
