package HERENCIA;

class SeleccionFutbol {
    int id;
    String Nombre;
    String Apellidos;
    int edad;

    public SeleccionFutbol(int id, String Nombre, String Apellidos, int edad){
        this.id=id;
        this.Nombre=Nombre;
        this.Apellidos=Apellidos;
        this.edad=edad;
    }

    public String getName(){
        return this.Nombre;
    }

}