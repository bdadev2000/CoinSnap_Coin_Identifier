package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.Key_androidKt;

/* loaded from: classes2.dex */
public final class KeyMapping_androidKt$platformDefaultKeyMapping$1 implements KeyMapping {
    @Override // androidx.compose.foundation.text.KeyMapping
    public final KeyCommand a(KeyEvent keyEvent) {
        KeyCommand keyCommand = null;
        if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
            long a2 = Key_androidKt.a(keyEvent.getKeyCode());
            if (Key.a(a2, MappedKeys.f6070i)) {
                keyCommand = KeyCommand.SELECT_LINE_LEFT;
            } else if (Key.a(a2, MappedKeys.f6071j)) {
                keyCommand = KeyCommand.SELECT_LINE_RIGHT;
            } else if (Key.a(a2, MappedKeys.f6072k)) {
                keyCommand = KeyCommand.SELECT_HOME;
            } else if (Key.a(a2, MappedKeys.f6073l)) {
                keyCommand = KeyCommand.SELECT_END;
            }
        } else if (keyEvent.isAltPressed()) {
            long a3 = Key_androidKt.a(keyEvent.getKeyCode());
            if (Key.a(a3, MappedKeys.f6070i)) {
                keyCommand = KeyCommand.LINE_LEFT;
            } else if (Key.a(a3, MappedKeys.f6071j)) {
                keyCommand = KeyCommand.LINE_RIGHT;
            } else if (Key.a(a3, MappedKeys.f6072k)) {
                keyCommand = KeyCommand.HOME;
            } else if (Key.a(a3, MappedKeys.f6073l)) {
                keyCommand = KeyCommand.END;
            }
        }
        return keyCommand == null ? KeyMappingKt.f6001a.a(keyEvent) : keyCommand;
    }
}
