package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$reverseScope$1;
import d0.b0;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class PagerWrapperFlingBehavior$performFling$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PagerWrapperFlingBehavior f5322a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScrollScope f5323b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerWrapperFlingBehavior$performFling$2$1(PagerWrapperFlingBehavior pagerWrapperFlingBehavior, ScrollingLogic$doFlingAnimation$2$reverseScope$1 scrollingLogic$doFlingAnimation$2$reverseScope$1) {
        super(1);
        this.f5322a = pagerWrapperFlingBehavior;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        float floatValue = ((Number) obj).floatValue();
        PagerWrapperFlingBehavior pagerWrapperFlingBehavior = this.f5322a;
        int o2 = pagerWrapperFlingBehavior.f5318b.o();
        PagerState pagerState = pagerWrapperFlingBehavior.f5318b;
        pagerState.f5278r.b(pagerState.i(pagerState.j() + a.t0(o2 != 0 ? floatValue / pagerState.o() : 0.0f)));
        return b0.f30125a;
    }
}
