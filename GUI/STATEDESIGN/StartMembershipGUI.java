// Author -Emmet Browne
/* Concrete State
 * 
 * 
 */
package GUI.STATEDESIGN;

import java.io.FileNotFoundException;
import java.io.IOException;

import GUI.Factory.GUI;
import GUI.Factory.GUIFactory;

public class StartMembershipGUI implements State {

    @Override
    public void enterGUI() throws FileNotFoundException, IOException {
        // We decided to use Factory method here 
        GUIFactory gui = new GUIFactory();
        GUI Membership = gui.getGUI("Membership");
        Membership.Create();

    }

}