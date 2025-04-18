package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key_androidKt;

/* loaded from: classes.dex */
public final class TextFieldKeyEventHandler_androidKt {
    public static final boolean a(int i2, KeyEvent keyEvent) {
        return ((int) (Key_androidKt.a(keyEvent.getKeyCode()) >> 32)) == i2;
    }
}
