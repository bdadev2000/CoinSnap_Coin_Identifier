package androidx.compose.ui.text;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.LinearGradient;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
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
import androidx.compose.ui.unit.TextUnit;
import org.objectweb.asm.Opcodes;
import p0.a;

@Immutable
/* loaded from: classes3.dex */
public final class TextStyle {
    public static final TextStyle d = new TextStyle(0, 0, null, null, 0, null, 0, 0, 16777215);

    /* renamed from: a, reason: collision with root package name */
    public final SpanStyle f17059a;

    /* renamed from: b, reason: collision with root package name */
    public final ParagraphStyle f17060b;

    /* renamed from: c, reason: collision with root package name */
    public final PlatformTextStyle f17061c;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle, PlatformTextStyle platformTextStyle) {
        this.f17059a = spanStyle;
        this.f17060b = paragraphStyle;
        this.f17061c = platformTextStyle;
    }

    public static TextStyle a(int i2, int i3, long j2, long j3, long j4, long j5, PlatformTextStyle platformTextStyle, TextStyle textStyle, FontFamily fontFamily, FontWeight fontWeight, LineHeightStyle lineHeightStyle) {
        PlatformTextStyle platformTextStyle2;
        PlatformSpanStyle platformSpanStyle;
        long b2 = (i3 & 1) != 0 ? textStyle.f17059a.f17017a.b() : j2;
        long j6 = (i3 & 2) != 0 ? textStyle.f17059a.f17018b : j3;
        FontWeight fontWeight2 = (i3 & 4) != 0 ? textStyle.f17059a.f17019c : fontWeight;
        FontStyle fontStyle = (i3 & 8) != 0 ? textStyle.f17059a.d : null;
        FontSynthesis fontSynthesis = (i3 & 16) != 0 ? textStyle.f17059a.e : null;
        FontFamily fontFamily2 = (i3 & 32) != 0 ? textStyle.f17059a.f17020f : fontFamily;
        String str = (i3 & 64) != 0 ? textStyle.f17059a.f17021g : null;
        long j7 = (i3 & 128) != 0 ? textStyle.f17059a.f17022h : j4;
        BaselineShift baselineShift = (i3 & 256) != 0 ? textStyle.f17059a.f17023i : null;
        TextGeometricTransform textGeometricTransform = (i3 & 512) != 0 ? textStyle.f17059a.f17024j : null;
        LocaleList localeList = (i3 & 1024) != 0 ? textStyle.f17059a.f17025k : null;
        long j8 = (i3 & Opcodes.ACC_STRICT) != 0 ? textStyle.f17059a.f17026l : 0L;
        TextDecoration textDecoration = (i3 & 4096) != 0 ? textStyle.f17059a.f17027m : null;
        Shadow shadow = (i3 & 8192) != 0 ? textStyle.f17059a.f17028n : null;
        DrawStyle drawStyle = (i3 & 16384) != 0 ? textStyle.f17059a.f17030p : null;
        int i4 = (32768 & i3) != 0 ? textStyle.f17060b.f16936a : i2;
        int i5 = (65536 & i3) != 0 ? textStyle.f17060b.f16937b : 0;
        long j9 = (131072 & i3) != 0 ? textStyle.f17060b.f16938c : j5;
        TextIndent textIndent = (262144 & i3) != 0 ? textStyle.f17060b.d : null;
        PlatformTextStyle platformTextStyle3 = (524288 & i3) != 0 ? textStyle.f17061c : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i3 & 1048576) != 0 ? textStyle.f17060b.f16939f : lineHeightStyle;
        int i6 = (2097152 & i3) != 0 ? textStyle.f17060b.f16940g : 0;
        int i7 = (4194304 & i3) != 0 ? textStyle.f17060b.f16941h : 0;
        TextMotion textMotion = (i3 & 8388608) != 0 ? textStyle.f17060b.f16942i : null;
        SpanStyle spanStyle = textStyle.f17059a;
        int i8 = i4;
        TextIndent textIndent2 = textIndent;
        TextForegroundStyle b3 = Color.c(b2, spanStyle.f17017a.b()) ? spanStyle.f17017a : TextForegroundStyle.Companion.b(b2);
        if (platformTextStyle3 != null) {
            platformSpanStyle = platformTextStyle3.f16949a;
            platformTextStyle2 = platformTextStyle3;
        } else {
            platformTextStyle2 = platformTextStyle3;
            platformSpanStyle = null;
        }
        return new TextStyle(new SpanStyle(b3, j6, fontWeight2, fontStyle, fontSynthesis, fontFamily2, str, j7, baselineShift, textGeometricTransform, localeList, j8, textDecoration, shadow, platformSpanStyle, drawStyle), new ParagraphStyle(i8, i5, j9, textIndent2, platformTextStyle2 != null ? platformTextStyle2.f16950b : null, lineHeightStyle2, i6, i7, textMotion), platformTextStyle2);
    }

    public static TextStyle f(int i2, int i3, long j2, long j3, long j4, long j5, TextStyle textStyle, FontFamily fontFamily, FontStyle fontStyle, FontWeight fontWeight, TextDecoration textDecoration) {
        long j6 = (i3 & 1) != 0 ? Color.f14962i : j2;
        long j7 = (i3 & 2) != 0 ? TextUnit.f17499c : j3;
        FontWeight fontWeight2 = (i3 & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i3 & 8) != 0 ? null : fontStyle;
        FontFamily fontFamily2 = (i3 & 32) != 0 ? null : fontFamily;
        long j8 = (i3 & 128) != 0 ? TextUnit.f17499c : j4;
        long j9 = (i3 & Opcodes.ACC_STRICT) != 0 ? Color.f14962i : 0L;
        TextDecoration textDecoration2 = (i3 & 4096) != 0 ? null : textDecoration;
        int i4 = (32768 & i3) != 0 ? Integer.MIN_VALUE : i2;
        int i5 = (65536 & i3) != 0 ? Integer.MIN_VALUE : 0;
        long j10 = (131072 & i3) != 0 ? TextUnit.f17499c : j5;
        int i6 = (i3 & 2097152) != 0 ? Integer.MIN_VALUE : 0;
        SpanStyle a2 = SpanStyleKt.a(textStyle.f17059a, j6, null, Float.NaN, j7, fontWeight2, fontStyle2, null, fontFamily2, null, j8, null, null, null, j9, textDecoration2, null, null, null);
        ParagraphStyle a3 = ParagraphStyleKt.a(textStyle.f17060b, i4, i5, j10, null, null, null, 0, i6, null);
        return (textStyle.f17059a == a2 && textStyle.f17060b == a3) ? textStyle : new TextStyle(a2, a3);
    }

    public final long b() {
        return this.f17059a.f17017a.b();
    }

    public final boolean c(TextStyle textStyle) {
        return this == textStyle || this.f17059a.b(textStyle.f17059a);
    }

    public final boolean d(TextStyle textStyle) {
        if (this != textStyle) {
            if (!a.g(this.f17060b, textStyle.f17060b) || !this.f17059a.a(textStyle.f17059a)) {
                return false;
            }
        }
        return true;
    }

    public final TextStyle e(TextStyle textStyle) {
        return (textStyle == null || a.g(textStyle, d)) ? this : new TextStyle(this.f17059a.c(textStyle.f17059a), this.f17060b.a(textStyle.f17060b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStyle)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) obj;
        return a.g(this.f17059a, textStyle.f17059a) && a.g(this.f17060b, textStyle.f17060b) && a.g(this.f17061c, textStyle.f17061c);
    }

    public final int hashCode() {
        int hashCode = (this.f17060b.hashCode() + (this.f17059a.hashCode() * 31)) * 31;
        PlatformTextStyle platformTextStyle = this.f17061c;
        return hashCode + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) Color.i(b()));
        sb.append(", brush=");
        SpanStyle spanStyle = this.f17059a;
        sb.append(spanStyle.f17017a.e());
        sb.append(", alpha=");
        sb.append(spanStyle.f17017a.a());
        sb.append(", fontSize=");
        sb.append((Object) TextUnit.d(spanStyle.f17018b));
        sb.append(", fontWeight=");
        sb.append(spanStyle.f17019c);
        sb.append(", fontStyle=");
        sb.append(spanStyle.d);
        sb.append(", fontSynthesis=");
        sb.append(spanStyle.e);
        sb.append(", fontFamily=");
        sb.append(spanStyle.f17020f);
        sb.append(", fontFeatureSettings=");
        sb.append(spanStyle.f17021g);
        sb.append(", letterSpacing=");
        sb.append((Object) TextUnit.d(spanStyle.f17022h));
        sb.append(", baselineShift=");
        sb.append(spanStyle.f17023i);
        sb.append(", textGeometricTransform=");
        sb.append(spanStyle.f17024j);
        sb.append(", localeList=");
        sb.append(spanStyle.f17025k);
        sb.append(", background=");
        d.z(spanStyle.f17026l, sb, ", textDecoration=");
        sb.append(spanStyle.f17027m);
        sb.append(", shadow=");
        sb.append(spanStyle.f17028n);
        sb.append(", drawStyle=");
        sb.append(spanStyle.f17030p);
        sb.append(", textAlign=");
        ParagraphStyle paragraphStyle = this.f17060b;
        sb.append((Object) TextAlign.b(paragraphStyle.f16936a));
        sb.append(", textDirection=");
        sb.append((Object) TextDirection.b(paragraphStyle.f16937b));
        sb.append(", lineHeight=");
        sb.append((Object) TextUnit.d(paragraphStyle.f16938c));
        sb.append(", textIndent=");
        sb.append(paragraphStyle.d);
        sb.append(", platformStyle=");
        sb.append(this.f17061c);
        sb.append(", lineHeightStyle=");
        sb.append(paragraphStyle.f16939f);
        sb.append(", lineBreak=");
        sb.append((Object) LineBreak.a(paragraphStyle.f16940g));
        sb.append(", hyphens=");
        sb.append((Object) Hyphens.b(paragraphStyle.f16941h));
        sb.append(", textMotion=");
        sb.append(paragraphStyle.f16942i);
        sb.append(')');
        return sb.toString();
    }

    public TextStyle(LinearGradient linearGradient, long j2, FontWeight fontWeight, FontFamily fontFamily, int i2, long j3) {
        this(new SpanStyle(TextForegroundStyle.Companion.a(Float.NaN, linearGradient), j2, fontWeight, (FontStyle) null, (FontSynthesis) null, fontFamily, (String) null, TextUnit.f17499c, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, Color.f14962i, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null), new ParagraphStyle(i2, Integer.MIN_VALUE, j3, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TextStyle(androidx.compose.ui.text.SpanStyle r4, androidx.compose.ui.text.ParagraphStyle r5) {
        /*
            r3 = this;
            androidx.compose.ui.text.PlatformSpanStyle r0 = r4.f17029o
            androidx.compose.ui.text.PlatformParagraphStyle r1 = r5.e
            if (r0 != 0) goto La
            if (r1 != 0) goto La
            r0 = 0
            goto L10
        La:
            androidx.compose.ui.text.PlatformTextStyle r2 = new androidx.compose.ui.text.PlatformTextStyle
            r2.<init>(r0, r1)
            r0 = r2
        L10:
            r3.<init>(r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.TextStyle.<init>(androidx.compose.ui.text.SpanStyle, androidx.compose.ui.text.ParagraphStyle):void");
    }

    public TextStyle(long j2, long j3, FontWeight fontWeight, FontFamily fontFamily, long j4, TextDecoration textDecoration, int i2, long j5, int i3) {
        this(new SpanStyle((i3 & 1) != 0 ? Color.f14962i : j2, (i3 & 2) != 0 ? TextUnit.f17499c : j3, (i3 & 4) != 0 ? null : fontWeight, (FontStyle) null, (FontSynthesis) null, (i3 & 32) != 0 ? null : fontFamily, (String) null, (i3 & 128) != 0 ? TextUnit.f17499c : j4, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, (i3 & Opcodes.ACC_STRICT) != 0 ? Color.f14962i : 0L, (i3 & 4096) != 0 ? null : textDecoration, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null), new ParagraphStyle((32768 & i3) != 0 ? Integer.MIN_VALUE : i2, (i3 & 65536) != 0 ? Integer.MIN_VALUE : 0, (i3 & Opcodes.ACC_DEPRECATED) != 0 ? TextUnit.f17499c : j5, null, null, null, 0, (i3 & 4194304) != 0 ? Integer.MIN_VALUE : 0, null), null);
    }
}
