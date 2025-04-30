package u6;

import android.util.SparseIntArray;
import androidx.lifecycle.InterfaceC0511v;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* loaded from: classes3.dex */
public final class h0 extends g0 {

    /* renamed from: w, reason: collision with root package name */
    public static final C.c f23319w;

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f23320x;

    /* renamed from: v, reason: collision with root package name */
    public long f23321v;

    static {
        C.c cVar = new C.c(6);
        f23319w = cVar;
        cVar.B(new String[]{"ads_shimmer_native_full_screen"}, new int[]{2}, new int[]{R.layout.ads_shimmer_native_full_screen});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23320x = sparseIntArray;
        sparseIntArray.put(R.id.img_guide, 3);
        sparseIntArray.put(R.id.tv_title, 4);
        sparseIntArray.put(R.id.tv_sub_text, 5);
    }

    @Override // d0.AbstractC2158e
    public final void E() {
        synchronized (this) {
            this.f23321v = 0L;
        }
        this.f23314s.F();
    }

    @Override // d0.AbstractC2158e
    public final boolean H() {
        synchronized (this) {
            try {
                if (this.f23321v != 0) {
                    return true;
                }
                if (this.f23314s.H()) {
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
            this.f23321v = 2L;
        }
        this.f23314s.I();
        L();
    }

    @Override // d0.AbstractC2158e
    public final void M(InterfaceC0511v interfaceC0511v) {
        super.M(interfaceC0511v);
        this.f23314s.M(interfaceC0511v);
    }
}
