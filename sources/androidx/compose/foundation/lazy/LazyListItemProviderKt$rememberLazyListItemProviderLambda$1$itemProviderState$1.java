package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.r;
import q0.a;
import w0.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$itemProviderState$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ State f4302a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LazyListState f4303b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LazyItemScopeImpl f4304c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$itemProviderState$1(State state, LazyListState lazyListState, LazyItemScopeImpl lazyItemScopeImpl) {
        super(0);
        this.f4302a = state;
        this.f4303b = lazyListState;
        this.f4304c = lazyItemScopeImpl;
    }

    @Override // q0.a
    public final Object invoke() {
        LazyListIntervalContent lazyListIntervalContent = (LazyListIntervalContent) this.f4302a.getValue();
        LazyListState lazyListState = this.f4303b;
        return new LazyListItemProviderImpl(lazyListState, lazyListIntervalContent, this.f4304c, new NearestRangeKeyIndexMap((g) lazyListState.d.e.getValue(), lazyListIntervalContent));
    }
}
