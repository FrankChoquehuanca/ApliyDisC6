package legacies.example.mscatalogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import legacies.example.mscatalogo.entity.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}


