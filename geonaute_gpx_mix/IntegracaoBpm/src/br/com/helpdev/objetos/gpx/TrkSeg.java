/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.helpdev.objetos.gpx;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Guilherme
 */
@XmlRootElement(name = "trkseg")
@XmlAccessorType(XmlAccessType.NONE)
public class TrkSeg {

    @XmlElements(
            @XmlElement(name = "trkpt", type = TrkPt.class))
    private ArrayList<TrkPt> trkPts;

    public ArrayList<TrkPt> getTrkPts() {
        return trkPts;
    }

    public void setTrkPts(ArrayList<TrkPt> trkPts) {
        this.trkPts = trkPts;
    }

    @Override
    public String toString() {
        return "TrkSeg{" + "trkPts=" + trkPts + '}';
    }

}
