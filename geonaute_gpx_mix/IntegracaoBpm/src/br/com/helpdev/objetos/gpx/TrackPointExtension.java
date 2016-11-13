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
@XmlRootElement(name = "TrackPointExtension", namespace = "http://www.garmin.com/xmlschemas/TrackPointExtension/v1")
@XmlAccessorType(XmlAccessType.NONE)
public class TrackPointExtension {

    @XmlElement(name = "atemp", namespace = "http://www.garmin.com/xmlschemas/TrackPointExtension/v1")
    private String atemp;
    @XmlElement(name = "hr", namespace = "http://www.garmin.com/xmlschemas/TrackPointExtension/v1")
    private String hr;

    public String getAtemp() {
        return atemp;
    }

    public void setAtemp(String atemp) {
        this.atemp = atemp;
    }

    public String getHr() {
        return hr;
    }

    public void setHr(String hr) {
        this.hr = hr;
    }

    @Override
    public String toString() {
        return "TrackPointExtension{" + "atemp=" + atemp + ", hr=" + hr + '}';
    }

}
