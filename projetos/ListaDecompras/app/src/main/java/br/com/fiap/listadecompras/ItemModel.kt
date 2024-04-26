package br.com.fiap.listadecompras

data class ItemModel(val name: String)
// a variável HERDA o tipo String, por isso é usado o :
//Adapter -> faz a manipulação do Recycle View, faz a gerência de quem aparece na tela, os itens.
/*Adapter tem 3 métodos : View Holder / Bind /  GetCount || Específico do Recycle View !
* O Adapter precisa de um KT e um XML */