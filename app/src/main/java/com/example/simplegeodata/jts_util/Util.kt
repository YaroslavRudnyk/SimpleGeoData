package com.example.simplegeodata.jts_util

import com.vividsolutions.jts.geom.GeometryFactory
import com.vividsolutions.jts.geom.PrecisionModel
import kotlin.math.pow

/**
 * Created by Yaroslav Rudnyk on 25.07.23.
 */
val scale = 10.0.pow(7.0)
val precisionModel = PrecisionModel(scale)
val defaultFactory = GeometryFactory(precisionModel, 4326, DefaultCoordinateSequenceFactory())