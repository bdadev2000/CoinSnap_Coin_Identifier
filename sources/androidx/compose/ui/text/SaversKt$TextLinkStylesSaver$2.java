package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import java.util.List;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class SaversKt$TextLinkStylesSaver$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final SaversKt$TextLinkStylesSaver$2 f17008a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        a.q(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        SaverKt$Saver$1 saverKt$Saver$1 = SaversKt.f16957i;
        Boolean bool = Boolean.FALSE;
        SpanStyle spanStyle = null;
        SpanStyle spanStyle2 = ((!a.g(obj2, bool) || (saverKt$Saver$1 instanceof NonNullValueClassSaver)) && obj2 != null) ? (SpanStyle) saverKt$Saver$1.f14535b.invoke(obj2) : null;
        Object obj3 = list.get(1);
        SpanStyle spanStyle3 = ((!a.g(obj3, bool) || (saverKt$Saver$1 instanceof NonNullValueClassSaver)) && obj3 != null) ? (SpanStyle) saverKt$Saver$1.f14535b.invoke(obj3) : null;
        Object obj4 = list.get(2);
        SpanStyle spanStyle4 = ((!a.g(obj4, bool) || (saverKt$Saver$1 instanceof NonNullValueClassSaver)) && obj4 != null) ? (SpanStyle) saverKt$Saver$1.f14535b.invoke(obj4) : null;
        Object obj5 = list.get(3);
        if ((!a.g(obj5, bool) || (saverKt$Saver$1 instanceof NonNullValueClassSaver)) && obj5 != null) {
            spanStyle = (SpanStyle) saverKt$Saver$1.f14535b.invoke(obj5);
        }
        return new TextLinkStyles(spanStyle2, spanStyle3, spanStyle4, spanStyle);
    }
}
