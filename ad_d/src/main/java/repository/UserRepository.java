package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springboot,model.User;

public interface UserRepository extends JpaRepository<>User, Long>{
	
	@Query("SELECT p from personagem p where p.dano >* :dano") 
	public List<Personagem> findAllMoreThan(@Param("dano")int dano);
	
	public List<Personagem> findByDanoGreaterThan(int dano);
}