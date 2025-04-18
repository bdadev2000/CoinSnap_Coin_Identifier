package androidx.lifecycle;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "androidx.lifecycle.BlockRunner$maybeRun$1", f = "CoroutineLiveData.kt", l = {Opcodes.RETURN}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BlockRunner$maybeRun$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f19934a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BlockRunner f19935b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockRunner$maybeRun$1(BlockRunner blockRunner, g gVar) {
        super(2, gVar);
        this.f19935b = blockRunner;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        BlockRunner$maybeRun$1 blockRunner$maybeRun$1 = new BlockRunner$maybeRun$1(this.f19935b, gVar);
        blockRunner$maybeRun$1.f19934a = obj;
        return blockRunner$maybeRun$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((BlockRunner$maybeRun$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        throw null;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        q.m(obj);
        d0 d0Var = (d0) this.f19934a;
        this.f19935b.getClass();
        new LiveDataScopeImpl(d0Var.getCoroutineContext());
        throw null;
    }
}
