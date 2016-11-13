/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajustahorariogpx;

import ajustahorariogpx.objetos.Gpx;
import ajustahorariogpx.objetos.TrkPt;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Guilherme
 */
public class AjustaHorarioGPX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Gpx gpx=ControllerGpx.getGpxFromFile("C://arquivo.gpx");
            
            SimpleDateFormat sdf= new SimpleDateFormat("HH:mm:ss");
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.HOUR_OF_DAY, 22);
            calendar.set(Calendar.MINUTE, 9);
            calendar.set(Calendar.SECOND, 50);
            
            for(int i=gpx.getTrkPts().size()-1;i>=0;i--){
                TrkPt trkPt=gpx.getTrkPts().get(i);
                String time = trkPt.getTime();
                String pt1 = time.substring(0, 11);
                String pt2 = time.substring(11,19);
                pt2=sdf.format(calendar.getTime());
                calendar.setTimeInMillis(calendar.getTimeInMillis()-1000);
                //System.out.println(pt2);
                trkPt.setTime(pt1+pt2+"Z");
            }
            System.out.println(gpx.toString());
            
            ControllerGpx.gravarGpx(gpx, new File("D://arquivo_mod.gpx"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
