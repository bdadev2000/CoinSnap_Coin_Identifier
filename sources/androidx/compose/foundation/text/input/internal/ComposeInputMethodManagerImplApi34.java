package androidx.compose.foundation.text.input.internal;

import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes.dex */
class ComposeInputMethodManagerImplApi34 extends ComposeInputMethodManagerImplApi24 {
    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManagerImpl, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public final void e() {
        d().startStylusHandwriting(this.f6374a);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManagerImpl, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public final void f() {
        d().prepareStylusHandwritingDelegation(this.f6374a);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManagerImpl, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public final void g() {
        d().acceptStylusHandwritingDelegation(this.f6374a);
    }
}
