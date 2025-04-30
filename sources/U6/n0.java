package u6;

import android.util.SparseIntArray;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* loaded from: classes3.dex */
public final class n0 extends m0 {

    /* renamed from: r, reason: collision with root package name */
    public static final SparseIntArray f23363r;

    /* renamed from: q, reason: collision with root package name */
    public long f23364q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23363r = sparseIntArray;
        sparseIntArray.put(R.id.linear_centimeter, 1);
        sparseIntArray.put(R.id.img_cb_centimeters, 2);
        sparseIntArray.put(R.id.linear_millimeter, 3);
        sparseIntArray.put(R.id.img_cb_millimeters, 4);
        sparseIntArray.put(R.id.linear_inches, 5);
        sparseIntArray.put(R.id.img_cb_inches, 6);
    }

    @Override // d0.AbstractC2158e
    public final void E() {
        synchronized (this) {
            this.f23364q = 0L;
        }
    }

    @Override // d0.AbstractC2158e
    public final boolean H() {
        synchronized (this) {
            try {
                if (this.f23364q != 0) {
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
            this.f23364q = 1L;
        }
        L();
    }
}
