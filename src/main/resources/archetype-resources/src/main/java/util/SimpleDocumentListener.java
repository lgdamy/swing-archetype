#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.util;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * @author lgdamy on 22/01/2021
 */
public interface SimpleDocumentListener extends DocumentListener {
    @Override
    default void insertUpdate(DocumentEvent documentEvent) {
        update(documentEvent);
    }

    @Override
    default void removeUpdate(DocumentEvent documentEvent) {
        update(documentEvent);
    }

    @Override
    default void changedUpdate(DocumentEvent documentEvent) {
        update(documentEvent);
    }

    void update(DocumentEvent ev);
}
