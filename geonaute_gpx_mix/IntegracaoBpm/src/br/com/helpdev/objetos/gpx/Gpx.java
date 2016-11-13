/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.helpdev.objetos.gpx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Guilherme
 */
@XmlRootElement(name = "gpx")
@XmlAccessorType(XmlAccessType.NONE)
public class Gpx {

    @XmlAttribute(name = "creator")
    private String creator;
    @XmlAttribute(name = "version")
    private String version;
    @XmlElement(name = "metadata", type = MetaData.class)
    private MetaData metaData;
    @XmlElement(name = "trk", type = Trk.class)
    private Trk trk;

    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    public Trk getTrk() {
        return trk;
    }

    public void setTrk(Trk trk) {
        this.trk = trk;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Gpx{" + "creator=" + creator + ", version=" + version + ", metaData=" + metaData + ", trk=" + trk + '}';
    }

}
