public class Character {
    private int xCoord;
    private int yCoord;
    private double movementSpeed;
    private double spriteScaling;
    private boolean isMoving;
    private boolean actionDone;
    private int health;

    private final int X_COORD_START = 250;
    private final int Y_COORD_START = 250;
    private final int GENERAL_HEALTH = 10000;

    public Character() {
        xCoord = X_COORD_START;
        yCoord = Y_COORD_START;
        movementSpeed = 1;
        spriteScaling = .5;
        items = ITEMS_LIST_SIZE;
        isMoving = false;
        actionDone = false;
        health = GENERAL_HEALTH;
    }

    //Moves the PC in one unit in the direction given returns true if coordinate changes
    //We change the coordinate that concides with the input accoding to the input Param
    //@param direction
    abstract public boolean movement;

    //Checks if an action was done with the item equipped
    abstract public boolean actionDone;

    //When the coordinates reach a certain point then change the screen wraparound.
    abstract public boolean transitionScreen;

    //Detects collision between objects
    abstract public boolean detectCollision;

    //Checks damage dealt
    //Based on the item that collides
    abstract public boolean damageDealt;

    //Checks movement speed
    //@param environmental input based on either the enemy type or on the current environment
    abstract public double movementSpeed;

}
