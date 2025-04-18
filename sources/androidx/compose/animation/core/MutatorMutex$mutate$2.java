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
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {Opcodes.GETSTATIC, 126}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class MutatorMutex$mutate$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public i1.a f2142a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2143b;

    /* renamed from: c, reason: collision with root package name */
    public MutatorMutex f2144c;
    public int d;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f2145f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MutatePriority f2146g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ MutatorMutex f2147h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f2148i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutate$2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, l lVar, g gVar) {
        super(2, gVar);
        this.f2146g = mutatePriority;
        this.f2147h = mutatorMutex;
        this.f2148i = lVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2(this.f2146g, this.f2147h, this.f2148i, gVar);
        mutatorMutex$mutate$2.f2145f = obj;
        return mutatorMutex$mutate$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((MutatorMutex$mutate$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v4, types: [i1.a] */
    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        MutatorMutex mutatorMutex;
        l lVar;
        MutatorMutex.Mutator mutator;
        d dVar;
        i1.a aVar;
        MutatorMutex.Mutator mutator2;
        MutatorMutex mutatorMutex2;
        Throwable th;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        i0.a aVar2 = i0.a.f30806a;
        ?? r1 = this.d;
        try {
            try {
                if (r1 == 0) {
                    q.m(obj);
                    j i2 = ((d0) this.f2145f).getCoroutineContext().i(a0.f22285b);
                    p0.a.p(i2);
                    MutatorMutex.Mutator mutator3 = new MutatorMutex.Mutator(this.f2146g, (h1) i2);
                    mutatorMutex = this.f2147h;
                    MutatorMutex.a(mutatorMutex, mutator3);
                    this.f2145f = mutator3;
                    d dVar2 = mutatorMutex.f2139b;
                    this.f2142a = dVar2;
                    l lVar2 = this.f2148i;
                    this.f2143b = lVar2;
                    this.f2144c = mutatorMutex;
                    this.d = 1;
                    if (dVar2.d(null, this) == aVar2) {
                        return aVar2;
                    }
                    lVar = lVar2;
                    mutator = mutator3;
                    dVar = dVar2;
                } else {
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutatorMutex2 = (MutatorMutex) this.f2143b;
                        aVar = this.f2142a;
                        mutator2 = (MutatorMutex.Mutator) this.f2145f;
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
                    MutatorMutex mutatorMutex3 = this.f2144c;
                    lVar = (l) this.f2143b;
                    ?? r5 = this.f2142a;
                    mutator = (MutatorMutex.Mutator) this.f2145f;
                    q.m(obj);
                    mutatorMutex = mutatorMutex3;
                    dVar = r5;
                }
                this.f2145f = mutator;
                this.f2142a = aVar;
                this.f2143b = mutatorMutex;
                this.f2144c = null;
                this.d = 2;
                Object invoke = lVar.invoke(this);
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
            aVar = dVar;
        } catch (Throwable th4) {
            ((d) r1).f(null);
            throw th4;
        }
    }
}
