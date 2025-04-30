package u6;

import android.util.SparseIntArray;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* renamed from: u6.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2805v extends AbstractC2804u {

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f23427w;

    /* renamed from: v, reason: collision with root package name */
    public long f23428v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23427w = sparseIntArray;
        sparseIntArray.put(R.id.imv_back, 1);
        sparseIntArray.put(R.id.linear_language, 2);
        sparseIntArray.put(R.id.linear_rate, 3);
        sparseIntArray.put(R.id.linear_share, 4);
        sparseIntArray.put(R.id.linear_policy, 5);
    }

    @Override // d0.AbstractC2158e
    public final void E() {
        synchronized (this) {
            this.f23428v = 0L;
        }
    }

    @Override // d0.AbstractC2158e
    public final boolean H() {
        synchronized (this) {
            try {
                if (this.f23428v != 0) {
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
            this.f23428v = 1L;
        }
        L();
    }
}
