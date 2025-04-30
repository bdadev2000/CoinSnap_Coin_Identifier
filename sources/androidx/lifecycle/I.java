package androidx.lifecycle;

import android.os.Handler;
import j5.C2400c;

/* loaded from: classes.dex */
public final class I implements InterfaceC0511v {

    /* renamed from: k, reason: collision with root package name */
    public static final I f4828k = new I();
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f4829c;

    /* renamed from: g, reason: collision with root package name */
    public Handler f4832g;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4830d = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4831f = true;

    /* renamed from: h, reason: collision with root package name */
    public final C0513x f4833h = new C0513x(this);

    /* renamed from: i, reason: collision with root package name */
    public final D3.b f4834i = new D3.b(this, 17);

    /* renamed from: j, reason: collision with root package name */
    public final C2400c f4835j = new C2400c(this, 24);

    public final void a() {
        int i9 = this.f4829c + 1;
        this.f4829c = i9;
        if (i9 == 1) {
            if (this.f4830d) {
                this.f4833h.e(EnumC0503m.ON_RESUME);
                this.f4830d = false;
            } else {
                Handler handler = this.f4832g;
                G7.j.b(handler);
                handler.removeCallbacks(this.f4834i);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0511v
    public final AbstractC0505o getLifecycle() {
        return this.f4833h;
    }
}
