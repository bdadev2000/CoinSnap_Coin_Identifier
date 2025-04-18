package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.TextUnit;
import b1.f0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes.dex */
public final class SaversKt$SpanStyleSaver$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final SaversKt$SpanStyleSaver$1 f16999a = new r(2);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        SaverScope saverScope = (SaverScope) obj;
        SpanStyle spanStyle = (SpanStyle) obj2;
        Color color = new Color(spanStyle.f17017a.b());
        SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$1 = SaversKt.f16966r;
        Object a2 = SaversKt.a(color, saversKt$NonNullValueClassSaver$1, saverScope);
        TextUnit textUnit = new TextUnit(spanStyle.f17018b);
        SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$12 = SaversKt.f16967s;
        Object a3 = SaversKt.a(textUnit, saversKt$NonNullValueClassSaver$12, saverScope);
        FontWeight fontWeight = FontWeight.f17264b;
        Object a4 = SaversKt.a(spanStyle.f17019c, SaversKt.f16962n, saverScope);
        FontStyle fontStyle = spanStyle.d;
        FontSynthesis fontSynthesis = spanStyle.e;
        String str = spanStyle.f17021g;
        Object a5 = SaversKt.a(new TextUnit(spanStyle.f17022h), saversKt$NonNullValueClassSaver$12, saverScope);
        Object a6 = SaversKt.a(spanStyle.f17023i, SaversKt.f16963o, saverScope);
        Object a7 = SaversKt.a(spanStyle.f17024j, SaversKt.f16960l, saverScope);
        LocaleList localeList = LocaleList.f17401c;
        Object a8 = SaversKt.a(spanStyle.f17025k, SaversKt.f16969u, saverScope);
        Object a9 = SaversKt.a(new Color(spanStyle.f17026l), saversKt$NonNullValueClassSaver$1, saverScope);
        Object a10 = SaversKt.a(spanStyle.f17027m, SaversKt.f16959k, saverScope);
        Shadow shadow = Shadow.d;
        return f0.b(a2, a3, a4, fontStyle, fontSynthesis, -1, str, a5, a6, a7, a8, a9, a10, SaversKt.a(spanStyle.f17028n, SaversKt.f16965q, saverScope));
    }
}
