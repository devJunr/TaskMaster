import tarefa_acao.*;
import tarefa_status.*; 
import tarefaMain.*;


public class main {
    public static void main(String[] args){

        tarefasConcluidas tarefasConcluidas = new tarefasConcluidas();
        tarefasPendentes tarefasPendentes = new tarefasPendentes();
        tarefaCriar tarefaCriar = new tarefaCriar();
        tarefaExcluir tarefaExcluir = new tarefaExcluir();
        tarefaListar tarefaListar = new tarefaListar();
        tarefasMenu tarefasMenu = new tarefasMenu();
        tarefaTitulo tarefaTitulo = new tarefaTitulo();

        tarefaTitulo.titulo();
    }
}
