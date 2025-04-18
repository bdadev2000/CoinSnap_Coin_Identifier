package androidx.compose.ui.text;

import java.util.List;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class SaversKt$TextRangeSaver$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final SaversKt$TextRangeSaver$2 f17010a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        a.q(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Integer num = obj2 != null ? (Integer) obj2 : null;
        a.p(num);
        int intValue = num.intValue();
        Object obj3 = list.get(1);
        Integer num2 = obj3 != null ? (Integer) obj3 : null;
        a.p(num2);
        return new TextRange(TextRangeKt.a(intValue, num2.intValue()));
    }
}
