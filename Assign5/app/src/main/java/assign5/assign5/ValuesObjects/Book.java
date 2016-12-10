package assign5.assign5.ValuesObjects;

/**
 * Created by 211014486 on 4/17/2016.
 */
import java.io.Serializable;

public class Book implements Serializable {
    private Long bookId;
    private static final long serialVersionUID = 1L;
    private String name;

    public Long  getBookId() {
        return bookId;
    }

    public String getName() {
        return name;
    }

    public Book() {
    }


    public Book(Builder builder) {
        this.bookId = builder.bookId;
        this.name = builder.name;
    }

    public static class Builder {
        private Long  bookId;
        private static final long serialVersionUID = 1L;
        private String name;

        public Builder bookId(Long  bookId) {
            this.bookId = bookId;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder copy(Book value) {
            this.bookId = value.bookId;
            this.name = value.name;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book code = (Book) o;

        if (bookId != null ? !bookId.equals(code.bookId) : code.bookId != null) return false;
        return name != null ? name.equals(code.name) : code.name == null;

    }

    @Override
    public int hashCode() {
        int result = bookId != null ? bookId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}