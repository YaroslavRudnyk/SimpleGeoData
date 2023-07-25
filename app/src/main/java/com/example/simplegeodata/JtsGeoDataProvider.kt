package com.example.simplegeodata

import com.vividsolutions.jts.geom.LineString
import com.vividsolutions.jts.geom.Point
import com.vividsolutions.jts.geom.Polygon

/**
 * Created by Yaroslav Rudnyk on 25.07.23.
 */

interface JtsGeoDataProvider {
    fun getPoint(): Point
    fun getLine(): LineString
    fun getPolygon(): Polygon
}