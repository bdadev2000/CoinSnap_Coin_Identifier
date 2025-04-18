package androidx.compose.foundation.pager;

import androidx.compose.runtime.internal.StabilityInferred;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class PagerSnapDistanceMaxPages implements PagerSnapDistance {

    /* renamed from: a, reason: collision with root package name */
    public final int f5262a = 1;

    @Override // androidx.compose.foundation.pager.PagerSnapDistance
    public final int a(int i2, int i3) {
        long j2 = i2;
        long j3 = this.f5262a;
        int w = (int) a.w(j2 - j3, 0L);
        long j4 = j2 + j3;
        if (j4 > 2147483647L) {
            j4 = 2147483647L;
        }
        return a.A(i3, w, (int) j4);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PagerSnapDistanceMaxPages) {
            return this.f5262a == ((PagerSnapDistanceMaxPages) obj).f5262a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5262a);
    }
}
