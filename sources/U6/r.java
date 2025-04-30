package u6;

import android.util.SparseIntArray;
import androidx.lifecycle.InterfaceC0511v;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* loaded from: classes3.dex */
public final class r extends AbstractC2801q {

    /* renamed from: w, reason: collision with root package name */
    public static final C.c f23400w;

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f23401x;

    /* renamed from: v, reason: collision with root package name */
    public long f23402v;

    static {
        C.c cVar = new C.c(11);
        f23400w = cVar;
        cVar.B(new String[]{"ads_shimmer_native_large"}, new int[]{2}, new int[]{R.layout.ads_shimmer_native_large});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23401x = sparseIntArray;
        sparseIntArray.put(R.id.tv_permission, 3);
        sparseIntArray.put(R.id.imv_go, 4);
        sparseIntArray.put(R.id.ivPermission, 5);
        sparseIntArray.put(R.id.img_camera_permission, 6);
        sparseIntArray.put(R.id.tv_des, 7);
        sparseIntArray.put(R.id.img_switch_camera_access, 8);
        sparseIntArray.put(R.id.tv_des_details, 9);
        sparseIntArray.put(R.id.frAdContainer, 10);
    }

    @Override // d0.AbstractC2158e
    public final void E() {
        synchronized (this) {
            this.f23402v = 0L;
        }
        this.f23397u.F();
    }

    @Override // d0.AbstractC2158e
    public final boolean H() {
        synchronized (this) {
            try {
                if (this.f23402v != 0) {
                    return true;
                }
                if (this.f23397u.H()) {
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
            this.f23402v = 2L;
        }
        this.f23397u.I();
        L();
    }

    @Override // d0.AbstractC2158e
    public final void M(InterfaceC0511v interfaceC0511v) {
        super.M(interfaceC0511v);
        this.f23397u.M(interfaceC0511v);
    }
}
