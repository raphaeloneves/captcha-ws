package br.gov.mec.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CaptchaResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Captcha> imagens;
	private Captcha imagemValida;
	private Captcha audioValido;

	public CaptchaResponse(List<Captcha> imagens, Captcha imagemValida, Captcha audioValido) {
		super();
		this.imagens = imagens;
		this.imagemValida = imagemValida;
		this.audioValido = audioValido;
	}
	
	public CaptchaResponse(){}

	public List<Captcha> getImagens() {
		return imagens;
	}

	public Captcha getImagemValida() {
		return imagemValida;
	}

	public Captcha getAudioValido() {
		return audioValido;
	}

	@Override
	public String toString() {
		return "CaptchaResponse [imagens=" + imagens + ", imagemValida=" + imagemValida + ", audioValido=" + audioValido
				+ "]";
	}
	

}
