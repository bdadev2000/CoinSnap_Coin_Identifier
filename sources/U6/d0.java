package u6;

import android.util.SparseIntArray;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* loaded from: classes3.dex */
public final class d0 extends c0 {

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f23286x;

    /* renamed from: w, reason: collision with root package name */
    public long f23287w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23286x = sparseIntArray;
        sparseIntArray.put(R.id.imgThumb, 1);
        sparseIntArray.put(R.id.txtFileName, 2);
        sparseIntArray.put(R.id.imgDelete, 3);
        sparseIntArray.put(R.id.txtDate, 4);
        sparseIntArray.put(R.id.txtHour, 5);
    }

    @Override // d0.AbstractC2158e
    public final void E() {
        synchronized (this) {
            this.f23287w = 0L;
        }
    }

    @Override // d0.AbstractC2158e
    public final boolean H() {
        synchronized (this) {
            try {
                if (this.f23287w != 0) {
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
            this.f23287w = 1L;
        }
        L();
    }
}
