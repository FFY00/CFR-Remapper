package me.coley.gui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;

import me.coley.Program;

/**
 * Prompts a user to select a jar file.
 */
public class ActionChooseFile implements ActionListener {
	private Program callback;

	public ActionChooseFile(Program callback) {
		this.callback = callback;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser chooser = callback.getFileChooser();
		int val = chooser.showOpenDialog(null);
		if (val == JFileChooser.APPROVE_OPTION) {
			callback.onFileSelect(chooser.getSelectedFile());
		}
	}

}