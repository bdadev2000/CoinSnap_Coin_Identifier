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
import q0.p;

@e(c = "androidx.compose.material3.internal.InternalMutatorMutex$mutateWith$2", f = "InternalMutatorMutex.kt", l = {Opcodes.GETFIELD, Opcodes.D2I}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class InternalMutatorMutex$mutateWith$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public i1.a f13002a;

    /* renamed from: b, reason: collision with root package name */
    public Object f13003b;

    /* renamed from: c, reason: collision with root package name */
    public Object f13004c;
    public InternalMutatorMutex d;

    /* renamed from: f, reason: collision with root package name */
    public int f13005f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f13006g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ MutatePriority f13007h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InternalMutatorMutex f13008i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f13009j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f13010k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalMutatorMutex$mutateWith$2(MutatePriority mutatePriority, InternalMutatorMutex internalMutatorMutex, p pVar, Object obj, g gVar) {
        super(2, gVar);
        this.f13007h = mutatePriority;
        this.f13008i = internalMutatorMutex;
        this.f13009j = pVar;
        this.f13010k = obj;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        InternalMutatorMutex$mutateWith$2 internalMutatorMutex$mutateWith$2 = new InternalMutatorMutex$mutateWith$2(this.f13007h, this.f13008i, this.f13009j, this.f13010k, gVar);
        internalMutatorMutex$mutateWith$2.f13006g = obj;
        return internalMutatorMutex$mutateWith$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((InternalMutatorMutex$mutateWith$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        InternalMutatorMutex internalMutatorMutex;
        Object obj2;
        InternalMutatorMutex.Mutator mutator;
        i1.a aVar;
        p pVar;
        InternalMutatorMutex.Mutator mutator2;
        InternalMutatorMutex internalMutatorMutex2;
        Throwable th;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        i0.a aVar2 = i0.a.f30806a;
        ?? r1 = this.f13005f;
        try {
            try {
                if (r1 == 0) {
                    q.m(obj);
                    j i2 = ((d0) this.f13006g).getCoroutineContext().i(a0.f22285b);
                    p0.a.p(i2);
                    InternalMutatorMutex.Mutator mutator3 = new InternalMutatorMutex.Mutator(this.f13007h, (h1) i2);
                    internalMutatorMutex = this.f13008i;
                    InternalMutatorMutex.a(internalMutatorMutex, mutator3);
                    this.f13006g = mutator3;
                    d dVar = internalMutatorMutex.f12992b;
                    this.f13002a = dVar;
                    p pVar2 = this.f13009j;
                    this.f13003b = pVar2;
                    Object obj3 = this.f13010k;
                    this.f13004c = obj3;
                    this.d = internalMutatorMutex;
                    this.f13005f = 1;
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
                        internalMutatorMutex2 = (InternalMutatorMutex) this.f13003b;
                        aVar = this.f13002a;
                        mutator2 = (InternalMutatorMutex.Mutator) this.f13006g;
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
                    InternalMutatorMutex internalMutatorMutex3 = this.d;
                    obj2 = this.f13004c;
                    pVar = (p) this.f13003b;
                    i1.a aVar3 = this.f13002a;
                    mutator = (InternalMutatorMutex.Mutator) this.f13006g;
                    q.m(obj);
                    internalMutatorMutex = internalMutatorMutex3;
                    aVar = aVar3;
                }
                this.f13006g = mutator;
                this.f13002a = aVar;
                this.f13003b = internalMutatorMutex;
                this.f13004c = null;
                this.d = null;
                this.f13005f = 2;
                Object invoke = pVar.invoke(obj2, this);
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
        } catch (Throwable th4) {
            ((d) r1).f(null);
            throw th4;
        }
    }
}
