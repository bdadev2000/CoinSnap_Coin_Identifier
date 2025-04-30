package u6;

import android.util.SparseIntArray;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* loaded from: classes3.dex */
public final class j0 extends i0 {

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f23334x;

    /* renamed from: w, reason: collision with root package name */
    public long f23335w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23334x = sparseIntArray;
        sparseIntArray.put(R.id.imgUnit, 1);
        sparseIntArray.put(R.id.txtUnit, 2);
        sparseIntArray.put(R.id.imv_premium, 3);
        sparseIntArray.put(R.id.imgCheck, 4);
        sparseIntArray.put(R.id.viewLine, 5);
    }

    @Override // d0.AbstractC2158e
    public final void E() {
        synchronized (this) {
            this.f23335w = 0L;
        }
    }

    @Override // d0.AbstractC2158e
    public final boolean H() {
        synchronized (this) {
            try {
                if (this.f23335w != 0) {
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
            this.f23335w = 1L;
        }
        L();
    }
}
