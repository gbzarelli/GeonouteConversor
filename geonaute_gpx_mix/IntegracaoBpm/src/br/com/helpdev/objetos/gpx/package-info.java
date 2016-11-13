@XmlSchema(
        elementFormDefault = XmlNsForm.QUALIFIED,
        namespace = "http://www.topografix.com/GPX/1/1",
        location = "http://www.topografix.com/GPX/1/1 http://www.topografix.com/GPX/1/1/gpx.xsd http://www.garmin.com/xmlschemas/GpxExtensions/v3 http://www.garmin.com/xmlschemas/GpxExtensionsv3.xsd http://www.garmin.com/xmlschemas/TrackPointExtension/v1 http://www.garmin.com/xmlschemas/TrackPointExtensionv1.xsd http://www.garmin.com/xmlschemas/GpxExtensions/v3 http://www.garmin.com/xmlschemas/GpxExtensionsv3.xsd http://www.garmin.com/xmlschemas/TrackPointExtension/v1 http://www.garmin.com/xmlschemas/TrackPointExtensionv1.xsd",
        xmlns = {
            @XmlNs(prefix = "", namespaceURI = "http://www.topografix.com/GPX/1/1"),
            @XmlNs(prefix = "xsi", namespaceURI = "http://www.w3.org/2001/XMLSchema-instance"),
            @XmlNs(prefix = "gpxtpx", namespaceURI = "http://www.garmin.com/xmlschemas/TrackPointExtension/v1"),
            @XmlNs(prefix = "gpxx", namespaceURI = "http://www.garmin.com/xmlschemas/GpxExtensions/v3")}
)
package br.com.helpdev.objetos.gpx;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;
