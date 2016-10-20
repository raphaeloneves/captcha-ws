package br.gov.mec.util;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import com.google.common.reflect.TypeToken;
import com.google.gson.GsonBuilder;

import br.gov.mec.model.Captcha;

public class ResourceLoader {

	private InputStreamReader criarReader(String tipo) throws Exception {
		return new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream(tipo));
	}
	
	public List<Captcha> carregarRecurso(String tipoRecurso) {
		List<Captcha> recursos = null;
		try{
			Reader reader = criarReader(tipoRecurso);
			criarReader(tipoRecurso);
			recursos = new GsonBuilder().create().fromJson(reader, new TypeToken<ArrayList<Captcha>>(){}.getType());
		}catch(Exception e){
			e.printStackTrace();
		}
		return recursos;
	}

}
