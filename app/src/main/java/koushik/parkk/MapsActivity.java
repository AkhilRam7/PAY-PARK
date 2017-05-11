package koushik.parkk;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        Bundle extras = getIntent().getExtras();
        int m = extras.getInt("long");
        int n = extras.getInt("lat");
        double x = m * 0.0000001;
        double y = n * 0.0000001;
        Log.d("Maps", "long_" + x);
        Log.d("Maps", "long_" + y);


        Polygon polygon1 = mMap.addPolygon(new PolygonOptions()
                .add(new LatLng(12.839970, 80.136911), new LatLng(12.839970, 80.136980), new LatLng(12.839690, 80.136980), new LatLng(12.839690, 80.136911), new LatLng(12.839967, 80.136911))
                .strokeColor(0xff000000)
                .strokeWidth(5)
                .fillColor(0x70c14212));
        Polyline line1_1 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(12.839730, 80.136911), new LatLng(12.839730, 80.136980))
                .width(3)
                .color(Color.BLUE));
        Polyline line1_2 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(12.839760, 80.136911), new LatLng(12.839760, 80.136980))
                .width(3)
                .color(Color.BLUE));
        Polyline line1_3 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(12.839790, 80.136911), new LatLng(12.839790, 80.136980))
                .width(3)
                .color(Color.BLUE));
        Polyline line1_4 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(12.839820, 80.136911), new LatLng(12.839820, 80.136980))
                .width(3)
                .color(Color.BLUE));
        Polyline line1_5 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(12.839850, 80.136911), new LatLng(12.839850, 80.136980))
                .width(3)
                .color(Color.BLUE));
        Polyline line1_6 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(12.839880, 80.136911), new LatLng(12.839880, 80.136980))
                .width(3)
                .color(Color.BLUE));
        Polyline line1_7 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(12.839910, 80.136911), new LatLng(12.839910, 80.136980))
                .width(3)
                .color(Color.BLUE));
        Polyline line1_8 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(12.839940, 80.136911), new LatLng(12.839940, 80.136980))
                .width(3)
                .color(Color.BLUE));
        //phase2
        Polygon polygon2 = mMap.addPolygon(new PolygonOptions()
                .add(new LatLng(12.839970, 80.137022), new LatLng(12.839970, 80.137130), new LatLng(12.839690, 80.137130), new LatLng(12.839690, 80.137022), new LatLng(12.839970, 80.137022))
                .strokeColor(0xff000000)
                .strokeWidth(5)
                .fillColor(0x70c14212));
        Polyline line2_1 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(12.839730, 80.137022), new LatLng(12.839730, 80.137130))
                .width(3)
                .color(Color.BLUE));
        Polyline line2_2 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(12.839760, 80.137022), new LatLng(12.839760, 80.137130))
                .width(3)
                .color(Color.BLUE));
        Polyline line2_3 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(12.839790, 80.137022), new LatLng(12.839790, 80.137130))
                .width(3)
                .color(Color.BLUE));
        Polyline line2_4 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(12.839820, 80.137022), new LatLng(12.839820, 80.137130))
                .width(3)
                .color(Color.BLUE));
        Polyline line2_5 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(12.839850, 80.137022), new LatLng(12.839850, 80.137130))
                .width(3)
                .color(Color.BLUE));
        Polyline line2_6 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(12.839880, 80.137022), new LatLng(12.839880, 80.137130))
                .width(3)
                .color(Color.BLUE));
        Polyline line2_7 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(12.839910, 80.137022), new LatLng(12.839910, 80.137130))
                .width(3)
                .color(Color.BLUE));
        Polyline line2_8 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(12.839940, 80.137022), new LatLng(12.839940, 80.137130))
                .width(3)
                .color(Color.BLUE));
        //phase3
        Polygon polygon3 = mMap.addPolygon(new PolygonOptions()
                .add(new LatLng(12.839970, 80.137180), new LatLng(12.839970, 80.137227), new LatLng(12.839690, 80.137227), new LatLng(12.839690, 80.137180), new LatLng(12.839970, 80.137180))
                .strokeColor(0xff000000)
                .strokeWidth(5)
                .fillColor(0x70c14212));
        Polyline line3_1 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(12.839730, 80.137180), new LatLng(12.839730, 80.137227))
                .width(3)
                .color(Color.BLUE));
        Polyline line3_2 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(12.839760, 80.137180), new LatLng(12.839760, 80.137227))
                .width(3)
                .color(Color.BLUE));
        Polyline line3_3 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(12.839790, 80.137180), new LatLng(12.839790, 80.137227))
                .width(3)
                .color(Color.BLUE));
        Polyline line3_4 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(12.839820, 80.137180), new LatLng(12.839820, 80.137227))
                .width(3)
                .color(Color.BLUE));
        Polyline line3_5 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(12.839850, 80.137180), new LatLng(12.839850, 80.137227))
                .width(3)
                .color(Color.BLUE));
        Polyline line3_6 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(12.839880, 80.137180), new LatLng(12.839880, 80.137227))
                .width(3)
                .color(Color.BLUE));
        Polyline line3_7 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(12.839910, 80.137180), new LatLng(12.839910, 80.137227))
                .width(3)
                .color(Color.BLUE));
        Polyline line3_8 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(12.839940, 80.137180), new LatLng(12.839940, 80.137227))
                .width(3)
                .color(Color.BLUE));
        //line
        Polyline linee_8 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(12.839970, 80.137075), new LatLng(12.839690, 80.137075))
                .width(5)
                .color(0xff000000));
        MarkerOptions marker = new MarkerOptions().position(new LatLng(x, y)).title("You are here!");
        marker.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE));
        googleMap.addMarker(marker);
        //parking markers
        MarkerOptions marker1 = new MarkerOptions().position(new LatLng(12.839805, 80.137050)).title("Parkstop 1");
        marker.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE));
        googleMap.addMarker(marker1);
        MarkerOptions marker2 = new MarkerOptions().position(new LatLng(12.839835, 80.137050)).title("Parkstop 2");
        marker.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE));
        googleMap.addMarker(marker2);
        MarkerOptions marker3 = new MarkerOptions().position(new LatLng(12.839865, 80.137050)).title("Parkstop 3");
        marker.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE));
        googleMap.addMarker(marker3);
        MarkerOptions marker4 = new MarkerOptions().position(new LatLng(12.839895, 80.137050)).title("Parkstop 4");
        marker.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE));
        googleMap.addMarker(marker4);
        MarkerOptions marker5 = new MarkerOptions().position(new LatLng(12.839925, 80.137050)).title("Parkstop 5");
        marker.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE));
        googleMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                if (marker.getTitle().equals("You are here!"))
                    Toast.makeText(MapsActivity.this, marker.getTitle(), Toast.LENGTH_SHORT).show();
                else {
                    avail(marker.getTitle());
                }
                return true;
            }
        });
        googleMap.addMarker(marker5);
        //
        CameraPosition cameraPosition = new CameraPosition.Builder().target(
                new LatLng(x, y)).zoom(17).build();
        googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));

    }
    public void avail(String a){
        Intent pay = new Intent(this, pay.class);
        pay.putExtra("name",a);
        startActivity(pay);
    }

}
