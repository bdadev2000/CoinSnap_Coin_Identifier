package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import java.util.List;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class SaversKt$ShadowSaver$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final SaversKt$ShadowSaver$2 f16998a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        a.q(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        int i2 = Color.f14963j;
        SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$1 = SaversKt.f16966r;
        Boolean bool = Boolean.FALSE;
        Color color = ((!a.g(obj2, bool) || (saversKt$NonNullValueClassSaver$1 instanceof NonNullValueClassSaver)) && obj2 != null) ? (Color) saversKt$NonNullValueClassSaver$1.f16992b.invoke(obj2) : null;
        a.p(color);
        long j2 = color.f14964a;
        Object obj3 = list.get(1);
        SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$12 = SaversKt.f16968t;
        Offset offset = ((!a.g(obj3, bool) || (saversKt$NonNullValueClassSaver$12 instanceof NonNullValueClassSaver)) && obj3 != null) ? (Offset) saversKt$NonNullValueClassSaver$12.f16992b.invoke(obj3) : null;
        a.p(offset);
        long j3 = offset.f14913a;
        Object obj4 = list.get(2);
        Float f2 = obj4 != null ? (Float) obj4 : null;
        a.p(f2);
        return new Shadow(j2, j3, f2.floatValue());
    }
}
