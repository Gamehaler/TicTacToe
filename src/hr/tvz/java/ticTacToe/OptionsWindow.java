package hr.tvz.java.ticTacToe;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class OptionsWindow {

    public void display(Player p1, Player p2, Label lp1, Label lp2, Label ispis, Button[][] p, Integer br)
    {
        Stage optionsStage = new Stage();
        optionsStage.setTitle("Options");
        optionsStage.initModality(Modality.APPLICATION_MODAL);

        Button close = new Button("Close");
        close.setOnAction(e -> {
            optionsStage.close();
        });

        HBox player1info = new HBox();
        Label player1natpis = new Label("Player 1");
        player1natpis.setPadding(new Insets(0, 5, 0, 0));
        TextField p1name = new TextField();
        p1name.setPromptText(p1.getIme());
        p1name.setPrefColumnCount(10);
        player1info.getChildren().addAll(player1natpis, p1name);

        HBox p1znak = new HBox();
        ToggleGroup odabirZnaka = new ToggleGroup();
        RadioButton x = new RadioButton("X");
        x.setSelected(true);
        x.requestFocus();
        x.setToggleGroup(odabirZnaka);
        x.setPadding(new Insets(2, 5, 2, 2));
        RadioButton o = new RadioButton("O");
        o.setToggleGroup(odabirZnaka);
        o.setPadding(new Insets(2, 2, 2, 5));
        p1znak.getChildren().addAll(x, o);
        p1znak.setAlignment(Pos.CENTER);

        HBox player2info = new HBox();
        Label player2natpis = new Label("Player 2");
        player2natpis.setPadding(new Insets(0, 5, 0, 0));
        TextField p2name = new TextField();
        p2name.setPromptText(p2.getIme());
        p2name.setPrefColumnCount(10);
        player2info.getChildren().addAll(player2natpis, p2name);

        HBox p2komp = new HBox();
        ToggleGroup odabirKompa = new ToggleGroup();
        RadioButton player = new RadioButton("Player");
        player.setSelected(true);
        player.requestFocus();
        player.setToggleGroup(odabirKompa);
        player.setPadding(new Insets(2, 5, 2, 2));
        RadioButton comp = new RadioButton("Computer");
        comp.setToggleGroup(odabirKompa);
        comp.setPadding(new Insets(2, 2, 2, 5));
        p2komp.getChildren().addAll(player, comp);
        p2komp.setAlignment(Pos.CENTER);

        HBox kompTezina = new HBox();
        ToggleGroup odabirTezineKompa = new ToggleGroup();
        RadioButton random = new RadioButton("Random");
        random.requestFocus();
        random.setToggleGroup(odabirTezineKompa);
        random.setPadding(new Insets(2, 5, 2, 2));
        random.setVisible(false);
        RadioButton easy = new RadioButton("Easy");
        easy.setToggleGroup(odabirTezineKompa);
        easy.setPadding(new Insets(2, 5, 2, 2));
        easy.setVisible(false);
        RadioButton medium = new RadioButton("Medium");
        medium.setToggleGroup(odabirTezineKompa);
        medium.setPadding(new Insets(2, 2, 2, 5));
        medium.setVisible(false);
        RadioButton hard = new RadioButton("Hard");
        hard.setToggleGroup(odabirTezineKompa);
        hard.setPadding(new Insets(2, 2, 2, 5));
        hard.setVisible(false);
        kompTezina.getChildren().addAll(random, easy, medium, hard);
        kompTezina.setAlignment(Pos.CENTER);

        odabirKompa.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> ov, Toggle t, Toggle t1) {

                RadioButton chk = (RadioButton)t1.getToggleGroup().getSelectedToggle();
                if(chk.getText().equals("Player"))
                {
                    p2.comp=0;
                    p2.setIme("Player 2");
                    random.setVisible(false);
                    easy.setVisible(false);
                    medium.setVisible(false);
                    hard.setVisible(false);
                }
                else if(chk.getText().equals("Computer"))
                {
                    p2.comp=4;
                    p2.setIme("Computer");
                    random.setSelected(true);
                    random.setVisible(true);
                    easy.setVisible(true);
                    medium.setVisible(true);
                    hard.setVisible(true);
                }
            }
        });

        odabirTezineKompa.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> ov, Toggle t, Toggle t1) {

                RadioButton chk = (RadioButton)t1.getToggleGroup().getSelectedToggle();
                if(chk.getText().equals("Easy"))
                {
                    p2.comp=1;
                }
                else if(chk.getText().equals("Medium"))
                {
                    p2.comp=2;
                }
                else if(chk.getText().equals("Hard"))
                {
                    p2.comp=3;
                }
                else if(chk.getText().equals("Random"))
                {
                    p2.comp=4;
                }
            }
        });

        player1info.setPadding(new Insets(10, 0, 5, 0));
        player2info.setPadding(new Insets(5, 0, 10, 0));


        Button submit = new Button("Submit");
        submit.setOnAction(e ->
        {
            if(player.isSelected())
            {
                p2.comp = 0;
            }
            else
            {
                if(easy.isSelected()) p2.comp = 1;
                else if(medium.isSelected()) p2.comp = 2;
                else if(hard.isSelected()) p2.comp = 3;
                else if(random.isSelected()) p2.comp = 4;
            }

            if((p2.getIme().equals("Computer"))&&(p2.comp==0))
            {
                p2.setIme("Player 2");
            }

            if(p1name.getText() != null && !p1name.getText().isEmpty())
            {
                p1.setIme(p1name.getText());
                lp1.setText(p1.getIme() + " \t" + p1.getZnak());
                p1name.setPromptText(p1.getIme());
            }

            if(x.isSelected())
            {
                p1.setZnak("X");
                p2.setZnak("O");
                lp1.setText(p1.getIme() + " \t" + p1.getZnak());
                lp2.setText(p2.getZnak() + " \t" + p2.getIme());
            }
            else if(o.isSelected())
            {
                p1.setZnak("O");
                p2.setZnak("X");
                lp1.setText(p1.getIme() + " \t" + p1.getZnak());
                lp2.setText(p2.getZnak() + " \t" + p2.getIme());
            }

            if(p2name.getText() != null && !p2name.getText().isEmpty())
            {
                p2.setIme(p2name.getText());
                lp2.setText(p2.getZnak() + " \t" + p2.getIme());
                p2name.setPromptText(p2.getIme());
            }

            Main brisanje = new Main();
            brisanje.brisi(p);
            brisanje.resetBrojaca(br);
            ispis.setText("");

            optionsStage.close();
        });

        GridPane buttonsBox = new GridPane();
        buttonsBox.setHgap(10);
        buttonsBox.add(submit, 0, 0);
        buttonsBox.add(close, 1, 0);
        buttonsBox.setAlignment(Pos.CENTER);
        buttonsBox.setPadding(new Insets(2, 0, 5, 0));

        VBox optionsLayout = new VBox();
        optionsLayout.getChildren().addAll(player1info, p1znak, player2info, p2komp, kompTezina, buttonsBox);
        optionsLayout.setAlignment(Pos.CENTER);
        optionsLayout.setPadding(new Insets(5, 10, 5, 10));
        Scene optionsScene = new Scene(optionsLayout);
        optionsStage.setScene(optionsScene);
        optionsStage.showAndWait();
    }
}
