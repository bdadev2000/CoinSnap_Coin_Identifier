package u6;

import android.util.SparseIntArray;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* renamed from: u6.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2809z extends AbstractC2808y {

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f23441w;

    /* renamed from: v, reason: collision with root package name */
    public long f23442v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23441w = sparseIntArray;
        sparseIntArray.put(R.id.include, 2);
        sparseIntArray.put(R.id.straight_ruler_view, 3);
        sparseIntArray.put(R.id.img_ruler, 4);
        sparseIntArray.put(R.id.img_home, 5);
    }

    @Override // d0.AbstractC2158e
    public final void E() {
        synchronized (this) {
            this.f23442v = 0L;
        }
    }

    @Override // d0.AbstractC2158e
    public final boolean H() {
        synchronized (this) {
            try {
                if (this.f23442v != 0) {
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
            this.f23442v = 1L;
        }
        L();
    }
}
