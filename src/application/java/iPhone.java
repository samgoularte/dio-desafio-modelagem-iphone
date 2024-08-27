package application.java;

import application.java.service.*;

public class iPhone implements NavegadorWeb, Telefone, Player {
    
    @Override
    public void call() { System.out.println("Ligando..."); }

    @Override
    public void answer() { System.out.println("Atendendo chamada..."); }

    @Override
    public void startVoiceMail() { System.out.println("Iniciando correio de voz!"); }

    @Override
    public void showPage() { System.out.println("Exibindo página..."); }

    @Override
    public void openNewTab() { System.out.println("Abrindo nova aba..."); }

    @Override
    public void refresh() { System.out.println("Página atualizada!"); }

    @Override
    public void play() { System.out.println("Reproduzinho faixa..."); }

    @Override
    public void pause() { System.out.println("Música pausada!"); }

    @Override
    public void selectMusic() { System.out.println("Selecionando faixa..."); }

    public static void main(String[] args) {
            iPhone iphone = new iPhone();

            iphone.call();
            iphone.answer();
            iphone.startVoiceMail();

            iphone.showPage();
            iphone.openNewTab();
            iphone.refresh();

            iphone.play();
            iphone.pause();
            iphone.selectMusic();
        }
    }