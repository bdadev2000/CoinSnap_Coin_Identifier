package androidx.compose.ui.platform;

import android.view.FocusFinder;
import android.view.View;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final /* synthetic */ class AndroidComposeView$focusOwner$3 extends kotlin.jvm.internal.o implements q0.l {
    @Override // q0.l
    public final Object invoke(Object obj) {
        int i2 = ((FocusDirection) obj).f14833a;
        AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
        Class cls = AndroidComposeView.C0;
        androidComposeView.getClass();
        boolean z2 = false;
        if (!FocusDirection.a(i2, 7) && !FocusDirection.a(i2, 8)) {
            Integer c2 = FocusInteropUtils_androidKt.c(i2);
            if (c2 == null) {
                throw new IllegalStateException("Invalid focus direction".toString());
            }
            int intValue = c2.intValue();
            Rect K = androidComposeView.K();
            android.graphics.Rect a2 = K != null ? RectHelper_androidKt.a(K) : null;
            FocusFinder focusFinder = FocusFinder.getInstance();
            View findNextFocus = a2 == null ? focusFinder.findNextFocus(androidComposeView, androidComposeView.findFocus(), intValue) : focusFinder.findNextFocusFromRect(androidComposeView, a2, intValue);
            if (findNextFocus != null) {
                z2 = FocusInteropUtils_androidKt.b(findNextFocus, Integer.valueOf(intValue), a2);
            }
        }
        return Boolean.valueOf(z2);
    }
}
