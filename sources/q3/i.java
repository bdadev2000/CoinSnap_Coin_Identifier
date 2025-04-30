package q3;

import android.content.Context;
import java.util.concurrent.Executor;
import k3.o;
import l3.C2441f;
import r3.InterfaceC2660c;
import r3.InterfaceC2661d;
import s3.InterfaceC2698c;
import s7.InterfaceC2701a;
import t3.AbstractC2706a;
import t3.C2707b;

/* loaded from: classes.dex */
public final class i implements InterfaceC2701a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2701a f22775a;
    public final InterfaceC2701a b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2701a f22776c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2701a f22777d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2701a f22778e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2701a f22779f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC2701a f22780g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC2701a f22781h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC2701a f22782i;

    public i(p3.c cVar, InterfaceC2701a interfaceC2701a, InterfaceC2701a interfaceC2701a2, p3.d dVar, InterfaceC2701a interfaceC2701a3, InterfaceC2701a interfaceC2701a4, InterfaceC2701a interfaceC2701a5) {
        o oVar = AbstractC2706a.f23009a;
        o oVar2 = AbstractC2706a.b;
        this.f22775a = cVar;
        this.b = interfaceC2701a;
        this.f22776c = interfaceC2701a2;
        this.f22777d = dVar;
        this.f22778e = interfaceC2701a3;
        this.f22779f = interfaceC2701a4;
        this.f22780g = oVar;
        this.f22781h = oVar2;
        this.f22782i = interfaceC2701a5;
    }

    @Override // s7.InterfaceC2701a
    public final Object get() {
        return new h((Context) this.f22775a.get(), (C2441f) this.b.get(), (InterfaceC2661d) this.f22776c.get(), (c) this.f22777d.get(), (Executor) this.f22778e.get(), (InterfaceC2698c) this.f22779f.get(), (C2707b) this.f22780g.get(), (C2707b) this.f22781h.get(), (InterfaceC2660c) this.f22782i.get());
    }
}
