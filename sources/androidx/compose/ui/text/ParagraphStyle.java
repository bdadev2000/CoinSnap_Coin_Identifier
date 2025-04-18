package androidx.compose.ui.text;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import p0.a;

@Immutable
/* loaded from: classes4.dex */
public final class ParagraphStyle {

    /* renamed from: a, reason: collision with root package name */
    public final int f16936a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16937b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16938c;
    public final TextIndent d;
    public final PlatformParagraphStyle e;

    /* renamed from: f, reason: collision with root package name */
    public final LineHeightStyle f16939f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16940g;

    /* renamed from: h, reason: collision with root package name */
    public final int f16941h;

    /* renamed from: i, reason: collision with root package name */
    public final TextMotion f16942i;

    public ParagraphStyle(int i2, int i3, long j2, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i4, int i5, TextMotion textMotion) {
        this.f16936a = i2;
        this.f16937b = i3;
        this.f16938c = j2;
        this.d = textIndent;
        this.e = platformParagraphStyle;
        this.f16939f = lineHeightStyle;
        this.f16940g = i4;
        this.f16941h = i5;
        this.f16942i = textMotion;
        if (TextUnit.a(j2, TextUnit.f17499c) || TextUnit.c(j2) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + TextUnit.c(j2) + ')').toString());
    }

    public final ParagraphStyle a(ParagraphStyle paragraphStyle) {
        return paragraphStyle == null ? this : ParagraphStyleKt.a(this, paragraphStyle.f16936a, paragraphStyle.f16937b, paragraphStyle.f16938c, paragraphStyle.d, paragraphStyle.e, paragraphStyle.f16939f, paragraphStyle.f16940g, paragraphStyle.f16941h, paragraphStyle.f16942i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphStyle)) {
            return false;
        }
        ParagraphStyle paragraphStyle = (ParagraphStyle) obj;
        return TextAlign.a(this.f16936a, paragraphStyle.f16936a) && TextDirection.a(this.f16937b, paragraphStyle.f16937b) && TextUnit.a(this.f16938c, paragraphStyle.f16938c) && a.g(this.d, paragraphStyle.d) && a.g(this.e, paragraphStyle.e) && a.g(this.f16939f, paragraphStyle.f16939f) && this.f16940g == paragraphStyle.f16940g && Hyphens.a(this.f16941h, paragraphStyle.f16941h) && a.g(this.f16942i, paragraphStyle.f16942i);
    }

    public final int hashCode() {
        int c2 = d.c(this.f16937b, Integer.hashCode(this.f16936a) * 31, 31);
        TextUnitType[] textUnitTypeArr = TextUnit.f17498b;
        int d = d.d(this.f16938c, c2, 31);
        TextIndent textIndent = this.d;
        int hashCode = (d + (textIndent != null ? textIndent.hashCode() : 0)) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.e;
        int hashCode2 = (hashCode + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0)) * 31;
        LineHeightStyle lineHeightStyle = this.f16939f;
        int c3 = d.c(this.f16941h, d.c(this.f16940g, (hashCode2 + (lineHeightStyle != null ? lineHeightStyle.hashCode() : 0)) * 31, 31), 31);
        TextMotion textMotion = this.f16942i;
        return c3 + (textMotion != null ? textMotion.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) TextAlign.b(this.f16936a)) + ", textDirection=" + ((Object) TextDirection.b(this.f16937b)) + ", lineHeight=" + ((Object) TextUnit.d(this.f16938c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f16939f + ", lineBreak=" + ((Object) LineBreak.a(this.f16940g)) + ", hyphens=" + ((Object) Hyphens.b(this.f16941h)) + ", textMotion=" + this.f16942i + ')';
    }
}
