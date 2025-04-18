package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes2.dex */
final class LazyStaggeredGridStateKt$rememberLazyStaggeredGridState$1$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5082b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridStateKt$rememberLazyStaggeredGridState$1$1(int i2, int i3) {
        super(0);
        this.f5081a = i2;
        this.f5082b = i3;
    }

    @Override // q0.a
    public final Object invoke() {
        return new LazyStaggeredGridState(new int[]{this.f5081a}, new int[]{this.f5082b});
    }
}
