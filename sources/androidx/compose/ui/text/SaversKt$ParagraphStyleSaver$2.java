package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import java.util.List;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class SaversKt$ParagraphStyleSaver$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final SaversKt$ParagraphStyleSaver$2 f16996a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        a.q(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        TextAlign textAlign = obj2 != null ? (TextAlign) obj2 : null;
        a.p(textAlign);
        int i2 = textAlign.f17463a;
        Object obj3 = list.get(1);
        TextDirection textDirection = obj3 != null ? (TextDirection) obj3 : null;
        a.p(textDirection);
        int i3 = textDirection.f17467a;
        Object obj4 = list.get(2);
        TextUnitType[] textUnitTypeArr = TextUnit.f17498b;
        SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$1 = SaversKt.f16967s;
        Boolean bool = Boolean.FALSE;
        TextUnit textUnit = ((!a.g(obj4, bool) || (saversKt$NonNullValueClassSaver$1 instanceof NonNullValueClassSaver)) && obj4 != null) ? (TextUnit) saversKt$NonNullValueClassSaver$1.f16992b.invoke(obj4) : null;
        a.p(textUnit);
        long j2 = textUnit.f17500a;
        Object obj5 = list.get(3);
        TextIndent textIndent = TextIndent.f17474c;
        SaverKt$Saver$1 saverKt$Saver$1 = SaversKt.f16961m;
        return new ParagraphStyle(i2, i3, j2, ((!a.g(obj5, bool) || (saverKt$Saver$1 instanceof NonNullValueClassSaver)) && obj5 != null) ? (TextIndent) saverKt$Saver$1.f14535b.invoke(obj5) : null, null, null, 0, Integer.MIN_VALUE, null);
    }
}
