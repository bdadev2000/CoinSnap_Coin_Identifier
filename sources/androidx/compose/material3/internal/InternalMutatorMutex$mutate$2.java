package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.internal.InternalMutatorMutex;
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
@e(c = "androidx.compose.material3.internal.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {Opcodes.GETFIELD, 103}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class InternalMutatorMutex$mutate$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public i1.a f12995a;

    /* renamed from: b, reason: collision with root package name */
    public Object f12996b;

    /* renamed from: c, reason: collision with root package name */
    public InternalMutatorMutex f12997c;
    public int d;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f12998f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MutatePriority f12999g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InternalMutatorMutex f13000h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f13001i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalMutatorMutex$mutate$2(MutatePriority mutatePriority, InternalMutatorMutex internalMutatorMutex, l lVar, g gVar) {
        super(2, gVar);
        this.f12999g = mutatePriority;
        this.f13000h = internalMutatorMutex;
        this.f13001i = lVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        InternalMutatorMutex$mutate$2 internalMutatorMutex$mutate$2 = new InternalMutatorMutex$mutate$2(this.f12999g, this.f13000h, this.f13001i, gVar);
        internalMutatorMutex$mutate$2.f12998f = obj;
        return internalMutatorMutex$mutate$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((InternalMutatorMutex$mutate$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v4, types: [i1.a] */
    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        InternalMutatorMutex internalMutatorMutex;
        l lVar;
        InternalMutatorMutex.Mutator mutator;
        d dVar;
        i1.a aVar;
        InternalMutatorMutex.Mutator mutator2;
        InternalMutatorMutex internalMutatorMutex2;
        Throwable th;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        i0.a aVar2 = i0.a.f30806a;
        ?? r1 = this.d;
        try {
            try {
                if (r1 == 0) {
                    q.m(obj);
                    j i2 = ((d0) this.f12998f).getCoroutineContext().i(a0.f22285b);
                    p0.a.p(i2);
                    InternalMutatorMutex.Mutator mutator3 = new InternalMutatorMutex.Mutator(this.f12999g, (h1) i2);
                    internalMutatorMutex = this.f13000h;
                    InternalMutatorMutex.a(internalMutatorMutex, mutator3);
                    this.f12998f = mutator3;
                    d dVar2 = internalMutatorMutex.f12992b;
                    this.f12995a = dVar2;
                    l lVar2 = this.f13001i;
                    this.f12996b = lVar2;
                    this.f12997c = internalMutatorMutex;
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
                        internalMutatorMutex2 = (InternalMutatorMutex) this.f12996b;
                        aVar = this.f12995a;
                        mutator2 = (InternalMutatorMutex.Mutator) this.f12998f;
                        try {
                            q.m(obj);
                            atomicReference2 = internalMutatorMutex2.f12991a;
                            while (!atomicReference2.compareAndSet(mutator2, null) && atomicReference2.get() == mutator2) {
                            }
                            ((d) aVar).f(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = internalMutatorMutex2.f12991a;
                            while (!atomicReference.compareAndSet(mutator2, null)) {
                            }
                            throw th;
                        }
                    }
                    InternalMutatorMutex internalMutatorMutex3 = this.f12997c;
                    lVar = (l) this.f12996b;
                    ?? r5 = this.f12995a;
                    mutator = (InternalMutatorMutex.Mutator) this.f12998f;
                    q.m(obj);
                    internalMutatorMutex = internalMutatorMutex3;
                    dVar = r5;
                }
                this.f12998f = mutator;
                this.f12995a = aVar;
                this.f12996b = internalMutatorMutex;
                this.f12997c = null;
                this.d = 2;
                Object invoke = lVar.invoke(this);
                if (invoke == aVar2) {
                    return aVar2;
                }
                internalMutatorMutex2 = internalMutatorMutex;
                obj = invoke;
                mutator2 = mutator;
                atomicReference2 = internalMutatorMutex2.f12991a;
                while (!atomicReference2.compareAndSet(mutator2, null)) {
                }
                ((d) aVar).f(null);
                return obj;
            } catch (Throwable th3) {
                mutator2 = mutator;
                internalMutatorMutex2 = internalMutatorMutex;
                th = th3;
                atomicReference = internalMutatorMutex2.f12991a;
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
