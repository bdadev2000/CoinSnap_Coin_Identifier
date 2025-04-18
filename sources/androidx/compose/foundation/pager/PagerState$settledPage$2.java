package androidx.compose.foundation.pager;

import kotlin.jvm.internal.r;
import q0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class PagerState$settledPage$2 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PagerState f5304a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$settledPage$2(PagerState pagerState) {
        super(0);
        this.f5304a = pagerState;
    }

    @Override // q0.a
    public final Object invoke() {
        PagerState pagerState = this.f5304a;
        return Integer.valueOf(pagerState.f5270j.a() ? pagerState.f5279s.g() : pagerState.j());
    }
}
