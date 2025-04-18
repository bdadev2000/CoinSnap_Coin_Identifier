package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import java.util.List;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class SaversKt$AnnotatedStringSaver$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final SaversKt$AnnotatedStringSaver$2 f16972a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        List list;
        List list2;
        a.q(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list3 = (List) obj;
        Object obj2 = list3.get(1);
        SaverKt$Saver$1 saverKt$Saver$1 = SaversKt.f16952b;
        Boolean bool = Boolean.FALSE;
        List list4 = null;
        List list5 = ((!a.g(obj2, bool) || (saverKt$Saver$1 instanceof NonNullValueClassSaver)) && obj2 != null) ? (List) saverKt$Saver$1.f14535b.invoke(obj2) : null;
        Object obj3 = list3.get(2);
        List list6 = ((!a.g(obj3, bool) || (saverKt$Saver$1 instanceof NonNullValueClassSaver)) && obj3 != null) ? (List) saverKt$Saver$1.f14535b.invoke(obj3) : null;
        Object obj4 = list3.get(0);
        String str = obj4 != null ? (String) obj4 : null;
        a.p(str);
        if (list5 != null) {
            List list7 = list5;
            if (list7.isEmpty()) {
                list7 = null;
            }
            list = list7;
        } else {
            list = null;
        }
        if (list6 != null) {
            List list8 = list6;
            if (list8.isEmpty()) {
                list8 = null;
            }
            list2 = list8;
        } else {
            list2 = null;
        }
        Object obj5 = list3.get(3);
        if ((!a.g(obj5, bool) || (saverKt$Saver$1 instanceof NonNullValueClassSaver)) && obj5 != null) {
            list4 = (List) saverKt$Saver$1.f14535b.invoke(obj5);
        }
        return new AnnotatedString(str, list, list2, list4);
    }
}
