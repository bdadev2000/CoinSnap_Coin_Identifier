package u6;

import android.util.SparseIntArray;
import androidx.lifecycle.InterfaceC0511v;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* renamed from: u6.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2800p extends AbstractC2799o {

    /* renamed from: C, reason: collision with root package name */
    public static final C.c f23387C;

    /* renamed from: D, reason: collision with root package name */
    public static final SparseIntArray f23388D;

    /* renamed from: B, reason: collision with root package name */
    public long f23389B;

    static {
        C.c cVar = new C.c(12);
        f23387C = cVar;
        cVar.B(new String[]{"ads_shimmer_native_large"}, new int[]{2}, new int[]{R.layout.ads_shimmer_native_large});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23388D = sparseIntArray;
        sparseIntArray.put(R.id.view_pager2, 3);
        sparseIntArray.put(R.id.ll_circle, 4);
        sparseIntArray.put(R.id.tv_get_start, 5);
        sparseIntArray.put(R.id.view_1, 6);
        sparseIntArray.put(R.id.view_2, 7);
        sparseIntArray.put(R.id.view_3, 8);
        sparseIntArray.put(R.id.view_4, 9);
        sparseIntArray.put(R.id.lottie_swipe_to_next, 10);
        sparseIntArray.put(R.id.frAdContainer, 11);
    }

    @Override // d0.AbstractC2158e
    public final void E() {
        synchronized (this) {
            this.f23389B = 0L;
        }
        this.f23370u.F();
    }

    @Override // d0.AbstractC2158e
    public final boolean H() {
        synchronized (this) {
            try {
                if (this.f23389B != 0) {
                    return true;
                }
                if (this.f23370u.H()) {
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
            this.f23389B = 2L;
        }
        this.f23370u.I();
        L();
    }

    @Override // d0.AbstractC2158e
    public final void M(InterfaceC0511v interfaceC0511v) {
        super.M(interfaceC0511v);
        this.f23370u.M(interfaceC0511v);
    }
}
