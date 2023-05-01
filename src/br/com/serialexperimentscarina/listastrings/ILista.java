package br.com.serialexperimentscarina.listastrings;

public interface ILista {
	
	public boolean isEmpty();
	public int size();
	public void addFirst(String dado);
	public void addLast(String dado) throws Exception;
	public void add(String dado, int pos) throws Exception;
	public void removeFirst() throws Exception;
	public void removeLast() throws Exception;
	public void remove(int pos) throws Exception;
	public String get(int pos) throws Exception;

}
