package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.key.Key_androidKt;

/* loaded from: classes2.dex */
public final class TextFieldFocusModifier_androidKt {
    public static final boolean a(int i2, KeyEvent keyEvent) {
        return ((int) (Key_androidKt.a(keyEvent.getKeyCode()) >> 32)) == i2;
    }

    public static final Modifier b(Modifier modifier, LegacyTextFieldState legacyTextFieldState, FocusManager focusManager) {
        return KeyInputModifierKt.b(modifier, new TextFieldFocusModifier_androidKt$interceptDPadAndMoveFocus$1(focusManager, legacyTextFieldState));
    }
}
