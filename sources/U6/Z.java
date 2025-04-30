package u6;

import android.util.SparseIntArray;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* loaded from: classes3.dex */
public final class Z extends Y {

    /* renamed from: v, reason: collision with root package name */
    public static final SparseIntArray f23241v;

    /* renamed from: u, reason: collision with root package name */
    public long f23242u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23241v = sparseIntArray;
        sparseIntArray.put(R.id.txtTitle, 1);
        sparseIntArray.put(R.id.llSearchBox, 2);
        sparseIntArray.put(R.id.edtSearch, 3);
        sparseIntArray.put(R.id.imgClearText, 4);
        sparseIntArray.put(R.id.txtCancel, 5);
        sparseIntArray.put(R.id.txtApply, 6);
    }

    @Override // d0.AbstractC2158e
    public final void E() {
        synchronized (this) {
            this.f23242u = 0L;
        }
    }

    @Override // d0.AbstractC2158e
    public final boolean H() {
        synchronized (this) {
            try {
                if (this.f23242u != 0) {
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
            this.f23242u = 1L;
        }
        L();
    }
}
