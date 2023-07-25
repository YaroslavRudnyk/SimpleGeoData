package com.example.simplegeodata.jts_util

import com.vividsolutions.jts.geom.Coordinate
import com.vividsolutions.jts.geom.CoordinateSequence
import com.vividsolutions.jts.geom.Envelope

/**
 * Created by Yaroslav Rudnyk on 25.07.23.
 */

class DefaultCoordinateSequence(val size: Int = 0): CoordinateSequence {

 private companion object {
  const val DIMENSION = 3
 }

 private var coordinates: ArrayList<Coordinate> = if (size > 0) ArrayList(size) else ArrayList()

 override fun getDimension(): Int = DIMENSION

 override fun getX(index: Int): Double = getCoordinate(index).x

 override fun getY(index: Int): Double = getCoordinate(index).y

 override fun expandEnvelope(env: Envelope): Envelope {
  coordinates.forEach{
   env.expandToInclude(it)
  }

  return env
 }

 override fun getOrdinate(index: Int, ordinateIndex: Int): Double {
  return when(ordinateIndex) {
   CoordinateSequence.X -> coordinates[index].x
   CoordinateSequence.Y -> coordinates[index].y
   CoordinateSequence.Z -> coordinates[index].z
   else -> Double.NaN
  }
 }

 override fun getCoordinateCopy(i: Int): Coordinate = Coordinate(coordinates[i])

 override fun toCoordinateArray(): Array<Coordinate> {
  val arrayOf: Array<Coordinate> = Array(coordinates.size) { Coordinate(0.0,0.0,0.0) }
  for (i in 0 until coordinates.size) {
   arrayOf[i] = coordinates[i]
  }
  return arrayOf
 }

 override fun clone(): Any  = toCoordinateArray()

 override fun size(): Int = coordinates.size

 override fun setOrdinate(index: Int, ordinateIndex: Int, value: Double) {
  when(ordinateIndex) {
   CoordinateSequence.X -> coordinates[index].x = value
   CoordinateSequence.Y -> coordinates[index].y = value
   CoordinateSequence.Z -> coordinates[index].z = value
   else -> {}
  }
 }

 override fun getCoordinate(i: Int): Coordinate = coordinates[i]

 override fun getCoordinate(index: Int, coord: Coordinate) {
  coord.apply {
   x = coordinates[index].x
   y = coordinates[index].y
   z = coordinates[index].z
  }
 }

 fun add(coordinate: Coordinate) {
  coordinates.add(coordinate)
 }
}