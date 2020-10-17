package futbol;

public class Jugador extends Futbolista implements Comparable<Object>{
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador() {
		super();
		this.golesMarcados = (short)289; this.dorsal = (byte)7;
	}
	
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados; this.dorsal = dorsal;
	}
	
	public int compareTo(Futbolista futbolista) {
		return (this.getEdad() - futbolista.getEdad());
	}
	
	public String toString() {
		return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() +
				" con el dorsal " + this.getDorsal() + ". Ha marcado " + this.getGolesMarcados();
	}
	
	public byte getDorsal() {
		return this.dorsal;
	}
	
	public short getGolesMarcados() {
		return this.golesMarcados;
	}
	
}
