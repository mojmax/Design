package runtimeexception;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public enum FormaGaranziaAttestato implements Serializable {

	BM("01", "BONUS/MALUS", "E"),
	FRANCHIGIA("02", "FRANCHIGIA", "C"),
	PEJUS("03", "PEJUS", ""),
	MISTA("04", "MISTA FRANCHIGIA- BONUS/MALUS- NO CLAIMS DISCOUNT", "M"),
	NO_CLAIMS_DISCOUNT("05", "NO CLAIMS DISCOUNT", ""),
	FISSA("06", "FISSA", "A"),
	ALTRE("09", "ALTRE", "");

	private String codice;
	private String descrizione;
	private String codiceAssimoco;

	/**
	 * @return the codice
	 */
	private FormaGaranziaAttestato(String codice, String descrizione, String codiceAssimoco) {
		this.codice = codice;
		this.descrizione = descrizione;
		this.codiceAssimoco = codiceAssimoco;
	}

	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * @return
	 */
	public static List<String> getListaValori() {
		List<String> lista = new ArrayList<String>(values().length);
		for (FormaGaranziaAttestato ta : values()) {
			lista.add(ta.getDescrizione());
		}
		return lista;
	}

	/**
	 * Ritorna la forma di garanzia attestato in base al codice
	 * @param codice
	 * @return
	 */
	public static FormaGaranziaAttestato getFormaGaranziaDaCodice(String codice) {
		for (FormaGaranziaAttestato sett : values()) {
			if (sett.getCodice().equals(codice))
				return sett;
		}
		throw new IllegalArgumentException("FormaGaranziaAttestato.getFormaGaranziaDaCodice() - codice '" + codice + "' non gestito!");
	}

	/**
	 * Ritorna la forma di garanzia attestato in base alla descrizione
	 * @param descrizione
	 * @return
	 */
	public static FormaGaranziaAttestato getFormaGaranziaDaDescrizione(String descrizione) {
		for (FormaGaranziaAttestato sett : values()) {
			if (sett.getDescrizione().equals(descrizione))
				return sett;
		}
		throw new IllegalArgumentException("FormaGaranziaAttestato.getFormaGaranziaDaDescrizione() - descrizione '" + descrizione + "' non gestita!");
	}

	public String getCodiceAssimoco() {
		return codiceAssimoco;
	}

	/**
	 * Ritorna la forma di garanzia attestato in base al codice assimoco
	 * @param codiceAssimoco
	 * @return
	 */
	public static FormaGaranziaAttestato getFormaGaranziaDaCodiceAssimoco(String codiceAssimoco) {
		for (FormaGaranziaAttestato sett : values()) {
			if (sett.getCodiceAssimoco().equals(codiceAssimoco))
				return sett;
		}
		throw new IllegalArgumentException("FormaGaranziaAttestato.getFormaGaranziaDaCodiceAssimoco() - codiceAssimoco '" + codiceAssimoco + "' non gestita!");
	}

}