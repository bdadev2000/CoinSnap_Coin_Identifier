package x1;

import java.util.ArrayList;
import java.util.List;
import y1.InterfaceC2942a;

/* loaded from: classes.dex */
public final class t implements c, InterfaceC2942a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f24212a;
    public final ArrayList b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final int f24213c;

    /* renamed from: d, reason: collision with root package name */
    public final y1.i f24214d;

    /* renamed from: e, reason: collision with root package name */
    public final y1.i f24215e;

    /* renamed from: f, reason: collision with root package name */
    public final y1.i f24216f;

    public t(D1.b bVar, C1.p pVar) {
        pVar.getClass();
        this.f24212a = pVar.f487e;
        this.f24213c = pVar.f484a;
        y1.e g9 = pVar.b.g();
        this.f24214d = (y1.i) g9;
        y1.e g10 = pVar.f485c.g();
        this.f24215e = (y1.i) g10;
        y1.e g11 = pVar.f486d.g();
        this.f24216f = (y1.i) g11;
        bVar.d(g9);
        bVar.d(g10);
        bVar.d(g11);
        g9.a(this);
        g10.a(this);
        g11.a(this);
    }

    @Override // y1.InterfaceC2942a
    public final void a() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i9 < arrayList.size()) {
                ((InterfaceC2942a) arrayList.get(i9)).a();
                i9++;
            } else {
                return;
            }
        }
    }

    public final void d(InterfaceC2942a interfaceC2942a) {
        this.b.add(interfaceC2942a);
    }

    @Override // x1.c
    public final void b(List list, List list2) {
    }
}
