package androidx.compose.ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;

@d0.a
/* loaded from: classes2.dex */
public interface InputMethodManager {
    void a(int i2, int i3, int i4, int i5);

    void b();

    void c(CursorAnchorInfo cursorAnchorInfo);

    void d(int i2, ExtractedText extractedText);

    void e();

    void f();

    boolean isActive();
}
