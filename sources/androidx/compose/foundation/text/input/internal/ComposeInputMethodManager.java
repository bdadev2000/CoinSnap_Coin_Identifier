package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import android.view.inputmethod.CursorAnchorInfo;

/* loaded from: classes4.dex */
public interface ComposeInputMethodManager {
    void a(int i2, int i3, int i4, int i5);

    void b();

    void c(CursorAnchorInfo cursorAnchorInfo);

    void e();

    void f();

    void g();

    void sendKeyEvent(KeyEvent keyEvent);
}
