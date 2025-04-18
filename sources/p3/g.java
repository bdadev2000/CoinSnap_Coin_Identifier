package p3;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class g implements a {
    public final a a;

    /* renamed from: b, reason: collision with root package name */
    public final d f23368b;

    /* renamed from: c, reason: collision with root package name */
    public final h f23369c;

    /* renamed from: d, reason: collision with root package name */
    public final h f23370d;

    /* renamed from: e, reason: collision with root package name */
    public final h f23371e;

    /* renamed from: f, reason: collision with root package name */
    public final h f23372f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f23373g = true;

    public g(a aVar, u3.b bVar, w3.h hVar) {
        this.a = aVar;
        d a = ((h4.c) hVar.a).a();
        this.f23368b = a;
        a.a(this);
        bVar.f(a);
        d a10 = ((s3.a) hVar.f26699b).a();
        this.f23369c = (h) a10;
        a10.a(this);
        bVar.f(a10);
        d a11 = ((s3.a) hVar.f26700c).a();
        this.f23370d = (h) a11;
        a11.a(this);
        bVar.f(a11);
        d a12 = ((s3.a) hVar.f26701d).a();
        this.f23371e = (h) a12;
        a12.a(this);
        bVar.f(a12);
        d a13 = ((s3.a) hVar.f26702e).a();
        this.f23372f = (h) a13;
        a13.a(this);
        bVar.f(a13);
    }

    @Override // p3.a
    public final void a() {
        this.f23373g = true;
        this.a.a();
    }

    public final void b(n3.a aVar) {
        if (!this.f23373g) {
            return;
        }
        this.f23373g = false;
        double floatValue = ((Float) this.f23370d.f()).floatValue() * 0.017453292519943295d;
        float floatValue2 = ((Float) this.f23371e.f()).floatValue();
        float sin = ((float) Math.sin(floatValue)) * floatValue2;
        float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
        int intValue = ((Integer) this.f23368b.f()).intValue();
        aVar.setShadowLayer(((Float) this.f23372f.f()).floatValue(), sin, cos, Color.argb(Math.round(((Float) this.f23369c.f()).floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
    }

    public final void c(h.c cVar) {
        h hVar = this.f23369c;
        if (cVar == null) {
            hVar.k(null);
        } else {
            hVar.k(new f(cVar));
        }
    }
}
