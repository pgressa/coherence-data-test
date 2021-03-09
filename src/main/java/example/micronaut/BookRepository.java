package example.micronaut;

import io.micronaut.coherence.data.annotation.CoherenceRepository;
import io.micronaut.data.repository.CrudRepository;
import java.util.UUID;

@CoherenceRepository("book")
public interface BookRepository extends CrudRepository<Book, UUID> {
}