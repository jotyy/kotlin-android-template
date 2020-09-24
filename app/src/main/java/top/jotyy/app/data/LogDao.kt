package top.jotyy.app.data

import androidx.room.Dao

@Dao
interface LogDao {

    fun getAll(): List<Log>

    fun insertAll(vararg logs: Log)

    fun nukeTable()
}
