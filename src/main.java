import fitnesstracker.view.guiCardLayout;

public class main {
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				guiCardLayout gui = new guiCardLayout();
				gui.createWindow();
				gui.showGui();
			}
		});
 	}
}
