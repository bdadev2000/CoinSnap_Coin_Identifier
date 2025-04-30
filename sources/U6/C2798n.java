package u6;

import android.util.SparseIntArray;
import androidx.lifecycle.InterfaceC0511v;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* renamed from: u6.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2798n extends AbstractC2797m {

    /* renamed from: v, reason: collision with root package name */
    public static final C.c f23360v;

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f23361w;

    /* renamed from: u, reason: collision with root package name */
    public long f23362u;

    static {
        C.c cVar = new C.c(8);
        f23360v = cVar;
        cVar.B(new String[]{"ads_shimmer_native_large"}, new int[]{2}, new int[]{R.layout.ads_shimmer_native_large});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23361w = sparseIntArray;
        sparseIntArray.put(R.id.imgIcon, 3);
        sparseIntArray.put(R.id.txtTitle, 4);
        sparseIntArray.put(R.id.imv_tick, 5);
        sparseIntArray.put(R.id.rvLanguage, 6);
        sparseIntArray.put(R.id.relay_ads, 7);
    }

    @Override // d0.AbstractC2158e
    public final void E() {
        synchronized (this) {
            this.f23362u = 0L;
        }
        this.f23359t.F();
    }

    @Override // d0.AbstractC2158e
    public final boolean H() {
        synchronized (this) {
            try {
                if (this.f23362u != 0) {
                    return true;
                }
                if (this.f23359t.H()) {
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
            this.f23362u = 2L;
        }
        this.f23359t.I();
        L();
    }

    @Override // d0.AbstractC2158e
    public final void M(InterfaceC0511v interfaceC0511v) {
        super.M(interfaceC0511v);
        this.f23359t.M(interfaceC0511v);
    }
}
