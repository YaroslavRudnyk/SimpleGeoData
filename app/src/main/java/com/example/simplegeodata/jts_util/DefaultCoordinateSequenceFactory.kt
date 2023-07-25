package com.example.simplegeodata.jts_util

import com.vividsolutions.jts.geom.Coordinate
import com.vividsolutions.jts.geom.CoordinateSequence
import com.vividsolutions.jts.geom.CoordinateSequenceFactory

/**
 * Created by Yaroslav Rudnyk on 25.07.23.
 */

class DefaultCoordinateSequenceFactory: CoordinateSequenceFactory {

    override fun create(coordinates: Array<out Coordinate>?): CoordinateSequence {
        val sequence = DefaultCoordinateSequence()

        coordinates?.let {
            it.forEach {coordinate ->
                sequence.add(coordinate)
            }
        }
        return sequence
    }

    override fun create(coordSeq: CoordinateSequence?): CoordinateSequence {
        val sequence = DefaultCoordinateSequence()

        coordSeq?.let {
            for (i in 0 until it.size()) {
                sequence.add(it.getCoordinate(i))
            }
        }
        return sequence
    }

    override fun create(size: Int, dimension: Int): CoordinateSequence {
        return DefaultCoordinateSequence(size)
    }
}