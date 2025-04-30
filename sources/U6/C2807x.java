package u6;

import android.util.SparseIntArray;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* renamed from: u6.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2807x extends AbstractC2806w {

    /* renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f23434u;

    /* renamed from: t, reason: collision with root package name */
    public long f23435t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23434u = sparseIntArray;
        sparseIntArray.put(R.id.include, 2);
        sparseIntArray.put(R.id.videoView, 3);
        sparseIntArray.put(R.id.txtAds, 4);
    }

    @Override // d0.AbstractC2158e
    public final void E() {
        synchronized (this) {
            this.f23435t = 0L;
        }
    }

    @Override // d0.AbstractC2158e
    public final boolean H() {
        synchronized (this) {
            try {
                if (this.f23435t != 0) {
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
            this.f23435t = 1L;
        }
        L();
    }
}
