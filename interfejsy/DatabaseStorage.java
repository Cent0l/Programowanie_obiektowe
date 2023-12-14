public class DatabaseStorage implements Storage
{
    String data;
    String identifier;

    public DatabaseStorage(String data, String identifier) {
        this.data = data;
        this.identifier = identifier;
    }
    @Override
    public boolean save(String data) {
        return data.isEmpty();
    }

    @Override
    public boolean delete(String identifier) {
        return identifier.isEmpty();
    }

    @Override
    public String retrieve(String identifier) {
        return identifier+" Database";
    }
}
