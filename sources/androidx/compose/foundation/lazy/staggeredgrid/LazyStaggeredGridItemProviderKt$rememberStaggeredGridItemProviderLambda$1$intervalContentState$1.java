package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.r;
import q0.a;
import q0.l;

/* loaded from: classes3.dex */
final class LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$intervalContentState$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ State f4947a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$intervalContentState$1(MutableState mutableState) {
        super(0);
        this.f4947a = mutableState;
    }

    @Override // q0.a
    public final Object invoke() {
        return new LazyStaggeredGridIntervalContent((l) this.f4947a.getValue());
    }
}
