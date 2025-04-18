package androidx.compose.material3;

import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class TimePickerStateImpl$Companion$Saver$2 extends r implements l {
    @Override // q0.l
    public final Object invoke(Object obj) {
        List list = (List) obj;
        Object obj2 = list.get(0);
        p0.a.q(obj2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj2).intValue();
        Object obj3 = list.get(1);
        p0.a.q(obj3, "null cannot be cast to non-null type kotlin.Int");
        int intValue2 = ((Integer) obj3).intValue();
        Object obj4 = list.get(2);
        p0.a.q(obj4, "null cannot be cast to non-null type kotlin.Boolean");
        return new TimePickerStateImpl(intValue, intValue2, ((Boolean) obj4).booleanValue());
    }
}
