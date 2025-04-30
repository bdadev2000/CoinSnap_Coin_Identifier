package u6;

import android.util.SparseIntArray;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* loaded from: classes3.dex */
public final class X extends W {

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f23235x;

    /* renamed from: w, reason: collision with root package name */
    public long f23236w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23235x = sparseIntArray;
        sparseIntArray.put(R.id.iv_rate, 1);
        sparseIntArray.put(R.id.tv_rate, 2);
        sparseIntArray.put(R.id.tv_rate_details, 3);
        sparseIntArray.put(R.id.linear_star, 4);
        sparseIntArray.put(R.id.img_start_1, 5);
        sparseIntArray.put(R.id.img_start_2, 6);
        sparseIntArray.put(R.id.img_start_3, 7);
        sparseIntArray.put(R.id.img_start_4, 8);
        sparseIntArray.put(R.id.img_start_5, 9);
        sparseIntArray.put(R.id.tv_later, 10);
    }

    @Override // d0.AbstractC2158e
    public final void E() {
        synchronized (this) {
            this.f23236w = 0L;
        }
    }

    @Override // d0.AbstractC2158e
    public final boolean H() {
        synchronized (this) {
            try {
                if (this.f23236w != 0) {
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
            this.f23236w = 1L;
        }
        L();
    }
}
