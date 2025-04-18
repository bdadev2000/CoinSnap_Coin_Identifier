package androidx.compose.ui.text;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class ParagraphIntrinsicInfo {

    /* renamed from: a, reason: collision with root package name */
    public final ParagraphIntrinsics f16933a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16934b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16935c;

    public ParagraphIntrinsicInfo(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i2, int i3) {
        this.f16933a = androidParagraphIntrinsics;
        this.f16934b = i2;
        this.f16935c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphIntrinsicInfo)) {
            return false;
        }
        ParagraphIntrinsicInfo paragraphIntrinsicInfo = (ParagraphIntrinsicInfo) obj;
        return a.g(this.f16933a, paragraphIntrinsicInfo.f16933a) && this.f16934b == paragraphIntrinsicInfo.f16934b && this.f16935c == paragraphIntrinsicInfo.f16935c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16935c) + d.c(this.f16934b, this.f16933a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.f16933a);
        sb.append(", startIndex=");
        sb.append(this.f16934b);
        sb.append(", endIndex=");
        return d.o(sb, this.f16935c, ')');
    }
}
