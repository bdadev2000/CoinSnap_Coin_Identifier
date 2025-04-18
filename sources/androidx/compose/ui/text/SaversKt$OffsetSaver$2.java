package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import java.util.List;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class SaversKt$OffsetSaver$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final SaversKt$OffsetSaver$2 f16994a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        if (a.g(obj, Boolean.FALSE)) {
            return new Offset(9205357640488583168L);
        }
        a.q(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Float f2 = obj2 != null ? (Float) obj2 : null;
        a.p(f2);
        float floatValue = f2.floatValue();
        Object obj3 = list.get(1);
        Float f3 = obj3 != null ? (Float) obj3 : null;
        a.p(f3);
        return new Offset(OffsetKt.a(floatValue, f3.floatValue()));
    }
}
