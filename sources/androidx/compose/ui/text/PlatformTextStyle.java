package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class PlatformTextStyle {

    /* renamed from: a, reason: collision with root package name */
    public final PlatformSpanStyle f16949a;

    /* renamed from: b, reason: collision with root package name */
    public final PlatformParagraphStyle f16950b;

    public PlatformTextStyle(PlatformSpanStyle platformSpanStyle, PlatformParagraphStyle platformParagraphStyle) {
        this.f16949a = platformSpanStyle;
        this.f16950b = platformParagraphStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformTextStyle)) {
            return false;
        }
        PlatformTextStyle platformTextStyle = (PlatformTextStyle) obj;
        return a.g(this.f16950b, platformTextStyle.f16950b) && a.g(this.f16949a, platformTextStyle.f16949a);
    }

    public final int hashCode() {
        PlatformSpanStyle platformSpanStyle = this.f16949a;
        int hashCode = (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.f16950b;
        return hashCode + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f16949a + ", paragraphSyle=" + this.f16950b + ')';
    }
}
