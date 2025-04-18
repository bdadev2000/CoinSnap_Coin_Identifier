package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes4.dex */
final class FlowMeasurePolicy$minMainAxisIntrinsicItemSize$2 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public static final FlowMeasurePolicy$minMainAxisIntrinsicItemSize$2 f4001a = new r(3);

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).intValue();
        return Integer.valueOf(((IntrinsicMeasurable) obj).K(((Number) obj3).intValue()));
    }
}
