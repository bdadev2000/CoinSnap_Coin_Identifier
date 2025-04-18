package androidx.compose.ui.text;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class TextLayoutInput {

    /* renamed from: a, reason: collision with root package name */
    public final AnnotatedString f17038a;

    /* renamed from: b, reason: collision with root package name */
    public final TextStyle f17039b;

    /* renamed from: c, reason: collision with root package name */
    public final List f17040c;
    public final int d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17041f;

    /* renamed from: g, reason: collision with root package name */
    public final Density f17042g;

    /* renamed from: h, reason: collision with root package name */
    public final LayoutDirection f17043h;

    /* renamed from: i, reason: collision with root package name */
    public final FontFamily.Resolver f17044i;

    /* renamed from: j, reason: collision with root package name */
    public final long f17045j;

    public TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List list, int i2, boolean z2, int i3, Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j2) {
        this.f17038a = annotatedString;
        this.f17039b = textStyle;
        this.f17040c = list;
        this.d = i2;
        this.e = z2;
        this.f17041f = i3;
        this.f17042g = density;
        this.f17043h = layoutDirection;
        this.f17044i = resolver;
        this.f17045j = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput = (TextLayoutInput) obj;
        return a.g(this.f17038a, textLayoutInput.f17038a) && a.g(this.f17039b, textLayoutInput.f17039b) && a.g(this.f17040c, textLayoutInput.f17040c) && this.d == textLayoutInput.d && this.e == textLayoutInput.e && TextOverflow.a(this.f17041f, textLayoutInput.f17041f) && a.g(this.f17042g, textLayoutInput.f17042g) && this.f17043h == textLayoutInput.f17043h && a.g(this.f17044i, textLayoutInput.f17044i) && Constraints.c(this.f17045j, textLayoutInput.f17045j);
    }

    public final int hashCode() {
        return Long.hashCode(this.f17045j) + ((this.f17044i.hashCode() + ((this.f17043h.hashCode() + ((this.f17042g.hashCode() + d.c(this.f17041f, d.g(this.e, (d.f(this.f17040c, (this.f17039b.hashCode() + (this.f17038a.hashCode() * 31)) * 31, 31) + this.d) * 31, 31), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TextLayoutInput(text=" + ((Object) this.f17038a) + ", style=" + this.f17039b + ", placeholders=" + this.f17040c + ", maxLines=" + this.d + ", softWrap=" + this.e + ", overflow=" + ((Object) TextOverflow.b(this.f17041f)) + ", density=" + this.f17042g + ", layoutDirection=" + this.f17043h + ", fontFamilyResolver=" + this.f17044i + ", constraints=" + ((Object) Constraints.m(this.f17045j)) + ')';
    }
}
