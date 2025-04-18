package androidx.compose.ui.input.nestedscroll;

import h0.g;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {218}, m = "dispatchPostFling-RZ2iAVY")
/* loaded from: classes3.dex */
public final class NestedScrollDispatcher$dispatchPostFling$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f15523a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NestedScrollDispatcher f15524b;

    /* renamed from: c, reason: collision with root package name */
    public int f15525c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollDispatcher$dispatchPostFling$1(NestedScrollDispatcher nestedScrollDispatcher, g gVar) {
        super(gVar);
        this.f15524b = nestedScrollDispatcher;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f15523a = obj;
        this.f15525c |= Integer.MIN_VALUE;
        return this.f15524b.a(0L, 0L, this);
    }
}
