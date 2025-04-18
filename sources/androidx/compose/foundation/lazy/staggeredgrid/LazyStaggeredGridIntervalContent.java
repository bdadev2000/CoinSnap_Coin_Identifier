package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.internal.StabilityInferred;
import q0.l;

@StabilityInferred
/* loaded from: classes2.dex */
public final class LazyStaggeredGridIntervalContent extends LazyLayoutIntervalContent<LazyStaggeredGridInterval> implements LazyStaggeredGridScope {

    /* renamed from: a, reason: collision with root package name */
    public final MutableIntervalList f4937a;

    /* renamed from: b, reason: collision with root package name */
    public final LazyStaggeredGridSpanProvider f4938b;

    public LazyStaggeredGridIntervalContent(l lVar) {
        MutableIntervalList mutableIntervalList = new MutableIntervalList();
        this.f4937a = mutableIntervalList;
        this.f4938b = new LazyStaggeredGridSpanProvider(mutableIntervalList);
        lVar.invoke(this);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public final MutableIntervalList h() {
        return this.f4937a;
    }
}
