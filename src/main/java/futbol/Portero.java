package futbol;

public class Portero extends Futbolista{
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos; this.dorsal = dorsal;
	}
	
	public String toString() {
		return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() +
		    	" con el dorsal " + this.getDorsal() + ". Le han marcado " + this.getGolesRecibidos();
	}
	
	public int compareTo(Portero portero) {
		return (portero.getGolesRecibidos() -this.getGolesRecibidos());
	}

	public short getGolesRecibidos() {
		return this.golesRecibidos;
	}
	
	public boolean jugarConLasManos() {
		return true;
	}
	
	public byte getDorsal() {
		return this.dorsal;
	}
	
	
}
