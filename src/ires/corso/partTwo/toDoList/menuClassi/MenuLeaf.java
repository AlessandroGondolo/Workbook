package ires.corso.partTwo.toDoList.menuClassi;

public class MenuLeaf extends MenuItem
{
    // Temporaneo
    private String _action;
    private Runnable _runAction = null;

    // Public constructor
    public MenuLeaf(String ID, String title, String action) {
        super(ID, title);
        _action = action; // Temporaneo
        _runAction = null; // Temporaneo
    }

    // Public constructor
    /*
    public ToDoMenuLeaf(String ID, String title, Runnable action) {
        super(ID, title);
        _action = "";
        _runAction = action; // Temporaneo
    }
    */

    @Override
    protected void select() {
        // Eseguo l'azione specifica
        System.out.println("Eseguo l'azione: " + _action);
        _runAction.run();
    }
}
