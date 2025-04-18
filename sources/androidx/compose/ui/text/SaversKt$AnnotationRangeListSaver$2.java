package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.text.AnnotatedString;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class SaversKt$AnnotationRangeListSaver$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final SaversKt$AnnotationRangeListSaver$2 f16974a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        a.q(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = list.get(i2);
            SaverKt$Saver$1 saverKt$Saver$1 = SaversKt.f16953c;
            AnnotatedString.Range range = null;
            if ((!a.g(obj2, Boolean.FALSE) || (saverKt$Saver$1 instanceof NonNullValueClassSaver)) && obj2 != null) {
                range = (AnnotatedString.Range) saverKt$Saver$1.f14535b.invoke(obj2);
            }
            a.p(range);
            arrayList.add(range);
        }
        return arrayList;
    }
}
