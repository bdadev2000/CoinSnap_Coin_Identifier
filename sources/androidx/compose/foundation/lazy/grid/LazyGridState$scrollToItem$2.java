package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.ScrollScope;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.lazy.grid.LazyGridState$scrollToItem$2", f = "LazyGridState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class LazyGridState$scrollToItem$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyGridState f4634a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4635b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4636c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridState$scrollToItem$2(LazyGridState lazyGridState, int i2, int i3, g gVar) {
        super(2, gVar);
        this.f4634a = lazyGridState;
        this.f4635b = i2;
        this.f4636c = i3;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new LazyGridState$scrollToItem$2(this.f4634a, this.f4635b, this.f4636c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        LazyGridState$scrollToItem$2 lazyGridState$scrollToItem$2 = (LazyGridState$scrollToItem$2) create((ScrollScope) obj, (g) obj2);
        b0 b0Var = b0.f30125a;
        lazyGridState$scrollToItem$2.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        q.m(obj);
        this.f4634a.k(this.f4635b, this.f4636c);
        return b0.f30125a;
    }
}
