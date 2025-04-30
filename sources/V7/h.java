package V7;

import Q7.AbstractC0251t;
import Q7.AbstractC0255x;
import Q7.C0247o;
import Q7.C0248p;
import Q7.E;
import Q7.L;
import Q7.m0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t7.C2722k;
import u7.C2814e;
import y7.AbstractC2954c;
import y7.InterfaceC2955d;

/* loaded from: classes3.dex */
public final class h extends E implements InterfaceC2955d, w7.f {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3513j = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0251t f3514f;

    /* renamed from: g, reason: collision with root package name */
    public final w7.f f3515g;

    /* renamed from: h, reason: collision with root package name */
    public Object f3516h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f3517i;

    public h(AbstractC0251t abstractC0251t, AbstractC2954c abstractC2954c) {
        super(-1);
        this.f3514f = abstractC0251t;
        this.f3515g = abstractC2954c;
        this.f3516h = a.f3505c;
        this.f3517i = a.k(abstractC2954c.getContext());
    }

    @Override // Q7.E
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0248p) {
            ((C0248p) obj).b.invoke(cancellationException);
        }
    }

    @Override // y7.InterfaceC2955d
    public final InterfaceC2955d d() {
        w7.f fVar = this.f3515g;
        if (fVar instanceof InterfaceC2955d) {
            return (InterfaceC2955d) fVar;
        }
        return null;
    }

    @Override // w7.f
    public final void e(Object obj) {
        Object c0247o;
        w7.f fVar = this.f3515g;
        w7.k context = fVar.getContext();
        Throwable a6 = C2722k.a(obj);
        if (a6 == null) {
            c0247o = obj;
        } else {
            c0247o = new C0247o(false, a6);
        }
        AbstractC0251t abstractC0251t = this.f3514f;
        if (abstractC0251t.k()) {
            this.f3516h = c0247o;
            this.f2528d = 0;
            abstractC0251t.j(context, this);
            return;
        }
        L a9 = m0.a();
        if (a9.f2535d >= 4294967296L) {
            this.f3516h = c0247o;
            this.f2528d = 0;
            C2814e c2814e = a9.f2537g;
            if (c2814e == null) {
                c2814e = new C2814e();
                a9.f2537g = c2814e;
            }
            c2814e.addLast(this);
            return;
        }
        a9.o(true);
        try {
            w7.k context2 = fVar.getContext();
            Object l = a.l(context2, this.f3517i);
            try {
                fVar.e(obj);
                do {
                } while (a9.q());
            } finally {
                a.g(context2, l);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // w7.f
    public final w7.k getContext() {
        return this.f3515g.getContext();
    }

    @Override // Q7.E
    public final Object j() {
        Object obj = this.f3516h;
        this.f3516h = a.f3505c;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f3514f + ", " + AbstractC0255x.p(this.f3515g) + ']';
    }

    @Override // Q7.E
    public final w7.f c() {
        return this;
    }
}
