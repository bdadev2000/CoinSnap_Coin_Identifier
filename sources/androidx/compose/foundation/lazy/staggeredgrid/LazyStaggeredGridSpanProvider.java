package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes4.dex */
public final class LazyStaggeredGridSpanProvider {

    /* renamed from: a, reason: collision with root package name */
    public final IntervalList f5047a;

    public LazyStaggeredGridSpanProvider(MutableIntervalList mutableIntervalList) {
        this.f5047a = mutableIntervalList;
    }

    public final void a(int i2) {
        if (i2 >= 0) {
            IntervalList intervalList = this.f5047a;
            if (i2 < intervalList.getSize()) {
                ((LazyStaggeredGridInterval) intervalList.get(i2).f4659c).getClass();
            }
        }
    }
}
