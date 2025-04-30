package u6;

import android.util.SparseIntArray;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* loaded from: classes3.dex */
public final class D extends C {

    /* renamed from: s, reason: collision with root package name */
    public static final SparseIntArray f23192s;

    /* renamed from: r, reason: collision with root package name */
    public long f23193r;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23192s = sparseIntArray;
        sparseIntArray.put(R.id.ad_unit_content, 1);
        sparseIntArray.put(R.id.ad_app_icon, 2);
        sparseIntArray.put(R.id.ad_headline, 3);
        sparseIntArray.put(R.id.ad_advertiser, 4);
        sparseIntArray.put(R.id.ad_body, 5);
        sparseIntArray.put(R.id.ad_media, 6);
        sparseIntArray.put(R.id.ad_call_to_action, 7);
    }

    @Override // d0.AbstractC2158e
    public final void E() {
        synchronized (this) {
            this.f23193r = 0L;
        }
    }

    @Override // d0.AbstractC2158e
    public final boolean H() {
        synchronized (this) {
            try {
                if (this.f23193r != 0) {
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
            this.f23193r = 1L;
        }
        L();
    }
}
