/*******************************************************************************
 * Copyright 2014, 2018 gwt-ol3
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package ol.geom;

import javax.annotation.Nullable;

import jsinterop.annotations.JsType;
import ol.Coordinate;

/**
 * MultiPolygon geometry.
 *
 * @author sbaumhekel
 */
@JsType(isNative = true)
public class MultiPolygon extends SimpleGeometry {

    public MultiPolygon(Coordinate[][][] coordinates) {}

    public MultiPolygon(Coordinate[][][] coordinates, @Nullable String geometryLayout) {}

    /**
     * Return the coordinates of this geometry.
     *
     * @return Coordinates.
     */
    public native Coordinate[][][] getCoordinates();

    /**
     * Append the passed polygon to this multipolygon.
     *
     * @param polygon
     *            Polygon.
     */
    public native void appendPolygon(Polygon polygon);

    /**
     * Return the polygon at the specified index.
     *
     * @param index
     *            Index.
     * @return polygon.
     */
    public native Polygon getPolygon(int index);

    /**
     * Return the polygons of this multipolygon.
     *
     * @return polygons.
     */
    public native Polygon[] getPolygons();

    /**
     * Set the coordinates of the polygon.
     *
     * @param coordinates
     */
    public native void setCoordinates(Coordinate[][][] coordinates);

    /**
     * Set the coordinates of this geometry.
     *
     * @param coordinates Coordinates.
     * @param geometryLayout opt_layout Layout.
     */
    public native void setCoordinates(Coordinate[][][] coordinates, @Nullable String geometryLayout);

}
