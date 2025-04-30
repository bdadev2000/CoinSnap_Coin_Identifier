package u6;

import android.util.SparseIntArray;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* loaded from: classes3.dex */
public final class q0 extends I {

    /* renamed from: s, reason: collision with root package name */
    public static final SparseIntArray f23398s;

    /* renamed from: r, reason: collision with root package name */
    public long f23399r;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23398s = sparseIntArray;
        sparseIntArray.put(R.id.imgSettingComponentIcon, 1);
        sparseIntArray.put(R.id.txtSettingComponentName, 2);
    }

    @Override // d0.AbstractC2158e
    public final void E() {
        synchronized (this) {
            this.f23399r = 0L;
        }
    }

    @Override // d0.AbstractC2158e
    public final boolean H() {
        synchronized (this) {
            try {
                if (this.f23399r != 0) {
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
            this.f23399r = 1L;
        }
        L();
    }
}
