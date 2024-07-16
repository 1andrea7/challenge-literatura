package com.github.pabloperalta94.challenge_literatura.config.iConfig;


public interface IConvertirDatos {

    <T> T convertirDatosJsonAJava(String json , Class<T> clase); 
}
