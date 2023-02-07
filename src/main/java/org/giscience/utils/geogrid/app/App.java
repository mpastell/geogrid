package org.giscience.utils.geogrid.app;
import org.giscience.utils.geogrid.geometry.GeoCoordinates;
import org.giscience.utils.geogrid.geometry.FaceCoordinates;
import org.giscience.utils.geogrid.projections.ISEAProjection;

public class App
{
    public static void main( String[] args ) throws Exception
    {
        ISEAProjection projection = new ISEAProjection();
        FaceCoordinates fc = new FaceCoordinates(2, 20.3, 12.5);
        GeoCoordinates c = projection.icosahedronToSphere(fc);
        c.getLat(); // 52.739063
        c.getLon(); // 0.315051

        System.out.println( c.getLat() + "," + c.getLon() );
    }
}
