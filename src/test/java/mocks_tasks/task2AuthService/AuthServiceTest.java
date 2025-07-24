package mocks_tasks.task2AuthService;

import mocks_tasks.task2_AuthService.AuthService;
import mocks_tasks.task2_AuthService.User;
import mocks_tasks.task2_AuthService.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AuthServiceTest {

    @InjectMocks
    private AuthService authService;

    @Mock
    UserRepository userRepository;

    @Test
    void authenticateUser_SuccessfulAuthorization(){
        User user = new User("Sasha","12345");
        Mockito.when(userRepository.findUserByUsername("Sasha")).thenReturn(user);

        boolean result = authService.authenticateUser("Sasha","12345");
        Assertions.assertTrue(result);

        Mockito.verify(userRepository,Mockito.times(1)).findUserByUsername("Sasha");

    }

    @Test
    void authenticateUser_FailedAuthorization(){
        User user = new User("Sasha","12345");
        Mockito.when(userRepository.findUserByUsername("Sasha")).thenReturn(user);

        boolean result = authService.authenticateUser("Sasha","54321");
        Assertions.assertFalse(result);

        Mockito.verify(userRepository,Mockito.times(1)).findUserByUsername("Sasha");

    }

    @Test
    void authenticateUser_FailedUserNotFound(){
        Mockito.when(userRepository.findUserByUsername("Petr")).thenReturn(null);

        boolean result = authService.authenticateUser("Petr","qwerty");
        Assertions.assertFalse(result);

        Mockito.verify(userRepository,Mockito.times(1)).findUserByUsername("Petr");

    }

}
