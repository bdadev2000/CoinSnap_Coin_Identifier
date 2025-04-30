package u6;

import android.util.SparseIntArray;
import androidx.lifecycle.InterfaceC0511v;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* loaded from: classes3.dex */
public final class T extends S {

    /* renamed from: v, reason: collision with root package name */
    public static final C.c f23222v;

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f23223w;

    /* renamed from: u, reason: collision with root package name */
    public long f23224u;

    static {
        C.c cVar = new C.c(8);
        f23222v = cVar;
        cVar.B(new String[]{"ads_shimmer_native_large"}, new int[]{2}, new int[]{R.layout.ads_shimmer_native_large});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23223w = sparseIntArray;
        sparseIntArray.put(R.id.img_bg, 3);
        sparseIntArray.put(R.id.tv_camera_access, 4);
        sparseIntArray.put(R.id.tv_camera_details, 5);
        sparseIntArray.put(R.id.tv_continue, 6);
        sparseIntArray.put(R.id.tv_cancel, 7);
    }

    @Override // d0.AbstractC2158e
    public final void E() {
        synchronized (this) {
            this.f23224u = 0L;
        }
        this.f23219r.F();
    }

    @Override // d0.AbstractC2158e
    public final boolean H() {
        synchronized (this) {
            try {
                if (this.f23224u != 0) {
                    return true;
                }
                if (this.f23219r.H()) {
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
            this.f23224u = 2L;
        }
        this.f23219r.I();
        L();
    }

    @Override // d0.AbstractC2158e
    public final void M(InterfaceC0511v interfaceC0511v) {
        super.M(interfaceC0511v);
        this.f23219r.M(interfaceC0511v);
    }
}
