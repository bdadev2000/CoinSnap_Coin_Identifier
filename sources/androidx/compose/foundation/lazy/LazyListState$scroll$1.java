package androidx.compose.foundation.lazy;

import androidx.compose.foundation.MutatePriority;
import h0.g;
import j0.c;
import j0.e;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.lazy.LazyListState", f = "LazyListState.kt", l = {388, 389}, m = "scroll")
/* loaded from: classes4.dex */
public final class LazyListState$scroll$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public LazyListState f4419a;

    /* renamed from: b, reason: collision with root package name */
    public MutatePriority f4420b;

    /* renamed from: c, reason: collision with root package name */
    public p f4421c;
    public /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ LazyListState f4422f;

    /* renamed from: g, reason: collision with root package name */
    public int f4423g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListState$scroll$1(LazyListState lazyListState, g gVar) {
        super(gVar);
        this.f4422f = lazyListState;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f4423g |= Integer.MIN_VALUE;
        return this.f4422f.b(null, null, this);
    }
}
