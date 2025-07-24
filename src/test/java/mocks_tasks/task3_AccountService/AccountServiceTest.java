package mocks_tasks.task3_AccountService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)

public class AccountServiceTest {
    @InjectMocks
    private AccountService accountService;
    @Mock
    private AccountRepository accountRepository;

    @Test
    void withdraw_SuccessfulCashWithdrawal(){
        Account account = new Account("I54",1200);
        Mockito.when(accountRepository.findAccountById("I54")).thenReturn(account);

        boolean result = accountService.withdraw("I54", 500);
        Assertions.assertTrue(result);

        Mockito.verify(accountRepository,Mockito.times(1)).findAccountById("I54");
    }

    @Test
    void withdraw_FailedCashWithdrawal(){
        Account account = new Account("I54",1200);
        Mockito.when(accountRepository.findAccountById("I54")).thenReturn(account);

        boolean result = accountService.withdraw("I54", 2000);
        Assertions.assertFalse(result);

        Mockito.verify(accountRepository,Mockito.times(1)).findAccountById("I54");
        Mockito.verify(accountRepository,Mockito.never()).updateAccount(Mockito.any());
    }

    @Test
    void withdraw_AccountNotFound(){
        Mockito.when(accountRepository.findAccountById("I54")).thenReturn(null);

        boolean result = accountService.withdraw("I54", 100);
        Assertions.assertFalse(result);

        Mockito.verify(accountRepository,Mockito.times(1)).findAccountById("I54");
        Mockito.verify(accountRepository,Mockito.never()).updateAccount(Mockito.any());
    }

}
