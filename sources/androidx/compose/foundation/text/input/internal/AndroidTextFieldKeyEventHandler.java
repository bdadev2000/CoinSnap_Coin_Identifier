package androidx.compose.foundation.text.input.internal;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;

@StabilityInferred
/* loaded from: classes4.dex */
public final class AndroidTextFieldKeyEventHandler extends TextFieldKeyEventHandler {
    @Override // androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler
    public final boolean a(KeyEvent keyEvent, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, boolean z2, boolean z3, q0.a aVar) {
        if (KeyEventType.a(KeyEvent_androidKt.a(keyEvent), 2) && keyEvent.isFromSource(257) && (keyEvent.getFlags() & 2) != 2) {
            textFieldSelectionState.f6722k.setValue(Boolean.FALSE);
        }
        return super.a(keyEvent, transformedTextFieldState, textLayoutState, textFieldSelectionState, z2, z3, aVar);
    }

    @Override // androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler
    public final boolean b(KeyEvent keyEvent, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, FocusManager focusManager, SoftwareKeyboardController softwareKeyboardController) {
        if (super.b(keyEvent, transformedTextFieldState, textFieldSelectionState, focusManager, softwareKeyboardController)) {
            return true;
        }
        InputDevice device = keyEvent.getDevice();
        if (device != null && device.supportsSource(513) && !device.isVirtual() && KeyEventType.a(KeyEvent_androidKt.a(keyEvent), 2) && keyEvent.getSource() != 257) {
            if (TextFieldKeyEventHandler_androidKt.a(19, keyEvent)) {
                return focusManager.d(5);
            }
            if (TextFieldKeyEventHandler_androidKt.a(20, keyEvent)) {
                return focusManager.d(6);
            }
            if (TextFieldKeyEventHandler_androidKt.a(21, keyEvent)) {
                return focusManager.d(3);
            }
            if (TextFieldKeyEventHandler_androidKt.a(22, keyEvent)) {
                return focusManager.d(4);
            }
            if (TextFieldKeyEventHandler_androidKt.a(23, keyEvent)) {
                softwareKeyboardController.show();
                return true;
            }
        }
        return false;
    }
}
