package hr.tvz.java.ticTacToe;

import hr.tvz.java.ticTacToe.Leo.Easy;
import hr.tvz.java.ticTacToe.Leo.Hard;
import hr.tvz.java.ticTacToe.Leo.Medium;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;

public class Main extends Application {

    Player p1 = new Player();
    Player p2 = new Player();
    Button[][] polje = new Button[3][3];
    int br = 0, pobijeda = 0;
    Label labelPlayer1BrojPobjeda = new Label(Integer.toString(p1.getPobijede()));
    Label labelPlayer2BrojPobjeda = new Label(Integer.toString(p2.getPobijede()));

    // Pozivanje start metode
    public static void main(String[] args) {launch(args);}

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Postavljanje zaglavnog teksta
        primaryStage.setTitle("Tic tac toe");

        // Inicijalizacija ispisa
        Label ispis = new Label("");

        ispis.setPadding(new Insets(5, 0, 10, 0));

        // Inicijalizacija gumba
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                polje[i][j] = new Button(" ");
                polje[i][j].setMaxWidth(60);
                polje[i][j].setMinWidth(60);
                polje[i][j].setMaxHeight(60);
                polje[i][j].setMinHeight(60);
            }
        }

        // onClick listener za sve gumbe
        polje[0][0].setOnAction(e -> pritisakGumba(0, 0, ispis));
        polje[0][1].setOnAction(e -> pritisakGumba(0, 1, ispis));
        polje[0][2].setOnAction(e -> pritisakGumba(0, 2, ispis));
        polje[1][0].setOnAction(e -> pritisakGumba(1, 0, ispis));
        polje[1][1].setOnAction(e -> pritisakGumba(1, 1, ispis));
        polje[1][2].setOnAction(e -> pritisakGumba(1, 2, ispis));
        polje[2][0].setOnAction(e -> pritisakGumba(2, 0, ispis));
        polje[2][1].setOnAction(e -> pritisakGumba(2, 1, ispis));
        polje[2][2].setOnAction(e -> pritisakGumba(2, 2, ispis));


        // Postavljanje layout-a za gumbe
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(30, 0, 30, 0));
        grid.setAlignment(Pos.CENTER);
        for(int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                grid.add(polje[i][j], i, j);
            }
        }

        Button sljedecaPartija = new Button("Next round");
        sljedecaPartija.setMinWidth(100);
        sljedecaPartija.setOnAction(e ->
        {
            osposobiPolje(polje);
            brisi(polje);
            ispis.setText("");
            br = 0;
        });

        VBox centar = new VBox();
        centar.setAlignment(Pos.CENTER);
        centar.getChildren().addAll(ispis, grid, sljedecaPartija);

        Label labelPlayer1Name = new Label(p1.getIme() + " \t" + p1.getZnak());
        labelPlayer1Name.setMinWidth(100);
        VBox layoutPlayer1 = new VBox(10);
        layoutPlayer1.setPadding(new Insets(5, 0, 0, 10));
        layoutPlayer1.getChildren().addAll(labelPlayer1Name, labelPlayer1BrojPobjeda);

        Label labelPlayer2Name = new Label(p2.getZnak() + " \t" + p2.getIme());
        labelPlayer2Name.setAlignment(Pos.CENTER_RIGHT);
        labelPlayer2Name.setMinWidth(100);
        VBox layoutPlayer2 = new VBox(10);
        layoutPlayer2.setPadding(new Insets(5, 10, 0, 0));
        layoutPlayer2.setAlignment(Pos.TOP_RIGHT);
        layoutPlayer2.getChildren().addAll(labelPlayer2Name, labelPlayer2BrojPobjeda);

        MenuBar menuBar = new MenuBar();
        Menu menuFile = new Menu("File");

        MenuItem newGame = new MenuItem("New game");
        newGame.setOnAction(e ->
        {
            brisi(polje);
            osposobiPolje(polje);
            p1.setPobijede(0);
            p2.setPobijede(0);
            labelPlayer1BrojPobjeda.setText(Integer.toString(p1.getPobijede()));
            labelPlayer2BrojPobjeda.setText(Integer.toString(p2.getPobijede()));
        });

        MenuItem save = new MenuItem("Save");
        save.setOnAction(e ->
        {
            SaveGame saveGame = new SaveGame();
            int i = saveGame.Spremi(p1, p2);
            if(i == 0)
            {
                Stage obavijest = new Stage();
                Button ok = new Button("OK");
                ok.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        obavijest.close();
                    }
                });
                Label ispisProvjere = new Label("Error: Unable to save.");
                VBox layout = new VBox(10);
                layout.setAlignment(Pos.CENTER);
                layout.getChildren().addAll(ispisProvjere, ok);
                Scene scenaProvjere = new Scene(layout, 300, 150);
                obavijest.setScene(scenaProvjere);
                obavijest.show();
            }
        });

        MenuItem load = new MenuItem("Load");
        load.setOnAction(e ->
        {
            LoadGame loadGame = new LoadGame();
            loadGame.Load(p1, p2);
            labelPlayer1Name.setText(p1.getIme() + " \t" + p1.getZnak());
            labelPlayer2Name.setText(p2.getZnak() + " \t" + p2.getIme());
            labelPlayer1BrojPobjeda.setText(Integer.toString(p1.getPobijede()));
            labelPlayer2BrojPobjeda.setText(Integer.toString(p2.getPobijede()));
        });

        MenuItem options = new MenuItem("Options");
        options.setOnAction(e ->
        {
            OptionsWindow optionsW = new OptionsWindow();
            optionsW.display(p1, p2, labelPlayer1Name, labelPlayer2Name, ispis, polje, br);
        });


        MenuItem exit = new MenuItem("Exit");
        exit.setOnAction(e -> primaryStage.close());

        menuFile.getItems().addAll(newGame, save, load, options, exit);

        menuBar.getMenus().addAll(menuFile);

        BorderPane glavni = new BorderPane();
        glavni.setCenter(centar);
        glavni.setTop(menuBar);
        glavni.setLeft(layoutPlayer1);
        glavni.setRight(layoutPlayer2);

        Scene scene = new Scene(glavni, 500, 400);

        primaryStage.setScene(scene);
        primaryStage.show();

        /*
        while(br<9||pobijeda<1)
        {
            Player trenutni = new Player();
            Player sljedeci = new Player();
            if(br%2==0)
            {
                trenutni = p1;
                sljedeci = p2;
            }
            else
            {
                trenutni = p2;
                sljedeci = p1;
            }
            if(trenutni.comp == 0)
            {
                osposobiPolje(polje);
            }
            else if(trenutni.comp > 0)
            {
                onesposobiPolje(polje);
                switch (trenutni.comp) {
                    case 1:
                        Easy izi = new Easy();
                        izi.easy(polje, trenutni, sljedeci);
                        break;
                    case 2:
                        Medium med = new Medium();
                        med.medium(polje, trenutni, sljedeci);
                        break;
                    case 3:
                        Hard har = new Hard();
                        har.hard(polje, trenutni, sljedeci);
                        break;
                }
            }
        }
        */
    }

    public void pritisakGumba(int x, int y, Label ispis) //x - x koordinata, y - y koordinata, ispis - glavni label s porukom
    {
        Player trenutniIgrac ;
        Player sljedeciIgrac ;
        if (br % 2 == 0) {
            trenutniIgrac = p1;
            sljedeciIgrac = p2;
        } else {
            trenutniIgrac = p2;
            sljedeciIgrac = p1;
        }

        if(trenutniIgrac.comp==0)
        {
            if (polje[x][y].getText().equals(" ")) {

                polje[x][y].setText(trenutniIgrac.getZnak());
                br++;

                provjera(x, y, ispis, trenutniIgrac);

                if (!polje[0][0].isDisable())
                    ispis.setText("It's " + sljedeciIgrac.getIme() + " (" + sljedeciIgrac.getZnak() + ") turn");

                if((sljedeciIgrac.comp > 0) && (!polje[0][0].isDisable())) {

                    /*
                    int provjera = 0;
                    Random rand = new Random();

                    while (provjera == 0) {
                        int nasumicni = rand.nextInt(9);
                        int r, s;
                        r = nasumicni / 3;
                        s = nasumicni % 3;
                        if (polje[r][s].getText().equals(" "))
                        {
                            polje[r][s].setText(sljedeciIgrac.getZnak());
                            provjera = 1;
                            br++;
                            provjera(r, s, ispis, sljedeciIgrac);
                        }
                    }*/


                    switch (sljedeciIgrac.comp) {
                        case 1:
                            Easy izi = new Easy();
                            izi.easy(polje, sljedeciIgrac, trenutniIgrac);
                            br++;
                            provjera(x, y, ispis, sljedeciIgrac);
                            break;
                        case 2:
                            Medium med = new Medium();
                            med.medium(polje, sljedeciIgrac, trenutniIgrac);
                            br++;
                            provjera(x, y, ispis, sljedeciIgrac);
                            break;
                        case 3:
                            Hard har = new Hard();
                            har.hard(polje, sljedeciIgrac, trenutniIgrac);
                            br++;
                            provjera(x, y, ispis, sljedeciIgrac);
                            break;
                        case 4:
                            int provjera = 0;
                            Random rand = new Random();

                            while (provjera == 0) {
                                int nasumicni = rand.nextInt(9);
                                int r, s;
                                r = nasumicni / 3;
                                s = nasumicni % 3;
                                if (polje[r][s].getText().equals(" ")) {
                                    polje[r][s].setText(sljedeciIgrac.getZnak());
                                    provjera = 1;
                                    br++;
                                    provjera(r, s, ispis, sljedeciIgrac);
                                }
                            }
                            break;
                    }
                    if (!polje[0][0].isDisable())
                        ispis.setText("It's " + trenutniIgrac.getIme() + " (" + trenutniIgrac.getZnak() + ") turn");
                }
            } else {
                ispis.setText("Field already filled!");
            }
        }
    }

    public void provjera(int x, int y, Label ispis, Player trenutni)
    {
        //provjera stupca
        for (int i = 0; i < 3; i++) {
            if (!polje[x][i].getText().equals(trenutni.getZnak()))
                break;
            if (i == 3 - 1) {
                ispis.setText(trenutni.getIme() + " won!");
                br = 0;
                onesposobiPolje(polje);
                trenutni.setPobijede(trenutni.getPobijede() + 1);
                labelPlayer1BrojPobjeda.setText(Integer.toString(p1.getPobijede()));
                labelPlayer2BrojPobjeda.setText(Integer.toString(p2.getPobijede()));
            }
        }

        //provjera reda
        for (int i = 0; i < 3; i++) {
            if (!polje[i][y].getText().equals(trenutni.getZnak()))
                break;
            if (i == 3 - 1) {
                ispis.setText(trenutni.getIme() + " won!");
                br = 0;
                onesposobiPolje(polje);
                trenutni.setPobijede(trenutni.getPobijede() + 1);
                labelPlayer1BrojPobjeda.setText(Integer.toString(p1.getPobijede()));
                labelPlayer2BrojPobjeda.setText(Integer.toString(p2.getPobijede()));
            }
        }

        //provjera dijagonale
        if (x == y) {
            //we're on a diagonal
            for (int i = 0; i < 3; i++) {
                if (!polje[i][i].getText().equals(trenutni.getZnak()))
                    break;
                if (i == 3 - 1) {
                    ispis.setText(trenutni.getIme() + " won!");
                    br = 0;
                    onesposobiPolje(polje);
                    trenutni.setPobijede(trenutni.getPobijede() + 1);
                    labelPlayer1BrojPobjeda.setText(Integer.toString(p1.getPobijede()));
                    labelPlayer2BrojPobjeda.setText(Integer.toString(p2.getPobijede()));
                }
            }
        }
        //provjera kontra dijagonale
        for (int i = 0; i < 3; i++) {
            if (!polje[i][(3 - 1) - i].getText().equals(trenutni.getZnak()))
                break;
            if (i == 3 - 1) {
                ispis.setText(trenutni.getIme() + " won!");
                br = 0;
                onesposobiPolje(polje);
                trenutni.setPobijede(trenutni.getPobijede() + 1);
                labelPlayer1BrojPobjeda.setText(Integer.toString(p1.getPobijede()));
                labelPlayer2BrojPobjeda.setText(Integer.toString(p2.getPobijede()));
            }
        }

        //provjera izjednačenja
        if (br == (9)) {
            ispis.setText("It's a draw");
            br = 0;
            onesposobiPolje(polje);
        }
    }

    public void brisi(Button[][] p)
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                p[i][j].setText(" ");
            }
        }
    }

    private void osposobiPolje (Button[][] p)
    {
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                p[i][j].setDisable(false);
            }
        }
    }

    private void onesposobiPolje (Button[][] p)
    {
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                p[i][j].setDisable(true);
            }
        }
    }
    public void resetBrojaca (int brojac)
    {
        brojac = 0;
    }
}
