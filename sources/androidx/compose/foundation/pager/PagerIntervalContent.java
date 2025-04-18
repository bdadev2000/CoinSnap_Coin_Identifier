package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.internal.StabilityInferred;
import q0.l;
import q0.r;

@StabilityInferred
/* loaded from: classes4.dex */
public final class PagerIntervalContent implements LazyLayoutIntervalContent.Interval {

    /* renamed from: a, reason: collision with root package name */
    public final l f5145a;

    /* renamed from: b, reason: collision with root package name */
    public final r f5146b;

    public PagerIntervalContent(l lVar, r rVar) {
        this.f5145a = lVar;
        this.f5146b = rVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public final l getKey() {
        return this.f5145a;
    }
}
