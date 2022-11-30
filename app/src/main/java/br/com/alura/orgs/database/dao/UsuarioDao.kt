package br.com.alura.orgs.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import br.com.alura.orgs.model.Usuario
import java.util.concurrent.Flow

@Dao
interface UsuarioDao {

    @Insert
    fun salva(usuario: Usuario)


    @Query("SELECT * FROM Usuario WHERE id = :usuarioId AND senha = :senha")
   suspend fun autentica(
        usuarioId: String,
        senha: String
    ): Usuario?

   @Query("SELECT * FROM Usuario WHERE id = :usuarioId")
   fun buscaPorId(usuarioId: String) : Flow<Usuario>
}