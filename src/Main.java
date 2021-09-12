import java.util.Collection;
import java.util.HashSet;

public class Main {
//для удаления дубликатов из коллекции достаточно возпользоваться HashSet
    public static <T>Collection<T> removeDuplicates(Collection<T> collection){
        return new HashSet<>(collection);
    }

}

