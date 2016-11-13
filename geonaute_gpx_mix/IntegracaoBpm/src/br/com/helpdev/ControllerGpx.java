/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.helpdev;

import br.com.helpdev.objetos.gpx.Gpx;
import br.com.helpdev.xml.ControllerXML;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author Guilherme
 */
public class ControllerGpx {

    public static Gpx getGpxFromFile(String file) throws Exception {
        return getGpxFromFile(new File(file));
    }

    public static Gpx getGpxFromFile(File file) throws Exception {
        if (file.isFile()) {
            Gpx gpx = (Gpx) ControllerXML.xml_to_object(Gpx.class, file);
            return gpx;
        } else {
            throw new FileNotFoundException("Este arquivo não existe");
        }
    }

    public static void gravarGpx(Gpx gpx, File file) throws Exception {
        ByteArrayOutputStream baos = ControllerXML.object_to_output_stream(gpx);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(baos.toByteArray());
        fos.flush();
        baos.close();
        fos.close();

    }

}
