package mocks_tasks.task1_OrderService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;


@ExtendWith(MockitoExtension.class)
public class OrderServiceTest {

    @InjectMocks
    private OrderService orderService;
    @Mock
    private InventoryService inventoryService;
    @Mock
    private OrderRepository orderRepository;

    @Test
    void processOrder_SuccessfulOrderProcessing(){
        Order order = new Order("I546",7,57.0);
        Mockito.when(inventoryService.isProductAvailable("I546",7)).thenReturn(true);

        boolean result = orderService.processOrder(order);

        Assertions.assertTrue(result);

        Mockito.verify(orderRepository,times(1)).saveOrder(order);
        Mockito.verify(inventoryService,times(1)).isProductAvailable("I546",7);
    }

    @Test
    void processOrder_FailedOrderProcessing(){
        Order order = new Order("I546",7,57.0);
        Mockito.when(inventoryService.isProductAvailable("I546",7)).thenReturn(false);

        boolean result = orderService.processOrder(order);

        Assertions.assertFalse(result);

        Mockito.verify(orderRepository,never()).saveOrder(order);
        Mockito.verify(inventoryService,times(1)).isProductAvailable("I546",7);
    }


}
