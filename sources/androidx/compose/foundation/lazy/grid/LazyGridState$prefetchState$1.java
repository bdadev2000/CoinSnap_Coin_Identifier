package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.runtime.snapshots.Snapshot;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazyGridState$prefetchState$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyGridState f4624a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4625b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridState$prefetchState$1(LazyGridState lazyGridState, int i2) {
        super(1);
        this.f4624a = lazyGridState;
        this.f4625b = i2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        NestedPrefetchScope nestedPrefetchScope = (NestedPrefetchScope) obj;
        LazyGridPrefetchStrategy lazyGridPrefetchStrategy = this.f4624a.f4604a;
        Snapshot a2 = Snapshot.Companion.a();
        Snapshot.Companion.f(a2, Snapshot.Companion.c(a2), a2 != null ? a2.f() : null);
        lazyGridPrefetchStrategy.a(nestedPrefetchScope, this.f4625b);
        return b0.f30125a;
    }
}
