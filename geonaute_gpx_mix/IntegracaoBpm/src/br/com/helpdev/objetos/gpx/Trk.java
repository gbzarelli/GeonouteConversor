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
@XmlRootElement(name = "trk")
@XmlAccessorType(XmlAccessType.NONE)
public class Trk {

    @XmlElement(name = "name")
    private String name;
    @XmlElement(name = "trkseg", type = TrkSeg.class)
    private TrkSeg trkseg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TrkSeg getTrkseg() {
        return trkseg;
    }

    public void setTrkseg(TrkSeg trkseg) {
        this.trkseg = trkseg;
    }

    @Override
    public String toString() {
        return "Trk{" + "name=" + name + ", trkseg=" + trkseg + '}';
    }

}
