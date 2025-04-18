package androidx.compose.ui.platform;

import d0.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final /* synthetic */ class AndroidComposeView$focusOwner$4 extends kotlin.jvm.internal.o implements q0.a {
    @Override // q0.a
    public final Object invoke() {
        AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
        Class cls = AndroidComposeView.C0;
        if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
            androidComposeView.clearFocus();
        }
        return b0.f30125a;
    }
}
