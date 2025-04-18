package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import p0.a;
import w0.d;

@StabilityInferred
/* loaded from: classes3.dex */
public final class ProgressBarRangeInfo {
    public static final ProgressBarRangeInfo d = new ProgressBarRangeInfo(0.0f, new d(0.0f, 0.0f), 0);

    /* renamed from: a, reason: collision with root package name */
    public final float f16786a;

    /* renamed from: b, reason: collision with root package name */
    public final d f16787b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16788c;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public ProgressBarRangeInfo(float f2, d dVar, int i2) {
        this.f16786a = f2;
        this.f16787b = dVar;
        this.f16788c = i2;
        if (!(!Float.isNaN(f2))) {
            throw new IllegalArgumentException("current must not be NaN".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressBarRangeInfo)) {
            return false;
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) obj;
        return this.f16786a == progressBarRangeInfo.f16786a && a.g(this.f16787b, progressBarRangeInfo.f16787b) && this.f16788c == progressBarRangeInfo.f16788c;
    }

    public final int hashCode() {
        return ((this.f16787b.hashCode() + (Float.hashCode(this.f16786a) * 31)) * 31) + this.f16788c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.f16786a);
        sb.append(", range=");
        sb.append(this.f16787b);
        sb.append(", steps=");
        return android.support.v4.media.d.o(sb, this.f16788c, ')');
    }
}
