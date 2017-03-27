package com.ktu.svylaklavke.tripmaster;

import com.google.android.gms.maps.model.LatLng;

import java.util.List;

//Route class that saves info about the route user will travel along
public class Route {
    public Distance distance;
    public Duration duration;
    public String endAddress;
    public LatLng endLocation;
    public String startAddress;
    public LatLng startLocation;
    public String description;

    public List<LatLng> points;
}