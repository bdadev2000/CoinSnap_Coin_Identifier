package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final /* synthetic */ class AndroidComposeView$contentCaptureManager$1 extends kotlin.jvm.internal.o implements q0.a {
    @Override // q0.a
    public final Object invoke() {
        View view = (View) this.receiver;
        ViewCompatShims.c(view);
        return ViewCompatShims.b(view);
    }
}
