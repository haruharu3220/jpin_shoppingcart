import java.util.Objects;

public class ItemName {
    private final String value;

    public ItemName(String value) {
        super();
        if(value==null || "".equals(value)){
            throw new IllegalArgumentException();
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemName itemName = (ItemName) o;
        return Objects.equals(value, itemName.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
