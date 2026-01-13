package sn.edu.uam.GuessMyNumber.repositories;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import sn.edu.uam.GuessMyNumber.entities.Partie;

@Repository
public class PartieRepositoryImpl implements PartieRepository {

    private final JdbcTemplate jdbcTemplate;

    public PartieRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(Partie partie) {
        String sql = "INSERT INTO partie (joueur, date_partie, nb_tentatives) VALUES (?, ?, ?)";
        jdbcTemplate.update(
                sql,
                partie.getJoueur(),
                partie.getDate(),
                partie.getTentatives()  // juste l'int, pas besoin de toString
        );
    }
}
