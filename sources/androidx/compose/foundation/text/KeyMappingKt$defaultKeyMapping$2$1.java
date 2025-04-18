package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.Key_androidKt;

/* loaded from: classes2.dex */
public final class KeyMappingKt$defaultKeyMapping$2$1 implements KeyMapping {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ KeyMapping f6004a;

    public KeyMappingKt$defaultKeyMapping$2$1(KeyMappingKt$commonKeyMapping$1 keyMappingKt$commonKeyMapping$1) {
        this.f6004a = keyMappingKt$commonKeyMapping$1;
    }

    @Override // androidx.compose.foundation.text.KeyMapping
    public final KeyCommand a(KeyEvent keyEvent) {
        KeyCommand keyCommand = null;
        if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
            long a2 = Key_androidKt.a(keyEvent.getKeyCode());
            int i2 = MappedKeys.f6084y;
            if (Key.a(a2, MappedKeys.f6070i)) {
                keyCommand = KeyCommand.SELECT_LEFT_WORD;
            } else if (Key.a(a2, MappedKeys.f6071j)) {
                keyCommand = KeyCommand.SELECT_RIGHT_WORD;
            } else if (Key.a(a2, MappedKeys.f6072k)) {
                keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
            } else if (Key.a(a2, MappedKeys.f6073l)) {
                keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
            }
        } else if (keyEvent.isCtrlPressed()) {
            long a3 = Key_androidKt.a(keyEvent.getKeyCode());
            int i3 = MappedKeys.f6084y;
            if (Key.a(a3, MappedKeys.f6070i)) {
                keyCommand = KeyCommand.LEFT_WORD;
            } else if (Key.a(a3, MappedKeys.f6071j)) {
                keyCommand = KeyCommand.RIGHT_WORD;
            } else if (Key.a(a3, MappedKeys.f6072k)) {
                keyCommand = KeyCommand.PREV_PARAGRAPH;
            } else if (Key.a(a3, MappedKeys.f6073l)) {
                keyCommand = KeyCommand.NEXT_PARAGRAPH;
            } else if (Key.a(a3, MappedKeys.f6066c)) {
                keyCommand = KeyCommand.DELETE_PREV_CHAR;
            } else if (Key.a(a3, MappedKeys.f6081t)) {
                keyCommand = KeyCommand.DELETE_NEXT_WORD;
            } else if (Key.a(a3, MappedKeys.f6080s)) {
                keyCommand = KeyCommand.DELETE_PREV_WORD;
            } else if (Key.a(a3, MappedKeys.f6069h)) {
                keyCommand = KeyCommand.DESELECT;
            }
        } else if (keyEvent.isShiftPressed()) {
            long a4 = Key_androidKt.a(keyEvent.getKeyCode());
            int i4 = MappedKeys.f6084y;
            if (Key.a(a4, MappedKeys.f6076o)) {
                keyCommand = KeyCommand.SELECT_LINE_LEFT;
            } else if (Key.a(a4, MappedKeys.f6077p)) {
                keyCommand = KeyCommand.SELECT_LINE_RIGHT;
            }
        } else if (keyEvent.isAltPressed()) {
            long a5 = Key_androidKt.a(keyEvent.getKeyCode());
            int i5 = MappedKeys.f6084y;
            if (Key.a(a5, MappedKeys.f6080s)) {
                keyCommand = KeyCommand.DELETE_FROM_LINE_START;
            } else if (Key.a(a5, MappedKeys.f6081t)) {
                keyCommand = KeyCommand.DELETE_TO_LINE_END;
            }
        }
        return keyCommand == null ? this.f6004a.a(keyEvent) : keyCommand;
    }
}
