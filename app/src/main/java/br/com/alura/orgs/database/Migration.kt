package br.com.alura.orgs.database

import androidx.room.RoomMasterTable.TABLE_NAME
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

val MIGRATION_1_2 = object : Migration(1,2){
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("""
            CREATE TABLE IF NOT EXISTS `${TABLE_NAME}
            ` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, 
            `nome` TEXT NOT NULL, `descricao` TEXT NOT NULL, 
            `valor` REAL NOT NULL, `imagem` TEXT)
    }

}