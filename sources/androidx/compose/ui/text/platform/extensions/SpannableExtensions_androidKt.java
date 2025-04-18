package androidx.compose.ui.text.platform.extensions;

import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.FontFeatureSpan;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.ui.text.android.style.ShadowSpan;
import androidx.compose.ui.text.android.style.SkewXSpan;
import androidx.compose.ui.text.android.style.TextDecorationSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.style.DrawStyleSpan;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import p0.a;
import q0.r;

/* loaded from: classes2.dex */
public final class SpannableExtensions_androidKt {
    public static final float a(long j2, float f2, Density density) {
        float c2;
        long b2 = TextUnit.b(j2);
        if (TextUnitType.a(b2, 4294967296L)) {
            if (density.x1() <= 1.05d) {
                return density.J0(j2);
            }
            c2 = TextUnit.c(j2) / TextUnit.c(density.u(f2));
        } else {
            if (!TextUnitType.a(b2, 8589934592L)) {
                return Float.NaN;
            }
            c2 = TextUnit.c(j2);
        }
        return c2 * f2;
    }

    public static final void b(Spannable spannable, long j2, int i2, int i3) {
        if (j2 != 16) {
            spannable.setSpan(new ForegroundColorSpan(ColorKt.j(j2)), i2, i3, 33);
        }
    }

    public static final void c(Spannable spannable, long j2, Density density, int i2, int i3) {
        long b2 = TextUnit.b(j2);
        if (TextUnitType.a(b2, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(a.t0(density.J0(j2)), false), i2, i3, 33);
        } else if (TextUnitType.a(b2, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(TextUnit.c(j2)), i2, i3, 33);
        }
    }

