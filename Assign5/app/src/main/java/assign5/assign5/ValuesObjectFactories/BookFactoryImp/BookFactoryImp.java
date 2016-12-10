package assign5.assign5.ValuesObjectFactories.BookFactoryImp;

/**
 * Created by 211014486 on 4/17/2016.
 */
import assign5.assign5.ValuesObjectFactories.BookFactory;
import assign5.assign5.ValuesObjects.Book;


public class BookFactoryImp implements BookFactory {
    private static BookFactoryImp factory = null;

    private BookFactoryImp() {
    }
    public static BookFactoryImp getInstance(){
        if(factory ==null)
            factory = new BookFactoryImp();
        return factory;
    }
    public Book createCode(Long bookId, String name) {
        Book code = new Book
                .Builder()
                .bookId(bookId)
                .name(name)
                .build();
        return code;
    }
}
