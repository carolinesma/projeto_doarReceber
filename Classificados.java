package ufba.mata55.doarReceber;

import java.util.ArrayList;

public abstract class Classificados implements IClassificados {

	private static ArrayList<Publicacao> classificadosDoar;
	private static ArrayList<Publicacao> classificadosReceber;
	private static ArrayList<EventoSocial> classificadosEventos;
	
	public static boolean add(Publicacao publicacao) {
		boolean retorno = false;
		if (publicacao instanceof Doar)
			retorno = classificadosDoar.add(publicacao);
		else if (publicacao instanceof Receber)
			retorno = classificadosReceber.add(publicacao);
		
		return retorno;
	}
		
	public static boolean remover(Publicacao publicacao) {
		boolean retorno = false;
		if (publicacao instanceof Doar)
			retorno = classificadosDoar.remove(publicacao);
		else if (publicacao instanceof Receber)
			retorno = classificadosReceber.remove(publicacao);
		
		return retorno;
	}

	public static boolean add(EventoSocial evento) {	return classificadosEventos.add(evento);}
	public static boolean remover(EventoSocial evento) {	return classificadosEventos.remove(evento); }
	
	public ArrayList<Publicacao> getClassificadosDoar() {	return classificadosDoar; }
	public ArrayList<Publicacao> getClassificadosReceber() {	return classificadosReceber; }
	public void setClassificadosDoar(ArrayList<Publicacao> classificadosDoar) {	Classificados.classificadosDoar = classificadosDoar; }
	public void setClassificadosReceber(ArrayList<Publicacao> classificadosReceber) {	Classificados.classificadosReceber = classificadosReceber; }
	public static ArrayList<EventoSocial> getClassificadosEventos() {	return classificadosEventos; }
	public static void setClassificadosEventos(ArrayList<EventoSocial> classificadosEventos) {	Classificados.classificadosEventos = classificadosEventos; }
	
}
