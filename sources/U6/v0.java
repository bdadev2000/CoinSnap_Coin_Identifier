package u6;

import android.util.SparseIntArray;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* loaded from: classes3.dex */
public final class v0 extends I {

    /* renamed from: s, reason: collision with root package name */
    public static final SparseIntArray f23429s;

    /* renamed from: r, reason: collision with root package name */
    public long f23430r;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23429s = sparseIntArray;
        sparseIntArray.put(R.id.ad_unit_content, 1);
        sparseIntArray.put(R.id.ad_call_to_action, 2);
        sparseIntArray.put(R.id.ad_app_icon, 3);
        sparseIntArray.put(R.id.ad_headline, 4);
        sparseIntArray.put(R.id.ad_advertiser, 5);
        sparseIntArray.put(R.id.ad_body, 6);
    }

    @Override // d0.AbstractC2158e
    public final void E() {
        synchronized (this) {
            this.f23430r = 0L;
        }
    }

    @Override // d0.AbstractC2158e
    public final boolean H() {
        synchronized (this) {
            try {
                if (this.f23430r != 0) {
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
            this.f23430r = 1L;
        }
        L();
    }
}
