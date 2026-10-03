package com.pepe.mirest;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.ArrayList;
import java.util.List;

import com.pepe.mirest.Models.*;
@Path("/api/v1/estudiante")
public class GreetingResource{
    private List<Estudiante> estudiantes = new ArrayList<>();

    public GreetingResource() {
        estudiantes.add(new Estudiante(1, "Pepe", "Perales", "password123", 123456789));
        estudiantes.add(new Estudiante(2, "María", "Gómez", "password456", 987654321));
        estudiantes.add(new Estudiante(3, "Pedro", "López", "password789", 456789123));
        estudiantes.add(new Estudiante(4, "Ana", "Martínez", "password321", 789123456));
        estudiantes.add(new Estudiante(5, "Luis", "Rodríguez", "password654", 321654987));
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response ObtenerEstudiantes() {
        return Response.ok(estudiantes).build();
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response ObtenerEstudiantes(@QueryParam("id") String id) {
        Estudiante estudianteBuscado = null;
        for (Estudiante estudiante : estudiantes) {
            if (String.valueOf(estudiante.getId()).equals(id)) {
                estudianteBuscado = estudiante;
                break;
            }
        }
        return Response.ok(estudianteBuscado).build();
    }
}
