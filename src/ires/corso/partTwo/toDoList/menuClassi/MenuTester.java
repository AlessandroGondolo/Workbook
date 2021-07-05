package ires.corso.partTwo.toDoList.menuClassi;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuTester
{
    public static void main(String[] args)
    {
        MenuLeaf a11 = new MenuLeaf("A", "Per priorità", "[[ STAMPO TODO LIST PER PRIORITY ]]");
        MenuLeaf a12 = new MenuLeaf("B", "Per Data", "[[ STAMPO TODO LIST PER DATE ]]");
        MenuLeaf a13 = new MenuLeaf("C", "Per Stato", "[[ STAMPO TODO LIST PER STATUS ]]");
        MenuBranch b1 = new MenuBranch("A", "Visualizza", new ArrayList(Arrays.asList(a11, a12, a13)));

        MenuLeaf a21 = new MenuLeaf("A", "Aggiungi", "[[ AGGIUNGO TODO ITEM ]]");
        MenuLeaf a22 = new MenuLeaf("B", "Modifica", "[[ MODIFICO TODO ITEM ]]");
        MenuLeaf a23 = new MenuLeaf("C", "Rimuovi", "[[ RIMUOVO TODO ITEM ]]");
        MenuBranch b2 = new MenuBranch("B", "Aggiungi, Modifica, Rimuovi", new ArrayList(Arrays.asList(a21, a22, a23)));

        MenuLeaf a31 = new MenuLeaf("A", "Import", "[[ IMPORT ]]");
        MenuLeaf a32 = new MenuLeaf("B", "Export", "[[ EXPORT ]]");
        MenuBranch b3 = new MenuBranch("C", "Import/Export", new ArrayList(Arrays.asList(a31, a32)));

        MenuLeaf a41 = new MenuLeaf("D", "Uscita", "[[ EXIT ]]");

        MenuBranch main = new MenuBranch("MAIN", "MENU PRINCIPALE", new ArrayList(Arrays.asList(b1, b2, b3, a41)));
        main.select();
    }
}