package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.r;
import q0.a;
import w0.g;

/* loaded from: classes3.dex */
final class LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$itemProviderState$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ State f4948a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LazyStaggeredGridState f4949b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$itemProviderState$1(State state, LazyStaggeredGridState lazyStaggeredGridState) {
        super(0);
        this.f4948a = state;
        this.f4949b = lazyStaggeredGridState;
    }

    @Override // q0.a
    public final Object invoke() {
        LazyStaggeredGridIntervalContent lazyStaggeredGridIntervalContent = (LazyStaggeredGridIntervalContent) this.f4948a.getValue();
        LazyStaggeredGridState lazyStaggeredGridState = this.f4949b;
        return new LazyStaggeredGridItemProviderImpl(lazyStaggeredGridState, lazyStaggeredGridIntervalContent, new NearestRangeKeyIndexMap((g) lazyStaggeredGridState.f5049a.f5040h.getValue(), lazyStaggeredGridIntervalContent));
    }
}
