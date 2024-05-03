public class Main {
    public static void main(String[] args) {
        ListaEstudiante listaEstudiante = new ListaEstudiante();
        ListaCarrera listaCarrera = new ListaCarrera();

        Reportes.generarReporte(listaEstudiante, listaCarrera);
    }
}
