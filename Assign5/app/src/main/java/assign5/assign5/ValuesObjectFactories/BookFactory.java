package assign5.assign5.ValuesObjectFactories;

import assign5.assign5.ValuesObjects.Book;

/**
 * Created by 211014486 on 4/17/2016.
 */
public interface BookFactory {
    Book createCode(Long bookId, String name);
}
