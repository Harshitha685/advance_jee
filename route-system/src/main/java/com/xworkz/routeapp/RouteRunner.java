package com.xworkz.routeapp;

import com.xworkz.routeapp.dto.RouteDto;
import com.xworkz.routeapp.exception.DestinationNotFoundException;
import com.xworkz.routeapp.exception.OriginNotFoundException;

public class RouteRunner {

    public static void main(String[] args) {
        String origin = getOriginByDestination("Pune");
        System.out.println("Origin : " +origin);
        try {
           String destination =  getDestinationByOrigin("Karnatak");
            System.out.println("Destination : " +destination);
        }catch (DestinationNotFoundException dnf){
            dnf.printStackTrace();
        }
    }
    public static String getOriginByDestination(String destination) {
        String origin = null;
        try {
            RouteDto routePlanDTO = new RouteDto();
            routePlanDTO.setOrigin("Mumbai");
            routePlanDTO.setDestination("Pune");

            if (routePlanDTO.getDestination().equalsIgnoreCase(destination)) {
                origin = routePlanDTO.getOrigin();
            } else {
                OriginNotFoundException originNotFoundException = new OriginNotFoundException("No origin found for destination: " + destination);
                throw originNotFoundException;
            }
        } catch (OriginNotFoundException dnfe) {
            dnfe.printStackTrace();
        }

        return origin;
    }

    public static String getDestinationByOrigin(String origin) throws DestinationNotFoundException {

        RouteDto dto = new RouteDto();
        dto.setOrigin("Karnataka");
        dto.setDestination("Hassan");

        if(dto.getOrigin().equals(origin)){
            return dto.getDestination();
        }
        else{
            throw new DestinationNotFoundException("Destination not found with origin " +origin);
        }

    }
}
