package androidx.lifecycle;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", l = {Opcodes.NEWARRAY}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BlockRunner$cancel$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f19932a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BlockRunner f19933b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockRunner$cancel$1(BlockRunner blockRunner, g gVar) {
        super(2, gVar);
        this.f19933b = blockRunner;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new BlockRunner$cancel$1(this.f19933b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((BlockRunner$cancel$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        return i0.a.f30806a;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f19932a;
        BlockRunner blockRunner = this.f19933b;
        if (i2 == 0) {
            q.m(obj);
            blockRunner.getClass();
            this.f19932a = 1;
            if (p0.a.L(0L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        blockRunner.getClass();
        throw null;
    }
}
