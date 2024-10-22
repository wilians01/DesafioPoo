package edu.will.iPhone.main;

import edu.will.iPhone.aparelhoTelefonico.AparelhoTelefônico;
import edu.will.iPhone.navegadorInternet.NavegadorInternet;
import edu.will.iPhone.reprodutorMusuical.ReprodutorMusical;

public class Iphone implements AparelhoTelefônico, ReprodutorMusical, NavegadorInternet {

    public void funcaotelefone (String numero) {
        ligar(numero);
        atender();
        iniciarCorreioVoz();
    }
    public void funcaoNavegacaoWeb(String url){
        exibirPagina(url);
        adicionarNovaAba();
        atualizarPagina();

    }
    public void fucaoMusica(String musica){
        tocar();
        pauasar();
        selecionarMusica(musica);

    }


    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o numero"+numero);
    }

    @Override
    public void atender() {
        System.out.println("Atender ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz ativo");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibir pagina web"+url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicioner nova aba web");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar pagina web");
    }

    @Override
    public void tocar() {
        System.out.println("Tocar música ");
    }

    @Override
    public void pauasar() {
        System.out.println("Pausar música");

    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("A música selecionada é a "+musica);


    }
}
