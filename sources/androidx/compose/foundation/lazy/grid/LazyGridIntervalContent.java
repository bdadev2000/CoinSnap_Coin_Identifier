package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import q0.l;
import q0.p;

@StabilityInferred
/* loaded from: classes3.dex */
public final class LazyGridIntervalContent extends LazyLayoutIntervalContent<LazyGridInterval> implements LazyGridScope {
    public static final p d = null;

    /* renamed from: a, reason: collision with root package name */
    public final LazyGridSpanLayoutProvider f4483a = new LazyGridSpanLayoutProvider(this);

    /* renamed from: b, reason: collision with root package name */
    public final MutableIntervalList f4484b = new MutableIntervalList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f4485c;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public LazyGridIntervalContent(l lVar) {
        lVar.invoke(this);
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public final void b(int i2, l lVar, p pVar, l lVar2, ComposableLambdaImpl composableLambdaImpl) {
        this.f4484b.a(i2, new LazyGridInterval(lVar, pVar == null ? LazyGridIntervalContent$Companion$DefaultSpan$1.f4486a : pVar, lVar2, composableLambdaImpl));
        if (pVar != null) {
            this.f4485c = true;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public final MutableIntervalList h() {
        return this.f4484b;
    }
}
