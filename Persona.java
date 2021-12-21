public class Persona {

    String nombre;

    int edad;

    double altura;

    double peso;

    char genero;

    double imc;

    String estado;

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public void setEdad(int edad) {

        this.edad = edad;
    }

    public void setAltura(double altura) {

        this.altura = altura;
    }

    public void setPeso(double peso) {

        this.peso = peso;
    }

    public void setGenero(char genero) {

        this.genero = genero;
    }

    public String getNombre() {

        return nombre;
    }

    public int getEdad() {

        return edad;
    }

    public double getAltura() {

        return altura;
    }

    public double getPeso() {

        return peso;
    }

    public char getGenero() {

        return genero;
    }

    public double getImc() {

        this.imc = peso / (altura * altura);
        return imc;
    }

    public String getEstado() {

        double imc = getImc();
        if (imc < 10.5) this.estado = "Peso inferior al normal, ¿quieres unas lentejas?";
        if (imc >= 18.5 && imc < 24.9) this.estado = "Peso normal";
        if (imc >= 24.9 && imc < 29.9) this.estado = "Peso superior al normal, usted sufre sobrepeso";
        if (imc > 29.9) this.estado = "Peso muy superior al normal, usted sufre de obesidad";
        return estado;
    }


}
