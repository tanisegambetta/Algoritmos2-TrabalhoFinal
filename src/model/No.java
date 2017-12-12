package model;

public class No<T> {
	  private No<T> proxima;
	  private No<T> anterior;
	  private T dado;
	  

public No(No<T> proxima, No<T> anterior, T dado) {
		super();
		this.proxima = proxima;
		this.anterior = anterior;
		this.dado = dado;
	}


public No() {
	
}


public No<T> getProxima() {
	return proxima;
}


public void setProxima(No<T> proxima) {
	this.proxima = proxima;
}


public No<T> getAnterior() {
	return anterior;
}


public void setAnterior(No<T> anterior) {
	this.anterior = anterior;
}


public T getDado() {
	return dado;
}


public void setDado(T dado) {
	this.dado = dado;
}



}