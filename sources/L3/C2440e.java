package l3;

import android.content.Context;
import k3.o;
import r3.AbstractC2662e;
import r3.C2668k;
import s7.InterfaceC2701a;
import t3.AbstractC2706a;
import t3.C2707b;

/* renamed from: l3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2440e implements InterfaceC2701a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21560a;
    public final InterfaceC2701a b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2701a f21561c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2701a f21562d;

    public C2440e(p3.c cVar, int i9) {
        this.f21560a = i9;
        switch (i9) {
            case 1:
                o oVar = AbstractC2662e.f22824a;
                o oVar2 = AbstractC2662e.b;
                this.b = cVar;
                this.f21561c = oVar;
                this.f21562d = oVar2;
                return;
            default:
                o oVar3 = AbstractC2706a.f23009a;
                o oVar4 = AbstractC2706a.b;
                this.b = cVar;
                this.f21561c = oVar3;
                this.f21562d = oVar4;
                return;
        }
    }

    @Override // s7.InterfaceC2701a
    public final Object get() {
        switch (this.f21560a) {
            case 0:
                return new C2439d((Context) this.b.get(), (C2707b) this.f21561c.get(), (C2707b) this.f21562d.get());
            default:
                return new C2668k((Context) this.b.get(), (String) this.f21561c.get(), ((Integer) this.f21562d.get()).intValue());
        }
    }
}
