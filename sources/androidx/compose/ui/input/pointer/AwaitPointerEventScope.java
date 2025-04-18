package androidx.compose.ui.input.pointer;

import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import h0.g;
import q0.p;

/* loaded from: classes4.dex */
public interface AwaitPointerEventScope extends Density {

    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
    }

    default long A0() {
        return 0L;
    }

    default Object E1(long j2, p pVar, g gVar) {
        return pVar.invoke(this, gVar);
    }

    Object L1(PointerEventPass pointerEventPass, g gVar);

    PointerEvent S0();

    long a();

    default Object f1(long j2, p pVar, g gVar) {
        return pVar.invoke(this, gVar);
    }

    ViewConfiguration getViewConfiguration();
}
