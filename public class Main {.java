public class Main {
    public static void main(String[] args) {
        // Crear una universidad
        Universidad miUniversidad = new Universidad("Mi Universidad");

        // Crear departamentos
        Departamentos departamentoInformatica = new Departamentos("Informática");
        Departamentos departamentoMatematicas = new Departamentos("Matemáticas");

        // Agregar departamentos a la universidad
        miUniversidad.agregarDepartamento(departamentoInformatica);
        miUniversidad.agregarDepartamento(departamentoMatematicas);

        // Crear programas
        Programa programaComputacion = new Programa("Ciencias de la Computación");
        Programa programaMatematicas = new Programa("Matemáticas Puras");

        // Agregar programas a los departamentos
        departamentoInformatica.agregarPrograma(programaComputacion);
        departamentoMatematicas.agregarPrograma(programaMatematicas);

        // Crear cursos
        Profesor profesor1 = new Profesor("Profesor A");
        Curso cursoJava = new Curso("Programación en Java", profesor1);
        Curso cursoCalculo = new Curso("Cálculo Avanzado", profesor1);

        // Agregar cursos a los programas
        programaComputacion.agregarCurso(cursoJava);
        programaMatematicas.agregarCurso(cursoCalculo);

        // Crear alumnos
        Alumno alumno1 = new Alumno("Alumno 1");
        Alumno alumno2 = new Alumno("Alumno 2");

        // Inscribir alumnos en cursos
        alumno1.inscribirseEnCurso(cursoJava);
        alumno2.inscribirseEnCurso(cursoCalculo);

        // Mostrar información sobre los agregados
        System.out.println("Universidad: " + miUniversidad.getNombre());
        System.out.println("Departamentos en la Universidad: " + miUniversidad.getDepartamentos());
        System.out.println("Programas en Informática: " + departamentoInformatica.getProgramas());
        System.out.println("Programas en Matemáticas: " + departamentoMatematicas.getProgramas());
        System.out.println("Cursos en Ciencias de la Computación: " + programaComputacion.getCursos());
        System.out.println("Cursos en Matemáticas Puras: " + programaMatematicas.getCursos());
        System.out.println("Alumnos inscritos en Programación en Java: " + cursoJava.getAlumnos());
        System.out.println("Alumnos inscritos en Cálculo Avanzado: " + cursoCalculo.getAlumnos());
    }
}
