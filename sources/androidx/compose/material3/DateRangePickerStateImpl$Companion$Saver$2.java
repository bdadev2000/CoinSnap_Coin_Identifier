package androidx.compose.material3;

import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;
import w0.e;

/* loaded from: classes4.dex */
final class DateRangePickerStateImpl$Companion$Saver$2 extends r implements l {
    /* JADX WARN: Type inference failed for: r4v0, types: [w0.g, w0.e] */
    @Override // q0.l
    public final Object invoke(Object obj) {
        List list = (List) obj;
        Long l2 = (Long) list.get(0);
        Long l3 = (Long) list.get(1);
        Long l4 = (Long) list.get(2);
        Object obj2 = list.get(3);
        p0.a.q(obj2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj2).intValue();
        Object obj3 = list.get(4);
        p0.a.q(obj3, "null cannot be cast to non-null type kotlin.Int");
        ?? eVar = new e(intValue, ((Integer) obj3).intValue(), 1);
        Object obj4 = list.get(5);
        p0.a.q(obj4, "null cannot be cast to non-null type kotlin.Int");
        return new DateRangePickerStateImpl(l2, l3, l4, eVar, ((Integer) obj4).intValue());
    }
}
