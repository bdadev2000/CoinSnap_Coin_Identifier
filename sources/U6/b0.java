package u6;

import androidx.lifecycle.InterfaceC0511v;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* loaded from: classes3.dex */
public final class b0 extends a0 {

    /* renamed from: v, reason: collision with root package name */
    public static final C.c f23266v;

    /* renamed from: u, reason: collision with root package name */
    public long f23267u;

    static {
        C.c cVar = new C.c(3);
        f23266v = cVar;
        cVar.B(new String[]{"ads_shimmer_native_home"}, new int[]{2}, new int[]{R.layout.ads_shimmer_native_home});
    }

    @Override // d0.AbstractC2158e
    public final void E() {
        synchronized (this) {
            this.f23267u = 0L;
        }
        this.f23262r.F();
    }

    @Override // d0.AbstractC2158e
    public final boolean H() {
        synchronized (this) {
            try {
                if (this.f23267u != 0) {
                    return true;
                }
                if (this.f23262r.H()) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // d0.AbstractC2158e
    public final void I() {
        synchronized (this) {
            this.f23267u = 2L;
        }
        this.f23262r.I();
        L();
    }

    @Override // d0.AbstractC2158e
    public final void M(InterfaceC0511v interfaceC0511v) {
        super.M(interfaceC0511v);
        this.f23262r.M(interfaceC0511v);
    }
}
