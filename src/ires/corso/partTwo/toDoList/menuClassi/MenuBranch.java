package ires.corso.partTwo.toDoList.menuClassi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class MenuBranch extends MenuItem {
    private List<MenuItem> _options = new ArrayList<>();
    private boolean _exit;
    private final String _defaultExitMessage = "Indietro";

    // Public constructor
    public MenuBranch(String ID, String title, List<MenuItem> options) {
        super(ID, title);
        _options.addAll( options );
        String exitID = String.valueOf( _options.size() + 1 );
        initExit( exitID, _defaultExitMessage );
    }

    public MenuBranch(String ID, String title, List<MenuItem> options, String exitID, String exitMessage) {
        super(ID, title);
        _options.addAll( options );
        exitID = String.valueOf( _options.size() + 1 );
        initExit( exitID, exitMessage );
    }

    private void initExit( String exitID, String exitMessage){
        MenuLeaf exitLeaf = new MenuLeaf( exitID, exitMessage, () -> _exit = true );
        _options.add( exitLeaf );
    }

    @Override
    public void run() {
        Scanner in = new Scanner(System.in);

        _exit = false;
        do {
            printContent();
            String choice = in.nextLine();
            Optional<MenuItem> selected = _options.stream().filter( o -> o.getID().equals( choice ) ).findFirst();
            if( selected.isPresent() )
                selected.get().run();
            else
                System.out.println( "L'opzione che hai selezionato non è valida." );
        }while( !_exit );
    }

    private void printContent() {
        System.out.println( getTitle() );
        _options.stream().map( MenuItem::toString ).forEach(System.out::println);
    }
}