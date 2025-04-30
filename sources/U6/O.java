package u6;

import android.util.SparseIntArray;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* loaded from: classes3.dex */
public final class O extends N {

    /* renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f23212u;

    /* renamed from: t, reason: collision with root package name */
    public long f23213t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23212u = sparseIntArray;
        sparseIntArray.put(R.id.imgDelete, 1);
        sparseIntArray.put(R.id.txtTitle, 2);
        sparseIntArray.put(R.id.txtMessage, 3);
        sparseIntArray.put(R.id.txtCancel, 4);
        sparseIntArray.put(R.id.txtApply, 5);
    }

    @Override // d0.AbstractC2158e
    public final void E() {
        synchronized (this) {
            this.f23213t = 0L;
        }
    }

    @Override // d0.AbstractC2158e
    public final boolean H() {
        synchronized (this) {
            try {
                if (this.f23213t != 0) {
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
            this.f23213t = 1L;
        }
        L();
    }
}
