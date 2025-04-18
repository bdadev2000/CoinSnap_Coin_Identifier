package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.PrefetchHandleProvider;
import androidx.compose.runtime.Stable;
import java.util.ArrayList;
import q0.l;

@Stable
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class LazyLayoutPrefetchState {

    /* renamed from: a, reason: collision with root package name */
    public final PrefetchScheduler f4834a;

    /* renamed from: b, reason: collision with root package name */
    public final l f4835b;

    /* renamed from: c, reason: collision with root package name */
    public final PrefetchMetrics f4836c = new PrefetchMetrics();
    public PrefetchHandleProvider d;

    /* loaded from: classes.dex */
    public final class NestedPrefetchScopeImpl implements NestedPrefetchScope {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f4837a = new ArrayList();

        public NestedPrefetchScopeImpl() {
        }

        @Override // androidx.compose.foundation.lazy.layout.NestedPrefetchScope
        public final void a(int i2) {
            long j2 = LazyLayoutPrefetchStateKt.f4839a;
            LazyLayoutPrefetchState lazyLayoutPrefetchState = LazyLayoutPrefetchState.this;
            PrefetchHandleProvider prefetchHandleProvider = lazyLayoutPrefetchState.d;
            if (prefetchHandleProvider == null) {
                return;
            }
            this.f4837a.add(new PrefetchHandleProvider.HandleAndRequestImpl(i2, j2, lazyLayoutPrefetchState.f4836c));
        }
    }

    /* loaded from: classes.dex */
    public interface PrefetchHandle {
        void b();

        void cancel();
    }

    public LazyLayoutPrefetchState(PrefetchScheduler prefetchScheduler, l lVar) {
        this.f4834a = prefetchScheduler;
        this.f4835b = lVar;
    }

    public final PrefetchHandle a(int i2, long j2) {
        PrefetchHandleProvider prefetchHandleProvider = this.d;
        if (prefetchHandleProvider == null) {
            return DummyHandle.f4656a;
        }
        PrefetchHandleProvider.HandleAndRequestImpl handleAndRequestImpl = new PrefetchHandleProvider.HandleAndRequestImpl(i2, j2, this.f4836c);
        prefetchHandleProvider.f4890c.a(handleAndRequestImpl);
        return handleAndRequestImpl;
    }
}
