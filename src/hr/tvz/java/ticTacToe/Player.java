package hr.tvz.java.ticTacToe;

public class Player {
    private String ime;
    private String znak;
    private int pobijede;
    public int comp;
    public static int ukupanBrojIgraca = 0;

    public Player()
    {
        ime = "Player " + Integer.toString(ukupanBrojIgraca + 1);
        if(ukupanBrojIgraca%2 == 0) znak = "X";
        else znak = "O";
        pobijede = 0;
        ukupanBrojIgraca++;
        comp = 0;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getZnak() {
        return znak;
    }

    public void setZnak(String znak) {
        this.znak = znak;
    }

    public int getPobijede() {
        return pobijede;
    }

    public void setPobijede(int pobijede) {
        this.pobijede = pobijede;
    }
}
