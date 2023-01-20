package com.example.runningapp.repository

import com.example.runningapp.db.Run
import com.example.runningapp.db.RunDao
import javax.inject.Inject


class MainRepository@Inject constructor(
    val runDao:RunDao
){
    suspend fun insertRun(run: Run)=runDao.insertRun(run)
    suspend fun deleteRun(run: Run)=runDao.deleteRun(run)

    fun getAllRunsSortedByDate()=runDao.getAllRunsSortedByDate()
    fun getAllRunsSortedByDistance()=runDao.getAllRunsSortedByDistance()
    fun getAllRunsSortedByTimeInMillis()=runDao.getAllRunsSortedByTimeInMillis()
    fun getAllRunsSortedByAvgSpeed()=runDao.getAllRunsSortedByAvgSpeed()
    fun getAllRunsSortedByCaloriesBurned()=runDao.getAllRunsSortedByCaloriesBurned()

    fun getTotalAvgSpeed()=runDao.getTotalAverageSpeed()
    fun getTotalDistance()=runDao.getTotalDistance()
    fun getTotalCaloriesBurned()=runDao.getTotalCaloriesBurned()
    fun getTotalTimeInMillis()=runDao.getTotalTimeInMillis()

}