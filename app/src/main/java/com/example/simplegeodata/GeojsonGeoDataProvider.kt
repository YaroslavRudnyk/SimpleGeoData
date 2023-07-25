package com.example.simplegeodata

/**
 * Created by Yaroslav Rudnyk on 25.07.23.
 */

interface GeojsonGeoDataProvider {
    fun getPoint(): String
    fun getLine(): String
    fun getPolygon(): String
}