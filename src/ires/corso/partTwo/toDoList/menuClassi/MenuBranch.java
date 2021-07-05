package ires.corso.partTwo.toDoList.menuClassi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// OPZIONE: contiene altri elementi
public class MenuBranch extends MenuItem
{
    private List<MenuItem> _options = new ArrayList<>();

    // Public constructor
    public MenuBranch(String ID, String title, List<MenuItem> options) {
        super(ID, title);
        _options.addAll(options);
    }

    @Override
    protected void select()
    {
        Scanner in = new Scanner(System.in);

        boolean exit = false;
        while(!exit) {
            printChoices();
            System.out.println("Scegli un'opzione:");
            String choice = in.nextLine();

            MenuItem t = null;
            for(int i = 0; i < _options.size(); i++) {
                if(choice.equals(_options.get(i).getID())) {
                    t = _options.get(i);
                    break;
                }
            }
            if(t != null)
                t.select();
            else
                exit = true;
        }
    }

    private void printChoices() {
        System.out.println();
        System.out.println(getTitle());
        System.out.println("----------------------------------------------------------------");
        _options.forEach(o -> System.out.println(o.toString()));
        System.out.println("----------------------------------------------------------------");
    }
}