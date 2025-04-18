package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import p0.a;

@Immutable
/* loaded from: classes3.dex */
public final class TextLinkStyles {

    /* renamed from: a, reason: collision with root package name */
    public final SpanStyle f17050a;

    /* renamed from: b, reason: collision with root package name */
    public final SpanStyle f17051b;

    /* renamed from: c, reason: collision with root package name */
    public final SpanStyle f17052c;
    public final SpanStyle d;

    public TextLinkStyles(SpanStyle spanStyle, SpanStyle spanStyle2, SpanStyle spanStyle3, SpanStyle spanStyle4) {
        this.f17050a = spanStyle;
        this.f17051b = spanStyle2;
        this.f17052c = spanStyle3;
        this.d = spanStyle4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TextLinkStyles)) {
            return false;
        }
        TextLinkStyles textLinkStyles = (TextLinkStyles) obj;
        return a.g(this.f17050a, textLinkStyles.f17050a) && a.g(this.f17051b, textLinkStyles.f17051b) && a.g(this.f17052c, textLinkStyles.f17052c) && a.g(this.d, textLinkStyles.d);
    }

    public final int hashCode() {
        SpanStyle spanStyle = this.f17050a;
        int hashCode = (spanStyle != null ? spanStyle.hashCode() : 0) * 31;
        SpanStyle spanStyle2 = this.f17051b;
        int hashCode2 = (hashCode + (spanStyle2 != null ? spanStyle2.hashCode() : 0)) * 31;
        SpanStyle spanStyle3 = this.f17052c;
        int hashCode3 = (hashCode2 + (spanStyle3 != null ? spanStyle3.hashCode() : 0)) * 31;
        SpanStyle spanStyle4 = this.d;
        return hashCode3 + (spanStyle4 != null ? spanStyle4.hashCode() : 0);
    }
}
