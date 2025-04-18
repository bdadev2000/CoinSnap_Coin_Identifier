package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;

/* loaded from: classes.dex */
class ComposeInputMethodManagerImplApi21 extends ComposeInputMethodManagerImpl {

    /* renamed from: c, reason: collision with root package name */
    public BaseInputConnection f6376c;

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void sendKeyEvent(KeyEvent keyEvent) {
        BaseInputConnection baseInputConnection = this.f6376c;
        if (baseInputConnection == null) {
            baseInputConnection = new BaseInputConnection(this.f6374a, false);
            this.f6376c = baseInputConnection;
        }
        baseInputConnection.sendKeyEvent(keyEvent);
    }
}
