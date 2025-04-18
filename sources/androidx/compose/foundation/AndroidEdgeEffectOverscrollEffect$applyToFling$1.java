package androidx.compose.foundation;

import h0.g;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect", f = "AndroidOverscroll.android.kt", l = {533, 559}, m = "applyToFling-BMRW4eQ")
/* loaded from: classes3.dex */
public final class AndroidEdgeEffectOverscrollEffect$applyToFling$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public AndroidEdgeEffectOverscrollEffect f2449a;

    /* renamed from: b, reason: collision with root package name */
    public long f2450b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f2451c;
    public final /* synthetic */ AndroidEdgeEffectOverscrollEffect d;

    /* renamed from: f, reason: collision with root package name */
    public int f2452f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEdgeEffectOverscrollEffect$applyToFling$1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, g gVar) {
        super(gVar);
        this.d = androidEdgeEffectOverscrollEffect;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f2451c = obj;
        this.f2452f |= Integer.MIN_VALUE;
        return this.d.d(0L, null, this);
    }
}
