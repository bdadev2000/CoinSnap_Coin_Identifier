package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.SoftwareKeyboardControllerCompat;
import b1.f0;
import d0.h;
import d0.i;

@StabilityInferred
/* loaded from: classes.dex */
public final class InputMethodManagerImpl implements InputMethodManager {

    /* renamed from: a, reason: collision with root package name */
    public final View f6418a;

    /* renamed from: b, reason: collision with root package name */
    public final h f6419b = f0.s(i.f30133c, new InputMethodManagerImpl$imm$2(this));

    public InputMethodManagerImpl(View view) {
        this.f6418a = view;
        new SoftwareKeyboardControllerCompat(view);
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public final void a(int i2, int i3, int i4, int i5) {
        f().updateSelection(this.f6418a, i2, i3, i4, i5);
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public final void b() {
        f().restartInput(this.f6418a);
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public final void c(CursorAnchorInfo cursorAnchorInfo) {
        f().updateCursorAnchorInfo(this.f6418a, cursorAnchorInfo);
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public final void d(int i2, ExtractedText extractedText) {
        f().updateExtractedText(this.f6418a, i2, extractedText);
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public final void e() {
        if (Build.VERSION.SDK_INT >= 34) {
            Api34StartStylusHandwriting.f6368a.a(f(), this.f6418a);
        }
    }

    public final android.view.inputmethod.InputMethodManager f() {
        return (android.view.inputmethod.InputMethodManager) this.f6419b.getValue();
    }

    @Override // androidx.compose.foundation.text.input.internal.InputMethodManager
    public final boolean isActive() {
        return f().isActive(this.f6418a);
    }
}
