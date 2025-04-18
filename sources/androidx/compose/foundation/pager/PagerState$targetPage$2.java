package androidx.compose.foundation.pager;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import kotlin.jvm.internal.r;
import q0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class PagerState$targetPage$2 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PagerState f5305a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$targetPage$2(PagerState pagerState) {
        super(0);
        this.f5305a = pagerState;
    }

    @Override // q0.a
    public final Object invoke() {
        int g2;
        PagerState pagerState = this.f5305a;
        if (pagerState.f5270j.a()) {
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = pagerState.f5278r;
            g2 = parcelableSnapshotMutableIntState.g() != -1 ? parcelableSnapshotMutableIntState.g() : Math.abs(pagerState.k()) >= Math.abs(Math.min(pagerState.f5276p.y1(PagerStateKt.f5306a), ((float) pagerState.n()) / 2.0f) / ((float) pagerState.n())) ? ((Boolean) pagerState.G.getValue()).booleanValue() ? pagerState.d + 1 : pagerState.d : pagerState.j();
        } else {
            g2 = pagerState.j();
        }
        return Integer.valueOf(pagerState.i(g2));
    }
}
