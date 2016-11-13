/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.helpdev;

import br.com.helpdev.objetos.gpx.Extensions;
import br.com.helpdev.objetos.gpx.Gpx;
import br.com.helpdev.objetos.gpx.TrackPointExtension;
import br.com.helpdev.objetos.gpx.TrkPt;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Guilherme
 */
public class ControllerMix {

    public static Gpx integrarBatimentos(Gpx gpx, ArrayList<Integer> batimentos) throws ParseException {
        ArrayList<TrkPt> trkPts = gpx.getTrk().getTrkseg().getTrkPts();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        int indiceGpx = 0;
        int indiceBpm = 0;
        int bpm;
        for (; indiceGpx < trkPts.size(); indiceGpx++) {
            TrkPt trkPt = trkPts.get(indiceGpx);

            if (batimentos.size() > indiceBpm) {

                Extensions ex = trkPt.getExtensions();
                if (ex == null) {
                    ex = new Extensions();
                    trkPt.setExtensions(ex);
                }
                TrackPointExtension tpe = ex.getTrackPointExtension();
                if (tpe == null) {
                    tpe = new TrackPointExtension();
                    ex.setTrackPointExtension(tpe);
                }

                bpm = batimentos.get(indiceBpm);
                tpe.setHr(String.valueOf(bpm));

                if ((indiceGpx + 1) < trkPts.size()) {
                    Date date1 = sdf.parse(trkPt.getTime().replace("T", " ").replace("Z", ""));
                    trkPt = trkPts.get(indiceGpx + 1);
                    Date date2 = sdf.parse(trkPt.getTime().replace("T", " ").replace("Z", ""));
                    long dif = (date2.getTime() - date1.getTime()) / 1000;
                    indiceBpm += dif;
                }
            }

        }
        return gpx;
    }

}
