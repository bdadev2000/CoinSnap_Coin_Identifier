package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes.dex */
class ComposeInputMethodManagerImplApi24 extends ComposeInputMethodManagerImplApi21 {
    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManagerImplApi21, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public final void sendKeyEvent(KeyEvent keyEvent) {
        d().dispatchKeyEventFromInputMethod(this.f6374a, keyEvent);
    }
}
