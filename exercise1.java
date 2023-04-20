public class App {

    static boolean iWillNotCheat = true;
    static boolean iWillWin = false;

    public static void main(String[] args) throws Exception {
      
        assert iWillNotCheat == true: "Disqualified!";

        enterCompetition();

        assert iWillWin == true: "Good try!";

        enterCompetition();
    }


    static void enterCompetition(){
        iWillNotCheat = true;
        iWillWin = false;
    }
}
