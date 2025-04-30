package u6;

import android.util.SparseIntArray;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* renamed from: u6.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2803t extends AbstractC2802s {

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f23412w;

    /* renamed from: v, reason: collision with root package name */
    public long f23413v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23412w = sparseIntArray;
        sparseIntArray.put(R.id.include, 2);
        sparseIntArray.put(R.id.protractor_view, 3);
        sparseIntArray.put(R.id.tv_angle, 4);
        sparseIntArray.put(R.id.img_home, 5);
    }

    @Override // d0.AbstractC2158e
    public final void E() {
        synchronized (this) {
            this.f23413v = 0L;
        }
    }

    @Override // d0.AbstractC2158e
    public final boolean H() {
        synchronized (this) {
            try {
                if (this.f23413v != 0) {
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
            this.f23413v = 1L;
        }
        L();
    }
}
