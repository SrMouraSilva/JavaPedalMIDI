package br.com.srmourasilva.pedalboard;

public class Pedalboard implements Plugabble {

	private Plugabble next;
	
	@Override
	public Plugabble connect(Plugabble plugabble) {
		this.next = plugabble;
		return next;
	}
}
