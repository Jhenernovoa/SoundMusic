package java.co.com.soundMusic.Artista.Album;
import java.sql.SQLException;
import java.util.List;


public interface IAlbumDao{

    List<Album> obtenerAlbumes() throws SQLException;
    Album obtenerAlbum (int idAlbum) throws SQLException;
    void crearAlbum(Album album) throws SQLException;
    void eliminarAlbum (String estado, int idAlbum) throws SQLException;
    void actualizarAlbum (Album album) throws SQLException;

}