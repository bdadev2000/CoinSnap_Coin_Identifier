package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.intl.PlatformLocaleKt;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;

/* loaded from: classes3.dex */
public final class TextStyleKt {

    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final TextStyle a(TextStyle textStyle, LayoutDirection layoutDirection) {
        int i2;
        SpanStyle spanStyle = textStyle.f17059a;
        TextForegroundStyle textForegroundStyle = SpanStyleKt.d;
        TextForegroundStyle c2 = spanStyle.f17017a.c(SpanStyleKt$resolveSpanStyleDefaults$1.f17034a);
        long j2 = spanStyle.f17018b;
        if (TextUnitKt.c(j2)) {
            j2 = SpanStyleKt.f17031a;
        }
        long j3 = j2;
        FontWeight fontWeight = spanStyle.f17019c;
        if (fontWeight == null) {
            fontWeight = FontWeight.f17269i;
        }
        FontWeight fontWeight2 = fontWeight;
        FontStyle fontStyle = spanStyle.d;
        FontStyle fontStyle2 = new FontStyle(fontStyle != null ? fontStyle.f17260a : 0);
        FontSynthesis fontSynthesis = spanStyle.e;
        FontSynthesis fontSynthesis2 = new FontSynthesis(fontSynthesis != null ? fontSynthesis.f17261a : 1);
        FontFamily fontFamily = spanStyle.f17020f;
        if (fontFamily == null) {
            fontFamily = FontFamily.f17224a;
        }
        FontFamily fontFamily2 = fontFamily;
        String str = spanStyle.f17021g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j4 = spanStyle.f17022h;
        if (TextUnitKt.c(j4)) {
            j4 = SpanStyleKt.f17032b;
        }
        long j5 = j4;
        BaselineShift baselineShift = spanStyle.f17023i;
        BaselineShift baselineShift2 = new BaselineShift(baselineShift != null ? baselineShift.f17447a : 0.0f);
        TextGeometricTransform textGeometricTransform = spanStyle.f17024j;
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.f17471c;
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList localeList = spanStyle.f17025k;
        if (localeList == null) {
            LocaleList localeList2 = LocaleList.f17401c;
            localeList = PlatformLocaleKt.f17404a.a();
        }
        LocaleList localeList3 = localeList;
        long j6 = spanStyle.f17026l;
        if (j6 == 16) {
            j6 = SpanStyleKt.f17033c;
        }
        long j7 = j6;
        TextDecoration textDecoration = spanStyle.f17027m;
        if (textDecoration == null) {
            textDecoration = TextDecoration.f17464b;
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = spanStyle.f17028n;
        if (shadow == null) {
            shadow = Shadow.d;
        }
        Shadow shadow2 = shadow;
        PlatformSpanStyle platformSpanStyle = spanStyle.f17029o;
        DrawStyle drawStyle = spanStyle.f17030p;
        if (drawStyle == null) {
            drawStyle = Fill.f15146a;
        }
        SpanStyle spanStyle2 = new SpanStyle(c2, j3, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j5, baselineShift2, textGeometricTransform2, localeList3, j7, textDecoration2, shadow2, platformSpanStyle, drawStyle);
        int i3 = ParagraphStyleKt.f16944b;
        ParagraphStyle paragraphStyle = textStyle.f17060b;
        int i4 = 5;
        int i5 = TextAlign.a(paragraphStyle.f16936a, Integer.MIN_VALUE) ? 5 : paragraphStyle.f16936a;
        int i6 = paragraphStyle.f16937b;
        if (TextDirection.a(i6, 3)) {
            int ordinal = layoutDirection.ordinal();
            if (ordinal == 0) {
                i4 = 4;
                i2 = 1;
            } else {
                if (ordinal != 1) {
                    throw new RuntimeException();
                }
                i2 = 1;
            }
        } else if (TextDirection.a(i6, Integer.MIN_VALUE)) {
            int ordinal2 = layoutDirection.ordinal();
            if (ordinal2 != 0) {
                i2 = 1;
                if (ordinal2 != 1) {
                    throw new RuntimeException();
                }
                i4 = 2;
            } else {
                i2 = 1;
                i4 = 1;
            }
        } else {
            i2 = 1;
            i4 = i6;
        }
        long j8 = paragraphStyle.f16938c;
        if (TextUnitKt.c(j8)) {
            j8 = ParagraphStyleKt.f16943a;
        }
        TextIndent textIndent = paragraphStyle.d;
        if (textIndent == null) {
            textIndent = TextIndent.f17474c;
        }
        PlatformParagraphStyle platformParagraphStyle = paragraphStyle.e;
        LineHeightStyle lineHeightStyle = paragraphStyle.f16939f;
        int i7 = paragraphStyle.f16940g;
        if (i7 == 0) {
            i7 = LineBreak.f17452b;
        }
        int i8 = paragraphStyle.f16941h;
        if (Hyphens.a(i8, Integer.MIN_VALUE)) {
            i8 = i2;
        }
        TextMotion textMotion = paragraphStyle.f16942i;
        if (textMotion == null) {
            textMotion = TextMotion.f17477c;
        }
        return new TextStyle(spanStyle2, new ParagraphStyle(i5, i4, j8, textIndent, platformParagraphStyle, lineHeightStyle, i7, i8, textMotion), textStyle.f17061c);
    }
}
