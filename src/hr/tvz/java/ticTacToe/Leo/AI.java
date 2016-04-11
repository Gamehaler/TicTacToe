package hr.tvz.java.ticTacToe.Leo;

import hr.tvz.java.ticTacToe.Player;
import javafx.scene.control.*;

public class AI {

    public int win(Button polje[][], Player trenutniIgrac, Player sljedeciIgrac)
    {
        if(polje[0][0].getText().equals(trenutniIgrac.getZnak()) && polje[0][1].getText().equals(trenutniIgrac.getZnak()) && polje[0][2].getText().equals(" "))//prvi stupac
        {
            polje[0][2].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[0][0].getText().equals(trenutniIgrac.getZnak()) && polje[0][2].getText().equals(trenutniIgrac.getZnak()) && polje[0][1].getText().equals(" "))
        {
            polje[0][1].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[0][1].getText().equals(trenutniIgrac.getZnak()) && polje[0][2].getText().equals(trenutniIgrac.getZnak()) && polje[0][0].getText().equals(" "))
        {
            polje[0][0].setText(trenutniIgrac.getZnak());
            return 1;
        }


        else if(polje[1][0].getText().equals(trenutniIgrac.getZnak()) && polje[1][1].getText().equals(trenutniIgrac.getZnak()) && polje[1][2].getText().equals(" "))//drugi stupac
        {
            polje[1][2].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[1][0].getText().equals(trenutniIgrac.getZnak()) && polje[1][2].getText().equals(trenutniIgrac.getZnak()) && polje[1][1].getText().equals(" "))
        {
            polje[1][1].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[1][1].getText().equals(trenutniIgrac.getZnak()) && polje[1][2].getText().equals(trenutniIgrac.getZnak()) && polje[1][0].getText().equals(" "))
        {
            polje[1][0].setText(trenutniIgrac.getZnak());
            return 1;
        }


        else if(polje[2][0].getText().equals(trenutniIgrac.getZnak()) && polje[2][1].getText().equals(trenutniIgrac.getZnak()) && polje[2][2].getText().equals(" "))//treci stupac
        {
            polje[2][2].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[2][0].getText().equals(trenutniIgrac.getZnak()) && polje[2][2].getText().equals(trenutniIgrac.getZnak()) && polje[2][1].getText().equals(" "))
        {
            polje[2][1].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[2][1].getText().equals(trenutniIgrac.getZnak()) && polje[2][2].getText().equals(trenutniIgrac.getZnak()) && polje[2][0].getText().equals(" "))
        {
            polje[2][0].setText(trenutniIgrac.getZnak());
            return 1;
        }

        else if(polje[0][0].getText().equals(trenutniIgrac.getZnak()) && polje[1][0].getText().equals(trenutniIgrac.getZnak()) && polje[2][0].getText().equals(" "))//prvi red
        {
            polje[2][0].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[0][0].getText().equals(trenutniIgrac.getZnak()) && polje[2][0].getText().equals(trenutniIgrac.getZnak()) && polje[1][0].getText().equals(" "))
        {
            polje[1][0].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[1][0].getText().equals(trenutniIgrac.getZnak()) && polje[2][0].getText().equals(trenutniIgrac.getZnak()) && polje[0][0].getText().equals(" "))
        {
            polje[0][0].setText(trenutniIgrac.getZnak());
            return 1;
        }

        else if(polje[0][1].getText().equals(trenutniIgrac.getZnak()) && polje[1][1].getText().equals(trenutniIgrac.getZnak()) && polje[2][1].getText().equals(" "))//drugi red
        {
            polje[2][1].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[0][1].getText().equals(trenutniIgrac.getZnak()) && polje[2][1].getText().equals(trenutniIgrac.getZnak()) && polje[1][1].getText().equals(" "))
        {
            polje[1][1].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[1][1].getText().equals(trenutniIgrac.getZnak()) && polje[2][1].getText().equals(trenutniIgrac.getZnak()) && polje[0][1].getText().equals(" "))
        {
            polje[0][1].setText(trenutniIgrac.getZnak());
            return 1;
        }

        else if(polje[0][2].getText().equals(trenutniIgrac.getZnak()) && polje[1][2].getText().equals(trenutniIgrac.getZnak()) && polje[2][2].getText().equals(" "))//treci red
        {
            polje[2][2].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[0][2].getText().equals(trenutniIgrac.getZnak()) && polje[2][2].getText().equals(trenutniIgrac.getZnak()) && polje[1][2].getText().equals(" "))
        {
            polje[1][2].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[1][2].getText().equals(trenutniIgrac.getZnak()) && polje[2][2].getText().equals(trenutniIgrac.getZnak()) && polje[0][2].getText().equals(" "))
        {
            polje[0][2].setText(trenutniIgrac.getZnak());
            return 1;
        }

        else if(polje[0][0].getText().equals(trenutniIgrac.getZnak()) && polje[1][1].getText().equals(trenutniIgrac.getZnak()) && polje[2][2].getText().equals(" "))//  /
        {
            polje[2][2].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[0][0].getText().equals(trenutniIgrac.getZnak()) && polje[2][2].getText().equals(trenutniIgrac.getZnak()) && polje[1][1].getText().equals(" "))
        {
            polje[1][1].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[1][1].getText().equals(trenutniIgrac.getZnak()) && polje[2][2].getText().equals(trenutniIgrac.getZnak()) && polje[0][0].getText().equals(" "))
        {
            polje[0][0].setText(trenutniIgrac.getZnak());
            return 1;
        }

        else if(polje[0][2].getText().equals(trenutniIgrac.getZnak()) && polje[1][1].getText().equals(trenutniIgrac.getZnak()) && polje[2][0].getText().equals(" "))//  \
        {
            polje[2][0].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[0][2].getText().equals(trenutniIgrac.getZnak()) && polje[2][0].getText().equals(trenutniIgrac.getZnak()) && polje[1][1].getText().equals(" "))
        {
            polje[1][1].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[1][1].getText().equals(trenutniIgrac.getZnak()) && polje[2][0].getText().equals(trenutniIgrac.getZnak()) && polje[0][2].getText().equals(" "))
        {
            polje[0][2].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else return 0;
    }

    public int winProvjera(Button polje[][], Player trenutniIgrac, Player sljedeciIgrac)
    {
        if(polje[0][0].getText().equals(trenutniIgrac.getZnak()) && polje[0][1].getText().equals(trenutniIgrac.getZnak()) && polje[0][2].getText().equals(" "))//prvi stupac
        {

            return 1;
        }
        else if(polje[0][0].getText().equals(trenutniIgrac.getZnak()) && polje[0][2].getText().equals(trenutniIgrac.getZnak()) && polje[0][1].getText().equals(" "))
        {

            return 1;
        }
        else if(polje[0][1].getText().equals(trenutniIgrac.getZnak()) && polje[0][2].getText().equals(trenutniIgrac.getZnak()) && polje[0][0].getText().equals(" "))
        {

            return 1;
        }


        else if(polje[1][0].getText().equals(trenutniIgrac.getZnak()) && polje[1][1].getText().equals(trenutniIgrac.getZnak()) && polje[1][2].getText().equals(" "))//drugi stupac
        {

            return 1;
        }
        else if(polje[1][0].getText().equals(trenutniIgrac.getZnak()) && polje[1][2].getText().equals(trenutniIgrac.getZnak()) && polje[1][1].getText().equals(" "))
        {

            return 1;
        }
        else if(polje[1][1].getText().equals(trenutniIgrac.getZnak()) && polje[1][2].getText().equals(trenutniIgrac.getZnak()) && polje[1][0].getText().equals(" "))
        {

            return 1;
        }


        else if(polje[2][0].getText().equals(trenutniIgrac.getZnak()) && polje[2][1].getText().equals(trenutniIgrac.getZnak()) && polje[2][2].getText().equals(" "))//treci stupac
        {

            return 1;
        }
        else if(polje[2][0].getText().equals(trenutniIgrac.getZnak()) && polje[2][2].getText().equals(trenutniIgrac.getZnak()) && polje[2][1].getText().equals(" "))
        {

            return 1;
        }
        else if(polje[2][1].getText().equals(trenutniIgrac.getZnak()) && polje[2][2].getText().equals(trenutniIgrac.getZnak()) && polje[2][0].getText().equals(" "))
        {

            return 1;
        }

        else if(polje[0][0].getText().equals(trenutniIgrac.getZnak()) && polje[1][0].getText().equals(trenutniIgrac.getZnak()) && polje[2][0].getText().equals(" "))//prvi red
        {

            return 1;
        }
        else if(polje[0][0].getText().equals(trenutniIgrac.getZnak()) && polje[2][0].getText().equals(trenutniIgrac.getZnak()) && polje[1][0].getText().equals(" "))
        {

            return 1;
        }
        else if(polje[1][0].getText().equals(trenutniIgrac.getZnak()) && polje[2][0].getText().equals(trenutniIgrac.getZnak()) && polje[0][0].getText().equals(" "))
        {

            return 1;
        }

        else if(polje[0][1].getText().equals(trenutniIgrac.getZnak()) && polje[1][1].getText().equals(trenutniIgrac.getZnak()) && polje[2][1].getText().equals(" "))//drugi red
        {

            return 1;
        }
        else if(polje[0][1].getText().equals(trenutniIgrac.getZnak()) && polje[2][1].getText().equals(trenutniIgrac.getZnak()) && polje[1][1].getText().equals(" "))
        {

            return 1;
        }
        else if(polje[1][1].getText().equals(trenutniIgrac.getZnak()) && polje[2][1].getText().equals(trenutniIgrac.getZnak()) && polje[0][1].getText().equals(" "))
        {

            return 1;
        }

        else if(polje[0][2].getText().equals(trenutniIgrac.getZnak()) && polje[1][2].getText().equals(trenutniIgrac.getZnak()) && polje[2][2].getText().equals(" "))//treci red
        {

            return 1;
        }
        else if(polje[0][2].getText().equals(trenutniIgrac.getZnak()) && polje[2][2].getText().equals(trenutniIgrac.getZnak()) && polje[1][2].getText().equals(" "))
        {

            return 1;
        }
        else if(polje[1][2].getText().equals(trenutniIgrac.getZnak()) && polje[2][2].getText().equals(trenutniIgrac.getZnak()) && polje[0][2].getText().equals(" "))
        {

            return 1;
        }

        else if(polje[0][0].getText().equals(trenutniIgrac.getZnak()) && polje[1][1].getText().equals(trenutniIgrac.getZnak()) && polje[2][2].getText().equals(" "))//  /
        {

            return 1;
        }
        else if(polje[0][0].getText().equals(trenutniIgrac.getZnak()) && polje[2][2].getText().equals(trenutniIgrac.getZnak()) && polje[1][1].getText().equals(" "))
        {

            return 1;
        }
        else if(polje[1][1].getText().equals(trenutniIgrac.getZnak()) && polje[2][2].getText().equals(trenutniIgrac.getZnak()) && polje[0][0].getText().equals(" "))
        {

            return 1;
        }

        else if(polje[0][2].getText().equals(trenutniIgrac.getZnak()) && polje[1][1].getText().equals(trenutniIgrac.getZnak()) && polje[2][0].getText().equals(" "))//  \
        {

            return 1;
        }
        else if(polje[0][2].getText().equals(trenutniIgrac.getZnak()) && polje[2][0].getText().equals(trenutniIgrac.getZnak()) && polje[1][1].getText().equals(" "))
        {

            return 1;
        }
        else if(polje[1][1].getText().equals(trenutniIgrac.getZnak()) && polje[2][0].getText().equals(trenutniIgrac.getZnak()) && polje[0][2].getText().equals(" "))
        {
            return 1;
        }
        else return 0;
    }

    public int block(Button polje[][], Player trenutniIgrac, Player sljedeciIgrac)
    {
        if(polje[0][0].getText().equals(sljedeciIgrac.getZnak()) && polje[0][1].getText().equals(sljedeciIgrac.getZnak()) && polje[0][2].getText().equals(" "))//prvi stupac
        {
            polje[0][2].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[0][0].getText().equals(sljedeciIgrac.getZnak()) && polje[0][2].getText().equals(sljedeciIgrac.getZnak()) && polje[0][1].getText().equals(" "))
        {
            polje[0][1].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[0][1].getText().equals(sljedeciIgrac.getZnak()) && polje[0][2].getText().equals(sljedeciIgrac.getZnak()) && polje[0][0].getText().equals(" "))
        {
            polje[0][0].setText(trenutniIgrac.getZnak());
            return 1;
        }


        else if(polje[1][0].getText().equals(sljedeciIgrac.getZnak()) && polje[1][1].getText().equals(sljedeciIgrac.getZnak()) && polje[1][2].getText().equals(" "))//drugi stupac
        {
            polje[1][2].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[1][0].getText().equals(sljedeciIgrac.getZnak()) && polje[1][2].getText().equals(sljedeciIgrac.getZnak()) && polje[1][1].getText().equals(" "))
        {
            polje[1][1].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[1][1].getText().equals(sljedeciIgrac.getZnak()) && polje[1][2].getText().equals(sljedeciIgrac.getZnak()) && polje[1][0].getText().equals(" "))
        {
            polje[1][0].setText(trenutniIgrac.getZnak());
            return 1;
        }


        else if(polje[2][0].getText().equals(sljedeciIgrac.getZnak()) && polje[2][1].getText().equals(sljedeciIgrac.getZnak()) && polje[2][2].getText().equals(" "))//treci stupac
        {
            polje[2][2].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[2][0].getText().equals(sljedeciIgrac.getZnak()) && polje[2][2].getText().equals(sljedeciIgrac.getZnak()) && polje[2][1].getText().equals(" "))
        {
            polje[2][1].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[2][1].getText().equals(sljedeciIgrac.getZnak()) && polje[2][2].getText().equals(sljedeciIgrac.getZnak()) && polje[2][0].getText().equals(" "))
        {
            polje[2][0].setText(trenutniIgrac.getZnak());
            return 1;
        }

        else if(polje[0][0].getText().equals(sljedeciIgrac.getZnak()) && polje[1][0].getText().equals(sljedeciIgrac.getZnak()) && polje[2][0].getText().equals(" "))//prvi red
        {
            polje[2][0].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[0][0].getText().equals(sljedeciIgrac.getZnak()) && polje[2][0].getText().equals(sljedeciIgrac.getZnak()) && polje[1][0].getText().equals(" "))
        {
            polje[1][0].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[1][0].getText().equals(sljedeciIgrac.getZnak()) && polje[2][0].getText().equals(sljedeciIgrac.getZnak()) && polje[0][0].getText().equals(" "))
        {
            polje[0][0].setText(trenutniIgrac.getZnak());
            return 1;
        }

        else if(polje[0][1].getText().equals(sljedeciIgrac.getZnak()) && polje[1][1].getText().equals(sljedeciIgrac.getZnak()) && polje[2][1].getText().equals(" "))//drugi red
        {
            polje[2][1].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[0][1].getText().equals(sljedeciIgrac.getZnak()) && polje[2][1].getText().equals(sljedeciIgrac.getZnak()) && polje[1][1].getText().equals(" "))
        {
            polje[1][1].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[1][1].getText().equals(sljedeciIgrac.getZnak()) && polje[2][1].getText().equals(sljedeciIgrac.getZnak()) && polje[0][1].getText().equals(" "))
        {
            polje[0][1].setText(trenutniIgrac.getZnak());
            return 1;
        }

        else if(polje[0][2].getText().equals(sljedeciIgrac.getZnak()) && polje[1][2].getText().equals(sljedeciIgrac.getZnak()) && polje[2][2].getText().equals(" "))//treci red
        {
            polje[2][2].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[0][2].getText().equals(sljedeciIgrac.getZnak()) && polje[2][2].getText().equals(sljedeciIgrac.getZnak()) && polje[1][2].getText().equals(" "))
        {
            polje[1][2].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[1][2].getText().equals(sljedeciIgrac.getZnak()) && polje[2][2].getText().equals(sljedeciIgrac.getZnak()) && polje[0][2].getText().equals(" "))
        {
            polje[0][2].setText(trenutniIgrac.getZnak());
            return 1;
        }

        else if(polje[0][0].getText().equals(sljedeciIgrac.getZnak()) && polje[1][1].getText().equals(sljedeciIgrac.getZnak()) && polje[2][2].getText().equals(" "))//  /
        {
            polje[2][2].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[0][0].getText().equals(sljedeciIgrac.getZnak()) && polje[2][2].getText().equals(sljedeciIgrac.getZnak()) && polje[1][1].getText().equals(" "))
        {
            polje[1][1].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[1][1].getText().equals(sljedeciIgrac.getZnak()) && polje[2][2].getText().equals(sljedeciIgrac.getZnak()) && polje[0][0].getText().equals(" "))
        {
            polje[0][0].setText(trenutniIgrac.getZnak());
            return 1;
        }

        else if(polje[0][2].getText().equals(sljedeciIgrac.getZnak()) && polje[1][1].getText().equals(sljedeciIgrac.getZnak()) && polje[2][0].getText().equals(" "))//  \
        {
            polje[2][0].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[0][2].getText().equals(sljedeciIgrac.getZnak()) && polje[2][0].getText().equals(sljedeciIgrac.getZnak()) && polje[1][1].getText().equals(" "))
        {
            polje[1][1].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[1][1].getText().equals(sljedeciIgrac.getZnak()) && polje[2][1].getText().equals(sljedeciIgrac.getZnak()) && polje[0][2].getText().equals(" "))
        {
            polje[0][2].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else return 0;

    }

    public int blockProvjera(Button polje[][], Player trenutniIgrac, Player sljedeciIgrac)
    {
        if(polje[0][0].getText().equals(sljedeciIgrac.getZnak()) && polje[0][1].getText().equals(sljedeciIgrac.getZnak()) && polje[0][2].getText().equals(" "))//prvi stupac
        {
            return 1;
        }
        else if(polje[0][0].getText().equals(sljedeciIgrac.getZnak()) && polje[0][2].getText().equals(sljedeciIgrac.getZnak()) && polje[0][1].getText().equals(" "))
        {
            return 1;
        }
        else if(polje[0][1].getText().equals(sljedeciIgrac.getZnak()) && polje[0][2].getText().equals(sljedeciIgrac.getZnak()) && polje[0][0].getText().equals(" "))
        {
            return 1;
        }


        else if(polje[1][0].getText().equals(sljedeciIgrac.getZnak()) && polje[1][1].getText().equals(sljedeciIgrac.getZnak()) && polje[1][2].getText().equals(" "))//drugi stupac
        {
            return 1;
        }
        else if(polje[1][0].getText().equals(sljedeciIgrac.getZnak()) && polje[1][2].getText().equals(sljedeciIgrac.getZnak()) && polje[1][1].getText().equals(" "))
        {
            return 1;
        }
        else if(polje[1][1].getText().equals(sljedeciIgrac.getZnak()) && polje[1][2].getText().equals(sljedeciIgrac.getZnak()) && polje[1][0].getText().equals(" "))
        {
            return 1;
        }


        else if(polje[2][0].getText().equals(sljedeciIgrac.getZnak()) && polje[2][1].getText().equals(sljedeciIgrac.getZnak()) && polje[2][2].getText().equals(" "))//treci stupac
        {
            return 1;
        }
        else if(polje[2][0].getText().equals(sljedeciIgrac.getZnak()) && polje[2][2].getText().equals(sljedeciIgrac.getZnak()) && polje[2][1].getText().equals(" "))
        {
            return 1;
        }
        else if(polje[2][1].getText().equals(sljedeciIgrac.getZnak()) && polje[2][2].getText().equals(sljedeciIgrac.getZnak()) && polje[2][0].getText().equals(" "))
        {
            return 1;
        }

        else if(polje[0][0].getText().equals(sljedeciIgrac.getZnak()) && polje[1][0].getText().equals(sljedeciIgrac.getZnak()) && polje[2][0].getText().equals(" "))//prvi red
        {

            return 1;
        }
        else if(polje[0][0].getText().equals(sljedeciIgrac.getZnak()) && polje[2][0].getText().equals(sljedeciIgrac.getZnak()) && polje[1][0].getText().equals(" "))
        {

            return 1;
        }
        else if(polje[1][0].getText().equals(sljedeciIgrac.getZnak()) && polje[2][0].getText().equals(sljedeciIgrac.getZnak()) && polje[0][0].getText().equals(" "))
        {

            return 1;
        }

        else if(polje[0][1].getText().equals(sljedeciIgrac.getZnak()) && polje[1][1].getText().equals(sljedeciIgrac.getZnak()) && polje[2][1].getText().equals(" "))//drugi red
        {

            return 1;
        }
        else if(polje[0][1].getText().equals(sljedeciIgrac.getZnak()) && polje[2][1].getText().equals(sljedeciIgrac.getZnak()) && polje[1][1].getText().equals(" "))
        {

            return 1;
        }
        else if(polje[1][1].getText().equals(sljedeciIgrac.getZnak()) && polje[2][1].getText().equals(sljedeciIgrac.getZnak()) && polje[0][1].getText().equals(" "))
        {

            return 1;
        }

        else if(polje[0][2].getText().equals(sljedeciIgrac.getZnak()) && polje[1][2].getText().equals(sljedeciIgrac.getZnak()) && polje[2][2].getText().equals(" "))//treci red
        {

            return 1;
        }
        else if(polje[0][2].getText().equals(sljedeciIgrac.getZnak()) && polje[2][2].getText().equals(sljedeciIgrac.getZnak()) && polje[1][2].getText().equals(" "))
        {

            return 1;
        }
        else if(polje[1][2].getText().equals(sljedeciIgrac.getZnak()) && polje[2][2].getText().equals(sljedeciIgrac.getZnak()) && polje[0][2].getText().equals(" "))
        {

            return 1;
        }

        else if(polje[0][0].getText().equals(sljedeciIgrac.getZnak()) && polje[1][1].getText().equals(sljedeciIgrac.getZnak()) && polje[2][2].getText().equals(" "))//  /
        {

            return 1;
        }
        else if(polje[0][0].getText().equals(sljedeciIgrac.getZnak()) && polje[2][2].getText().equals(sljedeciIgrac.getZnak()) && polje[1][1].getText().equals(" "))
        {

            return 1;
        }
        else if(polje[1][1].getText().equals(sljedeciIgrac.getZnak()) && polje[2][2].getText().equals(sljedeciIgrac.getZnak()) && polje[0][0].getText().equals(" "))
        {

            return 1;
        }

        else if(polje[0][2].getText().equals(sljedeciIgrac.getZnak()) && polje[1][1].getText().equals(sljedeciIgrac.getZnak()) && polje[2][0].getText().equals(" "))//  \
        {

            return 1;
        }
        else if(polje[0][2].getText().equals(sljedeciIgrac.getZnak()) && polje[2][0].getText().equals(sljedeciIgrac.getZnak()) && polje[1][1].getText().equals(" "))
        {

            return 1;
        }
        else if(polje[1][1].getText().equals(sljedeciIgrac.getZnak()) && polje[2][1].getText().equals(sljedeciIgrac.getZnak()) && polje[0][2].getText().equals(" "))
        {

            return 1;
        }
        else return 0;}



    public int fork(Button polje[][], Player trenutniIgrac, Player sljedeciIgrac)
    {
        int r1 = 0, r2=0, s1=0, s2=0, mat1=0, mat2=0, space=0;

        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                if(polje[i][j].getText().equals(trenutniIgrac.getZnak()))
                {
                    r1=i;
                    s1=j;
                }
            }
        }

        for(int i=2; i>0; i--)
        {
            for(int j=2; j>0; j--)
            {
                if(polje[i][j].getText().equals(trenutniIgrac.getZnak()))
                {
                    r2=i;
                    s2=j;
                }
            }
        }

        for(int i=0; i<2; i++)
        {
            if(polje[r1][i].getText().equals(" ")) space++;
        }
        if(space>1)
        {
            mat1++;
            space=0;
        }
        for(int i=0; i<2; i++)
        {
            if(polje[i][s2].getText().equals(" ")) space++;
        }
        if(space>1)
        {
            mat1++;
            space=0;
        }

        for(int i=0; i<2; i++)
        {
            if(polje[r2][i].getText().equals(" ")) space++;
        }
        if(space>1)
        {
            mat2++;
            space=0;
        }
        for(int i=0; i<2; i++)
        {
            if(polje[i][s1].getText().equals(" ")) space++;
        }
        if(space>1)
        {
            mat2++;
            space=0;
        }

        if(mat1>mat2)
        {
            polje[r1][s2].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(mat2>mat1)
        {
            polje[r2][s1].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else return 0;
    }

    public int denyFork(Button polje[][], Player trenutniIgrac, Player sljedeciIgrac)
    {
        int r1 = 0, r2=0, s1=0, s2=0, mat1=0, mat2=0, space=0;

        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                if(polje[i][j].getText().equals(sljedeciIgrac.getZnak()))
                {
                    r1=j;
                    s1=i;
                }
            }
        }

        for(int i=2; i>0; i--)
        {
            for(int j=2; j>0; j--)
            {
                if(polje[i][j].getText().equals(sljedeciIgrac.getZnak()))
                {
                    r2=j;
                    s2=i;
                }
            }
        }

        for(int i=0; i<2; i++)
        {
            if(polje[r1][i].getText().equals(" ")) space++;
        }
        if(space>1)
        {
            mat1++;
            space=0;
        }
        for(int i=0; i<2; i++)
        {
            if(polje[i][s2].getText().equals(" ")) space++;
        }
        if(space>1)
        {
            mat1++;
            space=0;
        }

        for(int i=0; i<2; i++)
        {
            if(polje[r2][i].getText().equals(" ")) space++;
        }
        if(space>1)
        {
            mat2++;
            space=0;
        }
        for(int i=0; i<2; i++)
        {
            if(polje[i][s1].getText().equals(" ")) space++;
        }
        if(space>1)
        {
            mat2++;
            space=0;
        }

        if(mat1>mat2)
        {
            polje[r1][s2].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(mat2>mat1)
        {
            polje[r2][s1].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else return 0;
    }

    public int center(Button polje[][], Player trenutniIgrac, Player sljedeciIgrac)
    {
        if(polje[1][1].getText().equals(" "))
        {
            polje[1][1].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else return 0;
    }

    public int suprotniKut(Button polje[][], Player trenutniIgrac, Player sljedeciIgrac)
    {
        if(polje[0][0].getText().equals(sljedeciIgrac.getZnak()))
        {
            polje[2][2].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[0][2].getText().equals(sljedeciIgrac.getZnak()))
        {
            polje[2][0].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[2][0].getText().equals(sljedeciIgrac.getZnak()))
        {
            polje[0][2].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[2][2].getText().equals(sljedeciIgrac.getZnak()))
        {
            polje[0][0].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else return 0;
    }

    public int suprotniKutProvjera(Button polje[][], Player trenutniIgrac, Player sljedeciIgrac)
    {
        if(polje[0][0].getText().equals(sljedeciIgrac.getZnak()))
        {
            return 1;
        }
        else if(polje[0][2].getText().equals(sljedeciIgrac.getZnak()))
        {
            return 1;
        }
        else if(polje[2][0].getText().equals(sljedeciIgrac.getZnak()))
        {
            return 1;
        }
        else if(polje[2][2].getText().equals(sljedeciIgrac.getZnak()))
        {
            return 1;
        }
        else return 0;
    }

    public int kut(Button polje[][], Player trenutniIgrac, Player sljedeciIgrac)
    {
        if(polje[0][0].getText().equals(" "))
        {
            polje[0][0].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[0][2].getText().equals(" "))
        {
            polje[0][2].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[2][0].getText().equals(" "))
        {
            polje[2][0].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[2][2].getText().equals(" "))
        {
            polje[2][2].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else return 0;
    }

    public int kutProvjera(Button polje[][], Player trenutniIgrac, Player sljedeciIgrac)
    {
        if(polje[0][0].getText().equals(" "))
        {
            return 1;
        }
        else if(polje[0][2].getText().equals(" "))
        {
            return 1;
        }
        else if(polje[2][0].getText().equals(" "))
        {
            return 1;
        }
        else if(polje[2][2].getText().equals(" "))
        {
            return 1;
        }
        else return 0;
    }

    public int strana(Button polje[][], Player trenutniIgrac, Player sljedeciIgrac)
    {
        if(polje[0][1].getText().equals(" "))
        {
            polje[0][1].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[1][0].getText().equals(" "))
        {
            polje[1][0].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[1][2].getText().equals(" "))
        {
            polje[1][2].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else if(polje[2][1].getText().equals(" "))
        {
            polje[2][1].setText(trenutniIgrac.getZnak());
            return 1;
        }
        else return 0;
    }

    public int stranaProvjera(Button polje[][], Player trenutniIgrac, Player sljedeciIgrac)
    {
        if(polje[0][1].getText().equals(" "))
        {
            return 1;
        }
        else if(polje[1][0].getText().equals(" "))
        {
            return 1;
        }
        else if(polje[1][2].getText().equals(" "))
        {
            return 1;
        }
        else if(polje[2][1].getText().equals(" "))
        {
            return 1;
        }
        else return 0;
    }


}