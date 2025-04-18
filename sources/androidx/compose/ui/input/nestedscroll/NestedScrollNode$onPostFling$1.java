package androidx.compose.ui.input.nestedscroll;

import h0.g;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {104, 105}, m = "onPostFling-RZ2iAVY")
/* loaded from: classes3.dex */
public final class NestedScrollNode$onPostFling$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public NestedScrollNode f15534a;

    /* renamed from: b, reason: collision with root package name */
    public long f15535b;

    /* renamed from: c, reason: collision with root package name */
    public long f15536c;
    public /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ NestedScrollNode f15537f;

    /* renamed from: g, reason: collision with root package name */
    public int f15538g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollNode$onPostFling$1(NestedScrollNode nestedScrollNode, g gVar) {
        super(gVar);
        this.f15537f = nestedScrollNode;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f15538g |= Integer.MIN_VALUE;
        return this.f15537f.h1(0L, 0L, this);
    }
}
