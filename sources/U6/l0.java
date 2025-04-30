package u6;

import android.util.SparseIntArray;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* loaded from: classes3.dex */
public final class l0 extends k0 {

    /* renamed from: v, reason: collision with root package name */
    public static final SparseIntArray f23354v;

    /* renamed from: u, reason: collision with root package name */
    public long f23355u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23354v = sparseIntArray;
        sparseIntArray.put(R.id.txtUnit, 1);
        sparseIntArray.put(R.id.rbCheck, 2);
        sparseIntArray.put(R.id.viewLine, 3);
    }

    @Override // d0.AbstractC2158e
    public final void E() {
        synchronized (this) {
            this.f23355u = 0L;
        }
    }

    @Override // d0.AbstractC2158e
    public final boolean H() {
        synchronized (this) {
            try {
                if (this.f23355u != 0) {
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
            this.f23355u = 1L;
        }
        L();
    }
}
