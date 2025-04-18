package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.runtime.snapshots.Snapshot;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class LazyListState$prefetchState$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyListState f4414a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4415b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListState$prefetchState$1(LazyListState lazyListState, int i2) {
        super(1);
        this.f4414a = lazyListState;
        this.f4415b = i2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        NestedPrefetchScope nestedPrefetchScope = (NestedPrefetchScope) obj;
        LazyListPrefetchStrategy lazyListPrefetchStrategy = this.f4414a.f4391a;
        Snapshot a2 = Snapshot.Companion.a();
        Snapshot.Companion.f(a2, Snapshot.Companion.c(a2), a2 != null ? a2.f() : null);
        lazyListPrefetchStrategy.a(nestedPrefetchScope, this.f4415b);
        return b0.f30125a;
    }
}
