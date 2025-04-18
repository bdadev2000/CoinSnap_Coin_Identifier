package b1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes4.dex */
public final class f1 extends j0.i implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f22314a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.a f22315b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(q0.a aVar, h0.g gVar) {
        super(2, gVar);
        this.f22315b = aVar;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        f1 f1Var = new f1(this.f22315b, gVar);
        f1Var.f22314a = obj;
        return f1Var;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f1) create((d0) obj, (h0.g) obj2)).invokeSuspend(d0.b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        i0.a aVar = i0.a.f30806a;
        kotlin.jvm.internal.q.m(obj);
        h0.l coroutineContext = ((d0) this.f22314a).getCoroutineContext();
        q0.a aVar2 = this.f22315b;
        try {
            h1 m2 = kotlin.jvm.internal.e.m(coroutineContext);
            f2 f2Var = new f2(m2);
            f2Var.f22318b = m2.y(true, true, f2Var);
            try {
                do {
                    atomicIntegerFieldUpdater = f2.f22316c;
                    i2 = atomicIntegerFieldUpdater.get(f2Var);
                    if (i2 != 0) {
                        if (i2 != 2 && i2 != 3) {
                            f2.c(i2);
                            throw null;
                        }
                    }
                    return aVar2.invoke();
                } while (!atomicIntegerFieldUpdater.compareAndSet(f2Var, i2, 0));
                return aVar2.invoke();
            } finally {
                f2Var.b();
            }
        } catch (InterruptedException e) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
        }
    }
}
