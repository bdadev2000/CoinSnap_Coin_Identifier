package androidx.compose.ui.text;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class ParagraphInfo {

    /* renamed from: a, reason: collision with root package name */
    public final Paragraph f16928a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16929b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16930c;
    public final int d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final float f16931f;

    /* renamed from: g, reason: collision with root package name */
    public final float f16932g;

    public ParagraphInfo(AndroidParagraph androidParagraph, int i2, int i3, int i4, int i5, float f2, float f3) {
        this.f16928a = androidParagraph;
        this.f16929b = i2;
        this.f16930c = i3;
        this.d = i4;
        this.e = i5;
        this.f16931f = f2;
        this.f16932g = f3;
    }

    public final long a(long j2, boolean z2) {
        if (z2) {
            int i2 = TextRange.f17057c;
            long j3 = TextRange.f17056b;
            if (TextRange.b(j2, j3)) {
                return j3;
            }
        }
        int i3 = TextRange.f17057c;
        int i4 = (int) (j2 >> 32);
        int i5 = this.f16929b;
        return TextRangeKt.a(i4 + i5, ((int) (j2 & 4294967295L)) + i5);
    }

    public final int b(int i2) {
        int i3 = this.f16930c;
        int i4 = this.f16929b;
        return a.A(i2, i4, i3) - i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphInfo)) {
            return false;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) obj;
        return a.g(this.f16928a, paragraphInfo.f16928a) && this.f16929b == paragraphInfo.f16929b && this.f16930c == paragraphInfo.f16930c && this.d == paragraphInfo.d && this.e == paragraphInfo.e && Float.compare(this.f16931f, paragraphInfo.f16931f) == 0 && Float.compare(this.f16932g, paragraphInfo.f16932g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16932g) + d.b(this.f16931f, d.c(this.e, d.c(this.d, d.c(this.f16930c, d.c(this.f16929b, this.f16928a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.f16928a);
        sb.append(", startIndex=");
        sb.append(this.f16929b);
        sb.append(", endIndex=");
        sb.append(this.f16930c);
        sb.append(", startLineIndex=");
        sb.append(this.d);
        sb.append(", endLineIndex=");
        sb.append(this.e);
        sb.append(", top=");
        sb.append(this.f16931f);
        sb.append(", bottom=");
        return d.n(sb, this.f16932g, ')');
    }
}
