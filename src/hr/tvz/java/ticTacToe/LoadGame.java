package hr.tvz.java.ticTacToe;

import java.io.*;

public class LoadGame {

    public void Load (Player p1, Player p2)
    {
        BufferedReader br = null;
        try {
            FileReader fr = new FileReader(new File("ticTacToe.txt"));
            br = new BufferedReader(fr);

            String[] s = new String[8];

            String line;
            while((line = br.readLine()) != null)
            {
                s = line.split("\\|");
            }
            {
                p1.setIme(s[0]);
                p1.setZnak(s[1]);
                p1.setPobijede(Integer.parseInt(s[2]));
                p1.comp = Integer.parseInt(s[3]);
                p2.setIme(s[4]);
                p2.setZnak(s[5]);
                p2.setPobijede(Integer.parseInt(s[6]));
                p2.comp = Integer.parseInt(s[7]);
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally
        {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
