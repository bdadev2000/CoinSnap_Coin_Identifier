package y1;

import android.graphics.Color;
import android.graphics.Paint;

/* loaded from: classes.dex */
public final class h implements InterfaceC2942a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2942a f24298a;
    public final f b;

    /* renamed from: c, reason: collision with root package name */
    public final i f24299c;

    /* renamed from: d, reason: collision with root package name */
    public final i f24300d;

    /* renamed from: e, reason: collision with root package name */
    public final i f24301e;

    /* renamed from: f, reason: collision with root package name */
    public final i f24302f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24303g = true;

    public h(InterfaceC2942a interfaceC2942a, D1.b bVar, F1.i iVar) {
        this.f24298a = interfaceC2942a;
        e g9 = ((B1.a) iVar.f1084c).g();
        this.b = (f) g9;
        g9.a(this);
        bVar.d(g9);
        e g10 = ((B1.b) iVar.f1085d).g();
        this.f24299c = (i) g10;
        g10.a(this);
        bVar.d(g10);
        e g11 = ((B1.b) iVar.f1086f).g();
        this.f24300d = (i) g11;
        g11.a(this);
        bVar.d(g11);
        e g12 = ((B1.b) iVar.f1087g).g();
        this.f24301e = (i) g12;
        g12.a(this);
        bVar.d(g12);
        e g13 = ((B1.b) iVar.f1088h).g();
        this.f24302f = (i) g13;
        g13.a(this);
        bVar.d(g13);
    }

    @Override // y1.InterfaceC2942a
    public final void a() {
        this.f24303g = true;
        this.f24298a.a();
    }

    public final void b(Paint paint) {
        if (!this.f24303g) {
            return;
        }
        this.f24303g = false;
        double floatValue = ((Float) this.f24300d.e()).floatValue() * 0.017453292519943295d;
        float floatValue2 = ((Float) this.f24301e.e()).floatValue();
        float sin = ((float) Math.sin(floatValue)) * floatValue2;
        float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
        int intValue = ((Integer) this.b.e()).intValue();
        paint.setShadowLayer(((Float) this.f24302f.e()).floatValue(), sin, cos, Color.argb(Math.round(((Float) this.f24299c.e()).floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
    }

    public final void c(E1.d dVar) {
        i iVar = this.f24299c;
        if (dVar == null) {
            iVar.j(null);
        } else {
            iVar.j(new g(dVar));
        }
    }
}
