package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.MutatePriority;
import h0.g;
import j0.c;
import j0.e;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.lazy.grid.LazyGridState", f = "LazyGridState.kt", l = {370, 371}, m = "scroll")
/* loaded from: classes.dex */
public final class LazyGridState$scroll$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public LazyGridState f4629a;

    /* renamed from: b, reason: collision with root package name */
    public MutatePriority f4630b;

    /* renamed from: c, reason: collision with root package name */
    public p f4631c;
    public /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ LazyGridState f4632f;

    /* renamed from: g, reason: collision with root package name */
    public int f4633g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridState$scroll$1(LazyGridState lazyGridState, g gVar) {
        super(gVar);
        this.f4632f = lazyGridState;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f4633g |= Integer.MIN_VALUE;
        return this.f4632f.b(null, null, this);
    }
}
