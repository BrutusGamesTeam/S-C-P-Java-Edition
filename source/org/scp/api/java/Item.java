// Pacote do Código
package org.scp.api.java;

// Importações Explicitas
import org.scp.api.java.basic.Entity;

// Classe Responsável pela Criação de Itens
public class Item extends Entity
{
    // Campos Exclusívos da Classe

    // Evento de Clique Esquerdo
    private Runnable item_leftClickEvent = null;

    // Evento de Clique Direito
    private Runnable item_rightClickEvent = null;
    
    // Construtores Básicos

    // Cria um Item com Argumentos Mínimos
    public Item(Runnable onLeftClick, Runnable onRightClick)
    {
        // Mudança de Eventos
        this.item_leftClickEvent = (onLeftClick != null ? onLeftClick : () -> {});
        this.item_rightClickEvent = (onRightClick != null ? onRightClick : () -> {});
    }

    // Funções Declaradas

    // Obtém o Evento de Clique Esquerdo
    public Runnable item_getLeftEvent()
    {
        // Retorne o Evento Atual
        return item_leftClickEvent;
    }

    // Obtém o Evento de Clique Direito
    public Runnable item_getRightEvent()
    {
        // Retorne o Evento Atual
        return item_rightClickEvent;
    }

    // Mude o Evento de Clique Esquerdo
    public void item_setLeftEvent(Runnable value)
    {
        // Mude o Evento Atual
        this.item_leftClickEvent = (value != null ? value : () -> {});
    }

    // Mude o Evento de Clique Direito
    public void item_setRightEvent(Runnable value)
    {
        // Mude o Evento Atual
        this.item_rightClickEvent = (value != null ? value : () -> {});
    }
}
