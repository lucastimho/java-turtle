import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Controller implements ActionListener
{
	View view;

	Controller()
	{
	}
	void setView(View v)
	{
		view = v;
	}

	public void actionPerformed(ActionEvent e)
	{
		view.removeButton();
	}
}
