import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SecondTest {
    @Mock
    Database databaseMock;

    @Test
    public void testQuery() {
        databaseMock = Mockito.mock(Database.class);
        assertNotNull(databaseMock);
        when(databaseMock.isAvailable()).thenReturn(true);
        Service t = new Service(databaseMock);
        boolean check = t.query("* from t");
        Assert.assertTrue(check);
    }
}
