package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import java.util.List;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class SaversKt$SpanStyleSaver$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final SaversKt$SpanStyleSaver$2 f17000a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        a.q(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        int i2 = Color.f14963j;
        SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$1 = SaversKt.f16966r;
        Boolean bool = Boolean.FALSE;
        Color color = ((!a.g(obj2, bool) || (saversKt$NonNullValueClassSaver$1 instanceof NonNullValueClassSaver)) && obj2 != null) ? (Color) saversKt$NonNullValueClassSaver$1.f16992b.invoke(obj2) : null;
        a.p(color);
        long j2 = color.f14964a;
        Object obj3 = list.get(1);
        TextUnitType[] textUnitTypeArr = TextUnit.f17498b;
        SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$12 = SaversKt.f16967s;
        TextUnit textUnit = ((!a.g(obj3, bool) || (saversKt$NonNullValueClassSaver$12 instanceof NonNullValueClassSaver)) && obj3 != null) ? (TextUnit) saversKt$NonNullValueClassSaver$12.f16992b.invoke(obj3) : null;
        a.p(textUnit);
        long j3 = textUnit.f17500a;
        Object obj4 = list.get(2);
        FontWeight fontWeight = FontWeight.f17264b;
        SaverKt$Saver$1 saverKt$Saver$1 = SaversKt.f16962n;
        FontWeight fontWeight2 = ((!a.g(obj4, bool) || (saverKt$Saver$1 instanceof NonNullValueClassSaver)) && obj4 != null) ? (FontWeight) saverKt$Saver$1.f14535b.invoke(obj4) : null;
        Object obj5 = list.get(3);
        FontStyle fontStyle = obj5 != null ? (FontStyle) obj5 : null;
        Object obj6 = list.get(4);
        FontSynthesis fontSynthesis = obj6 != null ? (FontSynthesis) obj6 : null;
        Object obj7 = list.get(6);
        String str = obj7 != null ? (String) obj7 : null;
        Object obj8 = list.get(7);
        TextUnit textUnit2 = ((!a.g(obj8, bool) || (saversKt$NonNullValueClassSaver$12 instanceof NonNullValueClassSaver)) && obj8 != null) ? (TextUnit) saversKt$NonNullValueClassSaver$12.f16992b.invoke(obj8) : null;
        a.p(textUnit2);
        String str2 = str;
        long j4 = textUnit2.f17500a;
        Object obj9 = list.get(8);
        SaverKt$Saver$1 saverKt$Saver$12 = SaversKt.f16963o;
        BaselineShift baselineShift = ((!a.g(obj9, bool) || (saverKt$Saver$12 instanceof NonNullValueClassSaver)) && obj9 != null) ? (BaselineShift) saverKt$Saver$12.f14535b.invoke(obj9) : null;
        Object obj10 = list.get(9);
        SaverKt$Saver$1 saverKt$Saver$13 = SaversKt.f16960l;
        TextGeometricTransform textGeometricTransform = ((!a.g(obj10, bool) || (saverKt$Saver$13 instanceof NonNullValueClassSaver)) && obj10 != null) ? (TextGeometricTransform) saverKt$Saver$13.f14535b.invoke(obj10) : null;
        Object obj11 = list.get(10);
        LocaleList localeList = LocaleList.f17401c;
        SaverKt$Saver$1 saverKt$Saver$14 = SaversKt.f16969u;
        LocaleList localeList2 = ((!a.g(obj11, bool) || (saverKt$Saver$14 instanceof NonNullValueClassSaver)) && obj11 != null) ? (LocaleList) saverKt$Saver$14.f14535b.invoke(obj11) : null;
        Object obj12 = list.get(11);
        Color color2 = ((!a.g(obj12, bool) || (saversKt$NonNullValueClassSaver$1 instanceof NonNullValueClassSaver)) && obj12 != null) ? (Color) saversKt$NonNullValueClassSaver$1.f16992b.invoke(obj12) : null;
        a.p(color2);
        long j5 = color2.f14964a;
        Object obj13 = list.get(12);
        SaverKt$Saver$1 saverKt$Saver$15 = SaversKt.f16959k;
        TextDecoration textDecoration = ((!a.g(obj13, bool) || (saverKt$Saver$15 instanceof NonNullValueClassSaver)) && obj13 != null) ? (TextDecoration) saverKt$Saver$15.f14535b.invoke(obj13) : null;
        Object obj14 = list.get(13);
        Shadow shadow = Shadow.d;
        SaverKt$Saver$1 saverKt$Saver$16 = SaversKt.f16965q;
        return new SpanStyle(j2, j3, fontWeight2, fontStyle, fontSynthesis, null, str2, j4, baselineShift, textGeometricTransform, localeList2, j5, textDecoration, ((!a.g(obj14, bool) || (saverKt$Saver$16 instanceof NonNullValueClassSaver)) && obj14 != null) ? (Shadow) saverKt$Saver$16.f14535b.invoke(obj14) : null, 49184);
    }
}
