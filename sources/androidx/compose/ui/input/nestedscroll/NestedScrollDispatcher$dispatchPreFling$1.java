package androidx.compose.ui.input.nestedscroll;

import h0.g;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {203}, m = "dispatchPreFling-QWom1Mo")
/* loaded from: classes3.dex */
public final class NestedScrollDispatcher$dispatchPreFling$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f15526a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NestedScrollDispatcher f15527b;

    /* renamed from: c, reason: collision with root package name */
    public int f15528c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollDispatcher$dispatchPreFling$1(NestedScrollDispatcher nestedScrollDispatcher, g gVar) {
        super(gVar);
        this.f15527b = nestedScrollDispatcher;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f15526a = obj;
        this.f15528c |= Integer.MIN_VALUE;
        return this.f15527b.b(0L, this);
    }
}
