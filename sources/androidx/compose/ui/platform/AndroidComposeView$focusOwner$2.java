package androidx.compose.ui.platform;

import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.geometry.Rect;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final /* synthetic */ class AndroidComposeView$focusOwner$2 extends kotlin.jvm.internal.o implements q0.p {
    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(AndroidComposeView.z((AndroidComposeView) this.receiver, (FocusDirection) obj, (Rect) obj2));
    }
}
