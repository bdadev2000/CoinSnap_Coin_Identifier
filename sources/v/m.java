package v;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class m implements j {

    /* renamed from: a, reason: collision with root package name */
    public static final m f31390a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static i.n f31391b;

    @Override // v.j
    public boolean a(r.g gVar) {
        p0.a aVar = gVar.f31350a;
        if (!(aVar instanceof r.a) || ((r.a) aVar).f31339a > 100) {
            p0.a aVar2 = gVar.f31351b;
            if (!(aVar2 instanceof r.a) || ((r.a) aVar2).f31339a > 100) {
                return true;
            }
        }
        return false;
    }

    @Override // v.j
    public boolean b() {
        boolean z2;
        synchronized (i.f31383a) {
            try {
                int i2 = i.f31385c;
                i.f31385c = i2 + 1;
                if (i2 >= 30 || SystemClock.uptimeMillis() > i.d + com.safedk.android.analytics.brandsafety.p.f29763c) {
                    i.f31385c = 0;
                    i.d = SystemClock.uptimeMillis();
                    String[] list = i.f31384b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    i.e = list.length < 800;
                }
                z2 = i.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }
}
