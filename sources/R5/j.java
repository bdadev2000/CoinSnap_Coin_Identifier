package R5;

import android.database.ContentObserver;
import android.os.Handler;
import f6.C2272a;

/* loaded from: classes3.dex */
public final class j implements d, b6.d {

    /* renamed from: g, reason: collision with root package name */
    public static j f2752g;

    /* renamed from: h, reason: collision with root package name */
    public static j f2753h;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2754a;
    public float b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2755c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2756d;

    /* renamed from: e, reason: collision with root package name */
    public ContentObserver f2757e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2758f;

    public /* synthetic */ j(int i9, Object obj, Object obj2) {
        this.f2754a = i9;
        this.f2755c = obj;
        this.f2756d = obj2;
    }

    public static j b() {
        if (f2752g == null) {
            int i9 = 0;
            f2752g = new j(i9, new Object(), new R3.e(9));
        }
        return f2752g;
    }

    public static j c() {
        if (f2753h == null) {
            int i9 = 1;
            f2753h = new j(i9, new R3.e(14), new L4.f(14));
        }
        return f2753h;
    }

    @Override // R5.d
    public final void a(boolean z8) {
        switch (this.f2754a) {
            case 0:
                if (z8) {
                    V5.b.f3483g.getClass();
                    V5.b.b();
                    return;
                }
                V5.b.f3483g.getClass();
                Handler handler = V5.b.f3485i;
                if (handler != null) {
                    handler.removeCallbacks(V5.b.f3487k);
                    V5.b.f3485i = null;
                    return;
                }
                return;
            default:
                if (z8) {
                    C2272a.f20351g.getClass();
                    C2272a.b();
                    return;
                }
                C2272a.f20351g.getClass();
                Handler handler2 = C2272a.f20353i;
                if (handler2 != null) {
                    handler2.removeCallbacks(C2272a.f20355k);
                    C2272a.f20353i = null;
                    return;
                }
                return;
        }
    }
}
