package uz.pdp.cityfront.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.tokens.ScalarToken;
import uz.pdp.cityfront.domain.entity.token.JwtTokenEntity;

@Repository
public interface JwtTokenRepository extends JpaRepository<JwtTokenEntity, ScalarToken> {

}