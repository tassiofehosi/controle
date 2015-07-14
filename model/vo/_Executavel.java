package vo;

public class _Executavel {

	public static void main(String[] args) {

		RadioTransceptor novoRadio = new RadioTransceptor(1120, "159TYG4596",
				"Motorola", "GM-300");

		Data dataDesist = new Data(05, 07, 2015);
		Data dataInst = new Data(06, 07, 2015);

		ViaturaOrigem vtrOrigem = new ViaturaOrigem(dataDesist, "21-2517",
				novoRadio);

		ViaturaDestino vtrDestino = new ViaturaDestino(dataInst, "21-1110",
				novoRadio);

		Bpm novoBpm = new Bpm("3Âº BatalhÃ£o", vtrOrigem, vtrDestino);

		Tecnico tecnico = new Tecnico("Pincel", "Sargento", 1478);

		Servico servico = new Servico(novoBpm, tecnico);
		// eh bom fazer um to String em servico;

		System.out.println("Controle de radio Trasceptor");
		System.out.println("\nDados Desinstalação:\n");
		System.out.println("Fabricante: "
				+ servico.Bbpm.VtrOrigem.radio.fabricante);
		System.out.println("Modelo: " + servico.Bbpm.VtrOrigem.radio.modelo);
		System.out.println("Serial: "
				+ servico.Bbpm.VtrOrigem.radio.numeroSerial);
		System.out.println("Cm: " + servico.Bbpm.VtrOrigem.radio.cm);
		System.out.println("Prefixo Vtr: " + servico.Bbpm.VtrOrigem.prefixoVtr);
		System.out.println("DataDesinstalacao: "
				+ servico.Bbpm.VtrOrigem.dataDesinstalacao.dia + "/"
				+ servico.Bbpm.VtrOrigem.dataDesinstalacao.mes + "/"
				+ servico.Bbpm.VtrOrigem.dataDesinstalacao.ano);
		System.out.println("Bpm: " + servico.Bbpm.nomeBpm);
		System.out.println("Responsavel Tecnico: " + servico.Ttecnico.nomeT
				+ "\nGraduacao:" + servico.Ttecnico.graduacaoT);

		System.out.println("\nDados Instalação:\n");
		System.out.println("Fabricante: "
				+ servico.Bbpm.VtrOrigem.radio.fabricante);
		System.out.println("Modelo: " + servico.Bbpm.VtrDestino.radio.modelo);
		System.out.println("Serial: "
				+ servico.Bbpm.VtrDestino.radio.numeroSerial);
		System.out.println("Cm: " + servico.Bbpm.VtrDestino.radio.cm);
		System.out
				.println("Prefixo Vtr: " + servico.Bbpm.VtrDestino.prefixoVtr);
		System.out.println("DataInstalacao: "
				+ servico.Bbpm.VtrDestino.dataInstalacao.dia + "/"
				+ servico.Bbpm.VtrDestino.dataInstalacao.mes + "/"
				+ servico.Bbpm.VtrDestino.dataInstalacao.ano);
		System.out.println("Bpm: " + servico.Bbpm.nomeBpm);
		System.out.println("Responsavel Tecnico: " + servico.Ttecnico.nomeT
				+ "\nGraduacao:" + servico.Ttecnico.graduacaoT);

	}

}
