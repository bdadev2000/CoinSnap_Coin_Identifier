package androidx.compose.foundation.pager;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class PagerState$animateScrollToPage$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PagerState f5291a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$animateScrollToPage$3(PagerState pagerState) {
        super(2);
        this.f5291a = pagerState;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj2).intValue();
        PagerState pagerState = this.f5291a;
        pagerState.f5278r.b(pagerState.i(intValue));
        return b0.f30125a;
    }
}
