package androidx.compose.ui.text;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import org.objectweb.asm.Opcodes;
import p0.a;

@Immutable
/* loaded from: classes3.dex */
public final class SpanStyle {

    /* renamed from: a, reason: collision with root package name */
    public final TextForegroundStyle f17017a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17018b;

    /* renamed from: c, reason: collision with root package name */
    public final FontWeight f17019c;
    public final FontStyle d;
    public final FontSynthesis e;

    /* renamed from: f, reason: collision with root package name */
    public final FontFamily f17020f;

    /* renamed from: g, reason: collision with root package name */
    public final String f17021g;

    /* renamed from: h, reason: collision with root package name */
    public final long f17022h;

    /* renamed from: i, reason: collision with root package name */
    public final BaselineShift f17023i;

    /* renamed from: j, reason: collision with root package name */
    public final TextGeometricTransform f17024j;

    /* renamed from: k, reason: collision with root package name */
    public final LocaleList f17025k;

    /* renamed from: l, reason: collision with root package name */
    public final long f17026l;

    /* renamed from: m, reason: collision with root package name */
    public final TextDecoration f17027m;

    /* renamed from: n, reason: collision with root package name */
    public final Shadow f17028n;

    /* renamed from: o, reason: collision with root package name */
    public final PlatformSpanStyle f17029o;

    /* renamed from: p, reason: collision with root package name */
    public final DrawStyle f17030p;

    public SpanStyle(TextForegroundStyle textForegroundStyle, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this.f17017a = textForegroundStyle;
        this.f17018b = j2;
        this.f17019c = fontWeight;
        this.d = fontStyle;
        this.e = fontSynthesis;
        this.f17020f = fontFamily;
        this.f17021g = str;
        this.f17022h = j3;
        this.f17023i = baselineShift;
        this.f17024j = textGeometricTransform;
        this.f17025k = localeList;
        this.f17026l = j4;
        this.f17027m = textDecoration;
        this.f17028n = shadow;
        this.f17029o = platformSpanStyle;
        this.f17030p = drawStyle;
    }

    public final boolean a(SpanStyle spanStyle) {
        if (this == spanStyle) {
            return true;
        }
        return TextUnit.a(this.f17018b, spanStyle.f17018b) && a.g(this.f17019c, spanStyle.f17019c) && a.g(this.d, spanStyle.d) && a.g(this.e, spanStyle.e) && a.g(this.f17020f, spanStyle.f17020f) && a.g(this.f17021g, spanStyle.f17021g) && TextUnit.a(this.f17022h, spanStyle.f17022h) && a.g(this.f17023i, spanStyle.f17023i) && a.g(this.f17024j, spanStyle.f17024j) && a.g(this.f17025k, spanStyle.f17025k) && Color.c(this.f17026l, spanStyle.f17026l) && a.g(this.f17029o, spanStyle.f17029o);
    }

    public final boolean b(SpanStyle spanStyle) {
        return a.g(this.f17017a, spanStyle.f17017a) && a.g(this.f17027m, spanStyle.f17027m) && a.g(this.f17028n, spanStyle.f17028n) && a.g(this.f17030p, spanStyle.f17030p);
    }

