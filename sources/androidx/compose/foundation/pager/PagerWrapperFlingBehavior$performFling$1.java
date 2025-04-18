package androidx.compose.foundation.pager;

import h0.g;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.pager.PagerWrapperFlingBehavior", f = "LazyLayoutPager.kt", l = {383}, m = "performFling")
/* loaded from: classes4.dex */
public final class PagerWrapperFlingBehavior$performFling$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5319a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PagerWrapperFlingBehavior f5320b;

    /* renamed from: c, reason: collision with root package name */
    public int f5321c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerWrapperFlingBehavior$performFling$1(PagerWrapperFlingBehavior pagerWrapperFlingBehavior, g gVar) {
        super(gVar);
        this.f5320b = pagerWrapperFlingBehavior;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f5319a = obj;
        this.f5321c |= Integer.MIN_VALUE;
        return this.f5320b.a(null, 0.0f, this);
    }
}
