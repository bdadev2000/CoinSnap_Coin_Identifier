package u6;

import android.util.SparseIntArray;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* loaded from: classes3.dex */
public final class u0 extends t0 {

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f23425x;

    /* renamed from: w, reason: collision with root package name */
    public long f23426w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23425x = sparseIntArray;
        sparseIntArray.put(R.id.imgTopBar, 1);
        sparseIntArray.put(R.id.txtScreenName, 2);
        sparseIntArray.put(R.id.lottie_premium, 3);
        sparseIntArray.put(R.id.layout_data, 4);
        sparseIntArray.put(R.id.constraint_author, 5);
        sparseIntArray.put(R.id.constraint_add_new_image, 6);
        sparseIntArray.put(R.id.tv_add_new_image, 7);
        sparseIntArray.put(R.id.rvImages, 8);
        sparseIntArray.put(R.id.layout_no_data, 9);
        sparseIntArray.put(R.id.imgEmpty, 10);
        sparseIntArray.put(R.id.txtMessEmptyFile, 11);
        sparseIntArray.put(R.id.tv_add_new, 12);
    }

    @Override // d0.AbstractC2158e
    public final void E() {
        synchronized (this) {
            this.f23426w = 0L;
        }
    }

    @Override // d0.AbstractC2158e
    public final boolean H() {
        synchronized (this) {
            try {
                if (this.f23426w != 0) {
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
            this.f23426w = 1L;
        }
        L();
    }
}
