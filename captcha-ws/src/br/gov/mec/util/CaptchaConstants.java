package br.gov.mec.util;

public class CaptchaConstants {
	
	private static final int NUMERO_IMAGENS = 5;
	private static final String CAMINHO_IMAGENS = "assets/images/";
	private static final String CAMINHO_AUDIOS = "assets/audios/";
	private static final String IMAGES_JSON = "images.json";
	private static final String AUDIOS_JSON = "audios.json";

	public static String getImagesJson() {
		return IMAGES_JSON;
	}

	public static String getAudiosJson() {
		return AUDIOS_JSON;
	}

	public static int getNumeroImagens() {
		return NUMERO_IMAGENS;
	}

	public static String getCaminhoImagens() {
		return CAMINHO_IMAGENS;
	}

	public static String getCaminhoAudios() {
		return CAMINHO_AUDIOS;
	}

}
