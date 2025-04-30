package p3;

import android.content.Context;
import java.util.concurrent.Executor;
import k3.o;
import q3.C2641a;
import q3.j;
import r3.InterfaceC2661d;
import s3.InterfaceC2698c;
import s7.InterfaceC2701a;
import t3.AbstractC2706a;

/* loaded from: classes.dex */
public final class d implements InterfaceC2701a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22213a = 0;
    public final InterfaceC2701a b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2701a f22214c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2701a f22215d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2701a f22216e;

    public d(InterfaceC2701a interfaceC2701a, InterfaceC2701a interfaceC2701a2, d dVar, InterfaceC2701a interfaceC2701a3) {
        this.b = interfaceC2701a;
        this.f22214c = interfaceC2701a2;
        this.f22215d = dVar;
        this.f22216e = interfaceC2701a3;
    }

    @Override // s7.InterfaceC2701a
    public final Object get() {
        switch (this.f22213a) {
            case 0:
                Context context = (Context) this.b.get();
                InterfaceC2661d interfaceC2661d = (InterfaceC2661d) this.f22214c.get();
                C2641a c2641a = (C2641a) this.f22215d.get();
                return new q3.c(context, interfaceC2661d, c2641a);
            default:
                return new j((Executor) this.b.get(), (InterfaceC2661d) this.f22214c.get(), (q3.c) this.f22215d.get(), (InterfaceC2698c) this.f22216e.get());
        }
    }

    public d(c cVar, InterfaceC2701a interfaceC2701a, c cVar2) {
        o oVar = AbstractC2706a.b;
        this.b = cVar;
        this.f22214c = interfaceC2701a;
        this.f22215d = cVar2;
        this.f22216e = oVar;
    }
}
