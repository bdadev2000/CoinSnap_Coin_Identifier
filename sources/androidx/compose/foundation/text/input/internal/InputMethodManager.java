package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;

/* loaded from: classes3.dex */
public interface InputMethodManager {
    void a(int i2, int i3, int i4, int i5);

    void b();

    void c(CursorAnchorInfo cursorAnchorInfo);

    void d(int i2, ExtractedText extractedText);

    void e();

    boolean isActive();
}
