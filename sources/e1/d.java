package e1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public final class d extends f1.g {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f30243g = AtomicIntegerFieldUpdater.newUpdater(d.class, "consumed");
    private volatile int consumed;
    public final d1.r d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f30244f;

    public /* synthetic */ d(d1.r rVar, boolean z2) {
        this(rVar, z2, h0.m.f30726a, -3, 1);
    }

    @Override // f1.g
    public final String a() {
        return "channel=" + this.d;
    }

    @Override // f1.g
    public final Object c(d1.q qVar, h0.g gVar) {
        Object N = p0.a.N(new f1.a0(qVar), this.d, this.f30244f, gVar);
        return N == i0.a.f30806a ? N : d0.b0.f30125a;
    }

    @Override // f1.g, e1.h
    public final Object collect(i iVar, h0.g gVar) {
        d0.b0 b0Var = d0.b0.f30125a;
        if (this.f30469b != -3) {
            Object collect = super.collect(iVar, gVar);
            return collect == i0.a.f30806a ? collect : b0Var;
        }
        boolean z2 = this.f30244f;
        if (z2 && f30243g.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
        }
        Object N = p0.a.N(iVar, this.d, z2, gVar);
        return N == i0.a.f30806a ? N : b0Var;
    }

    @Override // f1.g
    public final f1.g d(h0.l lVar, int i2, int i3) {
        return new d(this.d, this.f30244f, lVar, i2, i3);
    }

    @Override // f1.g
    public final h e() {
        return new d(this.d, this.f30244f);
    }

    @Override // f1.g
    public final d1.r f(b1.d0 d0Var) {
        if (!this.f30244f || f30243g.getAndSet(this, 1) == 0) {
            return this.f30469b == -3 ? this.d : super.f(d0Var);
        }
        throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
    }

    public d(d1.r rVar, boolean z2, h0.l lVar, int i2, int i3) {
        super(lVar, i2, i3);
        this.d = rVar;
        this.f30244f = z2;
        this.consumed = 0;
    }
}
