package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.ui.geometry.Offset;
import q0.l;

/* loaded from: classes2.dex */
public final class PointerInteropUtils_androidKt {
    public static final void a(PointerEvent pointerEvent, long j2, l lVar, boolean z2) {
        MotionEvent a2 = pointerEvent.a();
        if (a2 == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.".toString());
        }
        int action = a2.getAction();
        if (z2) {
            a2.setAction(3);
        }
        a2.offsetLocation(-Offset.g(j2), -Offset.h(j2));
        lVar.invoke(a2);
        a2.offsetLocation(Offset.g(j2), Offset.h(j2));
        a2.setAction(action);
    }
}
