package u6;

import android.util.SparseIntArray;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* loaded from: classes3.dex */
public final class V extends U {

    /* renamed from: t, reason: collision with root package name */
    public static final SparseIntArray f23227t;

    /* renamed from: s, reason: collision with root package name */
    public long f23228s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23227t = sparseIntArray;
        sparseIntArray.put(R.id.img_bg, 1);
        sparseIntArray.put(R.id.imv_close, 2);
        sparseIntArray.put(R.id.tv_camera_access, 3);
        sparseIntArray.put(R.id.tv_camera_details, 4);
        sparseIntArray.put(R.id.tv_get_premium, 5);
    }

    @Override // d0.AbstractC2158e
    public final void E() {
        synchronized (this) {
            this.f23228s = 0L;
        }
    }

    @Override // d0.AbstractC2158e
    public final boolean H() {
        synchronized (this) {
            try {
                if (this.f23228s != 0) {
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
            this.f23228s = 1L;
        }
        L();
    }
}
