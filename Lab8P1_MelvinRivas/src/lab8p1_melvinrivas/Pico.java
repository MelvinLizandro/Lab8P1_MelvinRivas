/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1_melvinrivas;

/**
 *
 * @author l3306
 */
class Pico {

    String material;
    private int vida;
    private float tiempoEnRomper;

    public Pico(String material) {
        this.material = material;
        if (material.equals("hierro")) {
            this.vida = 8;
        } else if (material.equals("diamante")) {
            this.vida = 14;
        }
    }

    public String getMaterial() {
        return material;
    }

    public int getVida() {
        return vida;
    }

    public float getTiempoEnRomper() {
        return tiempoEnRomper;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setTiempoEnRomper(float tiempoEnRomper) {
        this.tiempoEnRomper = tiempoEnRomper;
    }

    @Override
    public String toString() {
        return "Pico de: " + material + ", vida: " + vida ;
    }
    
}
