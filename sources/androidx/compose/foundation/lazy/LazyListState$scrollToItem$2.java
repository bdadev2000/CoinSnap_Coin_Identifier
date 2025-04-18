package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.ScrollScope;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", f = "LazyListState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class LazyListState$scrollToItem$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyListState f4424a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4425b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4426c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListState$scrollToItem$2(LazyListState lazyListState, int i2, int i3, g gVar) {
        super(2, gVar);
        this.f4424a = lazyListState;
        this.f4425b = i2;
        this.f4426c = i3;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new LazyListState$scrollToItem$2(this.f4424a, this.f4425b, this.f4426c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        LazyListState$scrollToItem$2 lazyListState$scrollToItem$2 = (LazyListState$scrollToItem$2) create((ScrollScope) obj, (g) obj2);
        b0 b0Var = b0.f30125a;
        lazyListState$scrollToItem$2.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        q.m(obj);
        this.f4424a.k(this.f4425b, this.f4426c);
        return b0.f30125a;
    }
}
