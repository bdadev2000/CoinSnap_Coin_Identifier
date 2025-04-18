package kf;

import android.util.SparseIntArray;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class z0 extends y0 {

    /* renamed from: v, reason: collision with root package name */
    public static final SparseIntArray f20940v;
    public long u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20940v = sparseIntArray;
        sparseIntArray.put(R.id.ad_unit_content, 1);
        sparseIntArray.put(R.id.ad_app_icon, 2);
        sparseIntArray.put(R.id.ad_headline, 3);
        sparseIntArray.put(R.id.ad_advertiser, 4);
        sparseIntArray.put(R.id.ad_body, 5);
        sparseIntArray.put(R.id.ad_media, 6);
        sparseIntArray.put(R.id.ad_call_to_action, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public z0(android.view.View r4) {
        /*
            r3 = this;
            android.util.SparseIntArray r0 = kf.z0.f20940v
            r1 = 8
            r2 = 0
            java.lang.Object[] r0 = androidx.databinding.e.K(r4, r1, r2, r0)
            r1 = 4
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 2
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 5
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 7
            r1 = r0[r1]
            android.widget.Button r1 = (android.widget.Button) r1
            r1 = 3
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 6
            r1 = r0[r1]
            com.google.android.gms.ads.nativead.MediaView r1 = (com.google.android.gms.ads.nativead.MediaView) r1
            r1 = 1
            r1 = r0[r1]
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r1 = 0
            r0 = r0[r1]
            com.facebook.shimmer.ShimmerFrameLayout r0 = (com.facebook.shimmer.ShimmerFrameLayout) r0
            r3.<init>(r2, r4, r0)
            r0 = -1
            r3.u = r0
            com.facebook.shimmer.ShimmerFrameLayout r0 = r3.f20932t
            r0.setTag(r2)
            r0 = 2131362128(0x7f0a0150, float:1.8344028E38)
            r4.setTag(r0, r3)
            r3.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.z0.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.u = 0L;
        }
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.u != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.u = 1L;
        }
        L();
    }
}
