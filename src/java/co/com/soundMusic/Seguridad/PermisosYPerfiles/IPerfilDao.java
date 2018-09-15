package co.com.soundMusic.Seguridad.PermisosYPerfiles;

import java.sql.SQLException;

/**
 *
 * @author Santiago Medina Pelaez
 */
public interface IPerfilDao {

    Perfil obtenerPerfil(int idPerfil) throws SQLException;

    void crearPerfil(Perfil perfil) throws SQLException;
}
