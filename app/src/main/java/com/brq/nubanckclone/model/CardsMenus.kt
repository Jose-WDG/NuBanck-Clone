package com.brq.nubanckclone.model

class CardsMenus {
    private var _urlImg: String = ""
    private var _titulo: String = ""
    private var _texto: String = ""
    fun setUrlImg(urlImg: String) {
        _urlImg = urlImg
    }

    fun setTitulo(titulo: String) {
        _titulo = titulo
    }

    fun setTexto(texto: String) {
        _texto = texto
    }

    fun getUrlImg() = _urlImg
    fun getTitulo() = _titulo
    fun getTexto() = _texto
}

