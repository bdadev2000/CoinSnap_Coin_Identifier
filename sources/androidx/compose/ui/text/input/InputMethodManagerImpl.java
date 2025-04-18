package androidx.compose.ui.text.input;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.SoftwareKeyboardControllerCompat;
import b1.f0;
import d0.h;
import d0.i;

@StabilityInferred
@d0.a
/* loaded from: classes2.dex */
public final class InputMethodManagerImpl implements InputMethodManager {

    /* renamed from: a, reason: collision with root package name */
    public final View f17337a;

    /* renamed from: b, reason: collision with root package name */
    public final h f17338b = f0.s(i.f30133c, new InputMethodManagerImpl$imm$2(this));

    /* renamed from: c, reason: collision with root package name */
    public final SoftwareKeyboardControllerCompat f17339c;

    public InputMethodManagerImpl(View view) {
        this.f17337a = view;
        this.f17339c = new SoftwareKeyboardControllerCompat(view);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public final void a(int i2, int i3, int i4, int i5) {
        ((android.view.inputmethod.InputMethodManager) this.f17338b.getValue()).updateSelection(this.f17337a, i2, i3, i4, i5);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public final void b() {
        ((android.view.inputmethod.InputMethodManager) this.f17338b.getValue()).restartInput(this.f17337a);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public final void c(CursorAnchorInfo cursorAnchorInfo) {
        ((android.view.inputmethod.InputMethodManager) this.f17338b.getValue()).updateCursorAnchorInfo(this.f17337a, cursorAnchorInfo);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public final void d(int i2, ExtractedText extractedText) {
        ((android.view.inputmethod.InputMethodManager) this.f17338b.getValue()).updateExtractedText(this.f17337a, i2, extractedText);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public final void e() {
        this.f17339c.b();
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public final void f() {
        this.f17339c.a();
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public final boolean isActive() {
        return ((android.view.inputmethod.InputMethodManager) this.f17338b.getValue()).isActive(this.f17337a);
    }
}
