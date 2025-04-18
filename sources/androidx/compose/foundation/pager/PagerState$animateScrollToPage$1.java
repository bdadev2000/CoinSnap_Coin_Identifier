package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import h0.g;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", l = {605, 613}, m = "animateScrollToPage")
/* loaded from: classes3.dex */
public final class PagerState$animateScrollToPage$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public PagerState f5285a;

    /* renamed from: b, reason: collision with root package name */
    public AnimationSpec f5286b;

    /* renamed from: c, reason: collision with root package name */
    public int f5287c;
    public float d;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f5288f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ PagerState f5289g;

    /* renamed from: h, reason: collision with root package name */
    public int f5290h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$animateScrollToPage$1(PagerState pagerState, g gVar) {
        super(gVar);
        this.f5289g = pagerState;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f5288f = obj;
        this.f5290h |= Integer.MIN_VALUE;
        return this.f5289g.f(0, 0.0f, null, this);
    }
}
