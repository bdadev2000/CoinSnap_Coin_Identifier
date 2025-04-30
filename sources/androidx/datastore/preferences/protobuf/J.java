package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class J {
    public static final C0443s b = new C0443s(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f4515a;

    public J(C0435j c0435j) {
        AbstractC0449y.a(c0435j, "output");
        this.f4515a = c0435j;
        c0435j.f4583c = this;
    }

    public void a(int i9, boolean z8) {
        ((C0435j) this.f4515a).U(i9, z8);
    }

    public void b(int i9, C0432g c0432g) {
        ((C0435j) this.f4515a).W(i9, c0432g);
    }

    public void c(int i9, double d2) {
        C0435j c0435j = (C0435j) this.f4515a;
        c0435j.getClass();
        c0435j.a0(i9, Double.doubleToRawLongBits(d2));
    }

    public void d(int i9, int i10) {
        ((C0435j) this.f4515a).c0(i9, i10);
    }

    public void e(int i9, int i10) {
        ((C0435j) this.f4515a).Y(i9, i10);
    }

    public void f(int i9, long j7) {
        ((C0435j) this.f4515a).a0(i9, j7);
    }

    public void g(int i9, float f9) {
        C0435j c0435j = (C0435j) this.f4515a;
        c0435j.getClass();
        c0435j.Y(i9, Float.floatToRawIntBits(f9));
    }

    public void h(int i9, Object obj, InterfaceC0426a0 interfaceC0426a0) {
        C0435j c0435j = (C0435j) this.f4515a;
        c0435j.i0(i9, 3);
        interfaceC0426a0.a((AbstractC0425a) obj, c0435j.f4583c);
        c0435j.i0(i9, 4);
    }

    public void i(int i9, int i10) {
        ((C0435j) this.f4515a).c0(i9, i10);
    }

    public void j(int i9, long j7) {
        ((C0435j) this.f4515a).l0(i9, j7);
    }

    public void k(int i9, Object obj, InterfaceC0426a0 interfaceC0426a0) {
        ((C0435j) this.f4515a).e0(i9, (AbstractC0425a) obj, interfaceC0426a0);
    }

    public void l(int i9, int i10) {
        ((C0435j) this.f4515a).Y(i9, i10);
    }

    public void m(int i9, long j7) {
        ((C0435j) this.f4515a).a0(i9, j7);
    }

    public void n(int i9, int i10) {
        ((C0435j) this.f4515a).j0(i9, (i10 >> 31) ^ (i10 << 1));
    }

    public void o(int i9, long j7) {
        ((C0435j) this.f4515a).l0(i9, (j7 >> 63) ^ (j7 << 1));
    }

    public void p(int i9, int i10) {
        ((C0435j) this.f4515a).j0(i9, i10);
    }

    public void q(int i9, long j7) {
        ((C0435j) this.f4515a).l0(i9, j7);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.I, java.lang.Object] */
    public J() {
        O o3;
        try {
            o3 = (O) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            o3 = b;
        }
        O[] oArr = {C0443s.b, o3};
        ?? obj = new Object();
        obj.f4514a = oArr;
        Charset charset = AbstractC0449y.f4610a;
        this.f4515a = obj;
    }
}
