package androidx.compose.ui.text;

import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.List;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class SaversKt$TextUnitSaver$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final SaversKt$TextUnitSaver$2 f17012a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        if (a.g(obj, Boolean.FALSE)) {
            return new TextUnit(TextUnit.f17499c);
        }
        a.q(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Float f2 = obj2 != null ? (Float) obj2 : null;
        a.p(f2);
        float floatValue = f2.floatValue();
        Object obj3 = list.get(1);
        TextUnitType textUnitType = obj3 != null ? (TextUnitType) obj3 : null;
        a.p(textUnitType);
        return new TextUnit(TextUnitKt.d(textUnitType.f17501a, floatValue));
    }
}
