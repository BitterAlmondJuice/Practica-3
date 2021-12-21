public class Persona {

    private String nombre;

    private int edad;

    private double altura;

    private double peso;

    private char genero;

    private double imc;

    private String estado;



    public Persona(String nombre, int edad, double altura, double peso, char genero) {

        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.genero = genero;
        this.peso = peso;
        imc = (int) (peso/(altura*altura));
        estado = calcularIMC(imc);

    }

    public Persona(String nombre, int edad, double altura, double peso, char genero, double imc, String estado) {

        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.genero = genero;
        this.imc = imc;
        this.estado = calcularIMC(imc);
    }


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

        imc = peso / (altura * altura);
        return imc;
    }

    public String calcularIMC(double imc) {

        if (imc < 10.5) estado = "Peso inferior al normal";
        if (imc >= 18.5 && imc < 24.9) estado = "Peso normal";
        if (imc >= 24.9 && imc < 29.9) estado = "Sobrepeso";
        if (imc > 29.9) estado = "Obesidad";
        return estado;
    }

    @Override
    public String toString() {

        return "Persona{" +
                "\"nombre\"=\"" + nombre +  '\"' +
                ", \"edad\"=\"" +  edad + '\"' +
                ", \"altura\"=\"" + altura + '\"' +
                ", \"peso\"=\"" + peso + '\"' +
                ", \"genero\"=\"" + genero + '\"' +
                ", \"imc\"=\"" + imc + '\"' +
                ", \"estado\"=\"" + estado + '\"' +
                '}';
    }

}
