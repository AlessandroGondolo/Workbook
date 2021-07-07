package ires.corso.partTwo.toDoList.menuClassi;

import ires.corso.partTwo.toDoList.ToDoImportExport;
import ires.corso.partTwo.toDoList.ToDoList;
import ires.corso.partTwo.toDoList.ToDoManager;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuTester {
    private static MenuBranch createMenu() {

        MenuLeaf byPriority = new MenuLeaf("1", "Per priorità", ToDoList::viewByPriority);
        MenuLeaf byDate = new MenuLeaf("2", "Per data", ToDoList::viewByDate);
        MenuLeaf byState = new MenuLeaf("3", "Per stato", ToDoList::viewByState);
        MenuBranch visualizzaMenu = new MenuBranch("1", "Visualizza", Arrays.asList(byPriority, byDate, byState));

        MenuLeaf addToDo = new MenuLeaf("1", "Aggiungi", ToDoManager::createNewToDo);
        MenuLeaf removeToDo = new MenuLeaf("2", "Rimuovi", ToDoManager::deleteTodo);
        MenuLeaf editToDo = new MenuLeaf("3", "Modifica", ToDoManager::updateToDo);
        MenuBranch editMenu = new MenuBranch("2", "Aggiungi, Rimuovi, Modifica", Arrays.asList(addToDo, removeToDo, editToDo));

        MenuBranch mainMenu = new MenuBranch("MainMenu", "Menu Principale", Arrays.asList(visualizzaMenu, editMenu), "3", "Esci");
        return mainMenu;
    }
}