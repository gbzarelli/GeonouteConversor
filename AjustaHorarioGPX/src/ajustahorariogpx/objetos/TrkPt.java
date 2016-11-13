/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajustahorariogpx.objetos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Guilherme
 */
@XmlRootElement(name = "trkpt")
@XmlAccessorType(XmlAccessType.NONE)
public class TrkPt {

    @XmlAttribute(name = "lat")
    private String lat;
    @XmlAttribute(name = "lon")
    private String lon;
    @XmlElement(name = "ele")
    private String ele;
    @XmlElement(name = "time")
    private String time;

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getEle() {
        return ele;
    }

    public void setEle(String ele) {
        this.ele = ele;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "TrkPt{" + "lat=" + lat + ", lon=" + lon + ", ele=" + ele + ", time=" + time + '}';
    }

}
