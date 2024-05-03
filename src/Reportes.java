public class Reportes {
    public static void generarReporte(ListaEstudiante listaEstudiante, ListaCarrera listaCarrera) {
        System.out.println("Reporte de Carreras:");

        // Obtener el promedio de notas y edad por carrera
        for (Carrera carrera : listaCarrera.carreras) {
            double totalPromedio = 0;
            int totalEdad = 0;
            int cantidadEstudiantes = 0;

            for (Estudiante estudiante : listaEstudiante.estudiantes) {
                if (estudiante.getCarrera().equals(carrera.getCodigo())) {
                    totalPromedio += estudiante.getPromedio();
                    totalEdad += estudiante.getEdad();
                    cantidadEstudiantes++;
                }
            }

            double promedioNotas = totalPromedio / cantidadEstudiantes;
            double promedioEdad = totalEdad / cantidadEstudiantes;

            System.out.println("Carrera: " + carrera.getNombre());
            System.out.println("Promedio de notas: " + promedioNotas);
            System.out.println("Promedio de edad: " + promedioEdad);
            System.out.println("---------------------------");
        }
    }
}