    public static final void d(Spannable spannable, TextStyle textStyle, List list, Density density, r rVar) {
        int i2;
        int i3;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = list.get(i5);
            Object obj2 = ((AnnotatedString.Range) obj).f16890a;
            SpanStyle spanStyle = (SpanStyle) obj2;
            if (spanStyle.f17020f != null || spanStyle.d != null || spanStyle.f17019c != null || ((SpanStyle) obj2).e != null) {
                arrayList.add(obj);
            }
        }
        SpanStyle spanStyle2 = textStyle.f17059a;
        FontFamily fontFamily = spanStyle2.f17020f;
        SpanStyle spanStyle3 = ((fontFamily != null || spanStyle2.d != null || spanStyle2.f17019c != null) || spanStyle2.e != null) ? new SpanStyle(0L, 0L, spanStyle2.f17019c, spanStyle2.d, spanStyle2.e, fontFamily, null, 0L, null, null, null, 0L, null, null, 65475) : null;
        SpannableExtensions_androidKt$setFontAttributes$1 spannableExtensions_androidKt$setFontAttributes$1 = new SpannableExtensions_androidKt$setFontAttributes$1(spannable, rVar);
        if (arrayList.size() > 1) {
            int size2 = arrayList.size();
            int i6 = size2 * 2;
            Integer[] numArr = new Integer[i6];
            for (int i7 = 0; i7 < i6; i7++) {
                numArr[i7] = 0;
            }
            int size3 = arrayList.size();
            for (int i8 = 0; i8 < size3; i8++) {
                AnnotatedString.Range range = (AnnotatedString.Range) arrayList.get(i8);
                numArr[i8] = Integer.valueOf(range.f16891b);
                numArr[i8 + size2] = Integer.valueOf(range.f16892c);
            }
            Integer[] numArr2 = numArr;
            if (numArr2.length > 1) {
                Arrays.sort(numArr2);
            }
            if (i6 == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            int intValue = numArr[0].intValue();
            int i9 = 0;
            while (i9 < i6) {
                int intValue2 = numArr[i9].intValue();
                if (intValue2 != intValue) {
                    int size4 = arrayList.size();
                    SpanStyle spanStyle4 = spanStyle3;
                    for (int i10 = i4; i10 < size4; i10++) {
                        AnnotatedString.Range range2 = (AnnotatedString.Range) arrayList.get(i10);
                        int i11 = range2.f16891b;
                        int i12 = range2.f16892c;
                        if (i11 != i12 && AnnotatedStringKt.c(intValue, intValue2, i11, i12)) {
                            SpanStyle spanStyle5 = (SpanStyle) range2.f16890a;
                            if (spanStyle4 != null) {
                                spanStyle5 = spanStyle4.c(spanStyle5);
                            }
                            spanStyle4 = spanStyle5;
                        }
                    }
                    if (spanStyle4 != null) {
                        spannableExtensions_androidKt$setFontAttributes$1.invoke(spanStyle4, Integer.valueOf(intValue), Integer.valueOf(intValue2));
                    }
                    intValue = intValue2;
                }
                i9++;
                i4 = 0;
            }
        } else if (!arrayList.isEmpty()) {
            SpanStyle spanStyle6 = (SpanStyle) ((AnnotatedString.Range) arrayList.get(0)).f16890a;
            if (spanStyle3 != null) {
                spanStyle6 = spanStyle3.c(spanStyle6);
            }
            spannableExtensions_androidKt$setFontAttributes$1.invoke(spanStyle6, Integer.valueOf(((AnnotatedString.Range) arrayList.get(0)).f16891b), Integer.valueOf(((AnnotatedString.Range) arrayList.get(0)).f16892c));
        }
        int size5 = list.size();
        boolean z2 = false;
        for (int i13 = 0; i13 < size5; i13++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) list.get(i13);
            int i14 = range3.f16891b;
            if (i14 >= 0 && i14 < spannable.length() && (i3 = range3.f16892c) > i14 && i3 <= spannable.length()) {
                int i15 = range3.f16891b;
                int i16 = range3.f16892c;
                SpanStyle spanStyle7 = (SpanStyle) range3.f16890a;
                BaselineShift baselineShift = spanStyle7.f17023i;
                if (baselineShift != null) {
                    spannable.setSpan(new BaselineShiftSpan(baselineShift.f17447a), i15, i16, 33);
                }
                TextForegroundStyle textForegroundStyle = spanStyle7.f17017a;
                b(spannable, textForegroundStyle.b(), i15, i16);
                Brush e = textForegroundStyle.e();
                float a2 = textForegroundStyle.a();
                if (e != null) {
                    if (e instanceof SolidColor) {
                        b(spannable, ((SolidColor) e).f15055a, i15, i16);
                    } else if (e instanceof ShaderBrush) {
                        spannable.setSpan(new ShaderBrushSpan((ShaderBrush) e, a2), i15, i16, 33);
                    }
                }
                TextDecoration textDecoration = spanStyle7.f17027m;
                if (textDecoration != null) {
                    spannable.setSpan(new TextDecorationSpan(textDecoration.a(TextDecoration.f17465c), textDecoration.a(TextDecoration.d)), i15, i16, 33);
                }
                c(spannable, spanStyle7.f17018b, density, i15, i16);
                String str = spanStyle7.f17021g;
                if (str != null) {
                    spannable.setSpan(new FontFeatureSpan(str), i15, i16, 33);
                }
                TextGeometricTransform textGeometricTransform = spanStyle7.f17024j;
                if (textGeometricTransform != null) {
                    spannable.setSpan(new ScaleXSpan(textGeometricTransform.f17472a), i15, i16, 33);
                    spannable.setSpan(new SkewXSpan(textGeometricTransform.f17473b), i15, i16, 33);
                }
                LocaleList localeList = spanStyle7.f17025k;
                if (localeList != null) {
                    spannable.setSpan(LocaleListHelperMethods.f17439a.a(localeList), i15, i16, 33);
                }
                long j2 = spanStyle7.f17026l;
                if (j2 != 16) {
                    spannable.setSpan(new BackgroundColorSpan(ColorKt.j(j2)), i15, i16, 33);
                }
                Shadow shadow = spanStyle7.f17028n;
                if (shadow != null) {
                    int j3 = ColorKt.j(shadow.f15039a);
                    long j4 = shadow.f15040b;
                    float g2 = Offset.g(j4);
                    float h2 = Offset.h(j4);
                    float f2 = shadow.f15041c;
                    if (f2 == 0.0f) {
                        f2 = Float.MIN_VALUE;
                    }
                    spannable.setSpan(new ShadowSpan(g2, h2, f2, j3), i15, i16, 33);
                }
                DrawStyle drawStyle = spanStyle7.f17030p;
                if (drawStyle != null) {
                    spannable.setSpan(new DrawStyleSpan(drawStyle), i15, i16, 33);
                }
                if (TextUnitType.a(TextUnit.b(spanStyle7.f17022h), 4294967296L) || TextUnitType.a(TextUnit.b(spanStyle7.f17022h), 8589934592L)) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            int size6 = list.size();
            for (int i17 = 0; i17 < size6; i17++) {
                AnnotatedString.Range range4 = (AnnotatedString.Range) list.get(i17);
                int i18 = range4.f16891b;
                SpanStyle spanStyle8 = (SpanStyle) range4.f16890a;
                if (i18 >= 0 && i18 < spannable.length() && (i2 = range4.f16892c) > i18 && i2 <= spannable.length()) {
                    long j5 = spanStyle8.f17022h;
                    long b2 = TextUnit.b(j5);
                    Object letterSpacingSpanPx = TextUnitType.a(b2, 4294967296L) ? new LetterSpacingSpanPx(density.J0(j5)) : TextUnitType.a(b2, 8589934592L) ? new LetterSpacingSpanEm(TextUnit.c(j5)) : null;
                    if (letterSpacingSpanPx != null) {
                        spannable.setSpan(letterSpacingSpanPx, i18, i2, 33);
                    }
                }
            }
        }
    }
}
