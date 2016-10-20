package br.gov.mec.model;

import static java.util.Collections.shuffle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import com.google.gson.Gson;

import br.gov.mec.util.CaptchaConstants;
import br.gov.mec.util.ResourceLoader;

public class CaptchaController implements Serializable{

	private static final long serialVersionUID = 1L;
	private List<Captcha> imagensResource = null;
	private List<Captcha> audiosResource = null;
	private Captcha audioValido = null;
	private Captcha imagemValida = null;
	private Random random = new Random();
	
	{
		carregarRecursos();
	}
	
	public void carregarRecursos(){
		ResourceLoader loader = new ResourceLoader();
		imagensResource = loader.carregarRecurso(CaptchaConstants.getImagesJson());
		audiosResource = loader.carregarRecurso(CaptchaConstants.getAudiosJson());
	}
	
	public String start(int numeroImagens){
		Gson gson = new Gson();
		gerarAudioValido();
		CaptchaResponse captcha = new CaptchaResponse(gerarListaImagens(numeroImagens), imagemValida, audioValido);
		return gson.toJson(captcha);
	}
	
	private List<Captcha> gerarListaImagens(int numeroImagens){
		shuffle(imagensResource);
		List<Captcha> opcoes = new ArrayList<Captcha>(numeroImagens);
		for(Captcha c : imagensResource.subList(0, numeroImagens)){
			opcoes.add(new Captcha(c.getValue(), c.getPath(), UUID.randomUUID().toString()));
		}
		gerarImagemValida(opcoes);
		return opcoes;
	}
	
	private Captcha gerarRecursoValido(List<Captcha> lista){
		return lista.get(random.nextInt(lista.size()));
	}
	
	private void gerarAudioValido(){
		shuffle(audiosResource);
		audioValido = gerarRecursoValido(audiosResource);
		audioValido.setUuid(UUID.randomUUID().toString());
	}
	
	private void gerarImagemValida(List<Captcha> lista){
		shuffle(lista);
		imagemValida = gerarRecursoValido(lista); 
	}
	
}
