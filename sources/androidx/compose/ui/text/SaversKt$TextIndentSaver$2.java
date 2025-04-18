package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import java.util.List;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class SaversKt$TextIndentSaver$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final SaversKt$TextIndentSaver$2 f17006a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        a.q(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        TextUnitType[] textUnitTypeArr = TextUnit.f17498b;
        SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$1 = SaversKt.f16967s;
        Boolean bool = Boolean.FALSE;
        TextUnit textUnit = null;
        TextUnit textUnit2 = ((!a.g(obj2, bool) || (saversKt$NonNullValueClassSaver$1 instanceof NonNullValueClassSaver)) && obj2 != null) ? (TextUnit) saversKt$NonNullValueClassSaver$1.f16992b.invoke(obj2) : null;
        a.p(textUnit2);
        Object obj3 = list.get(1);
        if ((!a.g(obj3, bool) || (saversKt$NonNullValueClassSaver$1 instanceof NonNullValueClassSaver)) && obj3 != null) {
            textUnit = (TextUnit) saversKt$NonNullValueClassSaver$1.f16992b.invoke(obj3);
        }
        a.p(textUnit);
        return new TextIndent(textUnit2.f17500a, textUnit.f17500a);
    }
}