    public final SpanStyle c(SpanStyle spanStyle) {
        if (spanStyle == null) {
            return this;
        }
        TextForegroundStyle textForegroundStyle = spanStyle.f17017a;
        return SpanStyleKt.a(this, textForegroundStyle.b(), textForegroundStyle.e(), textForegroundStyle.a(), spanStyle.f17018b, spanStyle.f17019c, spanStyle.d, spanStyle.e, spanStyle.f17020f, spanStyle.f17021g, spanStyle.f17022h, spanStyle.f17023i, spanStyle.f17024j, spanStyle.f17025k, spanStyle.f17026l, spanStyle.f17027m, spanStyle.f17028n, spanStyle.f17029o, spanStyle.f17030p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpanStyle)) {
            return false;
        }
        SpanStyle spanStyle = (SpanStyle) obj;
        return a(spanStyle) && b(spanStyle);
    }

    public final int hashCode() {
        TextForegroundStyle textForegroundStyle = this.f17017a;
        long b2 = textForegroundStyle.b();
        int i2 = Color.f14963j;
        int hashCode = Long.hashCode(b2) * 31;
        Brush e = textForegroundStyle.e();
        int hashCode2 = (Float.hashCode(textForegroundStyle.a()) + ((hashCode + (e != null ? e.hashCode() : 0)) * 31)) * 31;
        TextUnitType[] textUnitTypeArr = TextUnit.f17498b;
        int d = d.d(this.f17018b, hashCode2, 31);
        FontWeight fontWeight = this.f17019c;
        int i3 = (d + (fontWeight != null ? fontWeight.f17274a : 0)) * 31;
        FontStyle fontStyle = this.d;
        int hashCode3 = (i3 + (fontStyle != null ? Integer.hashCode(fontStyle.f17260a) : 0)) * 31;
        FontSynthesis fontSynthesis = this.e;
        int hashCode4 = (hashCode3 + (fontSynthesis != null ? Integer.hashCode(fontSynthesis.f17261a) : 0)) * 31;
        FontFamily fontFamily = this.f17020f;
        int hashCode5 = (hashCode4 + (fontFamily != null ? fontFamily.hashCode() : 0)) * 31;
        String str = this.f17021g;
        int d2 = d.d(this.f17022h, (hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31);
        BaselineShift baselineShift = this.f17023i;
        int hashCode6 = (d2 + (baselineShift != null ? Float.hashCode(baselineShift.f17447a) : 0)) * 31;
        TextGeometricTransform textGeometricTransform = this.f17024j;
        int hashCode7 = (hashCode6 + (textGeometricTransform != null ? textGeometricTransform.hashCode() : 0)) * 31;
        LocaleList localeList = this.f17025k;
        int d3 = d.d(this.f17026l, (hashCode7 + (localeList != null ? localeList.f17402a.hashCode() : 0)) * 31, 31);
        TextDecoration textDecoration = this.f17027m;
        int i4 = (d3 + (textDecoration != null ? textDecoration.f17466a : 0)) * 31;
        Shadow shadow = this.f17028n;
        int hashCode8 = (i4 + (shadow != null ? shadow.hashCode() : 0)) * 31;
        PlatformSpanStyle platformSpanStyle = this.f17029o;
        int hashCode9 = (hashCode8 + (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0)) * 31;
        DrawStyle drawStyle = this.f17030p;
        return hashCode9 + (drawStyle != null ? drawStyle.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        TextForegroundStyle textForegroundStyle = this.f17017a;
        sb.append((Object) Color.i(textForegroundStyle.b()));
        sb.append(", brush=");
        sb.append(textForegroundStyle.e());
        sb.append(", alpha=");
        sb.append(textForegroundStyle.a());
        sb.append(", fontSize=");
        sb.append((Object) TextUnit.d(this.f17018b));
        sb.append(", fontWeight=");
        sb.append(this.f17019c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f17020f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.f17021g);
        sb.append(", letterSpacing=");
        sb.append((Object) TextUnit.d(this.f17022h));
        sb.append(", baselineShift=");
        sb.append(this.f17023i);
        sb.append(", textGeometricTransform=");
        sb.append(this.f17024j);
        sb.append(", localeList=");
        sb.append(this.f17025k);
        sb.append(", background=");
        d.z(this.f17026l, sb, ", textDecoration=");
        sb.append(this.f17027m);
        sb.append(", shadow=");
        sb.append(this.f17028n);
        sb.append(", platformStyle=");
        sb.append(this.f17029o);
        sb.append(", drawStyle=");
        sb.append(this.f17030p);
        sb.append(')');
        return sb.toString();
    }

    public SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, int i2) {
        this((i2 & 1) != 0 ? Color.f14962i : j2, (i2 & 2) != 0 ? TextUnit.f17499c : j3, (i2 & 4) != 0 ? null : fontWeight, (i2 & 8) != 0 ? null : fontStyle, (i2 & 16) != 0 ? null : fontSynthesis, (i2 & 32) != 0 ? null : fontFamily, (i2 & 64) != 0 ? null : str, (i2 & 128) != 0 ? TextUnit.f17499c : j4, (i2 & 256) != 0 ? null : baselineShift, (i2 & 512) != 0 ? null : textGeometricTransform, (i2 & 1024) != 0 ? null : localeList, (i2 & Opcodes.ACC_STRICT) != 0 ? Color.f14962i : j5, (i2 & 4096) != 0 ? null : textDecoration, (i2 & 8192) != 0 ? null : shadow, (PlatformSpanStyle) null, (DrawStyle) null);
    }

    public SpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this(TextForegroundStyle.Companion.b(j2), j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, platformSpanStyle, drawStyle);
    }
}
