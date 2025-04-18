package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import q0.l;
import q0.r;

@StabilityInferred
/* loaded from: classes2.dex */
public final class LazyListInterval implements LazyLayoutIntervalContent.Interval {

    /* renamed from: a, reason: collision with root package name */
    public final l f4286a;

    /* renamed from: b, reason: collision with root package name */
    public final l f4287b;

    /* renamed from: c, reason: collision with root package name */
    public final r f4288c;

    public LazyListInterval(l lVar, l lVar2, ComposableLambdaImpl composableLambdaImpl) {
        this.f4286a = lVar;
        this.f4287b = lVar2;
        this.f4288c = composableLambdaImpl;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public final l getKey() {
        return this.f4286a;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public final l getType() {
        return this.f4287b;
    }
}
