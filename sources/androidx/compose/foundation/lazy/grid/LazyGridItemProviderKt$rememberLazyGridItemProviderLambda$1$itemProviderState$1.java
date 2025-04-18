package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.r;
import q0.a;
import w0.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class LazyGridItemProviderKt$rememberLazyGridItemProviderLambda$1$itemProviderState$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ State f4496a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LazyGridState f4497b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridItemProviderKt$rememberLazyGridItemProviderLambda$1$itemProviderState$1(State state, LazyGridState lazyGridState) {
        super(0);
        this.f4496a = state;
        this.f4497b = lazyGridState;
    }

    @Override // q0.a
    public final Object invoke() {
        LazyGridIntervalContent lazyGridIntervalContent = (LazyGridIntervalContent) this.f4496a.getValue();
        LazyGridState lazyGridState = this.f4497b;
        return new LazyGridItemProviderImpl(lazyGridState, lazyGridIntervalContent, new NearestRangeKeyIndexMap((g) lazyGridState.f4605b.e.getValue(), lazyGridIntervalContent));
    }
}
