/*-
 * ========================LICENSE_START=================================
 * TFG BYTEPIT-APP
 * %%
 * Copyright (C) 2016 Heidy Mabel Izaguirre Alvarez
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * =========================LICENSE_END==================================
 */
package es.udc.tfg.model.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Coordinates barcelona api
 * @author hmia
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CoordinatesBarcelona {

	private float latitude;
	private float longitude;

	public CoordinatesBarcelona() {
	}

	/**
	 * 
	 * @param latitude
	 * @param longitude
	 */
	public CoordinatesBarcelona(float latitude, float longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return " {latitude=" + latitude + ", longitude=" + longitude + "}";
	}
}
