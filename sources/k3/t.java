package k3;

import java.util.concurrent.Executor;
import l3.C2440e;
import l3.C2441f;
import p3.C2542a;
import r3.AbstractC2662e;
import r3.C2658a;
import r3.C2666i;
import r3.C2668k;
import r3.InterfaceC2661d;
import s3.InterfaceC2698c;
import s7.InterfaceC2701a;
import t3.AbstractC2706a;
import t3.C2707b;

/* loaded from: classes.dex */
public final class t implements InterfaceC2701a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21454a = 0;
    public final InterfaceC2701a b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2701a f21455c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2701a f21456d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2701a f21457e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2701a f21458f;

    public t(C2440e c2440e, InterfaceC2701a interfaceC2701a) {
        o oVar = AbstractC2706a.f23009a;
        o oVar2 = AbstractC2706a.b;
        o oVar3 = AbstractC2662e.f22825c;
        this.b = oVar;
        this.f21455c = oVar2;
        this.f21456d = oVar3;
        this.f21457e = c2440e;
        this.f21458f = interfaceC2701a;
    }

    @Override // s7.InterfaceC2701a
    public final Object get() {
        switch (this.f21454a) {
            case 0:
                return new s((C2707b) this.b.get(), (C2707b) this.f21455c.get(), (p3.b) this.f21456d.get(), (q3.h) this.f21457e.get(), (q3.j) this.f21458f.get());
            case 1:
                return new C2542a((Executor) this.b.get(), (C2441f) this.f21455c.get(), (q3.c) this.f21456d.get(), (InterfaceC2661d) this.f21457e.get(), (InterfaceC2698c) this.f21458f.get());
            default:
                return new C2666i((C2707b) this.b.get(), (C2707b) this.f21455c.get(), (C2658a) this.f21456d.get(), (C2668k) this.f21457e.get(), this.f21458f);
        }
    }

    public t(InterfaceC2701a interfaceC2701a, InterfaceC2701a interfaceC2701a2, p3.d dVar, InterfaceC2701a interfaceC2701a3, InterfaceC2701a interfaceC2701a4) {
        this.b = interfaceC2701a;
        this.f21455c = interfaceC2701a2;
        this.f21456d = dVar;
        this.f21457e = interfaceC2701a3;
        this.f21458f = interfaceC2701a4;
    }

    public t(t tVar, q3.i iVar, p3.d dVar) {
        o oVar = AbstractC2706a.f23009a;
        o oVar2 = AbstractC2706a.b;
        this.b = oVar;
        this.f21455c = oVar2;
        this.f21456d = tVar;
        this.f21457e = iVar;
        this.f21458f = dVar;
    }
}
