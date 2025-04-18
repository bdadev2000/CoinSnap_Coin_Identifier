package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes2.dex */
final class FlowMeasurePolicy$maxCrossAxisIntrinsicItemSize$1 extends r implements q {
    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).intValue();
        return Integer.valueOf(((IntrinsicMeasurable) obj).s(((Number) obj3).intValue()));
    }
}
