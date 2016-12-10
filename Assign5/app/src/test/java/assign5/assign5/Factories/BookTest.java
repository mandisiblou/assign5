package assign5.assign5.Factories;

/**
 * Created by 211014486 on 4/17/2016.
 */

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import assign5.assign5.ValuesObjectFactories.BookFactory;
import assign5.assign5.ValuesObjectFactories.BookFactoryImp.BookFactoryImp;
import assign5.assign5.ValuesObjects.Book;

public class BookTest {
    private BookFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = BookFactoryImp.getInstance();
    }

    @Test
    public void studenttestRoleCreation() throws Exception {
        Book code = factory.createCode(211L, "A");
        Assert.assertEquals(211L, code.getBookId(),4.4);
    }


    @Test
    public void testResultsUpdate() throws Exception {
        Book code = factory.createCode(210L, "B");
        Assert.assertEquals(210L, code.getBookId(),4.4);

        // Updated Name
        Book updateCode = new Book.Builder()
                .copy(code)
                .bookId(222L)
                .build();

        Assert.assertEquals(222L, updateCode.getBookId(),4.4);
    }
}
