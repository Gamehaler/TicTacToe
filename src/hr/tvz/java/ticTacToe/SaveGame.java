package hr.tvz.java.ticTacToe;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveGame {

    public int Spremi(Player p1, Player p2)
    {
        int provjera = 0;
        try {
            String content = p1.getIme() + "|" + p1.getZnak() + "|" + Integer.toString(p1.getPobijede()) + "|" +
                    Integer.toString(p1.comp) + "|" + p2.getIme() + "|" + p2.getZnak() + "|" +
                    Integer.toString(p2.getPobijede()) + "|" + Integer.toString(p2.comp);

            File file = new File("ticTacToe.txt");

            if(file.exists())
            {
                Stage stageProvjera = new Stage();
                Button da = new Button("yes");
                da.setOnAction(e -> stageProvjera.close());
                Button ne = new Button("No");
                ne.setOnAction(e ->
                {
                    stageProvjera.close();
                    return;
                });
                String stringIspisa = new String ("Save already exists, do you want to overwrite it?");
                Label ispisProvjere = new Label(stringIspisa);
                HBox buttons = new HBox(10);
                buttons.setAlignment(Pos.CENTER);
                VBox layout = new VBox(10);
                layout.setAlignment(Pos.CENTER);
                buttons.getChildren().addAll(da, ne);
                layout.getChildren().addAll(ispisProvjere, buttons);
                Scene scenaProvjere = new Scene(layout, 300, 150);
                stageProvjera.setScene(scenaProvjere);
                stageProvjera.show();
            }

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();

            provjera = 1;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return provjera;
    }
}
