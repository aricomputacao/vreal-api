package com.asolucao.vreal.api.config.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("vreal")

public class VrealApiProperty {

	private Seguranca seguranca =  new Seguranca();
	
	public static class Seguranca{
		private boolean enableHttps;

		public boolean isEnableHttps() {
			return enableHttps;
		}

		public void setEnableHttps(boolean enableHttps) {
			this.enableHttps = enableHttps;
		}
		
	}

	public Seguranca getSeguranca() {
		return seguranca;
	}
	
	
	
	
	
}
