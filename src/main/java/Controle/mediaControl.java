package Controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import modelo.Media;

@ManagedBean(name="media")
@ApplicationScoped
public class mediaControl {
	
	private Media media;
	List<String> lista = new ArrayList<>();
	
	
	public mediaControl(){
		media = new Media();
		
	}

	public String calculaMedia(){
		
		//System.out.println("1: "+media.getNum1());
		//System.out.println("2: "+media.getNum2());
		float valor = ((media.getNum1()+media.getNum2())/2 );
		media.setMedia(valor);
		//System.out.println("M: "+media.getMedia());
		lista.add(Float.toString(valor));
		//this.media = new Media();
		return "pagina2";
		
	}
	
	//get set
	public Media getMedia() {return media;}
	public void setMedia(Media media) {this.media = media;}

	public List<String> getLista() {return lista;}
	public void setLista(List<String> lista) {this.lista = lista;}

	
	
	

}
