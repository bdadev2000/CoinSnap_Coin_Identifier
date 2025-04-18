package androidx.compose.foundation.text.input.internal;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.core.view.SoftwareKeyboardControllerCompat;

/* loaded from: classes3.dex */
abstract class ComposeInputMethodManagerImpl implements ComposeInputMethodManager {

    /* renamed from: a, reason: collision with root package name */
    public final View f6374a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.inputmethod.InputMethodManager f6375b;

    public ComposeInputMethodManagerImpl(View view) {
        this.f6374a = view;
        new SoftwareKeyboardControllerCompat(view);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public final void a(int i2, int i3, int i4, int i5) {
        d().updateSelection(this.f6374a, i2, i3, i4, i5);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public final void b() {
        d().restartInput(this.f6374a);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public final void c(CursorAnchorInfo cursorAnchorInfo) {
        d().updateCursorAnchorInfo(this.f6374a, cursorAnchorInfo);
    }

    public final android.view.inputmethod.InputMethodManager d() {
        android.view.inputmethod.InputMethodManager inputMethodManager = this.f6375b;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        Object systemService = this.f6374a.getContext().getSystemService("input_method");
        p0.a.q(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        android.view.inputmethod.InputMethodManager inputMethodManager2 = (android.view.inputmethod.InputMethodManager) systemService;
        this.f6375b = inputMethodManager2;
        return inputMethodManager2;
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void e() {
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void f() {
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void g() {
    }
}
