package u6;

import android.util.SparseIntArray;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* loaded from: classes3.dex */
public final class M extends L {

    /* renamed from: t, reason: collision with root package name */
    public static final SparseIntArray f23207t;

    /* renamed from: s, reason: collision with root package name */
    public long f23208s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23207t = sparseIntArray;
        sparseIntArray.put(R.id.imgIcon, 1);
        sparseIntArray.put(R.id.txtTitle, 2);
        sparseIntArray.put(R.id.txtPermissionExplain, 3);
        sparseIntArray.put(R.id.txtAccept, 4);
        sparseIntArray.put(R.id.txtCancel, 5);
    }

    @Override // d0.AbstractC2158e
    public final void E() {
        synchronized (this) {
            this.f23208s = 0L;
        }
    }

    @Override // d0.AbstractC2158e
    public final boolean H() {
        synchronized (this) {
            try {
                if (this.f23208s != 0) {
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
            this.f23208s = 1L;
        }
        L();
    }
}
