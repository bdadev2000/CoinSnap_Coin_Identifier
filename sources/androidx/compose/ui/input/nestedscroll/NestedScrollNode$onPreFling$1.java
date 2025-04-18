package androidx.compose.ui.input.nestedscroll;

import h0.g;
import j0.c;
import j0.e;
import org.objectweb.asm.Opcodes;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {Opcodes.LADD, Opcodes.FADD}, m = "onPreFling-QWom1Mo")
/* loaded from: classes3.dex */
public final class NestedScrollNode$onPreFling$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public NestedScrollNode f15539a;

    /* renamed from: b, reason: collision with root package name */
    public long f15540b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f15541c;
    public final /* synthetic */ NestedScrollNode d;

    /* renamed from: f, reason: collision with root package name */
    public int f15542f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollNode$onPreFling$1(NestedScrollNode nestedScrollNode, g gVar) {
        super(gVar);
        this.d = nestedScrollNode;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f15541c = obj;
        this.f15542f |= Integer.MIN_VALUE;
        return this.d.W0(0L, this);
    }
}
