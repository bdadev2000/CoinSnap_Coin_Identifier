package u6;

import android.util.SparseIntArray;
import androidx.lifecycle.InterfaceC0511v;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* renamed from: u6.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2788d extends AbstractC2787c {

    /* renamed from: A, reason: collision with root package name */
    public static final C.c f23283A;

    /* renamed from: B, reason: collision with root package name */
    public static final SparseIntArray f23284B;

    /* renamed from: z, reason: collision with root package name */
    public long f23285z;

    static {
        C.c cVar = new C.c(11);
        f23283A = cVar;
        cVar.B(new String[]{"ads_shimmer_native_home"}, new int[]{2}, new int[]{R.layout.ads_shimmer_native_home});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23284B = sparseIntArray;
        sparseIntArray.put(R.id.bubbleLevelView, 3);
        sparseIntArray.put(R.id.iv_back, 4);
        sparseIntArray.put(R.id.linear_X, 5);
        sparseIntArray.put(R.id.tv_X, 6);
        sparseIntArray.put(R.id.iv_set_sensor, 7);
        sparseIntArray.put(R.id.linear_Y, 8);
        sparseIntArray.put(R.id.tv_Y, 9);
        sparseIntArray.put(R.id.frAdContainer, 10);
    }

    @Override // d0.AbstractC2158e
    public final void E() {
        synchronized (this) {
            this.f23285z = 0L;
        }
        this.f23274w.F();
    }

    @Override // d0.AbstractC2158e
    public final boolean H() {
        synchronized (this) {
            try {
                if (this.f23285z != 0) {
                    return true;
                }
                if (this.f23274w.H()) {
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
            this.f23285z = 2L;
        }
        this.f23274w.I();
        L();
    }

    @Override // d0.AbstractC2158e
    public final void M(InterfaceC0511v interfaceC0511v) {
        super.M(interfaceC0511v);
        this.f23274w.M(interfaceC0511v);
    }
}
