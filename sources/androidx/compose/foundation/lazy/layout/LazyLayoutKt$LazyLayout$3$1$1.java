package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class LazyLayoutKt$LazyLayout$3$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutPrefetchState f4806a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutItemContentFactory f4807b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SubcomposeLayoutState f4808c;
    public final /* synthetic */ PrefetchScheduler d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutKt$LazyLayout$3$1$1(LazyLayoutPrefetchState lazyLayoutPrefetchState, LazyLayoutItemContentFactory lazyLayoutItemContentFactory, SubcomposeLayoutState subcomposeLayoutState, PrefetchScheduler prefetchScheduler) {
        super(1);
        this.f4806a = lazyLayoutPrefetchState;
        this.f4807b = lazyLayoutItemContentFactory;
        this.f4808c = subcomposeLayoutState;
        this.d = prefetchScheduler;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        PrefetchHandleProvider prefetchHandleProvider = new PrefetchHandleProvider(this.f4807b, this.f4808c, this.d);
        final LazyLayoutPrefetchState lazyLayoutPrefetchState = this.f4806a;
        lazyLayoutPrefetchState.d = prefetchHandleProvider;
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$3$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                LazyLayoutPrefetchState.this.d = null;
            }
        };
    }
}
