package hr.tvz.java.ticTacToe.Leo;

import hr.tvz.java.ticTacToe.Player;
import javafx.scene.control.Button;

public class Hard {

    public void hard(Button polje[][], Player trenutniIgrac, Player sljedeciIgrac)
    {
        AI ai= new AI();

        if(ai.winProvjera(polje, trenutniIgrac, sljedeciIgrac)!=0)
            ai.win(polje, trenutniIgrac, sljedeciIgrac);
        else if(ai.blockProvjera(polje, trenutniIgrac, sljedeciIgrac)!=0)
            ai.block(polje, trenutniIgrac, sljedeciIgrac);
        else if(ai.fork(polje, trenutniIgrac, sljedeciIgrac)!=0)
            ai.fork(polje, trenutniIgrac, sljedeciIgrac);
        else if(ai.denyFork(polje, trenutniIgrac, sljedeciIgrac)!=0)
            ai.denyFork(polje, trenutniIgrac, sljedeciIgrac);
        else if(ai.center(polje, trenutniIgrac, sljedeciIgrac)!=0)
            ai.center(polje, trenutniIgrac, sljedeciIgrac);
        else if(ai.suprotniKutProvjera(polje, trenutniIgrac, sljedeciIgrac)!=0)
            ai.suprotniKut(polje, trenutniIgrac, sljedeciIgrac);
        else if(ai.stranaProvjera(polje, trenutniIgrac, sljedeciIgrac)!=0)
            ai.strana(polje, trenutniIgrac, sljedeciIgrac);
        else System.out.println("Igra bi trebala biti gotova?");
    }

}
