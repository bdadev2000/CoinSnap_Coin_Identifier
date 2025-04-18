package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.r;
import q0.a;
import w0.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$itemProviderState$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ State f5121a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PagerState f5122b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$itemProviderState$1(State state, PagerState pagerState) {
        super(0);
        this.f5121a = state;
        this.f5122b = pagerState;
    }

    @Override // q0.a
    public final Object invoke() {
        PagerLayoutIntervalContent pagerLayoutIntervalContent = (PagerLayoutIntervalContent) this.f5121a.getValue();
        PagerState pagerState = this.f5122b;
        return new PagerLazyLayoutItemProvider(pagerState, pagerLayoutIntervalContent, new NearestRangeKeyIndexMap((g) pagerState.f5265c.f5261f.getValue(), pagerLayoutIntervalContent));
    }
}
