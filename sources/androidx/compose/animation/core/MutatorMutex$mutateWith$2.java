package androidx.compose.animation.core;

import androidx.compose.animation.core.MutatorMutex;
import b1.a0;
import b1.d0;
import b1.h1;
import d0.b0;
import h0.g;
import h0.j;
import i1.d;
import j0.e;
import j0.i;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "androidx.compose.animation.core.MutatorMutex$mutateWith$2", f = "InternalMutatorMutex.kt", l = {Opcodes.GETSTATIC, Opcodes.IF_ACMPEQ}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MutatorMutex$mutateWith$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public i1.a f2149a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2150b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2151c;
    public MutatorMutex d;

    /* renamed from: f, reason: collision with root package name */
    public int f2152f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2153g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ MutatePriority f2154h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ MutatorMutex f2155i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f2156j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f2157k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutateWith$2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, p pVar, Object obj, g gVar) {
        super(2, gVar);
        this.f2154h = mutatePriority;
        this.f2155i = mutatorMutex;
        this.f2156j = pVar;
        this.f2157k = obj;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        MutatorMutex$mutateWith$2 mutatorMutex$mutateWith$2 = new MutatorMutex$mutateWith$2(this.f2154h, this.f2155i, this.f2156j, this.f2157k, gVar);
        mutatorMutex$mutateWith$2.f2153g = obj;
        return mutatorMutex$mutateWith$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((MutatorMutex$mutateWith$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        MutatorMutex mutatorMutex;
        Object obj2;
        MutatorMutex.Mutator mutator;
        i1.a aVar;
        p pVar;
        MutatorMutex.Mutator mutator2;
        MutatorMutex mutatorMutex2;
        Throwable th;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        i0.a aVar2 = i0.a.f30806a;
        ?? r1 = this.f2152f;
        try {
            try {
                if (r1 == 0) {
                    q.m(obj);
                    j i2 = ((d0) this.f2153g).getCoroutineContext().i(a0.f22285b);
                    p0.a.p(i2);
                    MutatorMutex.Mutator mutator3 = new MutatorMutex.Mutator(this.f2154h, (h1) i2);
                    mutatorMutex = this.f2155i;
                    MutatorMutex.a(mutatorMutex, mutator3);
                    this.f2153g = mutator3;
                    d dVar = mutatorMutex.f2139b;
                    this.f2149a = dVar;
                    p pVar2 = this.f2156j;
                    this.f2150b = pVar2;
                    Object obj3 = this.f2157k;
                    this.f2151c = obj3;
                    this.d = mutatorMutex;
                    this.f2152f = 1;
                    if (dVar.d(null, this) == aVar2) {
                        return aVar2;
                    }
                    obj2 = obj3;
                    mutator = mutator3;
                    aVar = dVar;
                    pVar = pVar2;
                } else {
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutatorMutex2 = (MutatorMutex) this.f2150b;
                        aVar = this.f2149a;
                        mutator2 = (MutatorMutex.Mutator) this.f2153g;
                        try {
                            q.m(obj);
                            atomicReference2 = mutatorMutex2.f2138a;
                            while (!atomicReference2.compareAndSet(mutator2, null) && atomicReference2.get() == mutator2) {
                            }
                            ((d) aVar).f(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = mutatorMutex2.f2138a;
                            while (!atomicReference.compareAndSet(mutator2, null)) {
                            }
                            throw th;
                        }
                    }
                    MutatorMutex mutatorMutex3 = this.d;
                    obj2 = this.f2151c;
                    pVar = (p) this.f2150b;
                    i1.a aVar3 = this.f2149a;
                    mutator = (MutatorMutex.Mutator) this.f2153g;
                    q.m(obj);
                    mutatorMutex = mutatorMutex3;
                    aVar = aVar3;
                }
                this.f2153g = mutator;
                this.f2149a = aVar;
                this.f2150b = mutatorMutex;
                this.f2151c = null;
                this.d = null;
                this.f2152f = 2;
                Object invoke = pVar.invoke(obj2, this);
                if (invoke == aVar2) {
                    return aVar2;
                }
                mutatorMutex2 = mutatorMutex;
                obj = invoke;
                mutator2 = mutator;
                atomicReference2 = mutatorMutex2.f2138a;
                while (!atomicReference2.compareAndSet(mutator2, null)) {
                }
                ((d) aVar).f(null);
                return obj;
            } catch (Throwable th3) {
                mutator2 = mutator;
                mutatorMutex2 = mutatorMutex;
                th = th3;
                atomicReference = mutatorMutex2.f2138a;
                while (!atomicReference.compareAndSet(mutator2, null) && atomicReference.get() == mutator2) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            ((d) r1).f(null);
            throw th4;
        }
    }
}
