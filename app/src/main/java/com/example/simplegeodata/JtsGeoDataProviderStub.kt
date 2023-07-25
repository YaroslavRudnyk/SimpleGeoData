package com.example.simplegeodata

import com.example.simplegeodata.jts_util.defaultFactory
import com.vividsolutions.jts.geom.Coordinate
import com.vividsolutions.jts.geom.LineString
import com.vividsolutions.jts.geom.Point
import com.vividsolutions.jts.geom.Polygon

/**
 * Created by Yaroslav Rudnyk on 25.07.23.
 */

class JtsGeoDataProviderStub: JtsGeoDataProvider {

 override fun getPoint(): Point =
  defaultFactory.createPoint(Coordinate(18.687557078746064, 50.269972474447286))

 override fun getLine(): LineString =
  defaultFactory.createLineString(arrayOf(
   Coordinate(18.687260823893006, 50.269948147569266),
   Coordinate(18.687439010544782, 50.269963993380266),
   Coordinate(18.687595504908508, 50.269961022291085),
   Coordinate(18.68775199927224, 50.26998875244937),
   Coordinate(18.68783721897526, 50.270028366933204),
   Coordinate(18.687896098042806, 50.27009670184033)
  ))

 override fun getPolygon(): Polygon =
  defaultFactory.createPolygon(arrayOf(
   Coordinate(18.687178703088275, 50.27006401994048),
   Coordinate(18.68725152719813, 50.269943195752234),
   Coordinate(18.687366186434925, 50.26986297624481),
   Coordinate(18.687618746645697, 50.269863966609925),
   Coordinate(18.68786510905989, 50.26990952338287),
   Coordinate(18.687851164017577, 50.269993704261644),
   Coordinate(18.687747350924806, 50.27007689463097),
   Coordinate(18.68747619732428, 50.270018463315346),
   Coordinate(18.687178703088275, 50.27006401994048)
  ))

}