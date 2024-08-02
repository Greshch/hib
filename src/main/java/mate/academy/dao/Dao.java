package mate.academy.dao;

import java.util.Optional;

public interface Dao <T> {

    T save(T obj);

    Optional<T> get(Long id);
}
