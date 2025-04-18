package androidx.compose.foundation.pager;

import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes3.dex */
final class LazyLayoutPagerKt$Pager$measurePolicy$1$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PagerState f5106a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutPagerKt$Pager$measurePolicy$1$1(PagerState pagerState) {
        super(0);
        this.f5106a = pagerState;
    }

    @Override // q0.a
    public final Object invoke() {
        return Integer.valueOf(this.f5106a.m());
    }
}
