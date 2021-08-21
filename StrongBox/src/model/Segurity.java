package model;

public class Segurity {
	
	private String clave;
	
	public Segurity() {
		clave="123456";
	}
	public boolean comprobacion(String a, String b, String c, String d, String e, String f) {
		boolean comprobado;
		String introducido="";
		introducido=a+b+c+d+e+f;
		if(introducido.equals(getClave())) {
			comprobado=true;
		}
		else {
			comprobado=false;
		}
		
		return comprobado;
	}
	
	public String changePassword(String currentP, String newP) {
		String message="";
		if(currentP.equals(getClave())) {
			setClave(newP);
			message="La combinacion se ha cambiado con exito";
		}
		else {
			message="La combinacion actual es incorrecta";
		}
		return message;
	}
	
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
}
