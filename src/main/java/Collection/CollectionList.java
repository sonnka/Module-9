package Collection;

public interface CollectionList{
    void clear();

    default int size() {
        return 0;
    }
}
