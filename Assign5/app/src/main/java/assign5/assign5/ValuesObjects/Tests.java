package assign5.assign5.ValuesObjects;

/**
 * Created by 211014486 on 4/17/2016.
 */
import java.io.Serializable;

public class Tests implements Serializable {
    private Long testId;
    private static final long serialVersionUID = 1L;
    private String name;

    public Long  getTestId() {
        return testId;
    }

    public String getName() {
        return name;
    }

    public Tests() {
    }


    public Tests(Builder builder) {
        this.testId = builder.testId;
        this.name = builder.name;
    }

    public static class Builder {
        private Long  testId;
        private static final long serialVersionUID = 1L;
        private String name;

        public Builder testId(Long  testId) {
            this.testId = testId;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder copy(Tests value) {
            this.testId = value.testId;
            this.name = value.name;
            return this;
        }

        public Tests build() {
            return new Tests(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Code)) return false;

        Tests code = (Tests) o;

        if (testId != null ? !testId.equals(code.testId) : code.testId != null) return false;
        return name != null ? name.equals(code.name) : code.name == null;

    }

    @Override
    public int hashCode() {
        int result = testId != null ? testId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}