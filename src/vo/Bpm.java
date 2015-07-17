package vo;

public class Bpm {

	public String nomeBpm;
	public ViaturaOrigem VtrOrigem;
	public ViaturaDestino VtrDestino;

	public Bpm(String nomeBpm, ViaturaOrigem VtrOrigem,
			ViaturaDestino VtrDestino) {
		this.nomeBpm = nomeBpm;
		this.VtrOrigem = VtrOrigem;
		this.VtrDestino = VtrDestino;
	}

}
