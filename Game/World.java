public class World {
    private Screen[][] screens; //We could go double array
    private int currentXIndex;
    private int currentYIndex;

    private final int AMOUNT_OF_SCREENS = 5; //Total to 25
    private final int CENTER_OF_MAP = 3; //Midpoint Center

    public World() {
        screens = new Screen[AMOUNT_OF_SCREENS][AMOUNT_OF_SCREENS];
        currentXIndex = CENTER_OF_MAP;
        currentYIndex = CENTER_OF_MAP;
    }

    //returns the current screen, used if there is a need to change the screen
    abstract public Screen getScreen();

    //Changes the current screen
    abstract public Screen changeScreen();

    //When the coordinates reach a certain point then change the screen wraparound.
    //@param Player coordinates
    abstract public boolean transitionScreen;

}