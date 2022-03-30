public class PrismaRecta {
    private float largo;
    private float ancho;
    private float altura;

    public PrismaRecta(float largo, float ancho, float altura) {
        this.largo = largo;
        this.ancho = ancho;
        this.altura = altura;
    }

    public PrismaRecta() {
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    private float areabase() {
        return this.ancho*this.largo;
    }

    private float arealarga() {
        return this.largo * this.altura;
    }

    private float areacorta() {
        return this.ancho*this.altura;
    }

    public float areaprisma() {
        return 2*(this.areabase()+this.arealarga()+this.areacorta());
    }
}
