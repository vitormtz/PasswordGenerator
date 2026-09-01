/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordgenerator.suporte;

import javax.swing.text.AttributeSet;
import javax.swing.text.PlainDocument;
import javax.swing.text.BadLocationException;

/**
 *
 * @author vitor
 */
public class Formatacao extends PlainDocument {

    @Override
    public void insertString(int offs, String str, AttributeSet attr)
            throws BadLocationException {

        if (str == null) {
            return;
        }

        String palAprov = str.replaceAll("[^ =!\\^#&_@%+\\-?*|${}\\[\\]()/\\\\\\'\"`~,;:.<>]", "");
        int tamanhoMax = 33;

        int tamPal = (getLength() + str.length());
        if (tamPal <= tamanhoMax) {
            super.insertString(offs, palAprov, attr);
        }
    }
}
