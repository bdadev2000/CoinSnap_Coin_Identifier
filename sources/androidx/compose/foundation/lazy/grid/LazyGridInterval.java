package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import q0.l;
import q0.p;
import q0.r;

@StabilityInferred
/* loaded from: classes4.dex */
public final class LazyGridInterval implements LazyLayoutIntervalContent.Interval {

    /* renamed from: a, reason: collision with root package name */
    public final l f4480a;

    /* renamed from: b, reason: collision with root package name */
    public final p f4481b;

    /* renamed from: c, reason: collision with root package name */
    public final l f4482c;
    public final r d;

    public LazyGridInterval(l lVar, p pVar, l lVar2, ComposableLambdaImpl composableLambdaImpl) {
        this.f4480a = lVar;
        this.f4481b = pVar;
        this.f4482c = lVar2;
        this.d = composableLambdaImpl;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public final l getKey() {
        return this.f4480a;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public final l getType() {
        return this.f4482c;
    }
}
