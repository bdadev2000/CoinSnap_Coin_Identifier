package androidx.compose.foundation;

import androidx.compose.foundation.MutatorMutex;
import b1.a0;
import b1.d0;
import b1.h1;
import d0.b0;
import h0.g;
import h0.j;
import i1.a;
import i1.d;
import j0.e;
import j0.i;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", l = {214, Opcodes.GOTO}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MutatorMutex$mutateWith$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public a f2825a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2826b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2827c;
    public MutatorMutex d;

    /* renamed from: f, reason: collision with root package name */
    public int f2828f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2829g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ MutatePriority f2830h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ MutatorMutex f2831i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f2832j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f2833k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutateWith$2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, p pVar, Object obj, g gVar) {
        super(2, gVar);
        this.f2830h = mutatePriority;
        this.f2831i = mutatorMutex;
        this.f2832j = pVar;
        this.f2833k = obj;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        MutatorMutex$mutateWith$2 mutatorMutex$mutateWith$2 = new MutatorMutex$mutateWith$2(this.f2830h, this.f2831i, this.f2832j, this.f2833k, gVar);
        mutatorMutex$mutateWith$2.f2829g = obj;
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
        a aVar;
        p pVar;
        MutatorMutex.Mutator mutator2;
        MutatorMutex mutatorMutex2;
        Throwable th;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        i0.a aVar2 = i0.a.f30806a;
        ?? r1 = this.f2828f;
        try {
            try {
                if (r1 == 0) {
                    q.m(obj);
                    j i2 = ((d0) this.f2829g).getCoroutineContext().i(a0.f22285b);
                    p0.a.p(i2);
                    MutatorMutex.Mutator mutator3 = new MutatorMutex.Mutator(this.f2830h, (h1) i2);
                    mutatorMutex = this.f2831i;
                    MutatorMutex.a(mutatorMutex, mutator3);
                    this.f2829g = mutator3;
                    d dVar = mutatorMutex.f2815b;
                    this.f2825a = dVar;
                    p pVar2 = this.f2832j;
                    this.f2826b = pVar2;
                    Object obj3 = this.f2833k;
                    this.f2827c = obj3;
                    this.d = mutatorMutex;
                    this.f2828f = 1;
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
                        mutatorMutex2 = (MutatorMutex) this.f2826b;
                        aVar = this.f2825a;
                        mutator2 = (MutatorMutex.Mutator) this.f2829g;
                        try {
                            q.m(obj);
                            atomicReference2 = mutatorMutex2.f2814a;
                            while (!atomicReference2.compareAndSet(mutator2, null) && atomicReference2.get() == mutator2) {
                            }
                            ((d) aVar).f(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = mutatorMutex2.f2814a;
                            while (!atomicReference.compareAndSet(mutator2, null)) {
                            }
                            throw th;
                        }
                    }
                    MutatorMutex mutatorMutex3 = this.d;
                    obj2 = this.f2827c;
                    pVar = (p) this.f2826b;
                    a aVar3 = this.f2825a;
                    mutator = (MutatorMutex.Mutator) this.f2829g;
                    q.m(obj);
                    mutatorMutex = mutatorMutex3;
                    aVar = aVar3;
                }
                this.f2829g = mutator;
                this.f2825a = aVar;
                this.f2826b = mutatorMutex;
                this.f2827c = null;
                this.d = null;
                this.f2828f = 2;
                Object invoke = pVar.invoke(obj2, this);
                if (invoke == aVar2) {
                    return aVar2;
                }
                mutatorMutex2 = mutatorMutex;
                obj = invoke;
                mutator2 = mutator;
                atomicReference2 = mutatorMutex2.f2814a;
                while (!atomicReference2.compareAndSet(mutator2, null)) {
                }
                ((d) aVar).f(null);
                return obj;
            } catch (Throwable th3) {
                mutator2 = mutator;
                mutatorMutex2 = mutatorMutex;
                th = th3;
                atomicReference = mutatorMutex2.f2814a;
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
