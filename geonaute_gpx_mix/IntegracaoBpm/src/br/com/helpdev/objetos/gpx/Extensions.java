/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.helpdev.objetos.gpx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Guilherme
 */
@XmlRootElement(name = "elements")
@XmlAccessorType(XmlAccessType.NONE)
public class Extensions {

    @XmlElement(name = "TrackPointExtension", type = TrackPointExtension.class, namespace = "http://www.garmin.com/xmlschemas/TrackPointExtension/v1")
    private TrackPointExtension trackPointExtension;

    public TrackPointExtension getTrackPointExtension() {
        return trackPointExtension;
    }

    public void setTrackPointExtension(TrackPointExtension trackPointExtension) {
        this.trackPointExtension = trackPointExtension;
    }

    @Override
    public String toString() {
        return "Extensions{" + "trackPointExtension=" + trackPointExtension + '}';
    }

}
